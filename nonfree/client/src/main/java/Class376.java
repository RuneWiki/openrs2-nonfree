import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class376 implements Interface25 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	public final int anInt10174;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public final int anInt10176;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "[F")
	public final float[] aFloatArray78;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(II)V")
	public Class376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10174 = arg1;
		this.anInt10176 = arg0;
		this.aFloatArray78 = new float[arg0 * arg1];
	}
}
