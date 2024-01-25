import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class10_Sub12 extends Class10 {

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1159;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	private Class10_Sub12() {
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V")
	public Class10_Sub12(@OriginalArg(0) int arg0) {
		this.anInt1159 = arg0;
	}
}
