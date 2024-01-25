import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class371 implements Interface24 {

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
	private int anInt9848;

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
	private int anInt9851;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
	private int anInt9857;

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
	private int anInt9855 = -1;

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
	private int anInt9852 = 0;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "[Lclient!hv;")
	private final Interface15[] anInterface15Array1 = new Interface15[9];

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_38;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	private final int anInt9841;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class371(@OriginalArg(0) Class33_Sub3 arg0) {
		if (!arg0.aBoolean567) {
			throw new IllegalStateException("");
		}
		this.aClass33_Sub3_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static453.anIntArray492, 0);
		this.anInt9841 = Static453.anIntArray492[0];
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILclient!vw;)V")
	public void method8436(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub5_Sub20 arg1) {
		if (this.anInt9855 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt9851 & ~local16) == 0) {
			this.anInt9848 = arg1.anInt10258;
			this.anInt9857 = arg1.anInt10249;
		} else if (arg1.anInt10249 != this.anInt9857 || arg1.anInt10258 != this.anInt9848) {
			throw new RuntimeException();
		}
		arg1.method8680(this.anInt9855, Static404.anIntArray445[arg0]);
		this.anInterface15Array1[arg0] = arg1;
		this.anInt9851 |= local16;
	}

	@OriginalMember(owner = "client!vda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_38.method6313(this.anInt9841);
		super.finalize();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!hfa;III)V")
	public void method8437(@OriginalArg(0) Class116_Sub1 arg0, @OriginalArg(3) int arg1) {
		this.method8446(arg1, arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public void method8430() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9852 &= 0xFFFFFFFD;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ld;III)V")
	private void method8438(@OriginalArg(0) Class116_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9855 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt9851) == 0) {
			this.anInt9848 = arg0.anInt7876;
			this.anInt9857 = arg0.anInt7871;
		} else if (this.anInt9857 != arg0.anInt7871 || arg0.anInt7876 != this.anInt9848) {
			throw new RuntimeException();
		}
		arg0.method6833(Static404.anIntArray445[arg1], this.anInt9855);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt9851 |= local16;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
	@Override
	public void method8435() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9841);
		this.anInt9852 |= 0x4;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
	public void method8439(@OriginalArg(0) int arg0) {
		if (this.anInt9855 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static404.anIntArray445[arg0]);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILclient!ld;)V")
	public void method8441(@OriginalArg(0) int arg0, @OriginalArg(2) Class116_Sub2 arg1) {
		this.method8438(arg1, arg0);
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)I")
	private int method8442() {
		if ((this.anInt9852 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9852 & 0x2) == 0) {
			return (this.anInt9852 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)Z")
	public boolean method8443() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9855);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
	public void method8445() {
		if (this.anInt9855 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static404.anIntArray445[0]);
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	@Override
	public void method8431() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9852 &= 0xFFFFFFFE;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILclient!hfa;Z)V")
	private void method8446(@OriginalArg(1) int arg0, @OriginalArg(3) Class116_Sub1 arg1) {
		if (this.anInt9855 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9851 & 0xFFFFFFFE) == 0) {
			this.anInt9857 = arg1.anInt3523;
			this.anInt9848 = arg1.anInt3523;
		} else if (this.anInt9857 != arg1.anInt3523 || this.anInt9848 != arg1.anInt3523) {
			throw new RuntimeException();
		}
		arg1.method3245(this.anInt9855, arg0, Static404.anIntArray445[0]);
		this.anInterface15Array1[0] = arg1;
		this.anInt9851 |= 0x1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9841);
		this.anInt9852 |= 0x1;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)V")
	@Override
	public void method8434() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9852 &= 0xFFFFFFFB;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	@Override
	public void method8432() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9841);
		this.anInt9852 |= 0x2;
		this.anInt9855 = this.method8442();
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(II)V")
	public void method8447(@OriginalArg(1) int arg0) {
		if (this.anInterface15Array1[arg0] != null) {
			this.anInterface15Array1[arg0].method8676();
		}
		this.anInt9851 &= ~(0x1 << arg0);
		this.anInterface15Array1[arg0] = null;
	}
}
