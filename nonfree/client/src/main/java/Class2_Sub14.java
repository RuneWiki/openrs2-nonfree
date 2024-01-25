import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	private Class2_Sub14() {
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub14(@OriginalArg(0) int arg0) {
		this.anInt1303 = arg0;
	}
}
