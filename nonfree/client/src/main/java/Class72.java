import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class72 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!lc;")
	private final Class54 aClass54_10 = new Class54(256);

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!lc;")
	private final Class54 aClass54_11 = new Class54(256);

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!bc;")
	private final Class1 aClass1_20;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!bc;")
	private final Class1 aClass1_21;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!bc;Lclient!bc;)V")
	public Class72(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		this.aClass1_20 = arg0;
		this.aClass1_21 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[II)Lclient!oc;")
	public Class3_Sub19_Sub1 method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass1_21.method50() == 1) {
			return this.method2056(0, arg0, arg1);
		} else if (this.aClass1_21.method56(arg0) == 1) {
			return this.method2056(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB[I)Lclient!oc;")
	public Class3_Sub19_Sub1 method2053(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass1_20.method50() == 1) {
			return this.method2058(0, arg1, arg0);
		} else if (this.aClass1_20.method56(arg0) == 1) {
			return this.method2058(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[II)Lclient!oc;")
	private Class3_Sub19_Sub1 method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class3_Sub19_Sub1 local38 = (Class3_Sub19_Sub1) this.aClass54_11.method1496(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class3_Sub18 local57 = (Class3_Sub18) this.aClass54_10.method1496(local31);
			if (local57 == null) {
				local57 = Static115.method1783(this.aClass1_21, arg0, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass54_10.method1494(local31, local57);
			}
			local38 = local57.method1777(arg2);
			if (local38 == null) {
				return null;
			} else {
				local57.method3159();
				this.aClass54_11.method1494(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II[II)Lclient!oc;")
	private Class3_Sub19_Sub1 method2058(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x60000FFF) << 4);
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class3_Sub19_Sub1 local36 = (Class3_Sub19_Sub1) this.aClass54_11.method1496(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) Class75 local54 = Static203.method2080(this.aClass1_20, arg0, arg2);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method2079();
			this.aClass54_11.method1494(local29, local36);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray37.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
