import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static int[] anIntArray1 = new int[32];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!uf;")
	private final Class77 aClass77_1 = new Class77(256);

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!uf;")
	private final Class77 aClass77_2 = new Class77(256);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!fd;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!fd;")
	private final Class24 aClass24_2;

	static {
		@Pc(18) int local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			anIntArray1[local20] = local18 - 1;
			local18 += local18;
		}
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!fd;Lclient!fd;)V")
	public Class1(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1) {
		this.aClass24_1 = arg0;
		this.aClass24_2 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[I)Lclient!s;")
	public Class2_Sub4_Sub1 method6(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass24_2.method1914() == 1) {
			return this.method10(0, arg1, arg0);
		} else if (this.aClass24_2.method1927(arg0) == 1) {
			return this.method10(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II[I)Lclient!s;")
	public Class2_Sub4_Sub1 method8(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass24_1.method1914() == 1) {
			return this.method9(arg0, arg1, 0);
		} else if (this.aClass24_1.method1927(arg0) == 1) {
			return this.method9(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[III)Lclient!s;")
	private Class2_Sub4_Sub1 method9(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg0 ^ ((arg2 & 0x70000FFF) << 4 | arg2 >>> 12);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class2_Sub4_Sub1 local36 = (Class2_Sub4_Sub1) this.aClass77_2.method2034(local29);
		if (local36 != null) {
			return local36;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) Class66 local54 = Static140.method1806(this.aClass24_1, arg2, arg0);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method1807();
			this.aClass77_2.method2030(local29, local36);
			if (arg1 != null) {
				arg1[0] -= local36.aByteArray35.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI[II)Lclient!s;")
	private Class2_Sub4_Sub1 method10(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg0 >>> 12 | (arg0 & 0xFFF) << 4) ^ arg2;
		@Pc(17) int local17 = local11 | arg0 << 16;
		@Pc(22) long local22 = (long) local17 ^ 0x100000000L;
		@Pc(29) Class2_Sub4_Sub1 local29 = (Class2_Sub4_Sub1) this.aClass77_2.method2034(local22);
		if (local29 != null) {
			return local29;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class2_Sub19 local60 = (Class2_Sub19) this.aClass77_1.method2034(local22);
			if (local60 == null) {
				local60 = Static90.method1632(this.aClass24_2, arg0, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass77_1.method2030(local22, local60);
			}
			local29 = local60.method1629(arg1);
			if (local29 == null) {
				return null;
			} else {
				local60.method2209();
				this.aClass77_2.method2030(local22, local29);
				return local29;
			}
		} else {
			return null;
		}
	}
}
