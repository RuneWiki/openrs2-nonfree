import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class197 {

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
	public int anInt5405;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "[I")
	public final int[] anIntArray292;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V")
	public Class197(@OriginalArg(0) int arg0) {
		this.anInt5405 = arg0;
		this.anIntArray292 = new int[this.anInt5405];
		this.anIntArray291 = new int[this.anInt5405];
	}
}
