import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "Lclient!sl;")
	private Class310 aClass310_25;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
	public int method5618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass310_25 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub4 local16 = (Class3_Sub4) this.aClass310_25.method6601((long) arg0);
			return local16 == null ? arg1 : local16.anInt109;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method5619(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3118();
			if (local13 == 0) {
				return;
			}
			this.method5623(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method5620(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass310_25 == null) {
			return arg1;
		} else {
			@Pc(18) Class3_Sub51 local18 = (Class3_Sub51) this.aClass310_25.method6601((long) arg0);
			return local18 == null ? arg1 : local18.aString128;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method5623(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(21) int local21 = arg0.method3118();
		@Pc(28) int local28;
		if (this.aClass310_25 == null) {
			local28 = Static114.method2375(local21);
			this.aClass310_25 = new Class310(local28);
		}
		for (local28 = 0; local28 < local21; local28++) {
			@Pc(47) boolean local47 = arg0.method3118() == 1;
			@Pc(51) int local51 = arg0.method3126();
			@Pc(60) Class3 local60;
			if (local47) {
				local60 = new Class3_Sub51(arg0.method3133());
			} else {
				local60 = new Class3_Sub4(arg0.method3116());
			}
			this.aClass310_25.method6603(local60, (long) local51);
		}
	}
}
