import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class339 {

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Lclient!eba;")
	public final Class98 aClass98_8 = new Class98();

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "Z")
	public boolean aBoolean750 = false;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Z)V")
	public Class339(@OriginalArg(0) boolean arg0) {
		this.aBoolean750 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!tf;)V")
	public void method8423(@OriginalArg(1) Class8_Sub10 arg0) {
		@Pc(8) Class8_Sub1 local8 = arg0.aClass8_Sub1_21;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class8_Sub7[] local13 = arg0.aClass8_Sub7Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean519) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(56) Class8_Sub10 local56;
		if (this.aBoolean750) {
			for (local56 = (Class8_Sub10) this.aClass98_8.method1777(); local56 != null; local56 = (Class8_Sub10) this.aClass98_8.method1782()) {
				if (local8 == local56.aClass8_Sub1_21) {
					local56.method8893();
					Static383.method5604(local56);
				}
			}
		}
		for (local56 = (Class8_Sub10) this.aClass98_8.method1777(); local56 != null; local56 = (Class8_Sub10) this.aClass98_8.method1782()) {
			if (local8.anInt10361 >= local56.aClass8_Sub1_21.anInt10361) {
				Static574.method8244(arg0, local56);
				return;
			}
		}
		this.aClass98_8.method1780(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	public void method8425() {
		while (true) {
			@Pc(11) Class8_Sub10 local11 = (Class8_Sub10) this.aClass98_8.method1784();
			if (local11 == null) {
				return;
			}
			local11.method8893();
			Static383.method5604(local11);
		}
	}
}
