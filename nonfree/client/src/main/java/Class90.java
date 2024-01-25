import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class90 implements Interface15 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString37;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!om;")
	private final Class246 aClass246_69;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!om;Ljava/lang/String;)V")
	public Class90(@OriginalArg(0) Class246 arg0, @OriginalArg(1) String arg1) {
		this.aString37 = arg1;
		this.aClass246_69 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	@Override
	public int method4825() {
		return this.aClass246_69.method5651(this.aString37) ? 100 : 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!wa;")
	@Override
	public Class356 method4824() {
		return Static574.aClass356_3;
	}
}
