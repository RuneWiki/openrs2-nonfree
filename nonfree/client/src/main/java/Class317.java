import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class317 implements Interface24 {

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "Lclient!cb;")
	private final Class50 aClass50_155;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString96;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!cb;Ljava/lang/String;)V")
	public Class317(@OriginalArg(0) Class50 arg0, @OriginalArg(1) String arg1) {
		this.aClass50_155 = arg0;
		this.aString96 = arg1;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Lclient!bja;")
	@Override
	public Class39 method7365() {
		return Static46.aClass39_3;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)I")
	@Override
	public int method7364() {
		return this.aClass50_155.method922(this.aString96) ? 100 : this.aClass50_155.method914(this.aString96);
	}
}
