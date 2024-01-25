import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class109 implements Interface13 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "I")
	private int anInt2781;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "[Lclient!cu;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	private int anInt2770 = 0;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "I")
	private int anInt2780 = -1;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_9;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "I")
	private final int anInt2774;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class109(@OriginalArg(0) Class16_Sub2 arg0) {
		if (!arg0.aBoolean331) {
			throw new IllegalStateException("");
		}
		this.aClass16_Sub2_9 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static290.anIntArray347, 0);
		this.anInt2774 = Static290.anIntArray347[0];
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	@Override
	public void method2545() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2774);
		this.anInt2770 |= 0x4;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	public void method2547() {
		if (this.anInt2780 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static120.anIntArray154[0]);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	@Override
	public void method2543() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2770 &= 0xFFFFFFFE;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!fw;I)V")
	public void method2548(@OriginalArg(1) Class3_Sub6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2780 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt2767 & ~local15) == 0) {
			this.anInt2781 = arg0.anInt3403;
			this.anInt2761 = arg0.anInt3399;
		} else if (arg0.anInt3399 != this.anInt2761 || arg0.anInt3403 != this.anInt2781) {
			throw new RuntimeException();
		}
		arg0.method2993(this.anInt2780, Static120.anIntArray154[arg1]);
		this.anInterface4Array1[arg1] = arg0;
		this.anInt2767 |= local15;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	@Override
	public void method2542() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2770 &= 0xFFFFFFFD;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z")
	public boolean method2549() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2780);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!kf;IB)V")
	private void method2550(@OriginalArg(1) Class39_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2780 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt2767 & ~local23) == 0) {
			this.anInt2781 = arg0.anInt9946;
			this.anInt2761 = arg0.anInt9944;
		} else if (this.anInt2761 != arg0.anInt9944 || this.anInt2781 != arg0.anInt9946) {
			throw new RuntimeException();
		}
		arg0.method8470(Static120.anIntArray154[arg1], this.anInt2780);
		this.anInterface4Array1[arg1] = arg0;
		this.anInt2767 |= local23;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!bja;IB)V")
	private void method2551(@OriginalArg(2) Class39_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt2780 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2767 & 0xFFFFFFFE) == 0) {
			this.anInt2781 = arg0.anInt1312;
			this.anInt2761 = arg0.anInt1312;
		} else if (arg0.anInt1312 != this.anInt2761 || this.anInt2781 != arg0.anInt1312) {
			throw new RuntimeException();
		}
		arg0.method1305(arg1, this.anInt2780, Static120.anIntArray154[0]);
		this.anInterface4Array1[0] = arg0;
		this.anInt2767 |= 0x1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	@Override
	public void method2541() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2770 &= 0xFFFFFFFB;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)V")
	public void method2552(@OriginalArg(1) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method8457();
		}
		this.anInt2767 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)I")
	private int method2553() {
		if ((this.anInt2770 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2770 & 0x2) == 0) {
			return (this.anInt2770 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method2544() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2774);
		this.anInt2770 |= 0x2;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!kf;)V")
	public void method2554(@OriginalArg(0) int arg0, @OriginalArg(2) Class39_Sub4 arg1) {
		this.method2550(arg1, arg0);
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	@Override
	public void method2546() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2774);
		this.anInt2770 |= 0x1;
		this.anInt2780 = this.method2553();
	}

	@OriginalMember(owner = "client!et", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub2_9.method3647(this.anInt2774);
		super.finalize();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!bja;I)V")
	public void method2555(@OriginalArg(0) int arg0, @OriginalArg(2) Class39_Sub1 arg1) {
		this.method2551(arg1, arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
	public void method2556(@OriginalArg(1) int arg0) {
		if (this.anInt2780 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static120.anIntArray154[arg0]);
	}
}
