import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class321 implements Interface19 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public final int anInt8568;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class321(@OriginalArg(0) int arg0) {
		this.anInt8568 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static459.aClass357_12;
	}
}
