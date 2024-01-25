import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!lha;")
	public static Class14_Sub26 aClass14_Sub26_9;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_90 = new Class251(30, -1);

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lclient!ida;")
	public static final Class170 aClass170_3 = new Class170();

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public static void method2652() {
		@Pc(10) int local10 = 0;
		if (aClass14_Sub26_9 != null) {
			local10 = aClass14_Sub26_9.aClass43_Sub3_1.method1380();
		}
		@Pc(47) int local47;
		@Pc(63) int local63;
		if (local10 == 2) {
			local47 = Static34.anInt543 > 800 ? 800 : Static34.anInt543;
			Static563.anInt4939 = local47;
			Static365.anInt6233 = (Static34.anInt543 - local47) / 2;
			local63 = Static235.anInt4561 <= 600 ? Static235.anInt4561 : 600;
			Static506.anInt8791 = local63;
			Static663.anInt10806 = 0;
		} else if (local10 == 1) {
			local47 = Static34.anInt543 <= 1024 ? Static34.anInt543 : 1024;
			Static563.anInt4939 = local47;
			Static365.anInt6233 = (Static34.anInt543 - local47) / 2;
			local63 = Static235.anInt4561 <= 768 ? Static235.anInt4561 : 768;
			Static663.anInt10806 = 0;
			Static506.anInt8791 = local63;
		} else {
			Static563.anInt4939 = Static34.anInt543;
			Static506.anInt8791 = Static235.anInt4561;
			Static663.anInt10806 = 0;
			Static365.anInt6233 = 0;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public static void method2654() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static380.anInt6689; local14++) {
			for (@Pc(17) int local17 = 0; local17 < Static542.anInt9214; local17++) {
				if (Static15.method271(Static63.aClass89ArrayArrayArray1, true, local17, local14, local5)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}
}
