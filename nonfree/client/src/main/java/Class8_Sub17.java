import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class8_Sub17 extends Class8 {

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	public int anInt2919;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class8_Sub17() {
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	public Class8_Sub17(@OriginalArg(0) int arg0) {
		this.anInt2919 = arg0;
	}
}
