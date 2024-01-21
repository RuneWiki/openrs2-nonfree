import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!j", name = "G", descriptor = "[Lclient!ve;")
	public final Class83[] aClass83Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!u;Lclient!u;IZ)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class4 local7 = new Class4();
		@Pc(12) int local12 = arg0.method3306(arg2);
		this.aClass83Array1 = new Class83[local12];
		@Pc(21) int[] local21 = arg0.method3311(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method3316(local21[local23], arg2);
			@Pc(35) Class1_Sub22 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub22 local54 = (Class1_Sub22) local7.method174(); local54 != null; local54 = (Class1_Sub22) local7.method181()) {
				if (local49 == local54.anInt3837) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method3324(0, local49);
				local35 = new Class1_Sub22(local49, local88);
				local7.method179(local35);
			}
			this.aClass83Array1[local21[local23]] = new Class83(local33, local35);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
	public boolean method1805(@OriginalArg(0) int arg0) {
		return this.aClass83Array1[arg0].aBoolean175;
	}
}
