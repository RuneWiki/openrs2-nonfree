import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public final int anInt719;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt719 = arg0;
		this.anInt716 = arg1;
	}
}
