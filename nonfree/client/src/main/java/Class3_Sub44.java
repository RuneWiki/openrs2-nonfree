import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	public final int anInt8521;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	public final int anInt8519;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8521 = arg1;
		this.anInt8519 = arg0;
	}
}
