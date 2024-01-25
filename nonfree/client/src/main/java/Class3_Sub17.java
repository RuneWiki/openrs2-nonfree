import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
	public final int anInt2267;

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
	public final int anInt2263;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(II)V")
	public Class3_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2267 = arg1;
		this.anInt2263 = arg0;
	}
}
