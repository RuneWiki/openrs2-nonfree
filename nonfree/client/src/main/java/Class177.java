import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class177 {

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "Lclient!q;")
	private Class4_Sub2 aClass4_Sub2_65;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!q;")
	private Class4_Sub2 aClass4_Sub2_64 = new Class4_Sub2();

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class177() {
		this.aClass4_Sub2_64.aClass4_Sub2_69 = this.aClass4_Sub2_64;
		this.aClass4_Sub2_64.aClass4_Sub2_68 = this.aClass4_Sub2_64;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method4270() {
		while (true) {
			@Pc(16) Class4_Sub2 local16 = this.aClass4_Sub2_64.aClass4_Sub2_69;
			if (local16 == this.aClass4_Sub2_64) {
				this.aClass4_Sub2_65 = null;
				return;
			}
			local16.method4396();
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)Lclient!q;")
	public Class4_Sub2 method4273() {
		@Pc(13) Class4_Sub2 local13 = this.aClass4_Sub2_64.aClass4_Sub2_69;
		if (this.aClass4_Sub2_64 == local13) {
			return null;
		} else {
			local13.method4396();
			return local13;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!q;)V")
	public void method4274(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_68 != null) {
			arg0.method4396();
		}
		arg0.aClass4_Sub2_69 = this.aClass4_Sub2_64;
		arg0.aClass4_Sub2_68 = this.aClass4_Sub2_64.aClass4_Sub2_68;
		arg0.aClass4_Sub2_68.aClass4_Sub2_69 = arg0;
		arg0.aClass4_Sub2_69.aClass4_Sub2_68 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Lclient!q;")
	public Class4_Sub2 method4278() {
		@Pc(20) Class4_Sub2 local20 = this.aClass4_Sub2_64.aClass4_Sub2_69;
		if (local20 == this.aClass4_Sub2_64) {
			this.aClass4_Sub2_65 = null;
			return null;
		} else {
			this.aClass4_Sub2_65 = local20.aClass4_Sub2_69;
			return local20;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Lclient!q;")
	public Class4_Sub2 method4280() {
		@Pc(2) Class4_Sub2 local2 = this.aClass4_Sub2_65;
		if (this.aClass4_Sub2_64 == local2) {
			this.aClass4_Sub2_65 = null;
			return null;
		} else {
			this.aClass4_Sub2_65 = local2.aClass4_Sub2_69;
			return local2;
		}
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)I")
	public int method4281() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub2 local11 = this.aClass4_Sub2_64.aClass4_Sub2_69;
		while (local11 != this.aClass4_Sub2_64) {
			local11 = local11.aClass4_Sub2_69;
			local7++;
		}
		return local7;
	}
}
