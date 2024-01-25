import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class220 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!wk;")
	private final Class246 aClass246_29 = new Class246(256);

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!wk;")
	private final Class246 aClass246_30 = new Class246(256);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!nl;")
	private final Class171 aClass171_83;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!nl;")
	private final Class171 aClass171_84;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!nl;Lclient!nl;)V")
	public Class220(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		this.aClass171_83 = arg1;
		this.aClass171_84 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[II)Lclient!qq;")
	public Class2_Sub15_Sub1 method4785(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass171_83.method3770() == 1) {
			return this.method4790(arg0, arg1, 0);
		} else if (this.aClass171_83.method3750(arg1) == 1) {
			return this.method4790(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[I)Lclient!qq;")
	public Class2_Sub15_Sub1 method4786(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass171_84.method3770() == 1) {
			return this.method4789(arg0, arg1, 0);
		} else if (this.aClass171_84.method3750(arg0) == 1) {
			return this.method4789(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[III)Lclient!qq;")
	private Class2_Sub15_Sub1 method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub15_Sub1 local31 = (Class2_Sub15_Sub1) this.aClass246_30.method5613(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class130 local52 = Static400.method3010(this.aClass171_84, arg2, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method3009();
			this.aClass246_30.method5609(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray99.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I[III)Lclient!qq;")
	private Class2_Sub15_Sub1 method4790(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x90000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(35) long local35 = (long) local21 ^ 0x100000000L;
		@Pc(44) Class2_Sub15_Sub1 local44 = (Class2_Sub15_Sub1) this.aClass246_30.method5613(local35);
		if (local44 != null) {
			return local44;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(68) Class2_Sub30 local68 = (Class2_Sub30) this.aClass246_29.method5613(local35);
			if (local68 == null) {
				local68 = Static227.method3708(this.aClass171_83, arg2, arg1);
				if (local68 == null) {
					return null;
				}
				this.aClass246_29.method5609(local68, local35);
			}
			local44 = local68.method3712(arg0);
			if (local44 == null) {
				return null;
			} else {
				local68.method5617();
				this.aClass246_30.method5609(local44, local35);
				return local44;
			}
		} else {
			return null;
		}
	}
}
