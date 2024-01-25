import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class93 {

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "Lclient!hd;")
	private final Class128 aClass128_8 = new Class128(256);

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!hd;")
	private final Class128 aClass128_9 = new Class128(256);

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_35;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_34;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;)V")
	public Class93(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		this.aClass251_35 = arg0;
		this.aClass251_34 = arg1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z[III)Lclient!ft;")
	private Class6_Sub19_Sub1 method2626(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFD) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(36) Class6_Sub19_Sub1 local36 = (Class6_Sub19_Sub1) this.aClass128_9.method3263(local24);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class141 local57 = Static605.method3635(this.aClass251_35, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method3637();
			this.aClass128_9.method3267(local36, local24);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray13.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "([III)Lclient!ft;")
	public Class6_Sub19_Sub1 method2628(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass251_34.method5755() == 1) {
			return this.method2631(arg1, arg0, 0);
		} else if (this.aClass251_34.method5768(arg1) == 1) {
			return this.method2631(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BI[I)Lclient!ft;")
	public Class6_Sub19_Sub1 method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass251_35.method5755() == 1) {
			return this.method2626(arg1, 0, arg0);
		} else if (this.aClass251_35.method5768(arg0) == 1) {
			return this.method2626(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[IIB)Lclient!ft;")
	private Class6_Sub19_Sub1 method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub19_Sub1 local33 = (Class6_Sub19_Sub1) this.aClass128_9.method3263(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class6_Sub22 local52 = (Class6_Sub22) this.aClass128_8.method3263(local26);
			if (local52 == null) {
				local52 = Static191.method3461(this.aClass251_34, arg2, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass128_8.method3267(local52, local26);
			}
			local33 = local52.method3458(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method7804();
				this.aClass128_9.method3267(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
