import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class34_Sub5 extends Class34 {

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "Z")
	private boolean aBoolean167 = false;

	static {
		new Class324("", 73);
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class34_Sub5(@OriginalArg(0) Class134_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
		super.aClass134_Sub1_21.method6724(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface8 local14 = super.aClass134_Sub1_21.method6802();
		if (local14 == null || !arg0) {
			super.aClass134_Sub1_21.method6816(0, Static468.aClass192_3);
			return;
		}
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6766(local14);
		super.aClass134_Sub1_21.method6836(Static438.aClass278_4);
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6770(Static116.aClass82_3, Static447.aClass82_5);
		super.aClass134_Sub1_21.method6791(true, Static493.aClass192_4, 2, false);
		super.aClass134_Sub1_21.method6816(0, Static468.aClass192_3);
		@Pc(65) Class113_Sub3 local65 = super.aClass134_Sub1_21.method6748();
		local65.method6066(super.aClass134_Sub1_21.method6803());
		super.aClass134_Sub1_21.method6808(Static301.aClass309_5);
		super.aClass134_Sub1_21.method6788(0);
		this.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static447.aClass82_5);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		if (this.aBoolean167) {
			super.aClass134_Sub1_21.method6788(1);
			super.aClass134_Sub1_21.method6836(Static586.aClass278_3);
			super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
			super.aClass134_Sub1_21.method6742(2, Static308.aClass192_1);
			super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
			super.aClass134_Sub1_21.method6813();
			super.aClass134_Sub1_21.method6766(null);
			super.aClass134_Sub1_21.method6788(0);
			this.aBoolean167 = false;
		} else {
			super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		}
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
