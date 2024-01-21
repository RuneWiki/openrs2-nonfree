import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "[Lclient!he;")
	public final Class33[] aClass33Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!fd;Lclient!fd;IZ)V")
	public Class2_Sub1_Sub6(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class3 local7 = new Class3();
		@Pc(12) int local12 = arg0.method1927(arg2);
		this.aClass33Array1 = new Class33[local12];
		@Pc(21) int[] local21 = arg0.method1929(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1931(local21[local23], arg2);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class2_Sub24 local49 = null;
			for (@Pc(54) Class2_Sub24 local54 = (Class2_Sub24) local7.method82(); local54 != null; local54 = (Class2_Sub24) local7.method74()) {
				if (local54.anInt2910 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(84) byte[] local84 = arg1.method1922(local47, 0);
				local49 = new Class2_Sub24(local47, local84);
				local7.method75(local49);
			}
			this.aClass33Array1[local21[local23]] = new Class33(local33, local49);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
	public boolean method1214(@OriginalArg(0) int arg0) {
		return this.aClass33Array1[arg0].aBoolean80;
	}
}
