import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "[Lclient!qb;")
	public final Class73[] aClass73Array1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!vb;Lclient!vb;IZ)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class30 local7 = new Class30();
		@Pc(12) int local12 = arg0.method2966(arg2);
		this.aClass73Array1 = new Class73[local12];
		@Pc(21) int[] local21 = arg0.method2945(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method2942(local21[local23], arg2);
			@Pc(35) Class1_Sub18 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class1_Sub18 local54 = (Class1_Sub18) local7.method1115(); local54 != null; local54 = (Class1_Sub18) local7.method1125()) {
				if (local49 == local54.anInt1990) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method2963(local49, 0);
				local35 = new Class1_Sub18(local49, local88);
				local7.method1113(local35);
			}
			this.aClass73Array1[local21[local23]] = new Class73(local33, local35);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Z")
	public boolean method869(@OriginalArg(0) int arg0) {
		return this.aClass73Array1[arg0].aBoolean116;
	}
}
