import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "Lclient!sj;")
	public static Class10 aClass10_8;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
	public static int anInt7782;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_154 = new Class156(141, -2);

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_204 = new Class381(60, 2);

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
	public static int anInt7781 = 0;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_155 = new Class156(43, 20);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
	public static void method6759(@OriginalArg(0) int arg0) {
		@Pc(24) Class5_Sub1_Sub18 local24 = Static123.method1827((long) arg0, 16);
		local24.method7444();
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([BIIIIII[BI)V")
	public static void method6762(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(25) int local25 = -arg5; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg2++;
				arg6[local33] += arg0[arg1++];
				@Pc(45) int local45 = arg2++;
				arg6[local45] += arg0[arg1++];
				@Pc(57) int local57 = arg2++;
				arg6[local57] += arg0[arg1++];
				@Pc(69) int local69 = arg2++;
				arg6[local69] += arg0[arg1++];
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local33 = arg2++;
				arg6[local33] += arg0[arg1++];
			}
			arg2 += arg3;
			arg1 += arg4;
		}
	}
}
