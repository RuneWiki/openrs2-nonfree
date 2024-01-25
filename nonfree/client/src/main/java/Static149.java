import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	public static int anInt3091 = 0;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[128][128];

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	public static int anInt3097 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2451(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static54.method895(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(43) int local43 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(46) int local46;
			do {
				local46 = arg1.nextInt();
			} while (local46 >= local43);
			return Static408.method5375(arg0, local46);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIZ)V")
	public static void method2452(@OriginalArg(3) boolean arg0) {
		Static314.aBoolean392 = arg0;
		Static410.anInt6842 = 22050;
		Static41.anInt770 = 2;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;ZLclient!mg;I)Lclient!lk;")
	public static Class153 method2453(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class160 arg2) {
		@Pc(22) int local22 = arg2.method3704(arg0);
		if (local22 == -1) {
			return new Class153(0);
		}
		@Pc(35) int[] local35 = arg2.method3723(local22);
		@Pc(41) Class153 local41 = new Class153(local35.length);
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		while (true) {
			while (local43 < local41.anInt4339) {
				@Pc(61) Class2_Sub23 local61 = new Class2_Sub23(arg2.method3696(local35[local45++], local22));
				@Pc(65) int local65 = local61.method5508();
				@Pc(69) int local69 = local61.method5500();
				@Pc(73) int local73 = local61.method5495();
				if (!arg1 && local73 == 1) {
					local41.anInt4339--;
				} else {
					local41.anIntArray367[local43] = local65;
					local41.anIntArray366[local43] = local69;
					local43++;
				}
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)V")
	public static void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 > Static181.anInt3543 || arg1 < Static430.anInt7123) {
			return;
		}
		@Pc(26) boolean local26;
		if (Static8.anInt223 > arg2) {
			arg2 = Static8.anInt223;
			local26 = false;
		} else if (Static184.anInt3600 < arg2) {
			arg2 = Static184.anInt3600;
			local26 = false;
		} else {
			local26 = true;
		}
		@Pc(61) boolean local61;
		if (Static8.anInt223 > arg4) {
			arg4 = Static8.anInt223;
			local61 = false;
		} else if (Static184.anInt3600 < arg4) {
			arg4 = Static184.anInt3600;
			local61 = false;
		} else {
			local61 = true;
		}
		if (arg3 < Static430.anInt7123) {
			arg3 = Static430.anInt7123;
		} else {
			Static64.method1247(arg2, Static280.anIntArrayArray51[arg3++], arg4, arg0);
		}
		if (Static181.anInt3543 < arg1) {
			arg1 = Static181.anInt3543;
		} else {
			Static64.method1247(arg2, Static280.anIntArrayArray51[arg1--], arg4, arg0);
		}
		@Pc(113) int local113;
		if (local26 && local61) {
			for (local113 = arg3; local113 <= arg1; local113++) {
				@Pc(119) int[] local119 = Static280.anIntArrayArray51[local113];
				local119[arg2] = local119[arg4] = arg0;
			}
		} else if (local26) {
			for (local113 = arg3; local113 <= arg1; local113++) {
				Static280.anIntArrayArray51[local113][arg2] = arg0;
			}
		} else if (local61) {
			for (local113 = arg3; local113 <= arg1; local113++) {
				Static280.anIntArrayArray51[local113][arg4] = arg0;
			}
		}
	}
}
