import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class173 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!du;")
	private final Class81 aClass81_38 = new Class81(256);

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "Lclient!du;")
	private final Class81 aClass81_39 = new Class81(256);

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!wu;")
	private final Class384 aClass384_68;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!wu;")
	private final Class384 aClass384_69;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;)V")
	public Class173(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1) {
		this.aClass384_68 = arg0;
		this.aClass384_69 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)Lclient!ct;")
	public Class5_Sub11_Sub1 method4010(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass384_68.method8865() == 1) {
			return this.method4011(0, arg0, arg1);
		} else if (this.aClass384_68.method8862(arg1) == 1) {
			return this.method4011(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[II)Lclient!ct;")
	private Class5_Sub11_Sub1 method4011(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(34) long local34 = (long) local21;
		@Pc(41) Class5_Sub11_Sub1 local41 = (Class5_Sub11_Sub1) this.aClass81_39.method1599(local34);
		if (local41 != null) {
			return local41;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(62) Class322 local62 = Static657.method7709(this.aClass384_68, arg0, arg2);
			if (local62 == null) {
				return null;
			}
			local41 = local62.method7710();
			this.aClass81_39.method1607(local41, local34);
			if (arg1 != null) {
				arg1[0] -= local41.aByteArray17.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IBII)Lclient!ct;")
	private Class5_Sub11_Sub1 method4012(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFFD) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub11_Sub1 local33 = (Class5_Sub11_Sub1) this.aClass81_39.method1599(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class5_Sub38 local52 = (Class5_Sub38) this.aClass81_38.method1599(local26);
			if (local52 == null) {
				local52 = Static412.method6285(this.aClass384_69, arg2, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass81_38.method1607(local52, local26);
			}
			local33 = local52.method6282(arg0);
			if (local33 == null) {
				return null;
			} else {
				local52.method8911();
				this.aClass81_39.method1607(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IBI)Lclient!ct;")
	public Class5_Sub11_Sub1 method4013(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass384_69.method8865() == 1) {
			return this.method4012(arg0, arg1, 0);
		} else if (this.aClass384_69.method8862(arg1) == 1) {
			return this.method4012(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
