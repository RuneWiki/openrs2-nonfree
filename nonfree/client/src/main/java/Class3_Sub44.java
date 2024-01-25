import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
	public int anInt7298;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
	private Class3_Sub44() {
	}

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub44(@OriginalArg(0) int arg0) {
		this.anInt7298 = arg0;
	}
}
