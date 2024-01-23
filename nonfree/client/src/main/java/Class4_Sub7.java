import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	public int anInt436;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
	public Class4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt434 = arg0;
		this.anInt436 = arg1;
	}
}
