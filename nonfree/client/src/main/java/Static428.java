import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas12;

	@OriginalMember(owner = "client!pea", name = "z", descriptor = "Lclient!hba;")
	public static Class115 aClass115_7;

	@OriginalMember(owner = "client!pea", name = "B", descriptor = "I")
	public static int anInt7857;

	@OriginalMember(owner = "client!pea", name = "w", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_9 = new Class352(6, 0, 4, 2);

	@OriginalMember(owner = "client!pea", name = "A", descriptor = "I")
	public static int anInt7856 = 0;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZII)Lclient!ni;")
	public static Class223 method6627(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class26 local5 = null;
		if (Static443.aClass240_4 != null) {
			local5 = new Class26(arg2, Static443.aClass240_4, Static109.aClass240Array1[arg2], 1000000);
		}
		Static180.aClass193_Sub1Array1[arg2] = Static301.aClass126_1.method3585(Static61.aClass26_1, local5, arg2);
		Static180.aClass193_Sub1Array1[arg2].method5577();
		return new Class223(Static180.aClass193_Sub1Array1[arg2], arg0, arg1);
	}
}
