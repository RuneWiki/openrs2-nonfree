import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!td", name = "L", descriptor = "[Lclient!vb;")
	public final Class83[] aClass83Array1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!bg;Lclient!bg;IZ)V")
	public Class2_Sub2_Sub16(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class81 local7 = new Class81();
		@Pc(12) int local12 = arg0.method2069(arg2);
		this.aClass83Array1 = new Class83[local12];
		@Pc(21) int[] local21 = arg0.method2051(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class2_Sub9 local27 = null;
			@Pc(35) byte[] local35 = arg0.method2049(local21[local23], arg2);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub9 local54 = (Class2_Sub9) local7.method2682(); local54 != null; local54 = (Class2_Sub9) local7.method2686()) {
				if (local54.anInt1364 == local49) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(92) byte[] local92 = arg1.method2050(0, local49);
				local27 = new Class2_Sub9(local49, local92);
				local7.method2683(local27);
			}
			this.aClass83Array1[local21[local23]] = new Class83(local35, local27);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Z")
	public boolean method2661(@OriginalArg(1) int arg0) {
		return this.aClass83Array1[arg0].aBoolean158;
	}
}
