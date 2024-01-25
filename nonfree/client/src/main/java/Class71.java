import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class71 implements Interface14 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_18;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/String;)V")
	public Class71(@OriginalArg(0) Class143 arg0, @OriginalArg(1) String arg1) {
		this.aClass143_18 = arg0;
		this.aString20 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
	@Override
	public int method7865() {
		return this.aClass143_18.method3118(this.aString20) ? 100 : this.aClass143_18.method3121(this.aString20);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!gb;")
	@Override
	public Class139 method7866() {
		return Static186.aClass139_3;
	}
}
