import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public static int anInt6218;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "Lclient!jda;")
	public static Class96_Sub1 aClass96_Sub1_2;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
	public static void method5410() {
		Static592.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!sca;II)V")
	public static void method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray13 != null) {
			@Pc(13) Class6_Sub10 local13 = new Class6_Sub10();
			local13.anObjectArray1 = arg1.anObjectArray13;
			local13.aClass302_14 = arg1;
			Static244.method4193(local13);
		}
		Static453.anInt8081 = arg1.anInt8834;
		Static133.anInt2549 = arg1.anInt8877;
		Static30.anInt4466 = arg1.anInt8838;
		Static543.anInt9347 = arg0;
		Static351.anInt6586 = arg1.anInt8861;
		Static280.aBoolean380 = true;
		Static541.anInt8105 = arg2;
		Static1.anInt8260 = arg1.anInt8865;
		Static603.method8464(arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ok;I)I")
	public static int method5412(@OriginalArg(0) Class242 arg0) {
		if (arg0 == Static409.aClass242_10) {
			return 5120;
		} else if (Static409.aClass242_11 == arg0) {
			return 5122;
		} else if (arg0 == Static409.aClass242_12) {
			return 5124;
		} else if (arg0 == Static409.aClass242_13) {
			return 5121;
		} else if (arg0 == Static409.aClass242_14) {
			return 5123;
		} else if (arg0 == Static409.aClass242_15) {
			return 5125;
		} else if (Static409.aClass242_16 == arg0) {
			return 5131;
		} else if (Static409.aClass242_17 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
