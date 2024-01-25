import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public final int anInt1050;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
	public Class7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1054 = arg1;
		this.anInt1050 = arg0;
	}
}
