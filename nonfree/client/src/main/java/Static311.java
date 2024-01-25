import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_72 = new Class61(63, 4);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!st;II[I)V")
	public static void method4788(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray651 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray651.length; local8++) {
				if (arg2[local8] != arg0.anIntArray651[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt8483 != -1) {
				@Pc(40) Class77 local40 = Static168.aClass327_2.method7326(arg0.anInt8483);
				@Pc(43) int local43 = local40.anInt2586;
				if (local43 == 1) {
					arg0.anInt8521 = 0;
					arg0.anInt8527 = 0;
					arg0.anInt8506 = 1;
					arg0.anInt8468 = 0;
					arg0.anInt8510 = arg1;
					Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8521, local40, arg0 == Static129.aClass10_Sub1_Sub2_Sub2_1);
				}
				if (local43 == 2) {
					arg0.anInt8527 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray651 == null || arg0.anIntArray651[local8] == -1 || Static168.aClass327_2.method7326(arg2[local8]).anInt2582 >= Static168.aClass327_2.method7326(arg0.anIntArray651[local8]).anInt2582) {
				arg0.anIntArray651 = arg2;
				arg0.anInt8510 = arg1;
				break;
			}
		}
		if (local6) {
			arg0.anIntArray651 = arg2;
			arg0.anInt8510 = arg1;
		}
	}
}
