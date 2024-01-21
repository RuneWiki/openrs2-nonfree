import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "[Lclient!db;")
	public final Class19[] aClass19Array1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!wa;Lclient!wa;IZ)V")
	public Class5_Sub2_Sub16(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class91 local7 = new Class91();
		@Pc(12) int local12 = arg0.method752(arg2);
		this.aClass19Array1 = new Class19[local12];
		@Pc(21) int[] local21 = arg0.method731(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method738(local21[local23], arg2);
			@Pc(35) Class5_Sub13 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class5_Sub13 local54 = (Class5_Sub13) local7.method2684(); local54 != null; local54 = (Class5_Sub13) local7.method2678()) {
				if (local54.anInt1317 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method749(0, local49);
				local35 = new Class5_Sub13(local49, local92);
				local7.method2686(local35);
			}
			this.aClass19Array1[local21[local23]] = new Class19(local33, local35);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Z")
	public boolean method2262(@OriginalArg(0) int arg0) {
		return this.aClass19Array1[arg0].aBoolean45;
	}
}
