import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class194 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public int anInt5914;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
	public final int[] anIntArray500;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
	public final int[] anIntArray499;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
	public Class194(@OriginalArg(0) int arg0) {
		this.anInt5914 = arg0;
		this.anIntArray500 = new int[this.anInt5914];
		this.anIntArray499 = new int[this.anInt5914];
	}
}
