import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class356 {

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "Lclient!ju;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_168;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_169;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;)V")
	public Class356(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1) {
		this.aClass50_168 = arg0;
		this.aClass50_169 = arg1;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)Lclient!ju;")
	private Class191 method8102() {
		if (this.aClass191_2 == null) {
			this.aClass191_2 = new Class191();
		}
		return this.aClass191_2;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!lt;)Lclient!lp;")
	public Interface13 method8103(@OriginalArg(1) Interface14 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class370 local11 = arg0.method7954();
		if (local11 == Static528.aClass370_8) {
			return new Class12((Class346) arg0);
		} else if (local11 == Static460.aClass370_7) {
			return new Class339(this.method8102(), (Class119) arg0);
		} else if (local11 == Static428.aClass370_6) {
			return new Class232(this.aClass50_168, (Class76) arg0);
		} else if (local11 == Static598.aClass370_9) {
			return new Class232_Sub1(this.aClass50_168, (Class76_Sub1) arg0);
		} else if (Static163.aClass370_2 == local11) {
			return new Class71_Sub3(this.aClass50_168, this.aClass50_169, (Class110_Sub3) arg0);
		} else if (Static363.aClass370_5 == local11) {
			return new Class71_Sub1(this.aClass50_168, this.aClass50_169, (Class110_Sub2) arg0);
		} else if (Static114.aClass370_1 == local11) {
			return new Class71_Sub2(this.aClass50_168, this.aClass50_169, (Class110_Sub1) arg0);
		} else if (local11 == Static355.aClass370_4) {
			return new Class77(this.aClass50_168, this.aClass50_169, (Class343) arg0);
		} else if (local11 == Static188.aClass370_3) {
			return new Class386(this.aClass50_168, (Class61) arg0);
		} else if (Static668.aClass370_10 == local11) {
			return new Class71_Sub2_Sub1(this.aClass50_168, this.aClass50_169, (Class110_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
