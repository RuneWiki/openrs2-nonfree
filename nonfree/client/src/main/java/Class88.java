import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class88 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!dda;")
	public final Class66 aClass66_1 = new Class66();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Z)V")
	public Class88(@OriginalArg(0) boolean arg0) {
		this.aBoolean210 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public void method2241() {
		while (true) {
			@Pc(7) Class19_Sub8 local7 = (Class19_Sub8) this.aClass66_1.method1376();
			if (local7 == null) {
				return;
			}
			local7.method9359();
			Static235.method3665(local7);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!mla;I)V")
	public void method2242(@OriginalArg(0) Class19_Sub8 arg0) {
		@Pc(8) Class19_Sub1 local8 = arg0.aClass19_Sub1_16;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class19_Sub6[] local13 = arg0.aClass19_Sub6Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean477) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(55) Class19_Sub8 local55;
		if (this.aBoolean210) {
			for (local55 = (Class19_Sub8) this.aClass66_1.method1381(); local55 != null; local55 = (Class19_Sub8) this.aClass66_1.method1380()) {
				if (local55.aClass19_Sub1_16 == local8) {
					local55.method9359();
					Static235.method3665(local55);
				}
			}
		}
		for (local55 = (Class19_Sub8) this.aClass66_1.method1381(); local55 != null; local55 = (Class19_Sub8) this.aClass66_1.method1380()) {
			if (local8.anInt11205 >= local55.aClass19_Sub1_16.anInt11205) {
				Static425.method6267(arg0, local55);
				return;
			}
		}
		this.aClass66_1.method1375(arg0);
	}
}
