import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class155 {

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!td;")
	private Class55_Sub8 aClass55_Sub8_2;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!td;")
	public final Class55_Sub8 aClass55_Sub8_1 = new Class55_Sub8();

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class155() {
		this.aClass55_Sub8_1.aClass55_Sub8_7 = this.aClass55_Sub8_1;
		this.aClass55_Sub8_1.aClass55_Sub8_8 = this.aClass55_Sub8_1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!td;)V")
	public void method4200(@OriginalArg(1) Class55_Sub8 arg0) {
		if (arg0.aClass55_Sub8_8 != null) {
			arg0.method4602();
		}
		arg0.aClass55_Sub8_8 = this.aClass55_Sub8_1.aClass55_Sub8_8;
		arg0.aClass55_Sub8_7 = this.aClass55_Sub8_1;
		arg0.aClass55_Sub8_8.aClass55_Sub8_7 = arg0;
		arg0.aClass55_Sub8_7.aClass55_Sub8_8 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lclient!td;")
	public Class55_Sub8 method4201() {
		@Pc(6) Class55_Sub8 local6 = this.aClass55_Sub8_2;
		if (local6 == this.aClass55_Sub8_1) {
			this.aClass55_Sub8_2 = null;
			return null;
		} else {
			this.aClass55_Sub8_2 = local6.aClass55_Sub8_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Lclient!td;")
	public Class55_Sub8 method4202() {
		@Pc(12) Class55_Sub8 local12 = this.aClass55_Sub8_1.aClass55_Sub8_7;
		if (this.aClass55_Sub8_1 == local12) {
			this.aClass55_Sub8_2 = null;
			return null;
		} else {
			this.aClass55_Sub8_2 = local12.aClass55_Sub8_7;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public void method4203() {
		while (true) {
			@Pc(5) Class55_Sub8 local5 = this.aClass55_Sub8_1.aClass55_Sub8_7;
			if (this.aClass55_Sub8_1 == local5) {
				this.aClass55_Sub8_2 = null;
				return;
			}
			local5.method4602();
		}
	}
}
