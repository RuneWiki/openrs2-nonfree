import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!hq;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_61 = new Class241(89, 3);

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
	public static int anInt4356 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
	public static int anInt4358 = -1;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
	public static int anInt4359 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	public static void method4014() {
		if (Static401.aClass304ArrayArray1 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static401.aClass304ArrayArray1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static401.aClass304ArrayArray1[local14].length; local18++) {
				Static401.aClass304ArrayArray1[local14][local18] = Static167.aClass304_1;
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!ha;Lclient!fw;III)V")
	public static void method4016(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class317 local9 = Static599.aClass306_2.method7371(arg2.anInt3589);
		if (local9.anInt8623 == -1) {
			return;
		}
		if (arg2.aBoolean293) {
			@Pc(27) int local27 = arg4 + arg2.anInt3623;
			arg4 = local27 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(41) Class49 local41 = local9.method7555(arg2.aBoolean290, arg1, arg4);
		if (local41 == null) {
			return;
		}
		@Pc(48) int local48 = arg2.anInt3614;
		@Pc(51) int local51 = arg2.lb;
		if ((arg4 & 0x1) == 1) {
			local48 = arg2.lb;
			local51 = arg2.anInt3614;
		}
		@Pc(72) int local72 = local41.method8991();
		@Pc(75) int local75 = local41.method8987();
		if (local9.aBoolean667) {
			local72 = local48 * 4;
			local75 = local51 * 4;
		}
		if (local9.anInt8624 == 0) {
			local41.method8986(arg0, arg3 - (local51 - 1) * 4, local72, local75);
		} else {
			local41.method8996(arg0, arg3 + 4 - local51 * 4, local72, local75, 0, local9.anInt8624 | 0xFF000000, 1);
		}
	}
}
