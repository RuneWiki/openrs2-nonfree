import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class255 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Lclient!saa;")
	public final Class317 aClass317_7 = new Class317();

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Z)V")
	public Class255(@OriginalArg(0) boolean arg0) {
		this.aBoolean471 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!pia;)V")
	public void method5615(@OriginalArg(1) Class34_Sub8 arg0) {
		@Pc(8) Class34_Sub1 local8 = arg0.aClass34_Sub1_20;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class34_Sub6[] local13 = arg0.aClass34_Sub6Array1;
		for (@Pc(19) int local19 = 0; local19 < local13.length; local19++) {
			if (local13[local19].aBoolean332) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(51) Class34_Sub8 local51;
		if (this.aBoolean471) {
			for (local51 = (Class34_Sub8) this.aClass317_7.method6891(); local51 != null; local51 = (Class34_Sub8) this.aClass317_7.method6894()) {
				if (local8 == local51.aClass34_Sub1_20) {
					local51.method8764();
					Static363.method8905(local51);
				}
			}
		}
		for (local51 = (Class34_Sub8) this.aClass317_7.method6891(); local51 != null; local51 = (Class34_Sub8) this.aClass317_7.method6894()) {
			if (local8.anInt9617 >= local51.aClass34_Sub1_20.anInt9617) {
				Static272.method4016(local51, arg0);
				return;
			}
		}
		this.aClass317_7.method6890(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	public void method5616() {
		while (true) {
			@Pc(19) Class34_Sub8 local19 = (Class34_Sub8) this.aClass317_7.method6895();
			if (local19 == null) {
				return;
			}
			local19.method8764();
			Static363.method8905(local19);
		}
	}
}
