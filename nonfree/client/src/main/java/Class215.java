import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class215 implements Interface23 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public final int anInt5937;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[F")
	public final float[] aFloatArray39;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(II)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5937 = arg1;
		this.anInt5936 = arg0;
		this.aFloatArray39 = new float[arg0 * arg1];
	}
}
