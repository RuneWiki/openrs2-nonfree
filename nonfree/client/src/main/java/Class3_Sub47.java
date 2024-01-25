import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
	public final int anInt8780;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
	public final int anInt8779;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(II)V")
	public Class3_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8780 = arg0;
		this.anInt8779 = arg1;
	}
}
