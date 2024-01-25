import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class108 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!ica;")
	private final Class127 aClass127_26 = new Class127(256);

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!ica;")
	private final Class127 aClass127_27 = new Class127(256);

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!dda;")
	private final Class53 aClass53_54;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_53;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!dda;Lclient!dda;)V")
	public Class108(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass53_54 = arg0;
		this.aClass53_53 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([IIII)Lclient!mca;")
	private Class2_Sub31_Sub1 method2840(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | (arg1 & 0x50000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub31_Sub1 local33 = (Class2_Sub31_Sub1) this.aClass127_27.method3205(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(64) Class2_Sub6 local64 = (Class2_Sub6) this.aClass127_26.method3205(local26);
			if (local64 == null) {
				local64 = Static27.method616(this.aClass53_53, arg1, arg2);
				if (local64 == null) {
					return null;
				}
				this.aClass127_26.method3213(local64, local26);
			}
			local33 = local64.method613(arg0);
			if (local33 == null) {
				return null;
			} else {
				local64.method7802();
				this.aClass127_27.method3213(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)Lclient!mca;")
	public Class2_Sub31_Sub1 method2842(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass53_53.method1607() == 1) {
			return this.method2840(arg0, 0, arg1);
		} else if (this.aClass53_53.method1592(arg1) == 1) {
			return this.method2840(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[II)Lclient!mca;")
	public Class2_Sub31_Sub1 method2843(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass53_54.method1607() == 1) {
			return this.method2845(arg0, 0, arg1);
		} else if (this.aClass53_54.method1592(arg1) == 1) {
			return this.method2845(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([IBII)Lclient!mca;")
	private Class2_Sub31_Sub1 method2845(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF9);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub31_Sub1 local31 = (Class2_Sub31_Sub1) this.aClass127_27.method3205(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class70 local57 = Static550.method2068(this.aClass53_54, arg1, arg2);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method2066();
			this.aClass127_27.method3213(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray91.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
