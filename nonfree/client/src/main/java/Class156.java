import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class156 {

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "Lclient!nt;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_54;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Lclient!gj;")
	private final Class143 aClass143_53;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;)V")
	public Class156(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1) {
		this.aClass143_54 = arg0;
		this.aClass143_53 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!ev;)Lclient!ef;")
	public Interface7 method3414(@OriginalArg(1) Interface9 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method8749();
		if (local11 == Static332.aClass6_19) {
			return new Class236((Class363) arg0);
		} else if (Static492.aClass6_32 == local11) {
			return new Class353(this.method3416(), (Class229) arg0);
		} else if (local11 == Static404.aClass6_25) {
			return new Class194(this.aClass143_54, (Class218) arg0);
		} else if (local11 == Static397.aClass6_23) {
			return new Class194_Sub1(this.aClass143_54, (Class218_Sub1) arg0);
		} else if (local11 == Static109.aClass6_8) {
			return new Class190_Sub3(this.aClass143_54, this.aClass143_53, (Class84_Sub2) arg0);
		} else if (local11 == Static140.aClass6_10) {
			return new Class190_Sub2(this.aClass143_54, this.aClass143_53, (Class84_Sub3) arg0);
		} else if (Static387.aClass6_22 == local11) {
			return new Class190_Sub1(this.aClass143_54, this.aClass143_53, (Class84_Sub1) arg0);
		} else if (local11 == Static199.aClass6_39) {
			return new Class189(this.aClass143_54, this.aClass143_53, (Class103) arg0);
		} else if (local11 == Static402.aClass6_24) {
			return new Class294(this.aClass143_54, (Class45) arg0);
		} else if (Static41.aClass6_5 == local11) {
			return new Class190_Sub1_Sub1(this.aClass143_54, this.aClass143_53, (Class84_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)Lclient!nt;")
	private Class255 method3416() {
		if (this.aClass255_1 == null) {
			this.aClass255_1 = new Class255();
		}
		return this.aClass255_1;
	}
}
