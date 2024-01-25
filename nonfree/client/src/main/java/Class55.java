import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class55 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!js;")
	private Class2_Sub1 aClass2_Sub1_13 = new Class2_Sub1();

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!ot;")
	private final Class174 aClass174_6 = new Class174();

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	private final int anInt1304;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	private int anInt1303;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!sq;")
	private final Class214 aClass214_8;

	static {
		new Class221("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
	public Class55(@OriginalArg(0) int arg0) {
		this.anInt1304 = arg0;
		this.anInt1303 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass214_8 = new Class214(local19);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
	public void method1247() {
		this.aClass174_6.method4101();
		this.aClass214_8.method5068();
		this.aClass2_Sub1_13 = new Class2_Sub1();
		this.anInt1303 = this.anInt1304;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IJLclient!js;)V")
	public void method1248(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		if (this.anInt1303 == 0) {
			@Pc(14) Class2_Sub1 local14 = this.aClass174_6.method4104();
			local14.method5745();
			local14.method5748();
			if (this.aClass2_Sub1_13 == local14) {
				local14 = this.aClass174_6.method4104();
				local14.method5745();
				local14.method5748();
			}
		} else {
			this.anInt1303--;
		}
		this.aClass214_8.method5065(arg0, arg1);
		this.aClass174_6.method4099(arg1);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZJ)Lclient!js;")
	public Class2_Sub1 method1250(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub1 local18 = (Class2_Sub1) this.aClass214_8.method5059(arg0);
		if (local18 != null) {
			this.aClass174_6.method4099(local18);
		}
		return local18;
	}
}
