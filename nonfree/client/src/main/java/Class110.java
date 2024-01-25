import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class110 implements Interface14 {

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_36;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString29;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/String;)V")
	public Class110(@OriginalArg(0) Class143 arg0, @OriginalArg(1) String arg1) {
		this.aClass143_36 = arg0;
		this.aString29 = arg1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I")
	@Override
	public int method7865() {
		return this.aClass143_36.method3140(this.aString29) ? 100 : 0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lclient!gb;")
	@Override
	public Class139 method7866() {
		return Static186.aClass139_2;
	}
}
