import java.awt.Frame;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_95 = new Class272(89, 3);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2877(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static575.method7623(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static590.anInt9377; local29++) {
			@Pc(35) String local35 = Static595.aStringArray49[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static575.method7623(local35);
			if (local35 != null && local35.equals(local20)) {
				Static590.anInt9377--;
				for (@Pc(59) int local59 = local29; local59 < Static590.anInt9377; local59++) {
					Static595.aStringArray49[local59] = Static595.aStringArray49[local59 + 1];
					Static588.aStringArray13[local59] = Static588.aStringArray13[local59 + 1];
					Static334.anIntArray461[local59] = Static334.anIntArray461[local59 + 1];
					Static339.aStringArray36[local59] = Static339.aStringArray36[local59 + 1];
					Static394.anIntArray540[local59] = Static394.anIntArray540[local59 + 1];
					Static265.aBooleanArray18[local59] = Static265.aBooleanArray18[local59 + 1];
				}
				Static417.anInt7008 = Static251.anInt4580;
				@Pc(130) Class3_Sub34 local130 = Static374.method5522(Static449.aClass298_152, Static220.aClass287_2);
				local130.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0));
				local130.aClass3_Sub11_Sub1_2.method3136(arg0);
				Static131.method2572(local130);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!n;IIIB)Ljava/awt/Frame;")
	public static Frame method2878(@OriginalArg(0) int arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1.method5204()) {
			return null;
		}
		@Pc(17) Class54[] local17 = Static221.method5007(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg3 == local17[local25].anInt1990 && local17[local25].anInt1988 == arg2 && (!local23 || local17[local25].anInt1992 > arg0)) {
				arg0 = local17[local25].anInt1992;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(94) Class192 local94 = arg1.method5191(arg3, arg2, arg0);
		while (local94.anInt5186 == 0) {
			Static374.method5521(10L);
		}
		@Pc(114) Frame local114 = (Frame) local94.anObject30;
		if (local114 == null) {
			return null;
		} else if (local94.anInt5186 == 2) {
			Static553.method7390(arg1, local114);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/io/File;Ljava/lang/String;)V")
	public static void method2879(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static155.aHashtable2.put(arg1, arg0);
	}
}
