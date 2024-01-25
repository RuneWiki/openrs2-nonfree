import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class298 implements Interface26 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[F")
	public final float[] aFloatArray60;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public final int anInt7776;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public final int anInt7775;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray60 = new float[arg1 * arg0];
		this.anInt7776 = arg1;
		this.anInt7775 = arg0;
	}
}
