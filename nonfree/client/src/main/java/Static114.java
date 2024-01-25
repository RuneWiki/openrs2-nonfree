import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!qs;")
	public static Class211 aClass211_32;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!o;")
	public static Class137 aClass137_4;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
	public static final int[] anIntArray278 = new int[50];

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_67 = new Class158("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIB)Lclient!wu;")
	public static Class1_Sub46 method1848(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class1_Sub46) Static261.aClass38_26.method765(local12);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!l;Ljava/awt/Canvas;I)Lclient!za;")
	public static Class106 method1849(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class106_Sub1(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!qs;III)Lclient!uq;")
	public static Class1_Sub1_Sub17 method1850(@OriginalArg(0) Class211 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub3 local14 = new Class1_Sub3(arg0.method4758(arg1, arg2));
		@Pc(47) Class1_Sub1_Sub17 local47 = new Class1_Sub1_Sub17(arg1, local14.method1201(), local14.method1201(), local14.method1188(), local14.method1188(), local14.method1171() == 1, local14.method1171(), local14.method1171());
		@Pc(51) int local51 = local14.method1171();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass203_48.method4551(new Class1_Sub30(local14.method1171(), local14.method1177(), local14.method1177(), local14.method1177(), local14.method1177(), local14.method1177(), local14.method1177(), local14.method1177(), local14.method1177()));
		}
		local47.method5654();
		return local47;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
	public static int method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static16.anIntArray23[arg0 & 0x3] : 256;
	}
}
