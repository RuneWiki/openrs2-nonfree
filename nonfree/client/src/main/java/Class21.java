import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class21 {

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!ta;")
	private final Class70 aClass70_2 = new Class70(256);

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!q;")
	private final Class62 aClass62_9;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!q;")
	private final Class62 aClass62_10;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!q;Lclient!q;)V")
	public Class21(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		this.aClass62_9 = arg0;
		this.aClass62_10 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([IIB)Lclient!pd;")
	public Class1_Sub16_Sub1 method693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass62_9.method2014() == 1) {
			return this.method699(arg0, 0, arg1);
		} else if (this.aClass62_9.method1999(arg1) == 1) {
			return this.method699(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([III)Lclient!pd;")
	public Class1_Sub16_Sub1 method694(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass62_10.method2014() == 1) {
			return this.method697(0, arg0, arg1);
		} else if (this.aClass62_10.method1999(arg1) == 1) {
			return this.method697(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[III)Lclient!pd;")
	private Class1_Sub16_Sub1 method697(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF3 | arg0 >>> 12) ^ arg2;
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class1_Sub16_Sub1 local38 = (Class1_Sub16_Sub1) this.aClass70_2.method1961(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class52 local59 = Static83.method1408(this.aClass62_10, arg0, arg2);
			if (local59 == null) {
				return null;
			}
			local38 = local59.method1409();
			this.aClass70_2.method1955(local38, local31);
			if (arg1 != null) {
				arg1[0] -= local38.aByteArray72.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([IIII)Lclient!pd;")
	private Class1_Sub16_Sub1 method699(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = (arg1 << 4 & 0xFFF1 | arg1 >>> 12) ^ arg2;
		@Pc(26) int local26 = local16 | arg1 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class1_Sub16_Sub1 local36 = (Class1_Sub16_Sub1) this.aClass70_2.method1961(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class51 local57 = Static134.method1393(this.aClass62_9, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method1392();
			this.aClass70_2.method1955(local36, local29);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray72.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
