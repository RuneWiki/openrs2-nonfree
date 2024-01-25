import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class314 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!du;")
	private Class2 aClass2_237;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "Lclient!dc;")
	private Class70 aClass70_50;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class314() {
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class314(@OriginalArg(0) Class70 arg0) {
		this.aClass70_50 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method6300(@OriginalArg(0) Class70 arg0) {
		this.aClass70_50 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Lclient!du;")
	public Class2 method6302() {
		@Pc(8) Class2 local8 = this.aClass70_50.aClass2_39.aClass2_286;
		if (local8 == this.aClass70_50.aClass2_39) {
			this.aClass2_237 = null;
			return null;
		} else {
			this.aClass2_237 = local8.aClass2_286;
			return local8;
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)Lclient!du;")
	public Class2 method6304() {
		@Pc(6) Class2 local6 = this.aClass2_237;
		if (local6 == this.aClass70_50.aClass2_39) {
			this.aClass2_237 = null;
			return null;
		} else {
			this.aClass2_237 = local6.aClass2_286;
			return local6;
		}
	}
}
