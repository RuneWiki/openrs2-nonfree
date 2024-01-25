import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class194 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "Lclient!gt;")
	public final Class123 aClass123_8 = new Class123();

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Z)V")
	public Class194(@OriginalArg(0) boolean arg0) {
		this.aBoolean443 = arg0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public void method5081() {
		while (true) {
			@Pc(18) Class15_Sub7 local18 = (Class15_Sub7) this.aClass123_8.method3540();
			if (local18 == null) {
				return;
			}
			local18.method8314();
			Static513.method7386(local18);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLclient!lba;)V")
	public void method5082(@OriginalArg(1) Class15_Sub7 arg0) {
		@Pc(8) Class15_Sub1 local8 = arg0.aClass15_Sub1_14;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class15_Sub6[] local13 = arg0.aClass15_Sub6Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean394) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(47) Class15_Sub7 local47;
		if (this.aBoolean443) {
			for (local47 = (Class15_Sub7) this.aClass123_8.method3537(); local47 != null; local47 = (Class15_Sub7) this.aClass123_8.method3541()) {
				if (local47.aClass15_Sub1_14 == local8) {
					local47.method8314();
					Static513.method7386(local47);
				}
			}
		}
		for (local47 = (Class15_Sub7) this.aClass123_8.method3537(); local47 != null; local47 = (Class15_Sub7) this.aClass123_8.method3541()) {
			if (local8.anInt10304 >= local47.aClass15_Sub1_14.anInt10304) {
				Static643.method8635(arg0, local47);
				return;
			}
		}
		this.aClass123_8.method3539(arg0);
	}
}
