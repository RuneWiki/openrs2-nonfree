import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class191 {

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!np;")
	private Class8_Sub2 aClass8_Sub2_6;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!np;")
	public final Class8_Sub2 aClass8_Sub2_5 = new Class8_Sub2();

	static {
		new Class209("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class191() {
		this.aClass8_Sub2_5.aClass8_Sub2_8 = this.aClass8_Sub2_5;
		this.aClass8_Sub2_5.aClass8_Sub2_7 = this.aClass8_Sub2_5;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lclient!np;")
	public Class8_Sub2 method4327() {
		@Pc(12) Class8_Sub2 local12 = this.aClass8_Sub2_5.aClass8_Sub2_8;
		if (this.aClass8_Sub2_5 == local12) {
			this.aClass8_Sub2_6 = null;
			return null;
		} else {
			this.aClass8_Sub2_6 = local12.aClass8_Sub2_8;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!np;)V")
	public void method4328(@OriginalArg(1) Class8_Sub2 arg0) {
		if (arg0.aClass8_Sub2_7 != null) {
			arg0.method5786();
		}
		arg0.aClass8_Sub2_7 = this.aClass8_Sub2_5.aClass8_Sub2_7;
		arg0.aClass8_Sub2_8 = this.aClass8_Sub2_5;
		arg0.aClass8_Sub2_7.aClass8_Sub2_8 = arg0;
		arg0.aClass8_Sub2_8.aClass8_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
	public int method4329() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class8_Sub2 local11 = this.aClass8_Sub2_5.aClass8_Sub2_8; local11 != this.aClass8_Sub2_5; local11 = local11.aClass8_Sub2_8) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	public void method4331() {
		while (true) {
			@Pc(5) Class8_Sub2 local5 = this.aClass8_Sub2_5.aClass8_Sub2_8;
			if (this.aClass8_Sub2_5 == local5) {
				this.aClass8_Sub2_6 = null;
				return;
			}
			local5.method5786();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lclient!np;")
	public Class8_Sub2 method4332() {
		@Pc(6) Class8_Sub2 local6 = this.aClass8_Sub2_6;
		if (local6 == this.aClass8_Sub2_5) {
			this.aClass8_Sub2_6 = null;
			return null;
		} else {
			this.aClass8_Sub2_6 = local6.aClass8_Sub2_8;
			return local6;
		}
	}
}
