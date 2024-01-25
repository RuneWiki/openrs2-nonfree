import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class291 implements Interface23 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!pl;")
	private final Class259 aClass259_145;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString85;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!pl;Ljava/lang/String;)V")
	public Class291(@OriginalArg(0) Class259 arg0, @OriginalArg(1) String arg1) {
		this.aClass259_145 = arg0;
		this.aString85 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!tj;")
	@Override
	public Class320 method6598() {
		return Static512.aClass320_3;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	@Override
	public int method6597() {
		return this.aClass259_145.method5989(this.aString85) ? 100 : 0;
	}
}
