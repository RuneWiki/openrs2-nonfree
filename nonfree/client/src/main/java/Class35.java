import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class35 {

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!wc;")
	private final Class81 aClass81_6 = new Class81(256);

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Lclient!wc;")
	private final Class81 aClass81_7 = new Class81(256);

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!ea;")
	private final Class20 aClass20_29;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!ea;")
	private final Class20 aClass20_30;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ea;Lclient!ea;)V")
	public Class35(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		this.aClass20_29 = arg1;
		this.aClass20_30 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[II)Lclient!ib;")
	private Class4_Sub13_Sub1 method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub13_Sub1 local31 = (Class4_Sub13_Sub1) this.aClass81_7.method2010(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class65 local57 = Static141.method1716(this.aClass20_30, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method1715();
			this.aClass81_7.method2015(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray12.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[I)Lclient!ib;")
	public Class4_Sub13_Sub1 method1034(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass20_30.method595() == 1) {
			return this.method1032(arg0, arg1, 0);
		} else if (this.aClass20_30.method591(arg0) == 1) {
			return this.method1032(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([IBI)Lclient!ib;")
	public Class4_Sub13_Sub1 method1035(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass20_29.method595() == 1) {
			return this.method1038(arg1, 0, arg0);
		} else if (this.aClass20_29.method591(arg1) == 1) {
			return this.method1038(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB[I)Lclient!ib;")
	private Class4_Sub13_Sub1 method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFF);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub13_Sub1 local33 = (Class4_Sub13_Sub1) this.aClass81_7.method2010(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class4_Sub17 local63 = (Class4_Sub17) this.aClass81_6.method2010(local26);
			if (local63 == null) {
				local63 = Static77.method1294(this.aClass20_29, arg1, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass81_6.method2015(local26, local63);
			}
			local33 = local63.method1290(arg2);
			if (local33 == null) {
				return null;
			} else {
				local63.method1999();
				this.aClass81_7.method2015(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
