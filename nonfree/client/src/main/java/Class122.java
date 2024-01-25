import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class122 implements Interface6 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	private int anInt3808;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private int anInt3815;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	private int anInt3822;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	private int anInt3809 = 0;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
	private int anInt3830 = -1;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "[Lclient!nj;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_23;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	private final int anInt3812;

	static {
		new Class175("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class122(@OriginalArg(0) Class75_Sub2 arg0) {
		if (!arg0.aBoolean220) {
			throw new IllegalStateException("");
		}
		this.aClass75_Sub2_23 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static83.anIntArray160, 0);
		this.anInt3812 = Static83.anIntArray160[0];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I")
	public int method3163() {
		return this.anInt3808;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public void method3164(@OriginalArg(1) int arg0) {
		if (this.anInt3830 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static338.anIntArray86[arg0]);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
	public void method3165(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4908();
		}
		this.anInt3815 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	@Override
	public void method3162() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3809 &= 0xFFFFFFFE;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	@Override
	public void method3160() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3809 &= 0xFFFFFFFB;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_23.method2422(this.anInt3812);
		super.finalize();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!sr;IBI)V")
	private void method3166(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3830 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt3815) == 0) {
			this.anInt3822 = arg0.anInt1533;
			this.anInt3808 = arg0.anInt1539;
		} else if (arg0.anInt1533 != this.anInt3822 || this.anInt3808 != arg0.anInt1539) {
			throw new RuntimeException();
		}
		arg0.method1263(Static338.anIntArray86[arg1], this.anInt3830);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt3815 |= local15;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!hp;I)V")
	public void method3167(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub11 arg1) {
		if (this.anInt3830 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt3815 & ~local20) == 0) {
			this.anInt3808 = arg1.anInt3379;
			this.anInt3822 = arg1.anInt3370;
		} else if (this.anInt3822 != arg1.anInt3370 || this.anInt3808 != arg1.anInt3379) {
			throw new RuntimeException();
		}
		arg1.method2758(this.anInt3830, Static338.anIntArray86[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt3815 |= local20;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!sr;I)V")
	public void method3168(@OriginalArg(1) Class42_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method3166(arg0, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	@Override
	public void method3158() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3812);
		this.anInt3809 |= 0x2;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	@Override
	public void method3157() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3812);
		this.anInt3809 |= 0x1;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)V")
	public void method3169() {
		if (this.anInt3830 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static338.anIntArray86[0]);
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method3159() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3812);
		this.anInt3809 |= 0x4;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!lm;II)V")
	private void method3171(@OriginalArg(1) int arg0, @OriginalArg(2) Class42_Sub3 arg1) {
		if (this.anInt3830 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3815 & 0xFFFFFFFE) == 0) {
			this.anInt3808 = arg1.anInt4538;
			this.anInt3822 = arg1.anInt4538;
		} else if (arg1.anInt4538 != this.anInt3822 || arg1.anInt4538 != this.anInt3808) {
			throw new RuntimeException();
		}
		arg1.method3698(arg0, Static338.anIntArray86[0], this.anInt3830);
		this.anInterface9Array1[0] = arg1;
		this.anInt3815 |= 0x1;
	}

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I")
	private int method3172() {
		if ((this.anInt3809 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3809 & 0x2) == 0) {
			return (this.anInt3809 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
	@Override
	public void method3161() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3809 &= 0xFFFFFFFD;
		this.anInt3830 = this.method3172();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!lm;IB)V")
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) Class42_Sub3 arg1) {
		this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
	public boolean method3174() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3830);
		return local13 == 36053;
	}
}
