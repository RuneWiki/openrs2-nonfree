import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class223 implements Interface2 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_78;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString72;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!mv;Ljava/lang/String;)V")
	public Class223(@OriginalArg(0) Class229 arg0, @OriginalArg(1) String arg1) {
		this.aClass229_78 = arg0;
		this.aString72 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Lclient!bl;")
	@Override
	public Class36 method6248() {
		return Static43.aClass36_3;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	@Override
	public int method6247() {
		return this.aClass229_78.method4977(this.aString72) ? 100 : 0;
	}
}
