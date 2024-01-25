import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class103 implements Interface2 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	private int anInt3057;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "[Lclient!vr;")
	private final Interface19[] anInterface19Array1 = new Interface19[9];

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private int anInt3052 = -1;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	private int anInt3045 = 0;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_8;

	@OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
	private final int anInt3061;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class103(@OriginalArg(0) Class62_Sub3 arg0) {
		if (!arg0.aBoolean282) {
			throw new IllegalStateException("");
		}
		this.aClass62_Sub3_8 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static103.anIntArray77, 0);
		this.anInt3061 = Static103.anIntArray77[0];
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public void method2737(@OriginalArg(1) int arg0) {
		if (this.anInt3052 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static51.anIntArray151[arg0]);
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)I")
	private int method2738() {
		if ((this.anInt3045 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3045 & 0x2) == 0) {
			return (this.anInt3045 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILclient!hp;)V")
	private void method2739(@OriginalArg(0) int arg0, @OriginalArg(3) Class4_Sub2 arg1) {
		if (this.anInt3052 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt3044) == 0) {
			this.anInt3041 = arg1.anInt6587;
			this.anInt3057 = arg1.anInt6588;
		} else if (this.anInt3041 != arg1.anInt6587 || arg1.anInt6588 != this.anInt3057) {
			throw new RuntimeException();
		}
		arg1.method5462(Static51.anIntArray151[arg0], this.anInt3052);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt3044 |= local16;
	}

	@OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass62_Sub3_8.method3983(this.anInt3061);
		super.finalize();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	public void method2740() {
		if (this.anInt3052 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static51.anIntArray151[0]);
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z")
	public boolean method2741() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3052);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	@Override
	public void method2732() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3045 &= 0xFFFFFFFB;
		this.anInt3052 = this.method2738();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!hp;I)V")
	public void method2743(@OriginalArg(1) Class4_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method2739(arg1, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBLclient!cm;)V")
	public void method2744(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub6 arg1) {
		if (this.anInt3052 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg0;
		if ((this.anInt3044 & ~local22) == 0) {
			this.anInt3057 = arg1.anInt1417;
			this.anInt3041 = arg1.anInt1419;
		} else if (this.anInt3041 != arg1.anInt1419 || arg1.anInt1417 != this.anInt3057) {
			throw new RuntimeException();
		}
		arg1.method1314(this.anInt3052, Static51.anIntArray151[arg0]);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt3044 |= local22;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V")
	@Override
	public void method2736() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3045 &= 0xFFFFFFFD;
		this.anInt3052 = this.method2738();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!oj;I)V")
	public void method2745(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub4 arg1) {
		this.method2748(arg1, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V")
	public void method2746(@OriginalArg(1) int arg0) {
		if (this.anInterface19Array1[arg0] != null) {
			this.anInterface19Array1[arg0].method5490();
		}
		this.anInt3044 &= ~(0x1 << arg0);
		this.anInterface19Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	@Override
	public void method2733() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3061);
		this.anInt3045 |= 0x1;
		this.anInt3052 = this.method2738();
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	@Override
	public void method2735() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3061);
		this.anInt3045 |= 0x4;
		this.anInt3052 = this.method2738();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!oj;BII)V")
	private void method2748(@OriginalArg(1) Class4_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt3052 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3044 & 0xFFFFFFFE) == 0) {
			this.anInt3041 = arg0.anInt6710;
			this.anInt3057 = arg0.anInt6710;
		} else if (arg0.anInt6710 != this.anInt3041 || this.anInt3057 != arg0.anInt6710) {
			throw new RuntimeException();
		}
		arg0.method5505(arg1, this.anInt3052, Static51.anIntArray151[0]);
		this.anInterface19Array1[0] = arg0;
		this.anInt3044 |= 0x1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)I")
	public int method2750() {
		return this.anInt3057;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	@Override
	public void method2731() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3061);
		this.anInt3045 |= 0x2;
		this.anInt3052 = this.method2738();
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	@Override
	public void method2734() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3045 &= 0xFFFFFFFE;
		this.anInt3052 = this.method2738();
	}
}
