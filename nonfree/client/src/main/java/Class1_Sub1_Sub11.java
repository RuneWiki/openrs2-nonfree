import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "[Lclient!n;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ai;Lclient!ai;IZ)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class19 local7 = new Class19();
		@Pc(12) int local12 = arg0.method3246(arg2);
		this.aClass69Array1 = new Class69[local12];
		@Pc(21) int[] local21 = arg0.method3244(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method3242(arg2, local21[local23]);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class1_Sub4 local49 = null;
			for (@Pc(54) Class1_Sub4 local54 = (Class1_Sub4) local7.method609(); local54 != null; local54 = (Class1_Sub4) local7.method615()) {
				if (local47 == local54.anInt511) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(88) byte[] local88 = arg1.method3251(local47, 0);
				local49 = new Class1_Sub4(local47, local88);
				local7.method620(local49);
			}
			this.aClass69Array1[local21[local23]] = new Class69(local33, local49);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Z")
	public boolean method1908(@OriginalArg(0) int arg0) {
		return this.aClass69Array1[arg0].aBoolean155;
	}
}
