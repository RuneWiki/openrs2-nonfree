import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "[Lclient!jc;")
	public final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!nb;Lclient!nb;IZ)V")
	public Class5_Sub1_Sub5(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class52 local7 = new Class52();
		@Pc(12) int local12 = arg0.method660(arg2);
		this.aClass38Array1 = new Class38[local12];
		@Pc(21) int[] local21 = arg0.method669(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method679(arg2, local21[local23]);
			@Pc(35) Class5_Sub8 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class5_Sub8 local54 = (Class5_Sub8) local7.method1358(); local54 != null; local54 = (Class5_Sub8) local7.method1363()) {
				if (local54.anInt1719 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method653(local49, 0);
				local35 = new Class5_Sub8(local49, local88);
				local7.method1362(local35);
			}
			this.aClass38Array1[local21[local23]] = new Class38(local33, local35);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Z")
	public boolean method521(@OriginalArg(1) int arg0) {
		return this.aClass38Array1[arg0].aBoolean58;
	}
}
