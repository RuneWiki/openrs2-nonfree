import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class90 implements Interface1 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	private int anInt2060;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	private int anInt2061;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	private int anInt2062;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "[Lclient!kk;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_13;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	private final int anInt2063;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class90(@OriginalArg(0) Class164_Sub1 arg0) {
		if (!arg0.aBoolean420) {
			throw new IllegalStateException("");
		}
		this.aClass164_Sub1_13 = arg0;
		this.aClass164_Sub1_13.anOpengl1.glGenFramebuffersEXT(1, Static116.anIntArray264, 0);
		this.anInt2063 = Static116.anIntArray264[0];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public void method1706(@OriginalArg(0) int arg0) {
		if (this.aClass164_Sub1_13.method3591() != this) {
			throw new RuntimeException();
		}
		this.aClass164_Sub1_13.anOpengl1.glDrawBuffer(Static116.anIntArray263[arg0]);
	}

	@OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass164_Sub1_13.method3618(this.anInt2063);
		super.finalize();
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "()V")
	@Override
	public void method3559() {
		this.aClass164_Sub1_13.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hi;)V")
	public void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2 arg1) {
		this.method1711(arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!cd;II)V")
	private void method1708(@OriginalArg(1) Class15_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass164_Sub1_13.method3591() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2061 & 0xFFFFFFFE) == 0) {
			this.anInt2062 = arg0.anInt820;
			this.anInt2060 = arg0.anInt820;
		} else if (arg0.anInt820 != this.anInt2062 || arg0.anInt820 != this.anInt2060) {
			throw new RuntimeException();
		}
		arg0.method650(Static116.anIntArray263[0], arg1);
		this.anInterface7Array1[0] = arg0;
		this.anInt2061 |= 0x1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!cd;I)V")
	public void method1709(@OriginalArg(1) Class15_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method1708(arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!kf;)V")
	public void method1710(@OriginalArg(1) Class133 arg0) {
		if (this.aClass164_Sub1_13.method3591() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt2061 & 0xFFFFFEFF) == 0) {
			this.anInt2062 = arg0.anInt3289;
			this.anInt2060 = arg0.anInt3290;
		} else if (arg0.anInt3289 != this.anInt2062 || arg0.anInt3290 != this.anInt2060) {
			throw new RuntimeException();
		}
		arg0.method2686(Static116.anIntArray263[8]);
		this.anInterface7Array1[8] = arg0;
		this.anInt2061 |= 0x100;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!hi;I)V")
	private void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2 arg1) {
		if (this.aClass164_Sub1_13.method3591() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt2061 & ~local12) == 0) {
			this.anInt2062 = arg1.anInt5853;
			this.anInt2060 = arg1.anInt5854;
		} else if (arg1.anInt5853 != this.anInt2062 || arg1.anInt5854 != this.anInt2060) {
			throw new RuntimeException();
		}
		arg1.method5038(Static116.anIntArray263[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt2061 |= local12;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	@Override
	public void method3558() {
		this.aClass164_Sub1_13.anOpengl1.glBindFramebufferEXT(36160, this.anInt2063);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public void method1712(@OriginalArg(0) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5548();
		}
		this.anInt2061 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "()Z")
	public boolean method1713() {
		@Pc(5) int local5 = this.aClass164_Sub1_13.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
	@Override
	public int method3557() {
		return this.anInt2060;
	}
}
