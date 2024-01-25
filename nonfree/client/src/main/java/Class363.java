import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class363 implements Interface13 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!vd;")
	private final Class353 aClass353_132;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString114;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!vd;Ljava/lang/String;)V")
	public Class363(@OriginalArg(0) Class353 arg0, @OriginalArg(1) String arg1) {
		this.aClass353_132 = arg0;
		this.aString114 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lclient!gj;")
	@Override
	public Class115 method8509() {
		return Static184.aClass115_4;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
	@Override
	public int method8510() {
		return this.aClass353_132.method8397(this.aString114) ? 100 : this.aClass353_132.method8418(this.aString114);
	}
}
