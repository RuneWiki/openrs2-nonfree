import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!te", name = "X", descriptor = "[Lclient!td;")
	public final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;IZ)V")
	public Class2_Sub1_Sub16(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class58 local7 = new Class58();
		@Pc(12) int local12 = arg0.method387(arg2);
		this.aClass69Array1 = new Class69[local12];
		@Pc(21) int[] local21 = arg0.method381(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method383(local21[local23], arg2);
			@Pc(35) Class2_Sub9 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub9 local54 = (Class2_Sub9) local7.method1285(); local54 != null; local54 = (Class2_Sub9) local7.method1281()) {
				if (local54.anInt1857 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method390(local49, 0);
				local35 = new Class2_Sub9(local49, local92);
				local7.method1294(local35);
			}
			this.aClass69Array1[local21[local23]] = new Class69(local33, local35);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Z")
	public boolean method1845(@OriginalArg(0) int arg0) {
		return this.aClass69Array1[arg0].aBoolean213;
	}
}
