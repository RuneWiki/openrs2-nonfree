import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class66 implements Interface19 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	public final int anInt1937;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public final int anInt1936;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[F")
	public final float[] aFloatArray28;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1937 = arg1;
		this.anInt1936 = arg0;
		this.aFloatArray28 = new float[arg1 * arg0];
	}
}
