import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public int anInt7748;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class2_Sub44() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub44(@OriginalArg(0) int arg0) {
		this.anInt7748 = arg0;
	}
}
