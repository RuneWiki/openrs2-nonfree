import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class171 implements Interface27 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public final int anInt4497;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public final int anInt4499;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[F")
	public final float[] aFloatArray29;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(II)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4497 = arg1;
		this.anInt4499 = arg0;
		this.aFloatArray29 = new float[arg1 * arg0];
	}
}
