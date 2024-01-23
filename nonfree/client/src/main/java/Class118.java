import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class118 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!l;")
	private Class101 aClass101_14 = new Class101(256);

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!l;")
	private Class101 aClass101_15 = new Class101(256);

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!ek;")
	private Class42 aClass42_54;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!ek;")
	private Class42 aClass42_51;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ek;Lclient!ek;)V")
	public Class118(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		this.aClass42_54 = arg1;
		this.aClass42_51 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[IIZ)Lclient!lb;")
	private Class2_Sub19_Sub1 method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFE);
		@Pc(17) int local17 = local11 | arg0 << 16;
		@Pc(22) long local22 = (long) local17 ^ 0x100000000L;
		@Pc(39) Class2_Sub19_Sub1 local39 = (Class2_Sub19_Sub1) this.aClass101_15.method2867(local22);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(61) Class2_Sub28 local61 = (Class2_Sub28) this.aClass101_14.method2867(local22);
			if (local61 == null) {
				local61 = Static283.method4408(this.aClass42_54, arg0, arg2);
				if (local61 == null) {
					return null;
				}
				this.aClass101_14.method2860(local61, local22);
			}
			local39 = local61.method4412(arg1);
			if (local39 == null) {
				return null;
			} else {
				local61.method4743();
				this.aClass101_15.method2860(local39, local22);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[I)Lclient!lb;")
	public Class2_Sub19_Sub1 method3234(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass42_51.method1275() == 1) {
			return this.method3236(arg0, 0, arg1);
		} else if (this.aClass42_51.method1269(arg0) == 1) {
			return this.method3236(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[I)Lclient!lb;")
	private Class2_Sub19_Sub1 method3236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = (arg1 >>> 12 | (arg1 & 0x40000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local11 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub19_Sub1 local31 = (Class2_Sub19_Sub1) this.aClass101_15.method2867(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class173 local56 = Static326.method4332(this.aClass42_51, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method4333();
			this.aClass101_15.method2860(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray36.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[I)Lclient!lb;")
	public Class2_Sub19_Sub1 method3238(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass42_54.method1275() == 1) {
			return this.method3233(0, arg1, arg0);
		} else if (this.aClass42_54.method1269(arg0) == 1) {
			return this.method3233(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
