import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "[Lclient!ck;")
	public Class28[] aClass28Array1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!th;Lclient!th;IZ)V")
	public Class1_Sub3_Sub21(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class26 local7 = new Class26();
		@Pc(12) int local12 = arg0.method4068(arg2);
		this.aClass28Array1 = new Class28[local12];
		@Pc(21) int[] local21 = arg0.method4044(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method4058(local21[local23], arg2);
			@Pc(37) Class1_Sub32 local37 = null;
			@Pc(51) int local51 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(56) Class1_Sub32 local56 = (Class1_Sub32) local7.method666(); local56 != null; local56 = (Class1_Sub32) local7.method672()) {
				if (local56.anInt6314 == local51) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(96) byte[] local96 = arg1.method4051(local51, 0);
				local37 = new Class1_Sub32(local51, local96);
				local7.method668(local37);
			}
			this.aClass28Array1[local21[local23]] = new Class28(local35, local37);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Z")
	public boolean method4307(@OriginalArg(0) int arg0) {
		return this.aClass28Array1[arg0].aBoolean52;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z")
	public boolean method4311(@OriginalArg(0) int arg0) {
		return this.aClass28Array1[arg0].aBoolean51;
	}
}
