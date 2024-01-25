import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "Lclient!fn;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	public static int anInt6243;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_126 = new Class256("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "[I")
	public static final int[] anIntArray420 = new int[6];

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	public static void method4964() {
		@Pc(15) int local15 = Static348.anInt6137;
		@Pc(17) int[] local17 = Static348.anIntArray412;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class4_Sub2_Sub2_Sub1 local27 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local17[local19]];
			if (local27 != null && local27.anInt6514 > 0) {
				local27.anInt6514--;
				if (local27.anInt6514 == 0) {
					local27.aString55 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static391.anInt6867; local53++) {
			@Pc(59) int local59 = Static312.anIntArray202[local53];
			@Pc(63) Class4_Sub2_Sub2_Sub2 local63 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local59];
			if (local63 != null && local63.anInt6514 > 0) {
				local63.anInt6514--;
				if (local63.anInt6514 == 0) {
					local63.aString55 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!us;ILclient!ql;Lclient!sq;IIII)V")
	public static void method4965(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Class4_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) Class4_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub23 local12 = new Class2_Sub23();
		local12.anInt3779 = arg6 << 7;
		local12.anInt3782 = arg5;
		local12.anInt3784 = arg3 << 7;
		if (arg0 != null) {
			local12.aClass250_1 = arg0;
			@Pc(33) int local33 = arg0.anInt7185;
			@Pc(36) int local36 = arg0.anInt7150;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg0.anInt7185;
				local33 = arg0.anInt7150;
			}
			local12.anInt3780 = local33 + arg3 << 7;
			local12.anInt3781 = arg0.anInt7172;
			local12.anInt3788 = arg0.anInt7157;
			local12.anIntArray252 = arg0.anIntArray477;
			local12.anInt3790 = arg0.anInt7171;
			local12.anInt3786 = arg0.anInt7141 << 7;
			local12.anInt3789 = arg0.anInt7147;
			local12.anInt3785 = arg6 + local36 << 7;
			if (arg0.anIntArray479 != null) {
				local12.aBoolean312 = true;
				local12.method3020();
			}
			if (local12.anIntArray252 != null) {
				local12.anInt3778 = (int) (Math.random() * (double) (local12.anInt3781 - local12.anInt3788)) + local12.anInt3788;
			}
			Static48.aClass265_11.method5999(local12);
		} else if (arg2 != null) {
			local12.aClass4_Sub2_Sub2_Sub2_1 = arg2;
			@Pc(129) Class215 local129 = arg2.aClass215_1;
			if (local129.anIntArray400 != null) {
				local12.aBoolean312 = true;
				local129 = local129.method4795(Static215.aClass225_1);
			}
			if (local129 != null) {
				local12.anInt3780 = arg3 + local129.anInt5998 << 7;
				local12.anInt3785 = local129.anInt5998 + arg6 << 7;
				local12.anInt3790 = Static184.method2922(arg2);
				local12.anInt3789 = local129.anInt6010;
				local12.anInt3786 = local129.anInt6006 << 7;
			}
			Static60.aClass265_15.method5999(local12);
		} else if (arg1 != null) {
			local12.aClass4_Sub2_Sub2_Sub1_1 = arg1;
			local12.anInt3780 = arg3 + arg1.method5118() << 7;
			local12.anInt3785 = arg1.method5118() + arg6 << 7;
			local12.anInt3790 = Static218.method769(arg1);
			local12.anInt3789 = arg1.anInt5723;
			local12.anInt3786 = arg1.anInt5726 << 7;
			Static69.aClass240_7.method5430((long) arg1.anInt6456, local12);
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)I")
	public static int method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}
}
