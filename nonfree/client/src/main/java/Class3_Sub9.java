import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	public final int anInt627;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(II)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt625 = arg1;
		this.anInt627 = arg0;
	}
}
