import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public static int anInt6618;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[J")
	public static long[] aLongArray13;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!lq;")
	public static Class202 aClass202_6;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt6620 = 0;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt6621 = 0;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt6623 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method5246() {
		Static505.aClass167_56.method3961();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!ek;)V")
	public static void method5249(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(9) int local9 = arg0.method7019();
		Static212.aClass216Array1 = new Class216[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static212.aClass216Array1[local14] = new Class216();
			Static212.aClass216Array1[local14].anInt6364 = arg0.method7019();
			Static212.aClass216Array1[local14].aString132 = arg0.method7006();
		}
		Static239.anInt5018 = arg0.method7019();
		Static403.anInt7841 = arg0.method7019();
		Static112.anInt2568 = arg0.method7019();
		Static481.aClass222_Sub1Array2 = new Class222_Sub1[Static403.anInt7841 + 1 - Static239.anInt5018];
		for (@Pc(68) int local68 = 0; local68 < Static112.anInt2568; local68++) {
			@Pc(74) int local74 = arg0.method7019();
			@Pc(82) Class222_Sub1 local82 = Static481.aClass222_Sub1Array2[local74] = new Class222_Sub1();
			local82.anInt10272 = arg0.method7004();
			local82.anInt10271 = arg0.method6990();
			local82.anInt10276 = Static239.anInt5018 + local74;
			local82.aString223 = arg0.method7006();
			local82.aString224 = arg0.method7006();
		}
		Static438.anInt8366 = arg0.method6990();
		Static543.aBoolean666 = true;
	}
}
