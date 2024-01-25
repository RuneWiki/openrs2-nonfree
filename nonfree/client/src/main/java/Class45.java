import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class45 {

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I)V")
	public Class45(@OriginalArg(0) int arg0) {
		this.anInt1505 = arg0;
		this.anIntArray103 = new int[this.anInt1505];
		this.anIntArray102 = new int[this.anInt1505];
	}
}
