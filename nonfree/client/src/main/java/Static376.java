import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	public static final int[] anIntArray752 = new int[13];

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_158 = new Class133(107, 6);

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_63 = new Class125(10);

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
	public static final int anInt8891 = Static192.method3681(1600);

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method7296() {
		Static549.aClass125_71.method3516();
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Z")
	public static boolean method7297() {
		return Static179.anInt4933 > 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(CZ)Z")
	public static boolean method7299(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z")
	public static boolean method7301(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BC)Z")
	public static boolean method7307(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static369.method5831(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static57.aCharArray3;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static155.aCharArray5;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (arg0 == local55) {
					return true;
				}
			}
			return false;
		}
	}
}
