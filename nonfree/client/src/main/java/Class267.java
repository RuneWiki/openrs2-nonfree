import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class267 {

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	public int anInt7259;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
	public final int[] anIntArray636;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
	public final int[] anIntArray637;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7259 = arg0;
		this.anIntArray636 = new int[this.anInt7259];
		this.anIntArray637 = new int[this.anInt7259];
	}
}
