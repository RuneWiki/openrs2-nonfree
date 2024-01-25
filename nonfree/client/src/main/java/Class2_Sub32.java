import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt5391;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	private Class2_Sub32() {
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class2_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5391 = arg0;
	}
}
