import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class63 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!sb;")
	private final Class66 aClass66_9 = new Class66(256);

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!lc;")
	private final Class40 aClass40_74;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!lc;")
	private final Class40 aClass40_73;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;)V")
	public Class63(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		this.aClass40_74 = arg1;
		this.aClass40_73 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[II)Lclient!ge;")
	private Class4_Sub1_Sub1 method1808(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = (arg2 >>> 12 | arg2 << 4 & 0xFFFB) ^ arg0;
		@Pc(26) int local26 = local16 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class4_Sub1_Sub1 local36 = (Class4_Sub1_Sub1) this.aClass66_9.method1834(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class73 local57 = Static137.method2006(this.aClass40_73, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method2005();
			this.aClass66_9.method1830(local36, local29);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray46.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI[II)Lclient!ge;")
	private Class4_Sub1_Sub1 method1809(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg2 << 4 & 0xFFF9 | arg2 >>> 12) ^ arg0;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class4_Sub1_Sub1 local38 = (Class4_Sub1_Sub1) this.aClass66_9.method1834(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(56) Class52 local56 = Static79.method1428(this.aClass40_74, arg2, arg0);
			if (local56 == null) {
				return null;
			}
			local38 = local56.method1427();
			this.aClass66_9.method1830(local38, local31);
			if (arg1 != null) {
				arg1[0] -= local38.aByteArray46.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)Lclient!ge;")
	public Class4_Sub1_Sub1 method1812(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass40_73.method1101() == 1) {
			return this.method1808(arg1, arg0, 0);
		} else if (this.aClass40_73.method1114(arg1) == 1) {
			return this.method1808(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([III)Lclient!ge;")
	public Class4_Sub1_Sub1 method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass40_74.method1101() == 1) {
			return this.method1809(arg1, arg0, 0);
		} else if (this.aClass40_74.method1114(arg1) == 1) {
			return this.method1809(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
