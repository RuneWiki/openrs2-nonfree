import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class213 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!jj;")
	private final Class108 aClass108_33 = new Class108(256);

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!jj;")
	private final Class108 aClass108_34 = new Class108(256);

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!dp;")
	private final Class53 aClass53_157;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!dp;")
	private final Class53 aClass53_156;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!dp;Lclient!dp;)V")
	public Class213(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass53_157 = arg1;
		this.aClass53_156 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([III)Lclient!hk;")
	public Class6_Sub11_Sub1 method5633(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass53_157.method1003() == 1) {
			return this.method5637(arg0, 0, arg1);
		} else if (this.aClass53_157.method1011(arg1) == 1) {
			return this.method5637(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIBI)Lclient!hk;")
	private Class6_Sub11_Sub1 method5637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xE0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(35) long local35 = (long) local21 ^ 0x100000000L;
		@Pc(42) Class6_Sub11_Sub1 local42 = (Class6_Sub11_Sub1) this.aClass108_34.method2900(local35);
		if (local42 != null) {
			return local42;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(66) Class6_Sub25 local66 = (Class6_Sub25) this.aClass108_33.method2900(local35);
			if (local66 == null) {
				local66 = Static188.method3551(this.aClass53_157, arg1, arg2);
				if (local66 == null) {
					return null;
				}
				this.aClass108_33.method2898(local35, local66);
			}
			local42 = local66.method3547(arg0);
			if (local42 == null) {
				return null;
			} else {
				local66.method5756();
				this.aClass108_34.method2898(local35, local42);
				return local42;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IB)Lclient!hk;")
	public Class6_Sub11_Sub1 method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass53_156.method1003() == 1) {
			return this.method5640(arg0, arg1, 0);
		} else if (this.aClass53_156.method1011(arg0) == 1) {
			return this.method5640(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[III)Lclient!hk;")
	private Class6_Sub11_Sub1 method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = (arg2 << 4 & 0xFFF3 | arg2 >>> 12) ^ arg0;
		@Pc(30) int local30 = local24 | arg2 << 16;
		@Pc(33) long local33 = (long) local30;
		@Pc(40) Class6_Sub11_Sub1 local40 = (Class6_Sub11_Sub1) this.aClass108_34.method2900(local33);
		if (local40 != null) {
			return local40;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(61) Class12 local61 = Static357.method221(this.aClass53_156, arg2, arg0);
			if (local61 == null) {
				return null;
			}
			local40 = local61.method222();
			this.aClass108_34.method2898(local33, local40);
			if (arg1 != null) {
				arg1[0] -= local40.aByteArray47.length;
			}
			return local40;
		} else {
			return null;
		}
	}
}
