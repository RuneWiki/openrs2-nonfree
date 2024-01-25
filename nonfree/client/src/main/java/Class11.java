import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public final class Class11 implements Interface27 {

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_7;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString3;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!gda;Ljava/lang/String;)V")
	public Class11(@OriginalArg(0) Class126 arg0, @OriginalArg(1) String arg1) {
		this.aClass126_7 = arg0;
		this.aString3 = arg1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class171 method4357() {
		return Static246.aClass171_3;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
	@Override
	public int method4358() {
		return this.aClass126_7.method3074(this.aString3) ? 100 : this.aClass126_7.method3087(this.aString3);
	}
}
