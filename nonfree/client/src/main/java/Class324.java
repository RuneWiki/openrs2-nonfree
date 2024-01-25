import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class324 implements Interface18 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "I")
	public final int anInt8745;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	public final int anInt8747;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "[F")
	public final float[] aFloatArray77;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(II)V")
	public Class324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8745 = arg1;
		this.anInt8747 = arg0;
		this.aFloatArray77 = new float[arg1 * arg0];
	}
}
