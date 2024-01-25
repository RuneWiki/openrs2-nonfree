import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class70 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!wo;")
	public final Class375 aClass375_3 = new Class375();

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Z)V")
	public Class70(@OriginalArg(0) boolean arg0) {
		this.aBoolean214 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method2570(@OriginalArg(0) Class2_Sub6 arg0) {
		@Pc(8) Class2_Sub3 local8 = arg0.aClass2_Sub3_9;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class2_Sub5[] local13 = arg0.aClass2_Sub5Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean303) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(47) Class2_Sub6 local47;
		if (this.aBoolean214) {
			for (local47 = (Class2_Sub6) this.aClass375_3.method8638(); local47 != null; local47 = (Class2_Sub6) this.aClass375_3.method8635()) {
				if (local47.aClass2_Sub3_9 == local8) {
					local47.method8558();
					Static295.method5066(local47);
				}
			}
		}
		for (local47 = (Class2_Sub6) this.aClass375_3.method8638(); local47 != null; local47 = (Class2_Sub6) this.aClass375_3.method8635()) {
			if (local8.anInt10423 >= local47.aClass2_Sub3_9.anInt10423) {
				Static446.method6763(arg0, local47);
				return;
			}
		}
		this.aClass375_3.method8639(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public void method2571() {
		while (true) {
			@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) this.aClass375_3.method8633();
			if (local15 == null) {
				return;
			}
			local15.method8558();
			Static295.method5066(local15);
		}
	}
}
