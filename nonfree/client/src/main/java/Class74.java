import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class74 {

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "Lclient!tia;")
	private Class3_Sub11 aClass3_Sub11_17;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "Lclient!tia;")
	public final Class3_Sub11 aClass3_Sub11_16 = new Class3_Sub11();

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class74() {
		this.aClass3_Sub11_16.aClass3_Sub11_66 = this.aClass3_Sub11_16;
		this.aClass3_Sub11_16.aClass3_Sub11_67 = this.aClass3_Sub11_16;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!tia;)V")
	public void method1840(@OriginalArg(1) Class3_Sub11 arg0) {
		if (arg0.aClass3_Sub11_66 != null) {
			arg0.method9345();
		}
		arg0.aClass3_Sub11_67 = this.aClass3_Sub11_16;
		arg0.aClass3_Sub11_66 = this.aClass3_Sub11_16.aClass3_Sub11_66;
		arg0.aClass3_Sub11_66.aClass3_Sub11_67 = arg0;
		arg0.aClass3_Sub11_67.aClass3_Sub11_66 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I")
	public int method1841() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class3_Sub11 local17 = this.aClass3_Sub11_16.aClass3_Sub11_67; local17 != this.aClass3_Sub11_16; local17 = local17.aClass3_Sub11_67) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)Lclient!tia;")
	public Class3_Sub11 method1842() {
		@Pc(11) Class3_Sub11 local11 = this.aClass3_Sub11_16.aClass3_Sub11_67;
		if (this.aClass3_Sub11_16 == local11) {
			this.aClass3_Sub11_17 = null;
			return null;
		} else {
			this.aClass3_Sub11_17 = local11.aClass3_Sub11_67;
			return local11;
		}
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Lclient!tia;")
	public Class3_Sub11 method1843() {
		@Pc(7) Class3_Sub11 local7 = this.aClass3_Sub11_16.aClass3_Sub11_67;
		if (this.aClass3_Sub11_16 == local7) {
			return null;
		} else {
			local7.method9345();
			return local7;
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)Lclient!tia;")
	public Class3_Sub11 method1844() {
		@Pc(13) Class3_Sub11 local13 = this.aClass3_Sub11_17;
		if (local13 == this.aClass3_Sub11_16) {
			this.aClass3_Sub11_17 = null;
			return null;
		} else {
			this.aClass3_Sub11_17 = local13.aClass3_Sub11_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)V")
	public void method1845() {
		while (true) {
			@Pc(5) Class3_Sub11 local5 = this.aClass3_Sub11_16.aClass3_Sub11_67;
			if (local5 == this.aClass3_Sub11_16) {
				this.aClass3_Sub11_17 = null;
				return;
			}
			local5.method9345();
		}
	}
}
