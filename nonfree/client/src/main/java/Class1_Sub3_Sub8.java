import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!h", name = "R", descriptor = "[Lclient!pc;")
	public final Class59[] aClass59Array1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;IZ)V")
	public Class1_Sub3_Sub8(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class53 local7 = new Class53();
		@Pc(12) int local12 = arg0.method1700(arg2);
		this.aClass59Array1 = new Class59[local12];
		@Pc(21) int[] local21 = arg0.method1712(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1710(arg2, local21[local23]);
			@Pc(35) Class1_Sub15 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub15 local54 = (Class1_Sub15) local7.method1442(); local54 != null; local54 = (Class1_Sub15) local7.method1450()) {
				if (local49 == local54.anInt1796) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method1701(local49, 0);
				local35 = new Class1_Sub15(local49, local88);
				local7.method1449(local35);
			}
			this.aClass59Array1[local21[local23]] = new Class59(local33, local35);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Z")
	public boolean method826(@OriginalArg(1) int arg0) {
		return this.aClass59Array1[arg0].aBoolean92;
	}
}
