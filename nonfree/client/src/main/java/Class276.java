import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class276 implements Interface18 {

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
	public final int anInt8087;

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
	public final int anInt8089;

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "[F")
	public final float[] aFloatArray70;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(II)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8087 = arg0;
		this.anInt8089 = arg1;
		this.aFloatArray70 = new float[arg1 * arg0];
	}
}
