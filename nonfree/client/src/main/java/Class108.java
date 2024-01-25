import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class108 implements Interface13 {

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString37;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class108(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
	public boolean method3108() {
		return this.aBoolean254;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lclient!gj;")
	@Override
	public Class115 method8509() {
		return Static184.aClass115_5;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
	@Override
	public int method8510() {
		@Pc(13) int local13 = Static104.method1717(this.aString37);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean254 = true;
			return 100;
		}
	}
}
