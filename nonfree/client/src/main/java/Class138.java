import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class138 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!bc;")
	private final Class25 aClass25_16 = new Class25(256);

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!bc;")
	private final Class25 aClass25_17 = new Class25(256);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!pe;")
	private final Class254 aClass254_58;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!pe;")
	private final Class254 aClass254_59;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;)V")
	public Class138(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1) {
		this.aClass254_58 = arg1;
		this.aClass254_59 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI[I)Lclient!bp;")
	public Class3_Sub6_Sub1 method3283(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass254_59.method6421() == 1) {
			return this.method3285(arg1, 0, arg0);
		} else if (this.aClass254_59.method6396(arg0) == 1) {
			return this.method3285(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[II)Lclient!bp;")
	public Class3_Sub6_Sub1 method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass254_58.method6421() == 1) {
			return this.method3286(arg1, arg0, 0);
		} else if (this.aClass254_58.method6396(arg0) == 1) {
			return this.method3286(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lclient!bp;")
	private Class3_Sub6_Sub1 method3285(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0x80000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(33) long local33 = (long) local21;
		@Pc(42) Class3_Sub6_Sub1 local42 = (Class3_Sub6_Sub1) this.aClass25_17.method946(local33);
		if (local42 != null) {
			return local42;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class273 local60 = Static607.method6869(this.aClass254_59, arg1, arg2);
			if (local60 == null) {
				return null;
			}
			local42 = local60.method6871();
			this.aClass25_17.method945(local42, local33);
			if (arg0 != null) {
				arg0[0] -= local42.aByteArray13.length;
			}
			return local42;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I[III)Lclient!bp;")
	private Class3_Sub6_Sub1 method3286(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg2 & 0x50000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub6_Sub1 local33 = (Class3_Sub6_Sub1) this.aClass25_17.method946(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class3_Sub16 local55 = (Class3_Sub16) this.aClass25_16.method946(local26);
			if (local55 == null) {
				local55 = Static176.method3135(this.aClass254_58, arg2, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass25_16.method945(local55, local26);
			}
			local33 = local55.method3134(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method8412();
				this.aClass25_17.method945(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
