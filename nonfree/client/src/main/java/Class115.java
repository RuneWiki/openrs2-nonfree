import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class115 {

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!ia;")
	private Class3_Sub4 aClass3_Sub4_49;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!ia;")
	public Class3_Sub4 aClass3_Sub4_48 = new Class3_Sub4();

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class115() {
		this.aClass3_Sub4_48.aClass3_Sub4_75 = this.aClass3_Sub4_48;
		this.aClass3_Sub4_48.aClass3_Sub4_74 = this.aClass3_Sub4_48;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!ia;)V")
	public void method2875(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_74 != null) {
			arg0.method5022();
		}
		arg0.aClass3_Sub4_74 = this.aClass3_Sub4_48.aClass3_Sub4_74;
		arg0.aClass3_Sub4_75 = this.aClass3_Sub4_48;
		arg0.aClass3_Sub4_74.aClass3_Sub4_75 = arg0;
		arg0.aClass3_Sub4_75.aClass3_Sub4_74 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method2877() {
		while (true) {
			@Pc(13) Class3_Sub4 local13 = this.aClass3_Sub4_48.aClass3_Sub4_75;
			if (local13 == this.aClass3_Sub4_48) {
				this.aClass3_Sub4_49 = null;
				return;
			}
			local13.method5022();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lclient!ia;")
	public Class3_Sub4 method2879() {
		@Pc(3) Class3_Sub4 local3 = this.aClass3_Sub4_48.aClass3_Sub4_75;
		if (this.aClass3_Sub4_48 == local3) {
			this.aClass3_Sub4_49 = null;
			return null;
		} else {
			this.aClass3_Sub4_49 = local3.aClass3_Sub4_75;
			return local3;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
	public int method2880() {
		@Pc(9) Class3_Sub4 local9 = this.aClass3_Sub4_48.aClass3_Sub4_75;
		@Pc(19) int local19 = 0;
		while (this.aClass3_Sub4_48 != local9) {
			local19++;
			local9 = local9.aClass3_Sub4_75;
		}
		return local19;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Lclient!ia;")
	public Class3_Sub4 method2882() {
		@Pc(3) Class3_Sub4 local3 = this.aClass3_Sub4_48.aClass3_Sub4_75;
		if (local3 == this.aClass3_Sub4_48) {
			return null;
		} else {
			local3.method5022();
			return local3;
		}
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Lclient!ia;")
	public Class3_Sub4 method2885() {
		@Pc(2) Class3_Sub4 local2 = this.aClass3_Sub4_49;
		if (local2 == this.aClass3_Sub4_48) {
			this.aClass3_Sub4_49 = null;
			return null;
		} else {
			this.aClass3_Sub4_49 = local2.aClass3_Sub4_75;
			return local2;
		}
	}
}
