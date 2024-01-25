import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!ij;")
	public static Class93 aClass93_125;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!tn;")
	public static Class190 aClass190_33 = new Class190(64);

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!cp;")
	public static final Class39 aClass39_7 = new Class39();

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)I")
	public static int method5883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local10 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local10 * arg0;
		} else {
			return local10;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ne;Ljava/lang/String;B)Lclient!bc;")
	public static Class16 method5884(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method3882(arg2);
		}
		@Pc(44) Class16 local44;
		if (arg0 == 1) {
			try {
				Static370.method5988("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1);
				local44 = new Class16();
				local44.anInt381 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class16();
				local44.anInt381 = 2;
				return local44;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local44 = new Class16();
				local44.anInt381 = 1;
				return local44;
			} catch (@Pc(86) Exception local86) {
				local44 = new Class16();
				local44.anInt381 = 2;
				return local44;
			}
		} else if (arg0 == 3) {
			try {
				Static370.method5989(arg1.anApplet1, "loggedout");
			} catch (@Pc(106) Throwable local106) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local44 = new Class16();
				local44.anInt381 = 1;
				return local44;
			} catch (@Pc(128) Exception local128) {
				local44 = new Class16();
				local44.anInt381 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5885(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static289.method5015(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static44.anInt750; local31++) {
			@Pc(36) String local36 = Static85.aStringArray14[local31];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static289.method5015(local36);
			if (local36 != null && local36.equals(local18)) {
				Static44.anInt750--;
				for (@Pc(60) int local60 = local31; local60 < Static44.anInt750; local60++) {
					Static85.aStringArray14[local60] = Static85.aStringArray14[local60 + 1];
					Static20.aStringArray5[local60] = Static20.aStringArray5[local60 + 1];
					Static60.anIntArray185[local60] = Static60.anIntArray185[local60 + 1];
					Static156.aStringArray37[local60] = Static156.aStringArray37[local60 + 1];
					Static349.anIntArray634[local60] = Static349.anIntArray634[local60 + 1];
					Static162.aBooleanArray14[local60] = Static162.aBooleanArray14[local60 + 1];
				}
				Static195.anInt3884 = Static190.anInt456;
				Static125.aClass5_Sub12_Sub2_3.method5125(219);
				Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0));
				Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
				return;
			}
		}
	}
}
