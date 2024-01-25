import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public static int anInt7040;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_11 = new Class222(9, 0, 4, 1);

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
	public static final int[] anIntArray501 = new int[32];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
	public static boolean method5993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!jm;)I")
	public static int method5994(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		@Pc(7) String local7 = Static425.method5665(arg0);
		@Pc(9) int[] local9 = null;
		if (Static56.method4531(arg0.anInt4369)) {
			local9 = Static72.aClass225_2.method4789((int) arg0.aLong122).anIntArray77;
		} else if (arg0.anInt4364 != -1) {
			local9 = Static72.aClass225_2.method4789(arg0.anInt4364).anIntArray77;
		} else if (Static62.method916(arg0.anInt4369)) {
			@Pc(37) Class2_Sub43 local37 = (Class2_Sub43) Static440.aClass118_41.method2595((long) arg0.aLong122);
			if (local37 != null) {
				@Pc(42) Class13_Sub1_Sub1_Sub1_Sub1 local42 = local37.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				@Pc(45) Class150 local45 = local42.aClass150_1;
				if (local45.anIntArray262 != null) {
					local45 = local45.method3196(Static431.aClass205_1);
				}
				if (local45 != null) {
					local9 = local45.anIntArray263;
				}
			}
		} else if (Static230.method3178(arg0.anInt4369)) {
			@Pc(81) Class191 local81;
			if (arg0.anInt4369 == 1001) {
				local81 = Static319.aClass141_4.method2971((int) arg0.aLong122);
			} else {
				local81 = Static319.aClass141_4.method2971((int) (arg0.aLong122 >>> 32 & 0x7FFFFFFFL));
			}
			if (local81.anIntArray323 != null) {
				local81 = local81.method4057(Static431.aClass205_1);
			}
			if (local81 != null) {
				local9 = local81.anIntArray322;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static486.method6810(local9);
		}
		@Pc(138) int local138 = Static228.aClass256_7.method5540(local7, Static140.aClass61Array4);
		if (arg0.aBoolean299) {
			local138 += Static205.aClass61_19.method6445() + 4;
		}
		return local138;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)Z")
	public static boolean method5996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIII)V")
	public static void method5997(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static27.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vj;B)Lclient!nd;")
	public static Class3_Sub2 method5998(@OriginalArg(0) Class2_Sub22 arg0) {
		return new Class3_Sub2(arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8539(), arg0.method8539(), arg0.method8547());
	}
}
