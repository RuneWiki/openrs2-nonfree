import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class267 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
	public int anInt7184;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "[I")
	public final int[] anIntArray424;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "[I")
	public final int[] anIntArray425;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7184 = arg0;
		this.anIntArray424 = new int[this.anInt7184];
		this.anIntArray425 = new int[this.anInt7184];
	}
}
