import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "[Lclient!bf;")
	public final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!pd;Lclient!pd;IZ)V")
	public Class4_Sub2_Sub4(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class61 local7 = new Class61();
		@Pc(12) int local12 = arg0.method471(arg2);
		this.aClass11Array1 = new Class11[local12];
		@Pc(21) int[] local21 = arg0.method479(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method474(arg2, local21[local23]);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(52) Class4_Sub12 local52 = (Class4_Sub12) local7.method1628();
			@Pc(54) Class4_Sub12 local54 = null;
			while (local52 != null) {
				if (local47 == local52.anInt1793) {
					local54 = local52;
					break;
				}
				local52 = (Class4_Sub12) local7.method1629();
			}
			if (local54 == null) {
				@Pc(80) byte[] local80 = arg1.method481(local47, 0);
				local54 = new Class4_Sub12(local47, local80);
				local7.method1635(local54);
			}
			this.aClass11Array1[local21[local23]] = new Class11(local33, local54);
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(II)Z")
	public boolean method381(@OriginalArg(1) int arg0) {
		return this.aClass11Array1[arg0].aBoolean12;
	}
}
