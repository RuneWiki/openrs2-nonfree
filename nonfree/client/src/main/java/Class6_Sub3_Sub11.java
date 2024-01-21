import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class6_Sub3_Sub11 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "[Lclient!t;")
	public final Class68[] aClass68Array1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!ge;Lclient!ge;IZ)V")
	public Class6_Sub3_Sub11(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class1 local7 = new Class1();
		@Pc(12) int local12 = arg0.method103(arg2);
		this.aClass68Array1 = new Class68[local12];
		@Pc(21) int[] local21 = arg0.method113(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method110(arg2, local21[local23]);
			@Pc(35) Class6_Sub15 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class6_Sub15 local54 = (Class6_Sub15) local7.method3(); local54 != null; local54 = (Class6_Sub15) local7.method14()) {
				if (local54.anInt2707 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method114(0, local49);
				local35 = new Class6_Sub15(local49, local92);
				local7.method10(local35);
			}
			this.aClass68Array1[local21[local23]] = new Class68(local33, local35);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	public boolean method1161(@OriginalArg(0) int arg0) {
		return this.aClass68Array1[arg0].aBoolean152;
	}
}
