import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt1007;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array21;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)I")
	public static int method742(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!bf;I)V")
	public static void method743(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.aClass8_1 = null;
		@Pc(12) int local12 = arg0.aClass2_Sub5Array1.length;
		for (@Pc(23) int local23 = 0; local23 < local12; local23++) {
			arg0.aClass2_Sub5Array1[local23].aBoolean396 = false;
		}
		@Pc(37) Class32[] local37 = Class9.aClass32Array1;
		synchronized (Class9.aClass32Array1) {
			if (local12 < Class9.aClass32Array1.length && Static125.anIntArray260[local12] < 200) {
				Class9.aClass32Array1[local12].method844(arg0);
				@Pc(58) int local58 = Static125.anIntArray260[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!nf;")
	public static Class141 method744(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static170.aClass198_129;
		@Pc(14) Class141 local14;
		synchronized (Static170.aClass198_129) {
			local14 = (Class141) Static170.aClass198_129.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static183.aClass193_67.method5047(Static55.method1176(arg0), Static265.method4584(arg0));
		local14 = new Class141();
		local14.anInt4391 = arg0;
		if (local34 != null) {
			local14.method3905(new Class4_Sub11(local34));
		}
		local14.method3900();
		@Pc(60) Class198 local60 = Static170.aClass198_129;
		synchronized (Static170.aClass198_129) {
			Static170.aClass198_129.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)C")
	public static char method745(@OriginalArg(1) byte arg0) {
		@Pc(16) int local16 = arg0 & 0xFF;
		if (local16 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local16, 16) + " provided");
		}
		if (local16 >= 128 && local16 < 160) {
			@Pc(50) char local50 = Static5.aCharArray5[local16 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local16 = local50;
		}
		return (char) local16;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
	public static void method746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
		Static15.aClass4_Sub11_Sub1_2.method3434(20);
		Static15.aClass4_Sub11_Sub1_2.method3434(arg3);
		Static15.aClass4_Sub11_Sub1_2.method3434(arg2);
		Static15.aClass4_Sub11_Sub1_2.method3402(arg0);
		Static15.aClass4_Sub11_Sub1_2.method3402(arg1);
		Static166.anInt3583 = 0;
		Static222.anInt4518 = 1;
		Static122.anInt2882 = 0;
		Static288.anInt5640 = -3;
	}
}
