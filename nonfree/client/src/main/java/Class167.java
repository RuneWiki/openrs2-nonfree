import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class167 implements Interface9 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	private int anInt5096;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	private int anInt5098;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lclient!hh;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_32;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	private final int anInt5099;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class167(@OriginalArg(0) Class55_Sub1 arg0) {
		if (!arg0.aBoolean309) {
			throw new IllegalStateException("");
		}
		this.aClass55_Sub1_32 = arg0;
		this.aClass55_Sub1_32.anOpengl1.glGenFramebuffersEXT(1, Static260.anIntArray493, 0);
		this.anInt5099 = Static260.anIntArray493[0];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fb;)V")
	public void method4540(@OriginalArg(1) Class67 arg0) {
		if (this.aClass55_Sub1_32.method3708() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5096 & 0xFFFFFEFF) == 0) {
			this.anInt5098 = arg0.anInt1557;
			this.anInt5097 = arg0.anInt1558;
		} else if (arg0.anInt1557 != this.anInt5098 || arg0.anInt1558 != this.anInt5097) {
			throw new RuntimeException();
		}
		arg0.method1501(Static260.anIntArray494[8]);
		this.anInterface4Array1[8] = arg0;
		this.anInt5096 |= 0x100;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fq;II)V")
	private void method4541(@OriginalArg(1) Class60_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass55_Sub1_32.method3708() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5096 & 0xFFFFFFFE) == 0) {
			this.anInt5098 = arg0.anInt1838;
			this.anInt5097 = arg0.anInt1838;
		} else if (arg0.anInt1838 != this.anInt5098 || arg0.anInt1838 != this.anInt5097) {
			throw new RuntimeException();
		}
		arg0.method1749(Static260.anIntArray494[0], arg1);
		this.anInterface4Array1[0] = arg0;
		this.anInt5096 |= 0x1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!hn;)V")
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) Class60_Sub4 arg1) {
		this.method4545(arg0, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass55_Sub1_32.method3641(this.anInt5099);
		super.finalize();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public void method4543(@OriginalArg(0) int arg0) {
		if (this.aClass55_Sub1_32.method3708() != this) {
			throw new RuntimeException();
		}
		this.aClass55_Sub1_32.anOpengl1.glDrawBuffer(Static260.anIntArray494[arg0]);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()V")
	@Override
	public void method4539() {
		this.aClass55_Sub1_32.anOpengl1.glBindFramebufferEXT(36160, this.anInt5099);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()I")
	@Override
	public int method4538() {
		return this.anInt5097;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method4544(@OriginalArg(0) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method5833();
		}
		this.anInt5096 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!hn;I)V")
	private void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) Class60_Sub4 arg1) {
		if (this.aClass55_Sub1_32.method3708() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt5096 & ~local12) == 0) {
			this.anInt5098 = arg1.anInt6574;
			this.anInt5097 = arg1.anInt6575;
		} else if (arg1.anInt6574 != this.anInt5098 || arg1.anInt6575 != this.anInt5097) {
			throw new RuntimeException();
		}
		arg1.method5850(Static260.anIntArray494[arg0]);
		this.anInterface4Array1[arg0] = arg1;
		this.anInt5096 |= local12;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()Z")
	public boolean method4546() {
		@Pc(5) int local5 = this.aClass55_Sub1_32.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fq;I)V")
	public void method4547(@OriginalArg(1) Class60_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method4541(arg0, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	@Override
	public void method4537() {
		this.aClass55_Sub1_32.anOpengl1.glBindFramebufferEXT(36160, 0);
	}
}
