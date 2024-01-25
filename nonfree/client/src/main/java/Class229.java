import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class229 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!ub;")
	private final Class240 aClass240_32 = new Class240(256);

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!ub;")
	private final Class240 aClass240_33 = new Class240(256);

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!pc;")
	private final Class188 aClass188_108;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!pc;")
	private final Class188 aClass188_107;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!pc;Lclient!pc;)V")
	public Class229(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class188 arg1) {
		this.aClass188_108 = arg1;
		this.aClass188_107 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)Lclient!uo;")
	private Class2_Sub41_Sub1 method5262(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 << 4 & 0xFFFB | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(32) long local32 = (long) local21;
		@Pc(39) Class2_Sub41_Sub1 local39 = (Class2_Sub41_Sub1) this.aClass240_33.method5439(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class267 local60 = Static462.method6066(this.aClass188_107, arg0, arg2);
			if (local60 == null) {
				return null;
			}
			local39 = local60.method6067();
			this.aClass240_33.method5430(local32, local39);
			if (arg1 != null) {
				arg1[0] -= local39.aByteArray195.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[IB)Lclient!uo;")
	public Class2_Sub41_Sub1 method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass188_108.method4299() == 1) {
			return this.method5266(arg0, 0, arg1);
		} else if (this.aClass188_108.method4285(arg0) == 1) {
			return this.method5266(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[I)Lclient!uo;")
	private Class2_Sub41_Sub1 method5266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF2);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub41_Sub1 local33 = (Class2_Sub41_Sub1) this.aClass240_33.method5439(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class2_Sub13 local55 = (Class2_Sub13) this.aClass240_32.method5439(local26);
			if (local55 == null) {
				local55 = Static73.method1318(this.aClass188_108, arg1, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass240_32.method5430(local26, local55);
			}
			local33 = local55.method1322(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method6072();
				this.aClass240_33.method5430(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I)Lclient!uo;")
	public Class2_Sub41_Sub1 method5267(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass188_107.method4299() == 1) {
			return this.method5262(0, arg1, arg0);
		} else if (this.aClass188_107.method4285(arg0) == 1) {
			return this.method5262(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
