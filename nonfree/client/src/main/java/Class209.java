import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class209 implements Interface11 {

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!la;")
	private final Class208 aClass208_73;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString74;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class209(@OriginalArg(0) Class208 arg0, @OriginalArg(1) String arg1) {
		this.aClass208_73 = arg0;
		this.aString74 = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!ud;")
	@Override
	public Class342 method9043() {
		return Static593.aClass342_2;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I")
	@Override
	public int method9042() {
		return this.aClass208_73.method4998(this.aString74) ? 100 : 0;
	}
}
