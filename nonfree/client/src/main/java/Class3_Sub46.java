import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
	public final int anInt8139;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	public final int anInt8137;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(II)V")
	public Class3_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8139 = arg1;
		this.anInt8137 = arg0;
	}
}
