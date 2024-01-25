import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class160 {

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "Lclient!wa;")
	private final Class354 aClass354_19 = new Class354(256);

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "Lclient!wa;")
	private final Class354 aClass354_20 = new Class354(256);

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_86;

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "Lclient!tf;")
	private final Class322 aClass322_85;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;)V")
	public Class160(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1) {
		this.aClass322_86 = arg0;
		this.aClass322_85 = arg1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "([IIII)Lclient!ug;")
	private Class3_Sub48_Sub1 method3788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub48_Sub1 local33 = (Class3_Sub48_Sub1) this.aClass354_20.method7689(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(65) Class3_Sub50 local65 = (Class3_Sub50) this.aClass354_19.method7689(local26);
			if (local65 == null) {
				local65 = Static577.method7744(this.aClass322_85, arg1, arg2);
				if (local65 == null) {
					return null;
				}
				this.aClass354_19.method7691(local65, local26);
			}
			local33 = local65.method7746(arg0);
			if (local33 == null) {
				return null;
			} else {
				local65.method7825();
				this.aClass354_20.method7691(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[II)Lclient!ug;")
	public Class3_Sub48_Sub1 method3790(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass322_85.method6825() == 1) {
			return this.method3788(arg0, 0, arg1);
		} else if (this.aClass322_85.method6831(arg1) == 1) {
			return this.method3788(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[IBI)Lclient!ug;")
	private Class3_Sub48_Sub1 method3791(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg2;
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub48_Sub1 local36 = (Class3_Sub48_Sub1) this.aClass354_20.method7689(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) Class43 local54 = Static598.method996(this.aClass322_86, arg0, arg2);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method998();
			this.aClass354_20.method7691(local36, local29);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray91.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ[I)Lclient!ug;")
	public Class3_Sub48_Sub1 method3795(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass322_86.method6825() == 1) {
			return this.method3791(0, arg1, arg0);
		} else if (this.aClass322_86.method6831(arg0) == 1) {
			return this.method3791(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
