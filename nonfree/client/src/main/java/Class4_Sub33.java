import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
	public int anInt6079;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	private Class4_Sub33() {
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V")
	public Class4_Sub33(@OriginalArg(0) int arg0) {
		this.anInt6079 = arg0;
	}
}
