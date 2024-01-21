import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "[Lclient!o;")
	public final Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!kc;Lclient!kc;IZ)V")
	public Class2_Sub1_Sub6(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class36 local7 = new Class36();
		@Pc(12) int local12 = arg0.method325(arg2);
		this.aClass40Array1 = new Class40[local12];
		@Pc(21) int[] local21 = arg0.method329(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method338(arg2, local21[local23]);
			@Pc(35) Class2_Sub11 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub11 local54 = (Class2_Sub11) local7.method1365(); local54 != null; local54 = (Class2_Sub11) local7.method1361()) {
				if (local49 == local54.anInt1404) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(84) byte[] local84 = arg1.method324(0, local49);
				local35 = new Class2_Sub11(local49, local84);
				local7.method1362(local35);
			}
			this.aClass40Array1[local21[local23]] = new Class40(local33, local35);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
	public boolean method1007(@OriginalArg(0) int arg0) {
		return this.aClass40Array1[arg0].aBoolean114;
	}
}
