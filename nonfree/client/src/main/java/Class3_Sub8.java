import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
	public final int anInt9906;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt9906 = arg0;
	}
}
