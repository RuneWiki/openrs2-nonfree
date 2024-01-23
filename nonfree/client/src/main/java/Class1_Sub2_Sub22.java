import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "[Lclient!oa;")
	public Class125[] aClass125Array1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!nk;Lclient!nk;IZ)V")
	public Class1_Sub2_Sub22(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class59 local7 = new Class59();
		@Pc(12) int local12 = arg0.method3125(arg2);
		this.aClass125Array1 = new Class125[local12];
		@Pc(21) int[] local21 = arg0.method3135(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method3115(arg2, local21[local23]);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			@Pc(54) Class1_Sub3 local54 = (Class1_Sub3) local7.method1704();
			@Pc(56) Class1_Sub3 local56 = null;
			while (local54 != null) {
				if (local54.anInt178 == local49) {
					local56 = local54;
					break;
				}
				local54 = (Class1_Sub3) local7.method1701();
			}
			if (local56 == null) {
				@Pc(87) byte[] local87 = arg1.method3112(0, local49);
				local56 = new Class1_Sub3(local49, local87);
				local7.method1706(local56);
			}
			this.aClass125Array1[local21[local23]] = new Class125(local35, local56);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Z")
	public boolean method4388(@OriginalArg(0) int arg0) {
		return this.aClass125Array1[arg0].aBoolean257;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Z")
	public boolean method4391(@OriginalArg(1) int arg0) {
		return this.aClass125Array1[arg0].aBoolean258;
	}
}
