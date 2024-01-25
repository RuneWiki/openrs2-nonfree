import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Lclient!mn;")
	public static Class171 aClass171_84;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[B)[B")
	public static byte[] method5110(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static472.method5022(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!gh;I)I")
	public static int method5111(@OriginalArg(0) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) int local11 = arg0.anInt2398;
		@Pc(15) Class101 local15 = arg0.method6218();
		if (arg0.aBoolean514) {
			local11 = arg0.anInt2407;
		} else if (local15.anInt2614 == arg0.anInt7663 || arg0.anInt7663 == local15.anInt2629 || local15.anInt2627 == arg0.anInt7663 || local15.anInt2643 == arg0.anInt7663) {
			local11 = arg0.anInt2399;
		} else if (local15.anInt2608 == arg0.anInt7663 || local15.anInt2619 == arg0.anInt7663 || local15.anInt2651 == arg0.anInt7663 || local15.anInt2654 == arg0.anInt7663) {
			local11 = arg0.anInt2412;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)[Lclient!jd;")
	public static Class129[] method5115() {
		return new Class129[] { Static112.aClass129_4, Static197.aClass129_5, Static19.aClass129_3, Static418.aClass129_7, Static222.aClass129_6, Static305.aClass129_2 };
	}
}
