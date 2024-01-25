import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4_Sub2_Sub1_Sub1 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[Lclient!cla;")
	public static Interface1[] lb;

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lclient!hv;")
	private Class4_Sub7 aClass4_Sub7_1;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int anInt151 = 0;

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
	private int anInt161 = 0;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
	private final int anInt152;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!cb;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class4_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt160 = arg11;
		this.anInt152 = arg0;
		@Pc(36) Class347 local36 = Static119.aClass209_1.method4570(this.anInt152);
		@Pc(39) int local39 = local36.anInt9356;
		if (local39 != -1) {
			this.aClass53_1 = new Class53_Sub1(this, false);
			@Pc(59) int local59 = local36.aBoolean800 ? 0 : 2;
			if (arg12) {
				local59 = 1;
			}
			this.aClass53_1.method4085(local59, false, local39, arg1);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			this.anInt160 = -28;
		}
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ha;Lclient!gw;Lclient!ka;B)V")
	private void method184(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class45 arg2) {
		arg2.method5750(arg1);
		@Pc(9) Class364[] local9 = arg2.method5753();
		@Pc(12) Class363[] local12 = arg2.method5745();
		if ((this.aClass4_Sub7_1 == null || this.aClass4_Sub7_1.aBoolean355) && (local9 != null || local12 != null)) {
			this.aClass4_Sub7_1 = Static256.method3629(Static528.anInt8386, true);
		}
		if (this.aClass4_Sub7_1 != null) {
			this.aClass4_Sub7_1.method3627(arg0, (long) Static528.anInt8386, local9, local12);
			this.aClass4_Sub7_1.method3628(super.aByte133, super.aShort130, super.aShort128, super.aShort127, super.aShort129);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean23;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public void method185() {
		if (this.aClass4_Sub7_1 != null) {
			this.aClass4_Sub7_1.method3637();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(11) Class45 local11 = this.method189(arg0, 0, this.anInt152);
		if (local11 != null) {
			@Pc(21) Class86 local21 = arg0.method9699();
			local21.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			this.method184(arg0, local21, local11);
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInt161 : 66;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
	public boolean method187() {
		return this.aClass53_1 != null && !this.aClass53_1.method4075();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(21) Class45 local21 = this.method189(arg0, (this.anInt160 == 0 ? 0 : 5) | 0x800, this.anInt152);
		if (local21 == null) {
			return null;
		}
		if (this.anInt160 != 0) {
			local21.a(this.anInt160 * 2048);
		}
		@Pc(40) Class86 local40 = arg0.method9699();
		local40.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		this.method184(arg0, local40, local21);
		@Pc(59) Class4_Sub8 local59 = Static118.method1730(1, false);
		if (Static591.aBoolean812) {
			local21.method5759(local40, local59.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local21.method5769(local40, local59.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass4_Sub7_1 != null) {
			@Pc(91) Class236 local91 = this.aClass4_Sub7_1.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local91, Static96.anInt1733);
			} else {
				arg0.method9666(local91);
			}
		}
		this.aBoolean23 = local21.F();
		this.anInt161 = local21.fa();
		this.anInt151 = local21.ma();
		return local59;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	public void method188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0 && (this.aClass53_1 != null && !this.aClass53_1.method4098())) {
			this.aClass53_1.method4077(arg1);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!ha;II)Lclient!ka;")
	private Class45 method189(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class347 local8 = Static119.aClass209_1.method4570(arg2);
		@Pc(13) Class133 local13 = Static126.aClass133Array1[super.aByte133];
		@Pc(27) Class133 local27 = super.aByte134 < 3 ? Static126.aClass133Array1[super.aByte134 + 1] : null;
		return this.aClass53_1 == null || this.aClass53_1.method4098() ? local8.method8251(local13, (byte) 2, arg1, super.anInt10229, (Class53) null, local27, arg0, super.anInt10234, super.anInt10228, true) : local8.method8251(local13, (byte) 2, arg1, super.anInt10229, this.aClass53_1, local27, arg0, super.anInt10234, super.anInt10228, true);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_1 != null) {
			this.aClass4_Sub7_1.method3637();
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		this.method188(true, -6);
		return this.anInt151;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z")
	public boolean method191() {
		return this.aClass53_1 == null || this.aClass53_1.method4098();
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}
}
