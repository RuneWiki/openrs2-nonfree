import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class189 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public int anInt5383;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "[I")
	public final int[] anIntArray441;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "[I")
	public final int[] anIntArray440;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class189(@OriginalArg(0) int arg0) {
		this.anInt5383 = arg0;
		this.anIntArray441 = new int[this.anInt5383];
		this.anIntArray440 = new int[this.anInt5383];
	}
}
