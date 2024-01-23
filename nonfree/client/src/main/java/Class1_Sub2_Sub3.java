import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[Lclient!w;")
	public Class124[] aClass124Array1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;IZ)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class120 local7 = new Class120();
		@Pc(12) int local12 = arg0.method832(arg2);
		this.aClass124Array1 = new Class124[local12];
		@Pc(21) int[] local21 = arg0.method830(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class1_Sub23 local27 = null;
			@Pc(35) byte[] local35 = arg0.method819(local21[local23], arg2);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class1_Sub23 local54 = (Class1_Sub23) local7.method3564(); local54 != null; local54 = (Class1_Sub23) local7.method3561()) {
				if (local49 == local54.anInt3551) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(88) byte[] local88 = arg1.method821(0, local49);
				local27 = new Class1_Sub23(local49, local88);
				local7.method3567(local27);
			}
			this.aClass124Array1[local21[local23]] = new Class124(local35, local27);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
	public boolean method474(@OriginalArg(1) int arg0) {
		return this.aClass124Array1[arg0].aBoolean435;
	}
}
