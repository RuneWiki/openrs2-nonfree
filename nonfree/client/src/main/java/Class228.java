import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class228 implements Interface23 {

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString55;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!pl;")
	private final Class259 aClass259_108;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!pl;Ljava/lang/String;)V")
	public Class228(@OriginalArg(0) Class259 arg0, @OriginalArg(1) String arg1) {
		this.aString55 = arg1;
		this.aClass259_108 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	@Override
	public int method6597() {
		return this.aClass259_108.method5982(this.aString55) ? 100 : this.aClass259_108.method5972(this.aString55);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lclient!tj;")
	@Override
	public Class320 method6598() {
		return Static512.aClass320_4;
	}
}
