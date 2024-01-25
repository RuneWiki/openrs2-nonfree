import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class142 {

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!pn;")
	private Class11_Sub4 aClass11_Sub4_33 = new Class11_Sub4();

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!fk;")
	private final Class74 aClass74_6 = new Class74();

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	private final int anInt4410;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!ec;")
	private final Class58 aClass58_26;

	static {
		new Class117("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
	public Class142(@OriginalArg(0) int arg0) {
		this.anInt4410 = arg0;
		this.anInt4409 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass58_26 = new Class58(local19);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!pn;J)V")
	public void method3870(@OriginalArg(1) Class11_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4409 == 0) {
			@Pc(14) Class11_Sub4 local14 = this.aClass74_6.method1293();
			local14.method5701();
			local14.method5580();
			if (local14 == this.aClass11_Sub4_33) {
				local14 = this.aClass74_6.method1293();
				local14.method5701();
				local14.method5580();
			}
		} else {
			this.anInt4409--;
		}
		this.aClass58_26.method1006(arg1, arg0);
		this.aClass74_6.method1290(arg0);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public void method3873() {
		this.aClass74_6.method1298();
		this.aClass58_26.method1011();
		this.aClass11_Sub4_33 = new Class11_Sub4();
		this.anInt4409 = this.anInt4410;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(JI)Lclient!pn;")
	public Class11_Sub4 method3874(@OriginalArg(0) long arg0) {
		@Pc(15) Class11_Sub4 local15 = (Class11_Sub4) this.aClass58_26.method1009(arg0);
		if (local15 != null) {
			this.aClass74_6.method1290(local15);
		}
		return local15;
	}
}
