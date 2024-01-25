import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class25_Sub8 extends Class25 {

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public final int anInt5128;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	public Class25_Sub8(@OriginalArg(0) int arg0) {
		this.anInt5128 = arg0;
	}
}
