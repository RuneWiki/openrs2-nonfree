import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class47 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!ii;")
	private Class79 aClass79_6 = new Class79(256);

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!ii;")
	private Class79 aClass79_7 = new Class79(256);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!jd;")
	private Class84 aClass84_23;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!jd;")
	private Class84 aClass84_24;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;)V")
	public Class47(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1) {
		this.aClass84_23 = arg1;
		this.aClass84_24 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB[I)Lclient!id;")
	private Class2_Sub9_Sub1 method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(39) Class2_Sub9_Sub1 local39 = (Class2_Sub9_Sub1) this.aClass79_7.method2002(local26);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(61) Class2_Sub22 local61 = (Class2_Sub22) this.aClass79_6.method2002(local26);
			if (local61 == null) {
				local61 = Static223.method3739(this.aClass84_23, arg0, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass79_6.method1994(local26, local61);
			}
			local39 = local61.method3737(arg2);
			if (local39 == null) {
				return null;
			} else {
				local61.method4926();
				this.aClass79_7.method1994(local26, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([IBI)Lclient!id;")
	public Class2_Sub9_Sub1 method1083(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass84_24.method2118() == 1) {
			return this.method1089(arg1, arg0, 0);
		} else if (this.aClass84_24.method2116(arg1) == 1) {
			return this.method1089(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I)Lclient!id;")
	public Class2_Sub9_Sub1 method1086(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass84_23.method2118() == 1) {
			return this.method1082(0, arg0, arg1);
		} else if (this.aClass84_23.method2116(arg0) == 1) {
			return this.method1082(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[IIZ)Lclient!id;")
	private Class2_Sub9_Sub1 method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19 = (arg2 << 4 & 0xFFFC | arg2 >>> 12) ^ arg0;
		@Pc(25) int local25 = local19 | arg2 << 16;
		@Pc(28) long local28 = (long) local25;
		@Pc(35) Class2_Sub9_Sub1 local35 = (Class2_Sub9_Sub1) this.aClass79_7.method2002(local28);
		if (local35 != null) {
			return local35;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class30 local57 = Static304.method647(this.aClass84_24, arg2, arg0);
			if (local57 == null) {
				return null;
			}
			local35 = local57.method646();
			this.aClass79_7.method1994(local28, local35);
			if (arg1 != null) {
				arg1[0] -= local35.aByteArray22.length;
			}
			return local35;
		} else {
			return null;
		}
	}
}
