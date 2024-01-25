import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class284 {

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!vs;")
	public final Class385 aClass385_7 = new Class385();

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Z)V")
	public Class284(@OriginalArg(0) boolean arg0) {
		this.aBoolean603 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!rs;)V")
	public void method7014(@OriginalArg(1) Class60_Sub9 arg0) {
		@Pc(8) Class60_Sub1 local8 = arg0.aClass60_Sub1_21;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class60_Sub10[] local13 = arg0.aClass60_Sub10Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean765) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(51) Class60_Sub9 local51;
		if (this.aBoolean603) {
			for (local51 = (Class60_Sub9) this.aClass385_7.method8778(); local51 != null; local51 = (Class60_Sub9) this.aClass385_7.method8773()) {
				if (local51.aClass60_Sub1_21 == local8) {
					local51.method8914();
					Static288.method4731(local51);
				}
			}
		}
		for (local51 = (Class60_Sub9) this.aClass385_7.method8778(); local51 != null; local51 = (Class60_Sub9) this.aClass385_7.method8773()) {
			if (local51.aClass60_Sub1_21.anInt9049 <= local8.anInt9049) {
				Static682.method8966(local51, arg0);
				return;
			}
		}
		this.aClass385_7.method8779(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method7015() {
		while (true) {
			@Pc(7) Class60_Sub9 local7 = (Class60_Sub9) this.aClass385_7.method8772();
			if (local7 == null) {
				return;
			}
			local7.method8914();
			Static288.method4731(local7);
		}
	}
}
