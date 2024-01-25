import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class88 implements Interface19 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString32;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_34;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!gga;Ljava/lang/String;)V")
	public Class88(@OriginalArg(0) Class124 arg0, @OriginalArg(1) String arg1) {
		this.aString32 = arg1;
		this.aClass124_34 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method9334() {
		return this.aClass124_34.method3632(this.aString32) ? 100 : 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!pw;")
	@Override
	public Class290 method9335() {
		return Static472.aClass290_3;
	}
}
