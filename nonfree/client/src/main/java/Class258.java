import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class258 {

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ba;")
	private final Class17 aClass17_32 = new Class17(256);

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Lclient!ba;")
	private final Class17 aClass17_33 = new Class17(256);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!kr;")
	private final Class171 aClass171_130;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!kr;")
	private final Class171 aClass171_132;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!kr;Lclient!kr;)V")
	public Class258(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1) {
		this.aClass171_130 = arg1;
		this.aClass171_132 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[I)Lclient!ti;")
	private Class1_Sub37_Sub1 method6146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xC0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub37_Sub1 local31 = (Class1_Sub37_Sub1) this.aClass17_33.method738(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class159 local52 = Static554.method4066(this.aClass171_132, arg1, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method4069();
			this.aClass17_33.method737(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray111.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B[II)Lclient!ti;")
	public Class1_Sub37_Sub1 method6147(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass171_132.method4331() == 1) {
			return this.method6146(arg1, 0, arg0);
		} else if (this.aClass171_132.method4349(arg1) == 1) {
			return this.method6146(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[II)Lclient!ti;")
	private Class1_Sub37_Sub1 method6148(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF7) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub37_Sub1 local33 = (Class1_Sub37_Sub1) this.aClass17_33.method738(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class1_Sub27 local55 = (Class1_Sub27) this.aClass17_32.method738(local26);
			if (local55 == null) {
				local55 = Static239.method4139(this.aClass171_130, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass17_32.method737(local55, local26);
			}
			local33 = local55.method4140(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method7525();
				this.aClass17_33.method737(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB[I)Lclient!ti;")
	public Class1_Sub37_Sub1 method6150(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass171_130.method4331() == 1) {
			return this.method6148(arg0, arg1, 0);
		} else if (this.aClass171_130.method4349(arg0) == 1) {
			return this.method6148(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
