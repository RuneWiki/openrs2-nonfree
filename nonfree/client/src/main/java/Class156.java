import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class156 {

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
	public int anInt4465;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
	public final int[] anIntArray237;

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "[I")
	public final int[] anIntArray236;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V")
	public Class156(@OriginalArg(0) int arg0) {
		this.anInt4465 = arg0;
		this.anIntArray237 = new int[this.anInt4465];
		this.anIntArray236 = new int[this.anInt4465];
	}
}
