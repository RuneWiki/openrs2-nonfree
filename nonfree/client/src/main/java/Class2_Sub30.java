import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public int anInt5508;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	private Class2_Sub30() {
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub30(@OriginalArg(0) int arg0) {
		this.anInt5508 = arg0;
	}
}
