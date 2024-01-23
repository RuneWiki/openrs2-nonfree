import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class150 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt4326;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[Lclient!ng;")
	public Class1_Sub2_Sub12[] aClass1_Sub2_Sub12Array1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
	public Class150(@OriginalArg(0) int arg0) {
		this.anInt4326 = arg0;
		this.aClass1_Sub2_Sub12Array1 = new Class1_Sub2_Sub12[this.anInt4326];
		this.anIntArray369 = new int[this.anInt4326];
	}
}
