import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class264 implements Interface9 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public final int anInt7412;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public final int anInt7415;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "[F")
	public final float[] aFloatArray73;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(II)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7412 = arg1;
		this.anInt7415 = arg0;
		this.aFloatArray73 = new float[arg0 * arg1];
	}
}
