import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class190 implements Interface15 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
	public final int anInt5111;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[F")
	public final float[] aFloatArray39;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public final int anInt5109;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5111 = arg1;
		this.aFloatArray39 = new float[arg0 * arg1];
		this.anInt5109 = arg0;
	}
}
