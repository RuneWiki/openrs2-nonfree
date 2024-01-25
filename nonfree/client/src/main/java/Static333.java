import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!he;")
	public static Class100 aClass100_64;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!he;")
	public static Class100 aClass100_65;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([[II)V")
	public static void method4855(@OriginalArg(0) int[][] arg0) {
		Static62.anIntArrayArray7 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Lclient!ts;B)V")
	public static void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) Class239[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class239 local21 = arg1[local15];
			if (local21 != null && local21.anInt6895 == arg0 && !Static50.method1153(local21)) {
				if (local21.anInt6900 == 0) {
					method4857(local21.anInt6908, arg1);
					if (local21.aClass239Array2 != null) {
						method4857(local21.anInt6908, local21.aClass239Array2);
					}
					@Pc(55) Class6_Sub9 local55 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local21.anInt6908);
					if (local55 != null) {
						Static316.method4598(local55.anInt1505);
					}
				}
				if (local21.anInt6900 == 6 && local21.anInt6924 != -1) {
					@Pc(75) Class131 local75 = Static5.aClass217_1.method5234(local21.anInt6924);
					if (local75 != null) {
						local21.anInt6934 += Static254.anInt4641;
						while (local21.anInt6934 > local75.anIntArray233[local21.anInt6932]) {
							local21.anInt6934 -= local75.anIntArray233[local21.anInt6932];
							local21.anInt6932++;
							if (local75.anIntArray235.length <= local21.anInt6932) {
								local21.anInt6932 -= local75.anInt3698;
								if (local21.anInt6932 < 0 || local75.anIntArray235.length <= local21.anInt6932) {
									local21.anInt6932 = 0;
								}
							}
							local21.anInt6929 = local21.anInt6932 + 1;
							if (local75.anIntArray235.length <= local21.anInt6929) {
								local21.anInt6929 -= local75.anInt3698;
								if (local21.anInt6929 < 0 || local75.anIntArray235.length <= local21.anInt6929) {
									local21.anInt6929 = -1;
								}
							}
							Static437.method6328(local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(B)Lclient!qp;")
	public static Class152_Sub1 method4858() {
		return Static237.anInt4340 < Static266.aClass152_Sub1Array2.length ? Static266.aClass152_Sub1Array2[Static237.anInt4340++] : null;
	}
}
