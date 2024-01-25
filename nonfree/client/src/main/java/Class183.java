import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class183 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public int anInt5334;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
	public final int[] anIntArray397;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
	public final int[] anIntArray398;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class183(@OriginalArg(0) int arg0) {
		this.anInt5334 = arg0;
		this.anIntArray397 = new int[this.anInt5334];
		this.anIntArray398 = new int[this.anInt5334];
	}
}
