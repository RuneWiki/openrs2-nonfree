import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class58 implements Interface23 {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public final int anInt1060;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[F")
	public final float[] aFloatArray11;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public final int anInt1061;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1060 = arg1;
		this.aFloatArray11 = new float[arg1 * arg0];
		this.anInt1061 = arg0;
	}
}
