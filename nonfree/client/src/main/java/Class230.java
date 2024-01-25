import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class230 implements Interface8 {

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString170;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Lclient!ri;")
	private final Class284 aClass284_110;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ri;Ljava/lang/String;)V")
	public Class230(@OriginalArg(0) Class284 arg0, @OriginalArg(1) String arg1) {
		this.aString170 = arg1;
		this.aClass284_110 = arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
	@Override
	public int method7897() {
		return this.aClass284_110.method6352(this.aString170) ? 100 : this.aClass284_110.method6340(this.aString170);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Lclient!cj;")
	@Override
	public Class56 method7898() {
		return Static67.aClass56_3;
	}
}
