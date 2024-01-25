import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class120 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!rg;")
	private Class2_Sub7 aClass2_Sub7_15;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!qk;")
	private Class290 aClass290_5;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	private Class120() {
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!qk;)V")
	public Class120(@OriginalArg(0) Class290 arg0) {
		this.aClass290_5 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Lclient!rg;")
	public Class2_Sub7 method2959() {
		@Pc(8) Class2_Sub7 local8 = this.aClass290_5.aClass2_Sub7_48.aClass2_Sub7_66;
		if (local8 == this.aClass290_5.aClass2_Sub7_48) {
			this.aClass2_Sub7_15 = null;
			return null;
		} else {
			this.aClass2_Sub7_15 = local8.aClass2_Sub7_66;
			return local8;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Lclient!rg;")
	public Class2_Sub7 method2960() {
		@Pc(11) Class2_Sub7 local11 = this.aClass2_Sub7_15;
		if (local11 == this.aClass290_5.aClass2_Sub7_48) {
			this.aClass2_Sub7_15 = null;
			return null;
		} else {
			this.aClass2_Sub7_15 = local11.aClass2_Sub7_66;
			return local11;
		}
	}
}
