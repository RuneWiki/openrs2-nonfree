import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class4_Sub5_Sub17 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!waa;")
	private Class350 aClass350_39;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)I")
	public int method7655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass350_39 == null) {
			return arg0;
		} else {
			@Pc(23) Class4_Sub38 local23 = (Class4_Sub38) this.aClass350_39.method8207((long) arg1);
			return local23 == null ? arg0 : local23.anInt8496;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!un;)V")
	public void method7657(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method7659(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7658(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass350_39 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub50 local16 = (Class4_Sub50) this.aClass350_39.method8207((long) arg0);
			return local16 == null ? arg1 : local16.aString105;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!un;)V")
	private void method7659(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method4905();
		@Pc(21) int local21;
		if (this.aClass350_39 == null) {
			local21 = Static341.method5553(local14);
			this.aClass350_39 = new Class350(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(40) boolean local40 = arg1.method4905() == 1;
			@Pc(44) int local44 = arg1.method4934();
			@Pc(55) Class4 local55;
			if (local40) {
				local55 = new Class4_Sub50(arg1.method4920());
			} else {
				local55 = new Class4_Sub38(arg1.method4931());
			}
			this.aClass350_39.method8199((long) local44, local55);
		}
	}
}
