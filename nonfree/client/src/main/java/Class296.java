import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class296 implements Interface18 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public final int anInt8598;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
	public Class296(@OriginalArg(0) int arg0) {
		this.anInt8598 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static596.aClass409_14;
	}
}
