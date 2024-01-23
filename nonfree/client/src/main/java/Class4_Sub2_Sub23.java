import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class4_Sub2_Sub23 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "[Lclient!ma;")
	public Class103[] aClass103Array1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!cg;Lclient!cg;IZ)V")
	public Class4_Sub2_Sub23(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class17 local7 = new Class17();
		@Pc(12) int local12 = arg0.method679(arg2);
		this.aClass103Array1 = new Class103[local12];
		@Pc(21) int[] local21 = arg0.method654(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(39) byte[] local39 = arg0.method665(arg2, local21[local23]);
			@Pc(41) Class4_Sub28 local41 = null;
			@Pc(55) int local55 = local39[1] & 0xFF | (local39[0] & 0xFF) << 8;
			for (@Pc(60) Class4_Sub28 local60 = (Class4_Sub28) local7.method613(); local60 != null; local60 = (Class4_Sub28) local7.method607()) {
				if (local55 == local60.anInt4088) {
					local41 = local60;
					break;
				}
			}
			if (local41 == null) {
				@Pc(96) byte[] local96 = arg1.method666(0, local55);
				local41 = new Class4_Sub28(local55, local96);
				local7.method619(local41);
			}
			this.aClass103Array1[local21[local23]] = new Class103(local39, local41);
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(II)Z")
	public boolean method4705(@OriginalArg(0) int arg0) {
		return this.aClass103Array1[arg0].aBoolean212;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(II)Z")
	public boolean method4713(@OriginalArg(0) int arg0) {
		return this.aClass103Array1[arg0].aBoolean211;
	}
}
