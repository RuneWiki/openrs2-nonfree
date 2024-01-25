import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class201 implements Interface3 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	public final int anInt5048;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt5048 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static207.aClass210_17;
	}
}
