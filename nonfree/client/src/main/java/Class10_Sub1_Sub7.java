import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class10_Sub1_Sub7 extends Class10_Sub1 {

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "[Lclient!ma;")
	public final Class39[] aClass39Array1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!he;Lclient!he;IZ)V")
	public Class10_Sub1_Sub7(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class9 local7 = new Class9();
		@Pc(12) int local12 = arg0.method217(arg2);
		this.aClass39Array1 = new Class39[local12];
		@Pc(21) int[] local21 = arg0.method223(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method203(arg2, local21[local23]);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(52) Class10_Sub6 local52 = (Class10_Sub6) local7.method72();
			@Pc(54) Class10_Sub6 local54 = null;
			while (local52 != null) {
				if (local52.anInt941 == local47) {
					local54 = local52;
					break;
				}
				local52 = (Class10_Sub6) local7.method81();
			}
			if (local54 == null) {
				@Pc(88) byte[] local88 = arg1.method209(0, local47);
				local54 = new Class10_Sub6(local47, local88);
				local7.method79(local54);
			}
			this.aClass39Array1[local21[local23]] = new Class39(local33, local54);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)Z")
	public boolean method631(@OriginalArg(1) int arg0) {
		return this.aClass39Array1[arg0].aBoolean76;
	}
}
