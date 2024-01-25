import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_21 = new Class382(8, 0, 4, 1);

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
	public static int anInt10425 = 0;

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "Z")
	public static boolean aBoolean730 = true;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "[Lclient!vv;")
	public static final Class14_Sub54[] aClass14_Sub54Array1 = new Class14_Sub54[300];

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "Lclient!qga;")
	public static Class299 aClass299_11 = null;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)[Lclient!wba;")
	public static Class386[] method8918() {
		if (Static60.aClass386Array1 == null) {
			@Pc(9) Class386[] local9 = Static231.method3887(Static344.aClass173_5);
			@Pc(13) Class386[] local13 = new Class386[local9.length];
			@Pc(15) int local15 = 0;
			@Pc(20) int local20 = Static181.aClass14_Sub26_9.aClass43_Sub3_1.method1380();
			@Pc(98) int local98;
			@Pc(103) Class386 local103;
			label69: for (@Pc(22) int local22 = 0; local22 < local9.length; local22++) {
				@Pc(27) Class386 local27 = local9[local22];
				if ((local27.anInt10885 <= 0 || local27.anInt10885 >= 24) && local27.anInt10886 >= 800 && local27.anInt10883 >= 600 && (local20 != 2 || local27.anInt10886 <= 800 && local27.anInt10883 <= 600) && (local20 != 1 || local27.anInt10886 <= 1024 && local27.anInt10883 <= 768)) {
					for (local98 = 0; local98 < local15; local98++) {
						local103 = local13[local98];
						if (local103.anInt10886 == local27.anInt10886 && local103.anInt10883 == local27.anInt10883) {
							if (local27.anInt10885 > local103.anInt10885) {
								local13[local98] = local27;
							}
							continue label69;
						}
					}
					local13[local15] = local27;
					local15++;
				}
			}
			Static60.aClass386Array1 = new Class386[local15];
			Static691.method86(local13, 0, Static60.aClass386Array1, 0, local15);
			@Pc(165) int[] local165 = new int[Static60.aClass386Array1.length];
			for (local98 = 0; local98 < Static60.aClass386Array1.length; local98++) {
				local103 = Static60.aClass386Array1[local98];
				local165[local98] = local103.anInt10883 * local103.anInt10886;
			}
			Static599.method8479(local165, Static60.aClass386Array1);
		}
		return Static60.aClass386Array1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!iha;ILjava/lang/String;Ljava/lang/String;I)Lclient!mba;")
	public static Class230 method8919(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg1 == 0) {
			return arg0.method4234(arg2);
		}
		@Pc(55) Class230 local55;
		if (arg1 == 1) {
			try {
				@Pc(34) Object local34 = Static698.method8235(Static531.anApplet2, new Object[] { (new URL(Static531.anApplet2.getCodeBase(), arg2)).toString() }, arg3);
				if (local34 == null) {
					throw new RuntimeException();
				}
				@Pc(45) Class230 local45 = new Class230();
				local45.anInt6256 = 1;
				return local45;
			} catch (@Pc(51) Throwable local51) {
				local55 = new Class230();
				local55.anInt6256 = 2;
				return local55;
			}
		} else if (arg1 == 2) {
			try {
				Static531.anApplet2.getAppletContext().showDocument(new URL(Static531.anApplet2.getCodeBase(), arg2), "_blank");
				local55 = new Class230();
				local55.anInt6256 = 1;
				return local55;
			} catch (@Pc(87) Exception local87) {
				local55 = new Class230();
				local55.anInt6256 = 2;
				return local55;
			}
		} else if (arg1 == 3) {
			try {
				Static698.method8237(Static531.anApplet2, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				Static531.anApplet2.getAppletContext().showDocument(new URL(Static531.anApplet2.getCodeBase(), arg2), "_top");
				local55 = new Class230();
				local55.anInt6256 = 1;
				return local55;
			} catch (@Pc(130) Exception local130) {
				local55 = new Class230();
				local55.anInt6256 = 2;
				return local55;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
