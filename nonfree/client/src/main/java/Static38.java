import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Lclient!df;")
	public static Class49 aClass49_6;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_20 = new Class256("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_15 = new Class81(88, -1);

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[I")
	public static final int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!fm;Z)V")
	public static void method717(@OriginalArg(0) Class38_Sub3 arg0) {
		arg0.aClass4_1 = null;
		@Pc(16) int local16 = arg0.aClass38_Sub4Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass38_Sub4Array1[local18].aBoolean201 = false;
		}
		@Pc(32) Class184[] local32 = Class39.aClass184Array1;
		synchronized (Class39.aClass184Array1) {
			if (local16 < Class39.aClass184Array1.length && Static280.anIntArray343[local16] < 200) {
				Class39.aClass184Array1[local16].method4207(arg0);
				@Pc(55) int local55 = Static280.anIntArray343[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V")
	public static void method720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg2, 4);
		local8.method434();
		local8.anInt656 = arg1;
		local8.anInt659 = arg0;
		local8.anInt657 = arg3;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILclient!cr;)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		if (Static191.aClass41_7 != null || Static237.aBoolean384 || (arg2 == null || Static256.method3899(arg2) == null)) {
			return;
		}
		Static191.aClass41_7 = arg2;
		Static309.aClass41_11 = Static256.method3899(arg2);
		Static150.aBoolean255 = false;
		Static190.anInt3757 = 0;
		Static77.anInt7116 = arg1;
		Static396.anInt6928 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Z")
	public static boolean method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static429.method5790(arg0, arg1) || Static7.method161(arg0, arg1);
	}
}
