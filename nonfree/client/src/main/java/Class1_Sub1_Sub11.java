import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!la", name = "I", descriptor = "[Lclient!qa;")
	public final Class65[] aClass65Array1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;IZ)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class56 local7 = new Class56();
		@Pc(12) int local12 = arg0.method1278(arg2);
		this.aClass65Array1 = new Class65[local12];
		@Pc(21) int[] local21 = arg0.method1290(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class1_Sub18 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1301(arg2, local21[local23]);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub18 local54 = (Class1_Sub18) local7.method1853(); local54 != null; local54 = (Class1_Sub18) local7.method1855()) {
				if (local49 == local54.anInt3402) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(80) byte[] local80 = arg1.method1280(local49, 0);
				local27 = new Class1_Sub18(local49, local80);
				local7.method1856(local27);
			}
			this.aClass65Array1[local21[local23]] = new Class65(local35, local27);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
	public boolean method1619(@OriginalArg(0) int arg0) {
		return this.aClass65Array1[arg0].aBoolean172;
	}
}
