import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class4_Sub3_Sub15 extends Class4_Sub3 {

	@OriginalMember(owner = "client!v", name = "P", descriptor = "[Lclient!qf;")
	public final Class67[] aClass67Array1;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!c;Lclient!c;IZ)V")
	public Class4_Sub3_Sub15(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class45 local7 = new Class45();
		@Pc(12) int local12 = arg0.method1772(arg2);
		this.aClass67Array1 = new Class67[local12];
		@Pc(21) int[] local21 = arg0.method1773(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1774(arg2, local21[local23]);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class4_Sub20 local49 = null;
			for (@Pc(54) Class4_Sub20 local54 = (Class4_Sub20) local7.method982(); local54 != null; local54 = (Class4_Sub20) local7.method986()) {
				if (local54.anInt2681 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(80) byte[] local80 = arg1.method1783(local47, 0);
				local49 = new Class4_Sub20(local47, local80);
				local7.method988(local49);
			}
			this.aClass67Array1[local21[local23]] = new Class67(local33, local49);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z")
	public boolean method1919(@OriginalArg(1) int arg0) {
		return this.aClass67Array1[arg0].aBoolean82;
	}
}
