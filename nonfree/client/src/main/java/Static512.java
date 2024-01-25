import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_134 = new Class47(60, -1);

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
	public static int anInt8676 = 1;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
	public static void method7099() {
		@Pc(12) Class31 local12 = null;
		try {
			local12 = Static426.method6120("2");
			@Pc(27) Class6_Sub21 local27 = new Class6_Sub21(Static88.anInt1751 * 6 + 3);
			local27.method6062(1);
			local27.method6052(Static88.anInt1751);
			for (@Pc(37) int local37 = 0; local37 < Static395.anIntArray511.length; local37++) {
				if (Static165.aBooleanArray29[local37]) {
					local27.method6052(local37);
					local27.method6033(Static395.anIntArray511[local37]);
				}
			}
			local12.method1005(local27.aByteArray93, local27.anInt7338, 0);
		} catch (@Pc(68) Exception local68) {
		}
		try {
			if (local12 != null) {
				local12.method1007();
			}
		} catch (@Pc(75) Exception local75) {
		}
		Static559.aLong254 = Static8.method201();
		Static185.aBoolean264 = false;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
	public static void method7101() {
		Static541.aClass361_51 = new Class361();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!e;ILjava/awt/Canvas;)Lclient!oa;")
	public static Class14 method7103(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class14_Sub3(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
	public static void method7104() {
		Static583.aFont2 = null;
		Static34.anImage1 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!pv;IIIII)V")
	public static void method7108(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt9438 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub7Array6[local4] != null) {
				arg0.anInt9438++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt9438; local22++) {
			@Pc(31) long local31 = Static362.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class78 local41;
			while (local31 != 0L) {
				local41 = Static478.aClass78Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub7_1 == arg0.aClass6_Sub7Array6[local22]) {
					continue label51;
				}
			}
			local31 = Static362.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static478.aClass78Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub7_1 == arg0.aClass6_Sub7Array6[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt9438 - 1; local93++) {
				arg0.aClass6_Sub7Array6[local93] = arg0.aClass6_Sub7Array6[local93 + 1];
			}
			arg0.anInt9438--;
		}
	}
}
