import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class226 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
	public static final int[] anIntArray529 = new int[120];

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!ee;")
	private final Class83 aClass83_25 = new Class83(256);

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!ee;")
	private final Class83 aClass83_26 = new Class83(256);

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!aj;")
	private final Class15 aClass15_100;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!aj;")
	private final Class15 aClass15_99;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray529[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;)V")
	public Class226(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass15_100 = arg0;
		this.aClass15_99 = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III[I)Lclient!ks;")
	private Class3_Sub35_Sub1 method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFF9 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub35_Sub1 local33 = (Class3_Sub35_Sub1) this.aClass83_26.method2368(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class3_Sub41 local57 = (Class3_Sub41) this.aClass83_25.method2368(local26);
			if (local57 == null) {
				local57 = Static377.method5458(this.aClass15_99, arg0, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass83_25.method2377(local26, local57);
			}
			local33 = local57.method5460(arg2);
			if (local33 == null) {
				return null;
			} else {
				local57.method9380();
				this.aClass83_26.method2377(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([IIB)Lclient!ks;")
	public Class3_Sub35_Sub1 method5482(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass15_99.method516() == 1) {
			return this.method5479(0, arg1, arg0);
		} else if (this.aClass15_99.method512(arg1) == 1) {
			return this.method5479(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI[I)Lclient!ks;")
	private Class3_Sub35_Sub1 method5483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF3) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub35_Sub1 local31 = (Class3_Sub35_Sub1) this.aClass83_26.method2368(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class209 local49 = Static683.method5274(this.aClass15_100, arg0, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method5277();
			this.aClass83_26.method2377(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray56.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[II)Lclient!ks;")
	public Class3_Sub35_Sub1 method5484(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass15_100.method516() == 1) {
			return this.method5483(0, arg1, arg0);
		} else if (this.aClass15_100.method512(arg1) == 1) {
			return this.method5483(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
