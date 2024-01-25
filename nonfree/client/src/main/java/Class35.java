import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class35 implements Interface17 {

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString7;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!eq;")
	private final Class97 aClass97_4;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!eq;Ljava/lang/String;)V")
	public Class35(@OriginalArg(0) Class97 arg0, @OriginalArg(1) String arg1) {
		this.aString7 = arg1;
		this.aClass97_4 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lclient!qfa;")
	@Override
	public Class276 method5453() {
		return Static457.aClass276_3;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method5454() {
		return this.aClass97_4.method2562(this.aString7) ? 100 : this.aClass97_4.method2552(this.aString7);
	}
}
