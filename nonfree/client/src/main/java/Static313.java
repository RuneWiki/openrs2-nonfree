import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIZIII)V")
	public static void method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = Static439.method5863(arg0, Static163.anInt3488, Static161.anInt3448);
		@Pc(15) int local15 = Static439.method5863(arg3, Static163.anInt3488, Static161.anInt3448);
		@Pc(21) int local21 = Static439.method5863(arg1, Static450.anInt7594, Static142.anInt3212);
		@Pc(31) int local31 = Static439.method5863(arg2, Static450.anInt7594, Static142.anInt3212);
		@Pc(40) int local40 = Static439.method5863(arg0 + arg4, Static163.anInt3488, Static161.anInt3448);
		@Pc(49) int local49 = Static439.method5863(arg3 - arg4, Static163.anInt3488, Static161.anInt3448);
		for (@Pc(51) int local51 = local9; local51 < local40; local51++) {
			Static15.method463(arg5, Static376.anIntArrayArray64[local51], local21, local31);
		}
		for (@Pc(70) int local70 = local15; local70 > local49; local70--) {
			Static15.method463(arg5, Static376.anIntArrayArray64[local70], local21, local31);
		}
		@Pc(95) int local95 = Static439.method5863(arg4 + arg1, Static450.anInt7594, Static142.anInt3212);
		@Pc(104) int local104 = Static439.method5863(arg2 - arg4, Static450.anInt7594, Static142.anInt3212);
		for (@Pc(106) int local106 = local40; local106 <= local49; local106++) {
			@Pc(111) int[] local111 = Static376.anIntArrayArray64[local106];
			Static15.method463(arg5, local111, local21, local95);
			Static15.method463(arg5, local111, local104, local31);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!m;I)Lclient!qa;")
	public static Class75 method4575(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) int arg2) {
		return new Class75_Sub1(arg2, arg0, arg1);
	}
}
