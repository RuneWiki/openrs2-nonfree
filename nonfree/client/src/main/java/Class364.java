import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class364 {

	@OriginalMember(owner = "client!v", name = "g", descriptor = "J")
	private long aLong305;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	private int anInt9947 = -1;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!ga;")
	private final Class124 aClass124_101 = new Class124();

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class364(@OriginalArg(0) Class5_Sub15 arg0) {
		this.method8272(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!mia;I)V")
	public void method8270(@OriginalArg(0) Class233 arg0) {
		if (this.aLong305 != arg0.aLong187 || this.anInt9947 != arg0.anInt6465) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static618.method8284(arg0.aLong187) + " updateNum:" + arg0.anInt6465 + " delta.owner:" + Static618.method8284(this.aLong305) + " updateNum:" + this.anInt9947);
		}
		for (@Pc(60) Class5_Sub5 local60 = (Class5_Sub5) this.aClass124_101.method2572(); local60 != null; local60 = (Class5_Sub5) this.aClass124_101.method2569()) {
			local60.method8345(arg0);
		}
		arg0.anInt6465++;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!rv;)V")
	private void method8272(@OriginalArg(1) Class5_Sub15 arg0) {
		this.aLong305 = arg0.method3634();
		this.anInt9947 = arg0.method3671();
		for (@Pc(25) int local25 = arg0.method3642(); local25 != 0; local25 = arg0.method3642()) {
			if (Static478.aBoolean592) {
				System.out.println("t:" + local25);
			}
			@Pc(75) Class5_Sub5 local75;
			if (local25 == 3) {
				local75 = new Class5_Sub5_Sub2();
			} else if (local25 == 1) {
				local75 = new Class5_Sub5_Sub1();
			} else if (local25 == 4) {
				local75 = new Class5_Sub5_Sub12();
			} else if (local25 == 6) {
				local75 = new Class5_Sub5_Sub6();
			} else if (local25 == 5) {
				local75 = new Class5_Sub5_Sub8();
			} else if (local25 == 2) {
				local75 = new Class5_Sub5_Sub10();
			} else if (local25 == 7) {
				local75 = new Class5_Sub5_Sub7();
			} else if (local25 == 8) {
				local75 = new Class5_Sub5_Sub9();
			} else if (local25 == 9) {
				local75 = new Class5_Sub5_Sub5();
			} else if (local25 == 10) {
				local75 = new Class5_Sub5_Sub11();
			} else if (local25 == 11) {
				local75 = new Class5_Sub5_Sub3();
			} else if (local25 == 12) {
				local75 = new Class5_Sub5_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local75.method8349(arg0);
			this.aClass124_101.method2574(local75);
		}
	}
}
