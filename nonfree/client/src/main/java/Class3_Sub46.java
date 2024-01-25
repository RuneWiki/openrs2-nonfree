import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public final int anInt8499;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	public final int anInt8500;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(II)V")
	public Class3_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8499 = arg0;
		this.anInt8500 = arg1;
	}
}
