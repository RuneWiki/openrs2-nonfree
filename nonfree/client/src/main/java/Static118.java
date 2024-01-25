import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!sw;I)V")
	public static void method1848(@OriginalArg(1) int arg0, @OriginalArg(2) Class342 arg1, @OriginalArg(3) int arg2) {
		Static556.aClass342ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method1849(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(local14 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!sfa;)V")
	public static void method1850(@OriginalArg(1) Class14_Sub2_Sub17 arg0) {
		@Pc(12) boolean local12 = false;
		arg0.method9093();
		for (@Pc(20) Class14_Sub2_Sub17 local20 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local20 != null; local20 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
			if (Static673.method9326(arg0.method8020(), local20.method8020())) {
				Static314.method4993(arg0, local20);
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static440.aClass269_60.method6493(arg0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V")
	public static void method1851() {
		for (@Pc(7) int local7 = 0; local7 < Static117.anInt1906; local7++) {
			@Pc(18) int local18 = Static596.method8450(local7 + Static515.anInt8875, Static117.anInt1906) * Static93.anInt1647;
			for (@Pc(20) int local20 = 0; local20 < Static93.anInt1647; local20++) {
				@Pc(31) int local31 = local18 + Static596.method8450(local20 + Static511.anInt8867, Static93.anInt1647);
				if (Static466.anIntArray414[local31] == Static186.anInt3088) {
					Static276.anInterface22Array1[local31].method9219(0, 0, Static599.anInt9885, Static611.anInt10061, local20 * Static599.anInt9885, Static611.anInt10061 * local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
	public static void method1852() {
		if (Static12.aFrame1 != null) {
			return;
		}
		@Pc(14) int local14 = Static365.anInt6233;
		@Pc(16) int local16 = Static663.anInt10806;
		@Pc(23) int local23 = Static34.anInt543 - Static563.anInt4939 - local14;
		@Pc(31) int local31 = Static235.anInt4561 - local16 - Static506.anInt8791;
		if (local14 <= 0 && local23 <= 0 && local16 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(62) Container local62;
			if (Static613.aFrame2 != null) {
				local62 = Static613.aFrame2;
			} else if (Static531.anApplet2 == null) {
				local62 = Static267.anApplet_Sub1_1;
			} else {
				local62 = Static531.anApplet2;
			}
			@Pc(70) int local70 = 0;
			@Pc(72) int local72 = 0;
			if (Static613.aFrame2 == local62) {
				@Pc(78) Insets local78 = Static613.aFrame2.getInsets();
				local72 = local78.top;
				local70 = local78.left;
			}
			@Pc(87) Graphics local87 = local62.getGraphics();
			local87.setColor(Color.black);
			if (local14 > 0) {
				local87.fillRect(local70, local72, local14, Static235.anInt4561);
			}
			if (local16 > 0) {
				local87.fillRect(local70, local72, Static34.anInt543, local16);
			}
			if (local23 > 0) {
				local87.fillRect(Static34.anInt543 + local70 - local23, local72, local23, Static235.anInt4561);
			}
			if (local31 > 0) {
				local87.fillRect(local70, local72 + Static235.anInt4561 - local31, Static34.anInt543, local31);
				return;
			}
		} catch (@Pc(149) Exception local149) {
			return;
		}
	}
}
