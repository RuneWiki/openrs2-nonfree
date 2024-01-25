import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!qo;")
	public static Class281 aClass281_4;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "F")
	public static float aFloat223;

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
	public static int anInt10078;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_176 = new Class274(118, 2);

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	public static int anInt10076 = 0;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Lclient!dm;")
	public static Class78 aClass78_11 = null;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method8429() {
		Static63.aClass32_1.method787();
		Static6.aClass40_1.method4498();
		Static181.aClient1.method1309();
		Static147.aCanvas5.setBackground(Color.black);
		Static178.anInt3979 = -1;
		Static63.aClass32_1 = Static384.method5791(Static147.aCanvas5);
		Static6.aClass40_1 = Static384.method5786(Static147.aCanvas5);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Lclient!lda;")
	public static Class202_Sub1 method8431(@OriginalArg(0) int arg0) {
		return Static335.aBoolean434 && arg0 >= Static191.anInt6072 && arg0 <= anInt10078 ? Static558.aClass202_Sub1Array2[arg0 - Static191.anInt6072] : null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZBLclient!ha;)Lclient!da;")
	public static Class64 method8432(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class87 arg2) {
		@Pc(14) Class164 local14 = Static85.method1547(arg2, arg0, arg1);
		return local14 == null ? null : local14.aClass64_7;
	}
}
