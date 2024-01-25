import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public static int anInt6688;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	public static int anInt6692;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Lclient!at;")
	public static Class24 method5694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class24 local9 = Static87.method8101(arg1);
		if (arg0 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass24Array1 == null || local9.aClass24Array1.length <= arg0) {
			return null;
		} else {
			return local9.aClass24Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!in;)I")
	public static int method5695(@OriginalArg(1) Class157 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4575(anInt6692)) {
			local5++;
		}
		if (arg0.method4575(Static349.anInt6963)) {
			local5++;
		}
		if (arg0.method4575(Static34.anInt736)) {
			local5++;
		}
		if (arg0.method4575(Static199.anInt8552)) {
			local5++;
		}
		if (arg0.method4575(Static313.anInt6435)) {
			local5++;
		}
		if (arg0.method4575(Static359.anInt7119)) {
			local5++;
		}
		if (arg0.method4575(Static615.anInt10775)) {
			local5++;
		}
		if (arg0.method4575(Static319.anInt6495)) {
			local5++;
		}
		if (arg0.method4575(Static392.anInt7542)) {
			local5++;
		}
		if (arg0.method4575(Static38.anInt822)) {
			local5++;
		}
		if (arg0.method4575(Static153.anInt3903)) {
			local5++;
		}
		if (arg0.method4575(Static155.anInt3953)) {
			local5++;
		}
		if (arg0.method4575(Static457.anInt8411)) {
			local5++;
		}
		if (arg0.method4575(Static255.anInt5461)) {
			local5++;
		}
		if (arg0.method4575(Static310.anInt6429)) {
			local5++;
		}
		if (arg0.method4575(Static552.anInt9900)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method5696() {
		Static449.aClass90_1.method8783();
		Static628.aClass9_1.method798();
		Static30.aClient1.method2217();
		Static639.aCanvas10.setBackground(Color.black);
		Static112.anInt3033 = -1;
		Static449.aClass90_1 = Static138.method3108(Static639.aCanvas10);
		Static628.aClass9_1 = Static261.method4787(Static639.aCanvas10);
	}
}
