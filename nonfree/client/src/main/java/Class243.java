import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class243 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
	public static final int[] anIntArray569 = new int[120];

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Lclient!hl;")
	private final Class96 aClass96_37 = new Class96(256);

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!hl;")
	private final Class96 aClass96_38 = new Class96(256);

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!ci;")
	private final Class38 aClass38_81;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Lclient!ci;")
	private final Class38 aClass38_82;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray569[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ci;Lclient!ci;)V")
	public Class243(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class38 arg1) {
		this.aClass38_81 = arg0;
		this.aClass38_82 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[III)Lclient!cv;")
	private Class4_Sub9_Sub1 method5610(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ (arg0 << 4 & 0xFFF4 | arg0 >>> 12);
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class4_Sub9_Sub1 local39 = (Class4_Sub9_Sub1) this.aClass96_38.method2797(local32);
		if (local39 != null) {
			return local39;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(61) Class4_Sub34 local61 = (Class4_Sub34) this.aClass96_37.method2797(local32);
			if (local61 == null) {
				local61 = Static333.method4923(this.aClass38_82, arg0, arg2);
				if (local61 == null) {
					return null;
				}
				this.aClass96_37.method2805(local32, local61);
			}
			local39 = local61.method4918(arg1);
			if (local39 == null) {
				return null;
			} else {
				local61.method6330();
				this.aClass96_38.method2805(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[II)Lclient!cv;")
	public Class4_Sub9_Sub1 method5611(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass38_82.method1035() == 1) {
			return this.method5610(0, arg0, arg1);
		} else if (this.aClass38_82.method1032(arg1) == 1) {
			return this.method5610(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIB)Lclient!cv;")
	public Class4_Sub9_Sub1 method5614(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_81.method1035() == 1) {
			return this.method5616(arg0, 0, arg1);
		} else if (this.aClass38_81.method1032(arg1) == 1) {
			return this.method5616(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIII)Lclient!cv;")
	private Class4_Sub9_Sub1 method5616(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFA) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub9_Sub1 local31 = (Class4_Sub9_Sub1) this.aClass96_38.method2797(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class110 local52 = Static473.method3025(this.aClass38_81, arg1, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method3023();
			this.aClass96_38.method2805(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray18.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
