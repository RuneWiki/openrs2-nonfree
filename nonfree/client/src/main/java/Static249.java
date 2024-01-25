import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jaa", name = "I", descriptor = "Lclient!mi;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	public static void method3868() {
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_2, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub25_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub13_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub26_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub14_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub29_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub11_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub23_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub28_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_2, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub4_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub27_1, 0);
		Static358.method6960();
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub19_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 2);
		Static246.method3759();
		Static571.method8044();
		Static9.aBoolean5 = true;
	}

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "(I)Lclient!mn;")
	public static Class232 method3870() {
		try {
			return (Class232) Class.forName("Class232_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public static void method3873(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static27.method539(local6.height, local6.width);
		if (Static453.anInt7627 == 1) {
			Static512.aClass126_22.method7042(arg0, Static134.anInt2214, Static444.anInt7482);
		} else {
			Static512.aClass126_22.method7042(arg0, Static27.anInt517, Static554.anInt9157);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZI)V")
	public static void method3874(@OriginalArg(1) int arg0) {
		Static95.method1438();
		@Pc(11) int local11 = Static520.aClass381_1.method8802(arg0).anInt4818;
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static564.aClass304_1.anIntArray666[arg0];
		if (local11 == 6) {
			Static122.anInt1976 = local23;
		}
		if (local11 == 5) {
			Static559.anInt9207 = local23;
		}
	}
}
