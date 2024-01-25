import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Lclient!bt;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "[I")
	public static final int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_103 = new Class337(35, -2);

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	public static int anInt5511 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)I")
	public static int method4932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static254.method4176(arg0 - 1, arg1 + -1) + Static254.method4176(arg0 + 1, arg1 - 1) + Static254.method4176(arg0 + -1, arg1 + 1) + Static254.method4176(arg0 + 1, arg1 - -1);
		@Pc(78) int local78 = Static254.method4176(arg0 - 1, arg1) + Static254.method4176(arg0 + 1, arg1) + Static254.method4176(arg0, arg1 + -1) + Static254.method4176(arg0, arg1 + 1);
		@Pc(83) int local83 = Static254.method4176(arg0, arg1);
		return local43 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!la;)I")
	public static int method4933(@OriginalArg(1) Class207 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4678(Static57.anInt1136)) {
			local5++;
		}
		if (arg0.method4678(Static395.anInt6578)) {
			local5++;
		}
		if (arg0.method4678(Static400.anInt6696)) {
			local5++;
		}
		if (arg0.method4678(Static411.anInt7150)) {
			local5++;
		}
		if (arg0.method4678(Static193.anInt8325)) {
			local5++;
		}
		if (arg0.method4678(Static139.anInt2427)) {
			local5++;
		}
		if (arg0.method4678(Static119.anInt2202)) {
			local5++;
		}
		if (arg0.method4678(Static70.anInt1419)) {
			local5++;
		}
		if (arg0.method4678(anInt5510)) {
			local5++;
		}
		if (arg0.method4678(Static540.anInt9191)) {
			local5++;
		}
		if (arg0.method4678(Static343.anInt5776)) {
			local5++;
		}
		if (arg0.method4678(Static60.anInt1159)) {
			local5++;
		}
		if (arg0.method4678(Static116.anInt5368)) {
			local5++;
		}
		if (arg0.method4678(Static36.anInt577)) {
			local5++;
		}
		if (arg0.method4678(Static124.anInt2268)) {
			local5++;
		}
		if (arg0.method4678(Static409.anInt3104)) {
			local5++;
		}
		return local5;
	}
}
