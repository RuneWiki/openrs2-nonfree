import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class159 {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public int anInt4868;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
	public final int[] anIntArray346;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
	public final int[] anIntArray347;

	static {
		new Class98("", 73);
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt4868 = arg0;
		this.anIntArray346 = new int[this.anInt4868];
		this.anIntArray347 = new int[this.anInt4868];
	}
}
