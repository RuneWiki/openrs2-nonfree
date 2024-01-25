import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
	public static int anInt4686;

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
	public static int anInt4687;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_81 = new Class15("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
	public static final int[] anIntArray379 = new int[13];

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_175 = new Class56(86, 2);

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_176 = new Class56(68, 1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BC)Z")
	public static boolean method3721(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static148.method2082(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static434.aCharArray9;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(38) char[] local38 = Static378.aCharArray8;
			for (@Pc(45) int local45 = 0; local45 < local38.length; local45++) {
				@Pc(51) char local51 = local38[local45];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
	public static boolean method3722() {
		@Pc(8) Class4_Sub30 local8 = (Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262;
		if (local8 == null || local8 == Static41.aClass244_2.aClass4_227) {
			return false;
		} else {
			if (local8.anInt4615 >= 2000) {
				local8.anInt4615 -= 2000;
			}
			return local8.anInt4615 == 1012;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qn;Lclient!gj;Lclient!qn;ILclient!qn;)Z")
	public static boolean method3723(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class4_Sub14_Sub1 arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(4) Class211 arg3) {
		Static383.aClass4_Sub14_Sub1_2 = arg1;
		Static122.aClass211_32 = arg3;
		Static199.aClass211_54 = arg0;
		Static446.aClass211_97 = arg2;
		return true;
	}
}
