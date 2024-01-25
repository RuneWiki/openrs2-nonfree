import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class347 implements Interface5 {

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
	private int anInt9340;

	@OriginalMember(owner = "client!vga", name = "o", descriptor = "I")
	private int anInt9348;

	@OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
	private int anInt9360;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
	private int anInt9343 = 0;

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "[Lclient!fea;")
	private final Interface6[] anInterface6Array1 = new Interface6[9];

	@OriginalMember(owner = "client!vga", name = "B", descriptor = "I")
	private int anInt9361 = -1;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_41;

	@OriginalMember(owner = "client!vga", name = "n", descriptor = "I")
	private final int anInt9347;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class347(@OriginalArg(0) Class66_Sub3 arg0) {
		if (!arg0.aBoolean482) {
			throw new IllegalStateException("");
		}
		this.aClass66_Sub3_41 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static428.anIntArray605, 0);
		this.anInt9347 = Static428.anIntArray605[0];
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!bm;I)V")
	public void method7680(@OriginalArg(1) Class4_Sub7_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9361 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt9360 & ~local16) == 0) {
			this.anInt9340 = arg0.anInt823;
			this.anInt9348 = arg0.anInt828;
		} else if (arg0.anInt823 != this.anInt9340 || this.anInt9348 != arg0.anInt828) {
			throw new RuntimeException();
		}
		arg0.method725(this.anInt9361, Static89.anIntArray224[arg1]);
		this.anInterface6Array1[arg1] = arg0;
		this.anInt9360 |= local16;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V")
	public void method7683() {
		if (this.anInt9361 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static89.anIntArray224[0]);
	}

	@OriginalMember(owner = "client!vga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub3_41.method5378(this.anInt9347);
		super.finalize();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	@Override
	public void method7674() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9347);
		this.anInt9343 |= 0x4;
		this.anInt9361 = this.method7684();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	@Override
	public void method7679() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9343 &= 0xFFFFFFFB;
		this.anInt9361 = this.method7684();
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)I")
	private int method7684() {
		if ((this.anInt9343 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9343 & 0x2) == 0) {
			return (this.anInt9343 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!jk;II)V")
	public void method7685(@OriginalArg(1) Class114_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method7690(arg0, arg1);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method7686(@OriginalArg(1) int arg0) {
		if (this.anInterface6Array1[arg0] != null) {
			this.anInterface6Array1[arg0].method4996();
		}
		this.anInt9360 &= ~(0x1 << arg0);
		this.anInterface6Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!gaa;II)V")
	public void method7687(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7688(arg0, arg1);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!gaa;II)V")
	private void method7688(@OriginalArg(1) Class114_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9361 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt9360 & ~local15) == 0) {
			this.anInt9340 = arg0.anInt5921;
			this.anInt9348 = arg0.anInt5918;
		} else if (this.anInt9340 != arg0.anInt5921 || arg0.anInt5918 != this.anInt9348) {
			throw new RuntimeException();
		}
		arg0.method5007(Static89.anIntArray224[arg1], this.anInt9361);
		this.anInterface6Array1[arg1] = arg0;
		this.anInt9360 |= local15;
	}

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "(I)Z")
	public boolean method7689() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9361);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILclient!jk;IZ)V")
	private void method7690(@OriginalArg(2) Class114_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9361 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9360 & 0xFFFFFFFE) == 0) {
			this.anInt9340 = arg0.anInt4933;
			this.anInt9348 = arg0.anInt4933;
		} else if (this.anInt9340 != arg0.anInt4933 || this.anInt9348 != arg0.anInt4933) {
			throw new RuntimeException();
		}
		arg0.method4206(this.anInt9361, Static89.anIntArray224[0], arg1);
		this.anInterface6Array1[0] = arg0;
		this.anInt9360 |= 0x1;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BI)V")
	public void method7691(@OriginalArg(1) int arg0) {
		if (this.anInt9361 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static89.anIntArray224[arg0]);
	}

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V")
	@Override
	public void method7677() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9347);
		this.anInt9343 |= 0x1;
		this.anInt9361 = this.method7684();
	}

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "(I)V")
	@Override
	public void method7678() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9347);
		this.anInt9343 |= 0x2;
		this.anInt9361 = this.method7684();
	}

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V")
	@Override
	public void method7676() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9343 &= 0xFFFFFFFD;
		this.anInt9361 = this.method7684();
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	@Override
	public void method7675() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9343 &= 0xFFFFFFFE;
		this.anInt9361 = this.method7684();
	}
}
