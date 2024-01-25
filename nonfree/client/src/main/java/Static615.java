import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
	public static int anInt10064;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
	public static int anInt10066;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Lclient!jk;")
	public static final Class176 aClass176_7 = new Class176("runescape", 0);

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "[I")
	public static final int[] anIntArray665 = new int[5];

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
	public static int anInt10065 = 1;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!tja;)Z")
	public static boolean method8500(@OriginalArg(1) Class338 arg0) {
		return arg0 == null ? false : Static602.method8296(arg0.anInt9477, arg0.anInt9470 - arg0.anInt9482, arg0.anInt9478 + -arg0.anInt9477, arg0.anInt9482, arg0.anInt9474, arg0.anInt9471 - arg0.anInt9474);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
	public static void method8501() {
		for (@Pc(15) Class6_Sub4_Sub10 local15 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local15 != null; local15 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
			if (local15.anInt5448 > 1) {
				local15.anInt5448 = 0;
				Static653.aClass10_63.method366(local15, ((Class6_Sub4_Sub12) local15.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67).aLong225);
				local15.aClass384_11.method8913();
			}
		}
		Static305.anInt5201 = 0;
		Static183.anInt3155 = 0;
		Static31.aClass362_3.method8543();
		Static472.aClass209_45.method5041();
		Static258.aClass384_7.method8913();
		Static277.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(II)V")
	public static void method8503(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub4_Sub18 local13 = Static565.method7924((long) arg0, 6);
		local13.method7979();
	}
}
