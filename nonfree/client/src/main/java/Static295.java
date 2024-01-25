import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4572(@OriginalArg(0) String arg0) {
		Static170.method2681("", 0, 0, arg0, "", "");
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!lb;Z)I")
	public static int method4575(@OriginalArg(0) Class221 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5068(Static25.anInt416)) {
			local5++;
		}
		if (arg0.method5068(Static148.anInt2795)) {
			local5++;
		}
		if (arg0.method5068(Static133.anInt3371)) {
			local5++;
		}
		if (arg0.method5068(Static534.anInt8996)) {
			local5++;
		}
		if (arg0.method5068(Static8.anInt111)) {
			local5++;
		}
		if (arg0.method5068(Static300.anInt5442)) {
			local5++;
		}
		if (arg0.method5068(Static274.anInt5019)) {
			local5++;
		}
		if (arg0.method5068(Static16.anInt291)) {
			local5++;
		}
		if (arg0.method5068(Static581.anInt9512)) {
			local5++;
		}
		if (arg0.method5068(Static8.anInt109)) {
			local5++;
		}
		if (arg0.method5068(Static221.anInt4257)) {
			local5++;
		}
		if (arg0.method5068(Static168.anInt10675)) {
			local5++;
		}
		if (arg0.method5068(Static330.anInt5761)) {
			local5++;
		}
		if (arg0.method5068(Static145.anInt2755)) {
			local5++;
		}
		if (arg0.method5068(Static700.anInt10967)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!cea;III)Ljava/awt/Frame;")
	public static Frame method4576(@OriginalArg(0) int arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method946()) {
			return null;
		}
		@Pc(18) Class95[] local18 = Static539.method8107(arg1);
		if (local18 == null) {
			return null;
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local18.length; local27++) {
			if (arg0 == local18[local27].anInt2811 && local18[local27].anInt2808 == arg2 && (!local25 || local18[local27].anInt2810 > arg3)) {
				local25 = true;
				arg3 = local18[local27].anInt2810;
			}
		}
		if (!local25) {
			return null;
		}
		@Pc(110) Class201 local110 = arg1.method944(arg0, arg2, arg3);
		while (local110.anInt5729 == 0) {
			Static564.method7845(10L);
		}
		@Pc(131) Frame local131 = (Frame) local110.anObject16;
		if (local131 == null) {
			return null;
		} else if (local110.anInt5729 == 2) {
			Static430.method6332(local131, arg1);
			return null;
		} else {
			return local131;
		}
	}
}
