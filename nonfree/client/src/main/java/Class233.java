import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class233 implements Interface17 {

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Lclient!ni;")
	private final Class223 aClass223_84;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!ni;Ljava/lang/String;)V")
	public Class233(@OriginalArg(0) Class223 arg0, @OriginalArg(1) String arg1) {
		this.aClass223_84 = arg0;
		this.aString73 = arg1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Lclient!mk;")
	@Override
	public Class206 method6325() {
		return Static354.aClass206_4;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)I")
	@Override
	public int method6326() {
		return this.aClass223_84.method5950(this.aString73) ? 100 : this.aClass223_84.method5957(this.aString73);
	}
}
