import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class166 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!g;")
	private Class63_Sub1 aClass63_Sub1_8;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!g;")
	public final Class63_Sub1 aClass63_Sub1_7 = new Class63_Sub1();

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class166() {
		this.aClass63_Sub1_7.aClass63_Sub1_5 = this.aClass63_Sub1_7;
		this.aClass63_Sub1_7.aClass63_Sub1_6 = this.aClass63_Sub1_7;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lclient!g;")
	public Class63_Sub1 method4434() {
		@Pc(6) Class63_Sub1 local6 = this.aClass63_Sub1_8;
		if (this.aClass63_Sub1_7 == local6) {
			this.aClass63_Sub1_8 = null;
			return null;
		} else {
			this.aClass63_Sub1_8 = local6.aClass63_Sub1_6;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!g;)V")
	public void method4435(@OriginalArg(1) Class63_Sub1 arg0) {
		if (arg0.aClass63_Sub1_5 != null) {
			arg0.method4349();
		}
		arg0.aClass63_Sub1_5 = this.aClass63_Sub1_7.aClass63_Sub1_5;
		arg0.aClass63_Sub1_6 = this.aClass63_Sub1_7;
		arg0.aClass63_Sub1_5.aClass63_Sub1_6 = arg0;
		arg0.aClass63_Sub1_6.aClass63_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method4436() {
		while (true) {
			@Pc(5) Class63_Sub1 local5 = this.aClass63_Sub1_7.aClass63_Sub1_6;
			if (this.aClass63_Sub1_7 == local5) {
				this.aClass63_Sub1_8 = null;
				return;
			}
			local5.method4349();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Lclient!g;")
	public Class63_Sub1 method4437() {
		@Pc(7) Class63_Sub1 local7 = this.aClass63_Sub1_7.aClass63_Sub1_6;
		if (local7 == this.aClass63_Sub1_7) {
			this.aClass63_Sub1_8 = null;
			return null;
		} else {
			this.aClass63_Sub1_8 = local7.aClass63_Sub1_6;
			return local7;
		}
	}
}
