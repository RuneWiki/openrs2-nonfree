import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class179 {

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[I")
	public final int[] anIntArray392;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
	public final int[] anIntArray393;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class179(@OriginalArg(0) int arg0) {
		this.anInt5505 = arg0;
		this.anIntArray392 = new int[this.anInt5505];
		this.anIntArray393 = new int[this.anInt5505];
	}
}
