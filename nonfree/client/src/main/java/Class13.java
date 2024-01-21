import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class13 {

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!jf;")
	private final Class42 aClass42_3 = new Class42(256);

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!pd;")
	private final Class20 aClass20_7;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!pd;")
	private final Class20 aClass20_8;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!pd;Lclient!pd;)V")
	public Class13(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		this.aClass20_7 = arg0;
		this.aClass20_8 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[I)Lclient!ke;")
	private Class4_Sub6_Sub1 method236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(20) int local20 = ((arg0 & 0x20000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class4_Sub6_Sub1 local36 = (Class4_Sub6_Sub1) this.aClass42_3.method1055(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class62 local54 = Static136.method1653(this.aClass20_7, arg0, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method1651();
			this.aClass42_3.method1056(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray13.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([IIII)Lclient!ke;")
	private Class4_Sub6_Sub1 method237(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ ((arg1 & 0xFFF) << 4 | arg1 >>> 12);
		@Pc(27) int local27 = local21 | arg1 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class4_Sub6_Sub1 local39 = (Class4_Sub6_Sub1) this.aClass42_3.method1055(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class72 local57 = Static107.method1882(this.aClass20_8, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local39 = local57.method1883();
			this.aClass42_3.method1056(local39, local32);
			if (arg0 != null) {
				arg0[0] -= local39.aByteArray13.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[I)Lclient!ke;")
	public Class4_Sub6_Sub1 method242(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass20_7.method468() == 1) {
			return this.method236(0, arg0, arg1);
		} else if (this.aClass20_7.method471(arg0) == 1) {
			return this.method236(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([IBI)Lclient!ke;")
	public Class4_Sub6_Sub1 method243(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass20_8.method468() == 1) {
			return this.method237(arg0, 0, arg1);
		} else if (this.aClass20_8.method471(arg1) == 1) {
			return this.method237(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
