import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt951 = arg0;
		this.anInt953 = arg1;
	}
}
