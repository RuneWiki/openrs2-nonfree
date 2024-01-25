import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class392 {

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public int anInt10919;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "[I")
	public final int[] anIntArray630;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "[I")
	public final int[] anIntArray629;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
	public Class392(@OriginalArg(0) int arg0) {
		this.anInt10919 = arg0;
		this.anIntArray630 = new int[this.anInt10919];
		this.anIntArray629 = new int[this.anInt10919];
	}
}
