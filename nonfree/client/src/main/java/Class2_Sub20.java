import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	private Class2_Sub20() {
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20(@OriginalArg(0) int arg0) {
		this.anInt2212 = arg0;
	}
}
