import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "[Lclient!oc;")
	public final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!k;Lclient!k;IZ)V")
	public Class2_Sub1_Sub9(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class52 local7 = new Class52();
		@Pc(12) int local12 = arg0.method1153(arg2);
		this.aClass44Array1 = new Class44[local12];
		@Pc(21) int[] local21 = arg0.method1131(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1150(local21[local23], arg2);
			@Pc(35) Class2_Sub5 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class2_Sub5 local54 = (Class2_Sub5) local7.method1587(); local54 != null; local54 = (Class2_Sub5) local7.method1588()) {
				if (local49 == local54.anInt715) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(84) byte[] local84 = arg1.method1154(0, local49);
				local35 = new Class2_Sub5(local49, local84);
				local7.method1593(local35);
			}
			this.aClass44Array1[local21[local23]] = new Class44(local33, local35);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z")
	public boolean method1211(@OriginalArg(1) int arg0) {
		return this.aClass44Array1[arg0].aBoolean114;
	}
}
