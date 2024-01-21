import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class62 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!ud;")
	private final Class75 aClass75_11 = new Class75(256);

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!ud;")
	private final Class75 aClass75_12 = new Class75(256);

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!c;")
	private final Class10 aClass10_24;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!c;")
	private final Class10 aClass10_23;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!c;Lclient!c;)V")
	public Class62(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		this.aClass10_24 = arg1;
		this.aClass10_23 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[I)Lclient!re;")
	private Class4_Sub6_Sub1 method1365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = arg0 ^ ((arg1 & 0xB0000FFF) << 4 | arg1 >>> 12);
		@Pc(17) int local17 = local11 | arg1 << 16;
		@Pc(20) long local20 = (long) local17;
		@Pc(38) Class4_Sub6_Sub1 local38 = (Class4_Sub6_Sub1) this.aClass75_12.method1896(local20);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class9 local56 = Static135.method224(this.aClass10_23, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local38 = local56.method225();
			this.aClass75_12.method1892(local20, local38);
			if (arg2 != null) {
				arg2[0] -= local38.aByteArray36.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[I)Lclient!re;")
	public Class4_Sub6_Sub1 method1366(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass10_24.method1766() == 1) {
			return this.method1368(arg1, 0, arg0);
		} else if (this.aClass10_24.method1772(arg0) == 1) {
			return this.method1368(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIII)Lclient!re;")
	private Class4_Sub6_Sub1 method1368(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0x30000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub6_Sub1 local33 = (Class4_Sub6_Sub1) this.aClass75_12.method1896(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class4_Sub16 local58 = (Class4_Sub16) this.aClass75_11.method1896(local26);
			if (local58 == null) {
				local58 = Static104.method1726(this.aClass10_24, arg1, arg2);
				if (local58 == null) {
					return null;
				}
				this.aClass75_11.method1892(local26, local58);
			}
			local33 = local58.method1719(arg0);
			if (local33 == null) {
				return null;
			} else {
				local58.method1989();
				this.aClass75_12.method1892(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B[II)Lclient!re;")
	public Class4_Sub6_Sub1 method1371(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass10_23.method1766() == 1) {
			return this.method1365(arg1, 0, arg0);
		} else if (this.aClass10_23.method1772(arg1) == 1) {
			return this.method1365(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
