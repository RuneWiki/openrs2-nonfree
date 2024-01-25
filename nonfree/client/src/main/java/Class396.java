import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class396 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	public int anInt10843;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
	public final int[] anIntArray622;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
	public final int[] anIntArray621;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class396(@OriginalArg(0) int arg0) {
		this.anInt10843 = arg0;
		this.anIntArray622 = new int[this.anInt10843];
		this.anIntArray621 = new int[this.anInt10843];
	}
}
