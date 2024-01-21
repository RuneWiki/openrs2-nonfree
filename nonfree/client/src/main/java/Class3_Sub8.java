import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	public final int anInt1076;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1076 = arg0;
	}
}
