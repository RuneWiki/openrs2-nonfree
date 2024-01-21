import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class46 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!gf;")
	private final Class28 aClass28_6 = new Class28(256);

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!gf;")
	private final Class28 aClass28_7 = new Class28(256);

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!la;")
	private final Class17 aClass17_25;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!la;")
	private final Class17 aClass17_24;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class46(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1) {
		this.aClass17_25 = arg1;
		this.aClass17_24 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[II)Lclient!pe;")
	public Class4_Sub6_Sub1 method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass17_25.method285() == 1) {
			return this.method1358(0, arg1, arg0);
		} else if (this.aClass17_25.method283(arg0) == 1) {
			return this.method1358(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[I)Lclient!pe;")
	public Class4_Sub6_Sub1 method1356(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass17_24.method285() == 1) {
			return this.method1357(arg1, arg0, 0);
		} else if (this.aClass17_24.method283(arg0) == 1) {
			return this.method1357(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([IIIZ)Lclient!pe;")
	private Class4_Sub6_Sub1 method1357(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | arg2 << 4 & 0xFFFE) ^ arg1;
		@Pc(17) int local17 = local11 | arg2 << 16;
		@Pc(24) long local24 = (long) local17;
		@Pc(31) Class4_Sub6_Sub1 local31 = (Class4_Sub6_Sub1) this.aClass28_7.method770(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class65 local52 = Static140.method1622(this.aClass17_24, arg2, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1623();
			this.aClass28_7.method774(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray46.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[III)Lclient!pe;")
	private Class4_Sub6_Sub1 method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 ^ ((arg0 & 0x10000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local11 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub6_Sub1 local33 = (Class4_Sub6_Sub1) this.aClass28_7.method770(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class4_Sub16 local52 = (Class4_Sub16) this.aClass28_6.method770(local26);
			if (local52 == null) {
				local52 = Static86.method1445(this.aClass17_25, arg0, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass28_6.method774(local26, local52);
			}
			local33 = local52.method1451(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method2004();
				this.aClass28_7.method774(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
