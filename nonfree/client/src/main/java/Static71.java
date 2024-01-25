import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
	public static int anInt1112;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_17 = new Class286(91, -1);

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Z")
	public static boolean aBoolean90 = true;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method907(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(20) char local20 = arg0.charAt(local12);
			if (local20 == '<' || local20 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local8 + local10);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(57) char local57 = arg0.charAt(local49);
			if (local57 == '<') {
				local45.append("<lt>");
			} else if (local57 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local57);
			}
		}
		if (15081 == 15081) {
			return local45.toString();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!wg;)Z")
	public static boolean method908(@OriginalArg(1) Class400 arg0) {
		try {
			return Static449.method6667(arg0);
		} catch (@Pc(16) IOException local16) {
			if (Static178.anInt3225 == 9) {
				arg0.aClass255_2 = null;
				return false;
			} else {
				Static648.method8729();
				return true;
			}
		} catch (@Pc(34) Exception local34) {
			@Pc(114) String local114 = "T2 - " + (arg0.aClass186_196 == null ? -1 : arg0.aClass186_196.method4640()) + "," + (arg0.aClass186_194 == null ? -1 : arg0.aClass186_194.method4640()) + "," + (arg0.aClass186_195 == null ? -1 : arg0.aClass186_195.method4640()) + " - " + arg0.anInt11061 + "," + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] + Static714.anInt11156) + "," + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] + Static339.anInt5859) + " - ";
			for (@Pc(116) int local116 = 0; local116 < arg0.anInt11061 && local116 < 50; local116++) {
				local114 = local114 + arg0.aClass3_Sub28_Sub2_2.aByteArray50[local116] + ",";
			}
			Static64.method799(local114, local34);
			Static483.method7049(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IBI)Z")
	public static boolean method909(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(B)J")
	public static long method912() {
		return Static420.aClass199_1.method8105();
	}
}
