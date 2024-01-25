import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!qj;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	public static final int[] anIntArray2 = new int[500];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public static int anInt45 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public static int anInt46 = 100;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method37() {
		@Pc(7) Class139 local7 = null;
		try {
			@Pc(13) Class268 local13 = Static7.aClass93_1.method2100("2", true);
			while (local13.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (local13.anInt7420 == 1) {
				local7 = (Class139) local13.anObject10;
				@Pc(45) byte[] local45 = new byte[(int) local7.method2900()];
				@Pc(59) int local59;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local59) {
					local59 = local7.method2898(local45.length - local47, local47, local45);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static91.method1313(new Class5_Sub15(local45));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method2897();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILjava/lang/String;Lclient!gt;)Lclient!wk;")
	public static Class268 method38(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class93 arg2) {
		if (arg0 == 0) {
			return arg2.method2084(arg1);
		}
		@Pc(39) Class268 local39;
		if (arg0 == 1) {
			try {
				Static471.method4682(arg2.anApplet1, new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg1)).toString() }, "openjs");
				local39 = new Class268();
				local39.anInt7420 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class268();
				local39.anInt7420 = 2;
				return local39;
			}
		} else if (arg0 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_blank");
				local39 = new Class268();
				local39.anInt7420 = 1;
				return local39;
			} catch (@Pc(81) Exception local81) {
				local39 = new Class268();
				local39.anInt7420 = 2;
				return local39;
			}
		} else if (arg0 == 3) {
			try {
				Static471.method4680("loggedout", arg2.anApplet1);
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_top");
				local39 = new Class268();
				local39.anInt7420 = 1;
				return local39;
			} catch (@Pc(123) Exception local123) {
				local39 = new Class268();
				local39.anInt7420 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
