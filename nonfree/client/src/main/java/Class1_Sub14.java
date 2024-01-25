import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
	public final int anInt1864;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public final int anInt1863;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V")
	public Class1_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1864 = arg1;
		this.anInt1863 = arg0;
	}
}
