import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class46 implements Interface17 {

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!eq;")
	private final Class97 aClass97_8;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!eq;Ljava/lang/String;)V")
	public Class46(@OriginalArg(0) Class97 arg0, @OriginalArg(1) String arg1) {
		this.aClass97_8 = arg0;
		this.aString12 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Lclient!qfa;")
	@Override
	public Class276 method5453() {
		return Static457.aClass276_2;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
	@Override
	public int method5454() {
		return this.aClass97_8.method2557(this.aString12) ? 100 : 0;
	}
}
