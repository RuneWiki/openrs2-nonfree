import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
	public static int anInt9293;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
	public static boolean aBoolean676;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "Lclient!oe;")
	public static final Class249 aClass249_13 = new Class249();

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	public static int anInt9303 = 0;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_317 = new Class179(77, 8);

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ns;Z)I")
	public static int method7832(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt5050 == 0) {
			return 0;
		}
		@Pc(66) int local66;
		@Pc(59) int local59;
		if (arg0.anInt5066 != -1) {
			@Pc(19) Class2_Sub1_Sub1_Sub3 local19 = null;
			if (arg0.anInt5066 < 32768) {
				@Pc(45) Class6_Sub44 local45 = (Class6_Sub44) Static349.aClass209_32.method5038((long) arg0.anInt5066);
				if (local45 != null) {
					local19 = local45.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				}
			} else if (arg0.anInt5066 >= 32768) {
				local19 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt5066 - 32768];
			}
			if (local19 != null) {
				local59 = arg0.anInt10006 - local19.anInt10006;
				local66 = arg0.anInt10001 - local19.anInt10001;
				if (local59 != 0 || local66 != 0) {
					arg0.method4327((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub1) {
			@Pc(156) Class2_Sub1_Sub1_Sub3_Sub1 local156 = (Class2_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local156.anInt4207 != -1 && (local156.anInt5119 == 0 || local156.anInt5122 > 0)) {
				local156.method4327(local156.anInt4207);
				local156.anInt4207 = -1;
			}
		} else if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
			@Pc(92) Class2_Sub1_Sub1_Sub3_Sub2 local92 = (Class2_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local92.anInt5136 != -1 && (local92.anInt5119 == 0 || local92.anInt5122 > 0)) {
				local59 = local92.anInt10006 - (local92.anInt5136 - Static534.anInt8753 - Static534.anInt8753) * 256;
				local66 = local92.anInt10001 - (local92.anInt5126 - Static234.anInt4239 - Static234.anInt4239) * 256;
				if (local59 != 0 || local66 != 0) {
					local92.method4327((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
				local92.anInt5136 = -1;
			}
		}
		return arg0.method4335();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public static void method7833() {
		Static17.method471();
		Static594.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public static void method7834(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 8);
		local9.method7979();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)Lclient!qha;")
	public static Class286 method7837(@OriginalArg(0) int arg0) {
		@Pc(8) Class286[] local8 = Static520.method7912();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class286 local21 = local8[local15];
			if (arg0 == local21.anInt8234) {
				return local21;
			}
		}
		return null;
	}
}
