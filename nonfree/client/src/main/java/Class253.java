import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class253 {

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!he;")
	private final Class128 aClass128_33 = new Class128(256);

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "Lclient!he;")
	private final Class128 aClass128_34 = new Class128(256);

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "Lclient!vd;")
	private final Class353 aClass353_80;

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "Lclient!vd;")
	private final Class353 aClass353_81;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;)V")
	public Class253(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1) {
		this.aClass353_80 = arg0;
		this.aClass353_81 = arg1;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[I)Lclient!ut;")
	public Class6_Sub37_Sub1 method6730(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass353_81.method8415() == 1) {
			return this.method6731(arg0, arg1, 0);
		} else if (this.aClass353_81.method8422(arg0) == 1) {
			return this.method6731(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[III)Lclient!ut;")
	private Class6_Sub37_Sub1 method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x10000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub37_Sub1 local33 = (Class6_Sub37_Sub1) this.aClass128_34.method3560(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class6_Sub7 local55 = (Class6_Sub7) this.aClass128_33.method3560(local26);
			if (local55 == null) {
				local55 = Static63.method1139(this.aClass353_81, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass128_33.method3551(local26, local55);
			}
			local33 = local55.method1142(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method9043();
				this.aClass128_34.method3551(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B[II)Lclient!ut;")
	public Class6_Sub37_Sub1 method6733(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass353_80.method8415() == 1) {
			return this.method6736(arg0, arg1, 0);
		} else if (this.aClass353_80.method8422(arg1) == 1) {
			return this.method6736(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([IIZI)Lclient!ut;")
	private Class6_Sub37_Sub1 method6736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22 = arg1 ^ ((arg2 & 0x20000FFF) << 4 | arg2 >>> 12);
		@Pc(28) int local28 = local22 | arg2 << 16;
		@Pc(31) long local31 = (long) local28;
		@Pc(38) Class6_Sub37_Sub1 local38 = (Class6_Sub37_Sub1) this.aClass128_34.method3560(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class258 local56 = Static656.method6812(this.aClass353_80, arg2, arg1);
			if (local56 == null) {
				return null;
			}
			local38 = local56.method6813();
			this.aClass128_34.method3551(local31, local38);
			if (arg0 != null) {
				arg0[0] -= local38.aByteArray111.length;
			}
			return local38;
		} else {
			return null;
		}
	}
}
