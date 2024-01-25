import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	public final int anInt2460;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt2460 = arg0;
	}
}
