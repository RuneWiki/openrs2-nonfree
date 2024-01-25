import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "Lclient!gb;")
	public static Class88 aClass88_8;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "[S")
	public static final short[] aShortArray101 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5005(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)[Lclient!td;")
	public static Class233[] method5008() {
		return new Class233[] { Static430.aClass233_4, Static125.aClass233_3, Static52.aClass233_1 };
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I")
	public static int method5015() {
		@Pc(7) Class34 local7 = Static185.aClass34_7;
		@Pc(9) boolean local9 = false;
		if (Static14.anInt293 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static459.method5776(null, local15, null, 0, 0);
			local9 = true;
		}
		@Pc(32) long local32 = Static27.method359();
		for (@Pc(41) int local41 = 0; local41 < 10000; local41++) {
			local7.method5750();
		}
		@Pc(66) int local66 = (int) (Static27.method359() - local32);
		local7.method5729(100, 0, 100, -16777216, 0);
		if (local9) {
			local7.method5782();
		}
		return local66;
	}
}
