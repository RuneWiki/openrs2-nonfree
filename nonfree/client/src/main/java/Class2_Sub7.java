import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7(@OriginalArg(0) int arg0) {
		this.anInt534 = arg0;
	}
}
