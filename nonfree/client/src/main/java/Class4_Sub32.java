import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class4_Sub32() {
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	public Class4_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5435 = arg0;
	}
}
