import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "[Lclient!s;")
	public final Class65[] aClass65Array1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!q;Lclient!q;IZ)V")
	public Class1_Sub1_Sub13(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class31 local7 = new Class31();
		@Pc(12) int local12 = arg0.method1999(arg2);
		this.aClass65Array1 = new Class65[local12];
		@Pc(21) int[] local21 = arg0.method2006(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method2008(local21[local23], arg2);
			@Pc(35) Class1_Sub13 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class1_Sub13 local54 = (Class1_Sub13) local7.method1000(); local54 != null; local54 = (Class1_Sub13) local7.method1003()) {
				if (local49 == local54.anInt1915) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method2000(local49, 0);
				local35 = new Class1_Sub13(local49, local92);
				local7.method1005(local35);
			}
			this.aClass65Array1[local21[local23]] = new Class65(local33, local35);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Z")
	public boolean method1722(@OriginalArg(1) int arg0) {
		return this.aClass65Array1[arg0].aBoolean216;
	}
}
