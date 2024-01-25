import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class127 implements Interface25 {

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
	private int anInt3478;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	private int anInt3481;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
	private int anInt3482 = -1;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
	private int anInt3486 = 0;

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "[Lclient!jga;")
	private final Interface14[] anInterface14Array1 = new Interface14[9];

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_15;

	@OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
	private final int anInt3499;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class127(@OriginalArg(0) Class95_Sub3 arg0) {
		if (!arg0.aBoolean392) {
			throw new IllegalStateException("");
		}
		this.aClass95_Sub3_15 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static11.anIntArray10, 0);
		this.anInt3499 = Static11.anIntArray10[0];
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	@Override
	public void method2974() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3486 &= 0xFFFFFFFB;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!rba;)V")
	public void method2978(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub2 arg1) {
		this.method2984(arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!iv;IIII)V")
	private void method2979(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3482 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3481 & 0xFFFFFFFE) == 0) {
			this.anInt3489 = arg0.anInt4633;
			this.anInt3478 = arg0.anInt4633;
		} else if (arg0.anInt4633 != this.anInt3489 || this.anInt3478 != arg0.anInt4633) {
			throw new RuntimeException();
		}
		arg0.method3940(Static143.anIntArray148[0], this.anInt3482, arg1);
		this.anInterface14Array1[0] = arg0;
		this.anInt3481 |= 0x1;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	@Override
	public void method2975() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3486 &= 0xFFFFFFFE;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!iv;BII)V")
	public void method2980(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method2979(arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)V")
	public void method2981() {
		if (this.anInt3482 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static143.anIntArray148[0]);
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I")
	private int method2982() {
		if ((this.anInt3486 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3486 & 0x2) == 0) {
			return (this.anInt3486 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!gea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_15.method4838(this.anInt3499);
		super.finalize();
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(BI)V")
	public void method2983(@OriginalArg(1) int arg0) {
		if (this.anInterface14Array1[arg0] != null) {
			this.anInterface14Array1[arg0].method6091();
		}
		this.anInt3481 &= ~(0x1 << arg0);
		this.anInterface14Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	@Override
	public void method2970() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3499);
		this.anInt3486 |= 0x4;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBILclient!rba;)V")
	private void method2984(@OriginalArg(2) int arg0, @OriginalArg(3) Class10_Sub2 arg1) {
		if (this.anInt3482 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt3481) == 0) {
			this.anInt3489 = arg1.anInt3349;
			this.anInt3478 = arg1.anInt3354;
		} else if (arg1.anInt3349 != this.anInt3489 || arg1.anInt3354 != this.anInt3478) {
			throw new RuntimeException();
		}
		arg1.method2857(Static143.anIntArray148[arg0], this.anInt3482);
		this.anInterface14Array1[arg0] = arg1;
		this.anInt3481 |= local15;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(Z)V")
	@Override
	public void method2973() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3499);
		this.anInt3486 |= 0x2;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	@Override
	public void method2972() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3486 &= 0xFFFFFFFD;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!df;II)V")
	public void method2986(@OriginalArg(0) Class3_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3482 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((~local22 & this.anInt3481) == 0) {
			this.anInt3478 = arg0.anInt2011;
			this.anInt3489 = arg0.anInt2014;
		} else if (arg0.anInt2014 != this.anInt3489 || this.anInt3478 != arg0.anInt2011) {
			throw new RuntimeException();
		}
		arg0.method1684(Static143.anIntArray148[arg1], this.anInt3482);
		this.anInterface14Array1[arg1] = arg0;
		this.anInt3481 |= local22;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	@Override
	public void method2971() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3499);
		this.anInt3486 |= 0x1;
		this.anInt3482 = this.method2982();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	public void method2987(@OriginalArg(1) int arg0) {
		if (this.anInt3482 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static143.anIntArray148[arg0]);
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(Z)Z")
	public boolean method2988() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3482);
		return local14 == 36053;
	}
}
