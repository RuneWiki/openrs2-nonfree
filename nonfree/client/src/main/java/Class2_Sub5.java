import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class2_Sub5() {
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5(@OriginalArg(0) int arg0) {
		this.anInt603 = arg0;
	}
}
