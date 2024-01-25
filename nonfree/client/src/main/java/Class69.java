import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class69 {

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!ru;")
	private final Class220 aClass220_5 = new Class220(256);

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!ru;")
	private final Class220 aClass220_6 = new Class220(256);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!mn;")
	private final Class171 aClass171_22;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!mn;")
	private final Class171 aClass171_23;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!mn;Lclient!mn;)V")
	public Class69(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		this.aClass171_22 = arg1;
		this.aClass171_23 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I)Lclient!lf;")
	public Class2_Sub14_Sub1 method1418(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass171_23.method3677() == 1) {
			return this.method1422(0, arg1, arg0);
		} else if (this.aClass171_23.method3662(arg0) == 1) {
			return this.method1422(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[III)Lclient!lf;")
	private Class2_Sub14_Sub1 method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0xFFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class2_Sub14_Sub1 local38 = (Class2_Sub14_Sub1) this.aClass220_6.method5099(local26);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class2_Sub41 local57 = (Class2_Sub41) this.aClass220_5.method5099(local26);
			if (local57 == null) {
				local57 = Static403.method5632(this.aClass171_22, arg2, arg0);
				if (local57 == null) {
					return null;
				}
				this.aClass220_5.method5104(local57, local26);
			}
			local38 = local57.method5631(arg1);
			if (local38 == null) {
				return null;
			} else {
				local57.method6260();
				this.aClass220_6.method5104(local38, local26);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([III)Lclient!lf;")
	public Class2_Sub14_Sub1 method1421(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass171_22.method3677() == 1) {
			return this.method1420(arg1, arg0, 0);
		} else if (this.aClass171_22.method3662(arg1) == 1) {
			return this.method1420(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[II)Lclient!lf;")
	private Class2_Sub14_Sub1 method1422(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub14_Sub1 local31 = (Class2_Sub14_Sub1) this.aClass220_6.method5099(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class149 local52 = Static469.method3064(this.aClass171_23, arg0, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method3063();
			this.aClass220_6.method5104(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray50.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
