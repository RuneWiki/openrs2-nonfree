import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class275 implements Interface4 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_205;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString62;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!nd;Ljava/lang/String;)V")
	public Class275(@OriginalArg(0) Class238 arg0, @OriginalArg(1) String arg1) {
		this.aClass238_205 = arg0;
		this.aString62 = arg1;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Lclient!qia;")
	@Override
	public Class288 method6365() {
		return Static470.aClass288_4;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
	@Override
	public int method6364() {
		return this.aClass238_205.method5570(this.aString62) ? 100 : this.aClass238_205.method5566(this.aString62);
	}
}
