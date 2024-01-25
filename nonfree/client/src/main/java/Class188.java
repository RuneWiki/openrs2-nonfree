import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class188 implements Interface27 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "[F")
	public final float[] aFloatArray17;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	public final int anInt4423;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	public final int anInt4422;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray17 = new float[arg1 * arg0];
		this.anInt4423 = arg1;
		this.anInt4422 = arg0;
	}
}
