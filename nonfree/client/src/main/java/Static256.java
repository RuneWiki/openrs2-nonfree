import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Z")
	public static boolean aBoolean274;

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "Lclient!ho;")
	public static Class9 aClass9_23;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([Lclient!oq;II)V")
	public static void method3693(@OriginalArg(0) Class2_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class2_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10007;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10007 > local27 + (local29 & 0x1)) {
				@Pc(44) Class2_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method3693(arg0, arg1, local10 - 1);
		method3693(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)I")
	public static int method3695() {
		@Pc(7) Class132 local7 = Static546.aClass132_13;
		@Pc(9) boolean local9 = false;
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static513.method7271((Class8) null, (Interface6) null, 0, 0, local18);
		}
		@Pc(35) long local35 = Static566.method7936();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method7515();
		}
		@Pc(66) int local66 = (int) (Static566.method7936() - local35);
		local7.method7512(100, 100, 0, 0, -16777216);
		if (local9) {
			local7.method7491();
		}
		return local66;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(III)I")
	public static int method3697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
