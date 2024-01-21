import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "[Lclient!k;")
	public final Class51[] aClass51Array1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IZ)V")
	public Class2_Sub1_Sub24(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class13 local7 = new Class13();
		@Pc(12) int local12 = arg0.method2117(arg2);
		this.aClass51Array1 = new Class51[local12];
		@Pc(21) int[] local21 = arg0.method2123(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method2130(arg2, local21[local23]);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class2_Sub12 local49 = null;
			for (@Pc(54) Class2_Sub12 local54 = (Class2_Sub12) local7.method303(); local54 != null; local54 = (Class2_Sub12) local7.method309()) {
				if (local54.anInt2332 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(84) byte[] local84 = arg1.method2131(0, local47);
				local49 = new Class2_Sub12(local47, local84);
				local7.method304(local49);
			}
			this.aClass51Array1[local21[local23]] = new Class51(local33, local49);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z")
	public boolean method2775(@OriginalArg(0) int arg0) {
		return this.aClass51Array1[arg0].aBoolean108;
	}
}
