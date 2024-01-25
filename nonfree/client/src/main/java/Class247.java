import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class247 {

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Lclient!sq;")
	private Class1_Sub1 aClass1_Sub1_52;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "Lclient!sq;")
	private final Class1_Sub1 aClass1_Sub1_51 = new Class1_Sub1();

	static {
		new Class96("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class247() {
		this.aClass1_Sub1_51.aClass1_Sub1_58 = this.aClass1_Sub1_51;
		this.aClass1_Sub1_51.aClass1_Sub1_57 = this.aClass1_Sub1_51;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lclient!sq;")
	public Class1_Sub1 method5585() {
		@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_51.aClass1_Sub1_58;
		if (this.aClass1_Sub1_51 == local11) {
			return null;
		} else {
			local11.method5893();
			return local11;
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public void method5586() {
		while (true) {
			@Pc(15) Class1_Sub1 local15 = this.aClass1_Sub1_51.aClass1_Sub1_58;
			if (this.aClass1_Sub1_51 == local15) {
				this.aClass1_Sub1_52 = null;
				return;
			}
			local15.method5893();
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Lclient!sq;")
	public Class1_Sub1 method5587() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_52;
		if (local6 == this.aClass1_Sub1_51) {
			this.aClass1_Sub1_52 = null;
			return null;
		} else {
			this.aClass1_Sub1_52 = local6.aClass1_Sub1_58;
			return local6;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!sq;I)V")
	public void method5590(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_57 != null) {
			arg0.method5893();
		}
		arg0.aClass1_Sub1_57 = this.aClass1_Sub1_51.aClass1_Sub1_57;
		arg0.aClass1_Sub1_58 = this.aClass1_Sub1_51;
		arg0.aClass1_Sub1_57.aClass1_Sub1_58 = arg0;
		arg0.aClass1_Sub1_58.aClass1_Sub1_57 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Lclient!sq;")
	public Class1_Sub1 method5591() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_51.aClass1_Sub1_58;
		if (this.aClass1_Sub1_51 == local7) {
			this.aClass1_Sub1_52 = null;
			return null;
		} else {
			this.aClass1_Sub1_52 = local7.aClass1_Sub1_58;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)I")
	public int method5596() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class1_Sub1 local9 = this.aClass1_Sub1_51.aClass1_Sub1_58; local9 != this.aClass1_Sub1_51; local9 = local9.aClass1_Sub1_58) {
			local5++;
		}
		return local5;
	}
}
