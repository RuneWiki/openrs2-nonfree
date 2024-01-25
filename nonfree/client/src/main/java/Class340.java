import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class340 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Lclient!wk;")
	private Class360 aClass360_2;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!tf;")
	private final Class322 aClass322_146;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!tf;")
	private final Class322 aClass322_145;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;)V")
	public Class340(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1) {
		this.aClass322_146 = arg0;
		this.aClass322_145 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!vb;)Lclient!waa;")
	public Interface24 method7126(@OriginalArg(1) Interface22 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) Class140 local19 = arg0.method7197();
		if (local19 == Static364.aClass140_5) {
			return new Class94((Class80) arg0);
		} else if (local19 == Static337.aClass140_15) {
			return new Class286(this.method7127(), (Class342) arg0);
		} else if (local19 == Static578.aClass140_18) {
			return new Class104(this.aClass322_146, (Class9) arg0);
		} else if (local19 == Static41.aClass140_6) {
			return new Class104_Sub1(this.aClass322_146, (Class9_Sub1) arg0);
		} else if (Static271.aClass140_14 == local19) {
			return new Class50_Sub1(this.aClass322_146, this.aClass322_145, (Class65_Sub2) arg0);
		} else if (Static72.aClass140_10 == local19) {
			return new Class50_Sub2(this.aClass322_146, this.aClass322_145, (Class65_Sub3) arg0);
		} else if (local19 == Static351.aClass140_16) {
			return new Class50_Sub3(this.aClass322_146, this.aClass322_145, (Class65_Sub1) arg0);
		} else if (Static79.aClass140_17 == local19) {
			return new Class327(this.aClass322_146, this.aClass322_145, (Class144) arg0);
		} else if (local19 == Static27.aClass140_12) {
			return new Class133(this.aClass322_146, (Class180) arg0);
		} else if (Static242.aClass140_13 == local19) {
			return new Class50_Sub3_Sub1(this.aClass322_146, this.aClass322_145, (Class65_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lclient!wk;")
	private Class360 method7127() {
		if (this.aClass360_2 == null) {
			this.aClass360_2 = new Class360();
		}
		return this.aClass360_2;
	}
}
