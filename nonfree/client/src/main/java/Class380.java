import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class380 implements Interface11 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString135;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_144;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class380(@OriginalArg(0) Class208 arg0, @OriginalArg(1) String arg1) {
		this.aString135 = arg1;
		this.aClass208_144 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method9042() {
		return this.aClass208_144.method5006(this.aString135) ? 100 : this.aClass208_144.method4987(this.aString135);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!ud;")
	@Override
	public Class342 method9043() {
		return Static593.aClass342_3;
	}
}
