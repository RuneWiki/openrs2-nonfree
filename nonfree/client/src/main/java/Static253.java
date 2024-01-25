import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V")
	public static void method4430() {
		Static112.aClass245_24.method6083(50);
		Static226.aClass245_36.method6083(50);
		Static279.aClass245_43.method6083(50);
		Static483.aClass245_61.method6083(50);
		Static369.aClass245_51.method6083(50);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIILclient!kv;Lclient!kv;)V")
	public static void method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub4 arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class224 local4 = Static178.method3530(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub4_3 = arg3;
			local4.aClass11_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!iaa;)V")
	public static void method4454(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(9) int local9 = arg0.method4973();
		Static193.aClass262Array1 = new Class262[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static193.aClass262Array1[local14] = new Class262();
			Static193.aClass262Array1[local14].anInt7748 = arg0.method4973();
			Static193.aClass262Array1[local14].aString99 = arg0.method4945();
		}
		Static74.anInt8666 = arg0.method4973();
		Static13.anInt573 = arg0.method4973();
		Static511.anInt9007 = arg0.method4973();
		Static548.aClass116_Sub1Array2 = new Class116_Sub1[Static13.anInt573 + 1 - Static74.anInt8666];
		for (@Pc(66) int local66 = 0; local66 < Static511.anInt9007; local66++) {
			@Pc(72) int local72 = arg0.method4973();
			@Pc(80) Class116_Sub1 local80 = Static548.aClass116_Sub1Array2[local72] = new Class116_Sub1();
			local80.anInt3890 = arg0.method4966();
			local80.anInt3892 = arg0.method5000();
			local80.anInt3901 = Static74.anInt8666 + local72;
			local80.aString40 = arg0.method4945();
			local80.aString39 = arg0.method4945();
		}
		Static100.anInt2364 = arg0.method5000();
		Static522.aBoolean685 = true;
	}
}
