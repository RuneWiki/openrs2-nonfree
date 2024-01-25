import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class202 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!bp;")
	private Class6_Sub1 aClass6_Sub1_38;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!bp;")
	private final Class6_Sub1 aClass6_Sub1_37 = new Class6_Sub1();

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class202() {
		this.aClass6_Sub1_37.aClass6_Sub1_55 = this.aClass6_Sub1_37;
		this.aClass6_Sub1_37.aClass6_Sub1_56 = this.aClass6_Sub1_37;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lclient!bp;")
	public Class6_Sub1 method4470() {
		@Pc(7) Class6_Sub1 local7 = this.aClass6_Sub1_37.aClass6_Sub1_56;
		if (this.aClass6_Sub1_37 == local7) {
			return null;
		} else {
			local7.method5984();
			return local7;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I")
	public int method4471() {
		@Pc(7) int local7 = 0;
		@Pc(18) Class6_Sub1 local18 = this.aClass6_Sub1_37.aClass6_Sub1_56;
		while (this.aClass6_Sub1_37 != local18) {
			local18 = local18.aClass6_Sub1_56;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bp;I)V")
	public void method4472(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aClass6_Sub1_55 != null) {
			arg0.method5984();
		}
		arg0.aClass6_Sub1_56 = this.aClass6_Sub1_37;
		arg0.aClass6_Sub1_55 = this.aClass6_Sub1_37.aClass6_Sub1_55;
		arg0.aClass6_Sub1_55.aClass6_Sub1_56 = arg0;
		arg0.aClass6_Sub1_56.aClass6_Sub1_55 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
	public void method4473() {
		while (true) {
			@Pc(5) Class6_Sub1 local5 = this.aClass6_Sub1_37.aClass6_Sub1_56;
			if (local5 == this.aClass6_Sub1_37) {
				this.aClass6_Sub1_38 = null;
				return;
			}
			local5.method5984();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)Lclient!bp;")
	public Class6_Sub1 method4474() {
		@Pc(12) Class6_Sub1 local12 = this.aClass6_Sub1_38;
		if (this.aClass6_Sub1_37 == local12) {
			this.aClass6_Sub1_38 = null;
			return null;
		} else {
			this.aClass6_Sub1_38 = local12.aClass6_Sub1_56;
			return local12;
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(B)Lclient!bp;")
	public Class6_Sub1 method4476() {
		@Pc(7) Class6_Sub1 local7 = this.aClass6_Sub1_37.aClass6_Sub1_56;
		if (this.aClass6_Sub1_37 == local7) {
			this.aClass6_Sub1_38 = null;
			return null;
		} else {
			this.aClass6_Sub1_38 = local7.aClass6_Sub1_56;
			return local7;
		}
	}
}
