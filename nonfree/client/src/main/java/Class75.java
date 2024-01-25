import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class75 implements Interface13 {

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_24;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString26;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!vd;Ljava/lang/String;)V")
	public Class75(@OriginalArg(0) Class353 arg0, @OriginalArg(1) String arg1) {
		this.aClass353_24 = arg0;
		this.aString26 = arg1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Lclient!gj;")
	@Override
	public Class115 method8509() {
		return Static184.aClass115_3;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
	@Override
	public int method8510() {
		return this.aClass353_24.method8427(this.aString26) ? 100 : 0;
	}
}
