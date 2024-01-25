import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public class Class23 {

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "[Lclient!pw;")
	public static final Class194[] aClass194Array12 = new Class194[5];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!rh;")
	public Class23 aClass23_25;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!rh;")
	public Class23 aClass23_26;

	static {
		for (@Pc(16) int local16 = 0; local16 < aClass194Array12.length; local16++) {
			aClass194Array12[local16] = new Class194();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public final void method5853() {
		if (this.aClass23_26 != null) {
			this.aClass23_26.aClass23_25 = this.aClass23_25;
			this.aClass23_25.aClass23_26 = this.aClass23_26;
			this.aClass23_26 = null;
			this.aClass23_25 = null;
		}
	}
}
