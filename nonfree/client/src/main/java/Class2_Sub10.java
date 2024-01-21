import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	public final int anInt974;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt974 = arg0;
	}
}
