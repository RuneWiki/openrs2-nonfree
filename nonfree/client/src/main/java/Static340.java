import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!lha", name = "A", descriptor = "Lclient!kb;")
	public static Class186 aClass186_3;

	@OriginalMember(owner = "client!lha", name = "F", descriptor = "Lclient!ae;")
	public static Class8 aClass8_93;

	@OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
	public static int anInt5881;

	@OriginalMember(owner = "client!lha", name = "N", descriptor = "Lclient!gia;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!lha", name = "p", descriptor = "Lclient!af;")
	public static final Class10 aClass10_37 = new Class10(3000000, 200);

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "([BI)Lclient!raa;")
	public static Class6_Sub4_Sub16 method4995(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub4_Sub16 local9 = new Class6_Sub4_Sub16();
		@Pc(14) Class6_Sub23 local14 = new Class6_Sub23(arg0);
		local14.anInt9901 = local14.aByteArray101.length - 2;
		@Pc(25) int local25 = local14.method8363();
		@Pc(36) int local36 = local14.aByteArray101.length - local25 - 16 - 2;
		local14.anInt9901 = local36;
		@Pc(43) int local43 = local14.method8369();
		local9.anInt8430 = local14.method8363();
		local9.anInt8429 = local14.method8363();
		local9.anInt8431 = local14.method8363();
		local9.anInt8428 = local14.method8363();
		local9.anInt8426 = local14.method8363();
		local9.anInt8427 = local14.method8363();
		@Pc(81) int local81 = local14.method8374();
		@Pc(89) int local89;
		@Pc(95) int local95;
		if (local81 > 0) {
			local9.aClass209Array1 = new Class209[local81];
			for (local89 = 0; local89 < local81; local89++) {
				local95 = local14.method8363();
				@Pc(102) Class209 local102 = new Class209(Static655.method8912(local95));
				local9.aClass209Array1[local89] = local102;
				while (local95-- > 0) {
					@Pc(113) int local113 = local14.method8369();
					@Pc(119) int local119 = local14.method8369();
					local102.method5035((long) local113, new Class6_Sub36(local119));
				}
			}
		}
		local14.anInt9901 = 0;
		local9.aString113 = local14.method8359();
		local9.anIntArray546 = new int[local43];
		local89 = 0;
		while (local14.anInt9901 < local36) {
			local95 = local14.method8363();
			if (local95 == 3) {
				if (local9.aStringArray52 == null) {
					local9.aStringArray52 = new String[local43];
				}
				local9.aStringArray52[local89] = local14.method8354().intern();
			} else if (local95 == 54) {
				if (local9.aLongArray20 == null) {
					local9.aLongArray20 = new long[local43];
				}
				local9.aLongArray20[local89] = local14.method8381();
			} else {
				if (local9.anIntArray547 == null) {
					local9.anIntArray547 = new int[local43];
				}
				if (local95 >= 150 || local95 == 21 || local95 == 38 || local95 == 39) {
					local9.anIntArray547[local89] = local14.method8374();
				} else {
					local9.anIntArray547[local89] = local14.method8369();
				}
			}
			local9.anIntArray546[local89++] = local95;
		}
		return local9;
	}

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "()V")
	public static void method4997() {
		Static354.method5132(Static633.anInt10310);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4998(@OriginalArg(0) Class132 arg0) {
		if (Static277.aBoolean303) {
			Static521.method7354(arg0);
		} else {
			Static387.method5524(arg0);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IZ)V")
	public static void method5000(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = Static182.anInt3138;
		@Pc(14) int local14 = Static243.anInt4304;
		if (arg0 && Static487.aBoolean565) {
			local12 <<= 0x1;
			local14 = -local12;
		}
		Static546.aClass132_13.f(local14, local12);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIB)I")
	public static int method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}
}
