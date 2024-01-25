import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class75 implements Interface17 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString16;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class75(@OriginalArg(0) String arg0) {
		this.aString16 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lclient!wea;")
	@Override
	public Class370 method6809() {
		return Static623.aClass370_5;
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Z")
	public boolean method2143() {
		return this.aBoolean148;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
	@Override
	public int method6808() {
		@Pc(8) int local8 = Static1.method8297(this.aString16);
		if (local8 >= 0 && local8 <= 100) {
			return local8;
		} else {
			this.aBoolean148 = true;
			return 100;
		}
	}
}
