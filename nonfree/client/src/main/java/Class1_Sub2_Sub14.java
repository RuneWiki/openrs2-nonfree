import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "[Lclient!rf;")
	public Class97[] aClass97Array1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!mb;Lclient!mb;IZ)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class105 local7 = new Class105();
		@Pc(12) int local12 = arg0.method3532(arg2);
		this.aClass97Array1 = new Class97[local12];
		@Pc(21) int[] local21 = arg0.method3538(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method3509(local21[local23], arg2);
			@Pc(35) Class1_Sub19 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class1_Sub19 local54 = (Class1_Sub19) local7.method3120(); local54 != null; local54 = (Class1_Sub19) local7.method3109()) {
				if (local54.anInt2652 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(84) byte[] local84 = arg1.method3528(local49, 0);
				local35 = new Class1_Sub19(local49, local84);
				local7.method3119(local35);
			}
			this.aClass97Array1[local21[local23]] = new Class97(local33, local35);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Z")
	public boolean method2867(@OriginalArg(0) int arg0) {
		return this.aClass97Array1[arg0].aBoolean181;
	}
}
