import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public class Class3 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "[Lclient!tca;")
	public static final Class325[] aClass325Array33 = new Class325[5];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!cm;")
	public Class3 aClass3_67;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!cm;")
	public Class3 aClass3_68;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass325Array33.length; local4++) {
			aClass325Array33[local4] = new Class325();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public final void method8909() {
		if (this.aClass3_68 != null) {
			this.aClass3_68.aClass3_67 = this.aClass3_67;
			this.aClass3_67.aClass3_68 = this.aClass3_68;
			this.aClass3_67 = null;
			this.aClass3_68 = null;
		}
	}
}
