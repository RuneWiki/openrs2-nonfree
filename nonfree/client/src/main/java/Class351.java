import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class351 {

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "Lclient!bea;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "Lclient!lb;")
	private final Class221 aClass221_151;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "Lclient!lb;")
	private final Class221 aClass221_150;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;)V")
	public Class351(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1) {
		this.aClass221_151 = arg1;
		this.aClass221_150 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lclient!bea;")
	private Class25 method8306() {
		if (this.aClass25_2 == null) {
			this.aClass25_2 = new Class25();
		}
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLclient!oea;)Lclient!kg;")
	public Interface14 method8307(@OriginalArg(1) Interface18 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class409 local12 = arg0.method7832();
		if (Static596.aClass409_14 == local12) {
			return new Class104((Class296) arg0);
		} else if (local12 == Static660.aClass409_15) {
			return new Class172(this.method8306(), (Class327) arg0);
		} else if (Static198.aClass409_5 == local12) {
			return new Class132(this.aClass221_150, (Class14) arg0);
		} else if (Static247.aClass409_8 == local12) {
			return new Class132_Sub1(this.aClass221_150, (Class14_Sub1) arg0);
		} else if (Static223.aClass409_7 == local12) {
			return new Class81_Sub1(this.aClass221_150, this.aClass221_151, (Class21_Sub1) arg0);
		} else if (Static228.aClass409_13 == local12) {
			return new Class81_Sub3(this.aClass221_150, this.aClass221_151, (Class21_Sub2) arg0);
		} else if (Static454.aClass409_12 == local12) {
			return new Class81_Sub2(this.aClass221_150, this.aClass221_151, (Class21_Sub3) arg0);
		} else if (Static248.aClass409_9 == local12) {
			return new Class203(this.aClass221_150, this.aClass221_151, (Class99) arg0);
		} else if (local12 == Static703.aClass409_16) {
			return new Class373(this.aClass221_150, (Class164) arg0);
		} else if (local12 == Static188.aClass409_4) {
			return new Class81_Sub2_Sub1(this.aClass221_150, this.aClass221_151, (Class21_Sub3_Sub1) arg0);
		} else {
			return null;
		}
	}
}
