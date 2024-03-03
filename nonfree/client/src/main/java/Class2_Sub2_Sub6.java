import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
	public final int anInt6623;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V", line = 1161)
	protected Class2_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt6623 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5952();

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(B)Z")
	public abstract boolean method5955();
}
