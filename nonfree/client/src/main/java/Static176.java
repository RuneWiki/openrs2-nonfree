import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gba", name = "H", descriptor = "Lclient!an;")
	public static final Class19 aClass19_4 = new Class19();

	@OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
	public static int anInt3533 = -1;

	@OriginalMember(owner = "client!gba", name = "M", descriptor = "[Lclient!tq;")
	public static final Class337[] aClass337Array1 = new Class337[100];

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
	public static void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub7_Sub2 local10 = Static188.method3210(9, arg2);
		local10.method925();
		local10.anInt852 = arg1;
		local10.anInt855 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BIIJZ)Ljava/lang/String;")
	public static String method3032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) char local13 = ',';
		@Pc(15) char local15 = '.';
		if (arg1 == 0) {
			local15 = ',';
			local13 = '.';
		}
		if (arg1 == 2) {
			local15 = ' ';
		}
		@Pc(31) boolean local31 = false;
		if (arg2 < 0L) {
			local31 = true;
			arg2 = -arg2;
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(26);
		@Pc(54) int local54;
		@Pc(58) int local58;
		if (arg0 > 0) {
			for (local54 = 0; local54 < arg0; local54++) {
				local58 = (int) arg2;
				arg2 /= 10L;
				local47.append((char) (local58 + 48 - (int) arg2 * 10));
			}
			local47.append(local13);
		}
		local54 = 0;
		while (true) {
			local58 = (int) arg2;
			arg2 /= 10L;
			local47.append((char) (local58 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local31) {
					local47.append('-');
				}
				return local47.reverse().toString();
			}
			if (arg3) {
				local54++;
				if (local54 % 3 == 0) {
					local47.append(local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!vda;I)V")
	public static void method3033(@OriginalArg(0) Class2_Sub7_Sub20 arg0) {
		arg0.method8504();
		@Pc(12) boolean local12 = false;
		for (@Pc(17) Class2_Sub7_Sub20 local17 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local17 != null; local17 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
			if (Static573.method7953(local17.method8486(), arg0.method8486())) {
				Static205.method5786(arg0, local17);
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static515.aClass290_7.method6678(arg0);
		}
	}
}
