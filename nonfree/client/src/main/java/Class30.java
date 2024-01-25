import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class30 implements Interface17 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString3;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_13;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!la;Ljava/lang/String;)V")
	public Class30(@OriginalArg(0) Class196 arg0, @OriginalArg(1) String arg1) {
		this.aString3 = arg1;
		this.aClass196_13 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lclient!wea;")
	@Override
	public Class370 method6809() {
		return Static623.aClass370_3;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	@Override
	public int method6808() {
		return this.aClass196_13.method5090(this.aString3) ? 100 : 0;
	}
}
