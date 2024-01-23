import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class8_Sub28 extends Class8 {

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	public int anInt4870;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class8_Sub28() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	public Class8_Sub28(@OriginalArg(0) int arg0) {
		this.anInt4870 = arg0;
	}
}
