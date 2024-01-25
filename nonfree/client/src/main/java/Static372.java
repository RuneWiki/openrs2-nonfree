import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!vo;")
	public static final Class3_Sub49 aClass3_Sub49_1 = new Class3_Sub49(0, 0);

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
	public static int anInt6997 = 0;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_114 = new Class67("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!pt;III)V")
	public static void method5856(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static329.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5751 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub30Array5[arg0.anInt5751++] = Static513.aClass103Array1[local21 - 1].aClass3_Sub30_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5751; local21 < 4; local21++) {
			arg0.aClass3_Sub30Array5[local21] = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method5858(@OriginalArg(0) File arg0) {
		return Static190.method3585((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Z")
	public static boolean method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static85.method1757(arg0, arg1) | Static185.method3503(arg0, arg1) | Static253.method4324(arg0, arg1)) & Static438.method6624(arg1, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	public static void method5861(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 3);
		local8.method6212();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
	public static void method5864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub10_Sub16 local16 = Static362.method5701(arg1, 6);
		local16.method6211();
		local16.anInt7557 = arg0;
	}
}
