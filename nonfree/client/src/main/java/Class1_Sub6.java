import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public final int anInt685;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public final int anInt686;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt685 = arg0;
		this.anInt686 = arg1;
	}
}
