import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_100 = new Class126(27, -2);

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public static int anInt5485 = 0;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method4635() {
		@Pc(12) Class3_Sub44 local12 = Static275.method5689(Static288.aClass376_74, Static540.aClass282_4);
		local12.aClass3_Sub17_Sub2_3.method4876(Static154.anInt2874);
		Static616.method8089(local12);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ul;)I")
	public static int method4638(@OriginalArg(1) Class361 arg0) {
		if (Static63.aClass361_14 == arg0) {
			return 6407;
		} else if (Static264.aClass361_8 == arg0) {
			return 6408;
		} else if (arg0 == Static550.aClass361_15) {
			return 6406;
		} else if (arg0 == Static356.aClass361_9) {
			return 6409;
		} else if (Static665.aClass361_16 == arg0) {
			return 6410;
		} else if (arg0 == Static196.aClass361_5) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method4639(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static105.anInt2206 == 2) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[0]);
				Static49.aClass392Array1[1].method8689(Static94.aClass224Array1[1]);
			} else if (Static105.anInt2206 == 3) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[0]);
				Static49.aClass392Array1[1].method8689(Static94.aClass224Array1[1]);
				Static49.aClass392Array1[2].method8689(Static94.aClass224Array1[2]);
			} else {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[0]);
				Static49.aClass392Array1[1].method8689(Static94.aClass224Array1[1]);
				Static49.aClass392Array1[2].method8689(Static94.aClass224Array1[2]);
				Static49.aClass392Array1[3].method8689(Static94.aClass224Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static105.anInt2206 == 2) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[2]);
			} else if (Static105.anInt2206 == 3) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[3]);
				Static49.aClass392Array1[1].method8689(Static94.aClass224Array1[4]);
			} else {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[4]);
				Static49.aClass392Array1[1].method8689(Static94.aClass224Array1[5]);
				Static49.aClass392Array1[2].method8689(Static94.aClass224Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static105.anInt2206 == 2) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[3]);
				return;
			}
			if (Static105.anInt2206 == 3) {
				Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[5]);
				return;
			}
			Static49.aClass392Array1[0].method8689(Static94.aClass224Array1[7]);
		}
	}
}
