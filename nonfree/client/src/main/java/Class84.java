import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class84 {

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
	public int anInt2183;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "[I")
	public final int[] anIntArray157;

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "[I")
	public final int[] anIntArray156;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.anInt2183 = arg0;
		this.anIntArray157 = new int[this.anInt2183];
		this.anIntArray156 = new int[this.anInt2183];
	}
}
