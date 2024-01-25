import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class214 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public int anInt6341;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
	public final int[] anIntArray620;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
	public final int[] anIntArray619;

	static {
		new Class45("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt6341 = arg0;
		this.anIntArray620 = new int[this.anInt6341];
		this.anIntArray619 = new int[this.anInt6341];
	}
}
