import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	public int anInt8272;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public final int anInt8270;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(II)V")
	public Class3_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8272 = arg1;
		this.anInt8270 = arg0;
	}
}
