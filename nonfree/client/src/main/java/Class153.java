import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class153 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public int anInt4339;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	public final int[] anIntArray367;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
	public final int[] anIntArray366;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class153(@OriginalArg(0) int arg0) {
		this.anInt4339 = arg0;
		this.anIntArray367 = new int[this.anInt4339];
		this.anIntArray366 = new int[this.anInt4339];
	}
}
