import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class332 implements Interface22 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!wm;")
	private final Class390 aClass390_111;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString86;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!wm;Ljava/lang/String;)V")
	public Class332(@OriginalArg(0) Class390 arg0, @OriginalArg(1) String arg1) {
		this.aClass390_111 = arg0;
		this.aString86 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lclient!dca;")
	@Override
	public Class77 method8098() {
		return Static99.aClass77_2;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	@Override
	public int method8097() {
		return this.aClass390_111.method8921(this.aString86) ? 100 : 0;
	}
}
