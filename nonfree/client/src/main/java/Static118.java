import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!el", name = "B", descriptor = "I")
	public static int anInt9299;

	@OriginalMember(owner = "client!el", name = "D", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array10;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "[J")
	public static final long[] aLongArray17 = new long[32];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method7552(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static189.method3293(0, arg0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BZ)Lclient!jk;")
	public static Class3_Sub4_Sub14 method7553(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class3_Sub4_Sub14 local7 = new Class3_Sub4_Sub14();
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(arg0);
		local12.anInt7869 = local12.aByteArray86.length - 2;
		@Pc(23) int local23 = local12.method6535();
		@Pc(34) int local34 = local12.aByteArray86.length - local23 - 12 - 2;
		local12.anInt7869 = local34;
		@Pc(41) int local41 = local12.method6497();
		local7.anInt5387 = local12.method6535();
		local7.anInt5389 = local12.method6535();
		local7.anInt5388 = local12.method6535();
		local7.anInt5391 = local12.method6535();
		@Pc(65) int local65 = local12.method6538();
		@Pc(73) int local73;
		@Pc(78) int local78;
		if (local65 > 0) {
			local7.aClass25Array1 = new Class25[local65];
			for (local73 = 0; local73 < local65; local73++) {
				local78 = local12.method6535();
				@Pc(85) Class25 local85 = new Class25(Static178.method3152(local78));
				local7.aClass25Array1[local73] = local85;
				while (local78-- > 0) {
					@Pc(95) int local95 = local12.method6497();
					@Pc(99) int local99 = local12.method6497();
					local85.method945(new Class3_Sub48(local99), (long) local95);
				}
			}
		}
		local12.anInt7869 = 0;
		local7.aString57 = local12.method6512();
		local7.anIntArray318 = new int[local41];
		local7.anIntArray319 = new int[local41];
		local7.aStringArray20 = new String[local41];
		local73 = 0;
		while (local34 > local12.anInt7869) {
			local78 = local12.method6535();
			if (local78 == 3) {
				local7.aStringArray20[local73] = local12.method6536().intern();
			} else if (local78 >= 100 || local78 == 21 || local78 == 38 || local78 == 39) {
				local7.anIntArray319[local73] = local12.method6538();
			} else {
				local7.anIntArray319[local73] = local12.method6497();
			}
			local7.anIntArray318[local73++] = local78;
		}
		return local7;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLclient!sa;Lclient!oa;II)V")
	public static void method7556(@OriginalArg(0) int arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class114 local9 = Static568.aClass315_4.method7655(arg1.anInt8755);
		if (local9.anInt3381 == -1) {
			return;
		}
		if (arg1.aBoolean735) {
			@Pc(26) int local26 = arg4 + arg1.anInt8738;
			arg4 = local26 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class37 local38 = local9.method2982(arg2, arg1.aBoolean727, arg4);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg1.anInt8734;
		@Pc(51) int local51 = arg1.anInt8775;
		if ((arg4 & 0x1) == 1) {
			local51 = arg1.anInt8734;
			local48 = arg1.anInt8775;
		}
		@Pc(67) int local67 = local38.AA();
		@Pc(70) int local70 = local38.a();
		if (local9.aBoolean261) {
			local67 = local48 * 4;
			local70 = local51 * 4;
		}
		if (local9.anInt3377 == 0) {
			local38.method7080(arg0, arg3 + 4 - local51 * 4, local67, local70);
		} else {
			local38.KA(arg0, arg3 + 4 - local51 * 4, local67, local70, 0, local9.anInt3377 | 0xFF000000, 1);
		}
	}
}
