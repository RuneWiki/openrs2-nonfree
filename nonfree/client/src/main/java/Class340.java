import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class340 implements Interface8 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!ri;")
	private final Class284 aClass284_160;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString257;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!ri;Ljava/lang/String;)V")
	public Class340(@OriginalArg(0) Class284 arg0, @OriginalArg(1) String arg1) {
		this.aClass284_160 = arg0;
		this.aString257 = arg1;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)Lclient!cj;")
	@Override
	public Class56 method7898() {
		return Static67.aClass56_2;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)I")
	@Override
	public int method7897() {
		return this.aClass284_160.method6325(this.aString257) ? 100 : 0;
	}
}
