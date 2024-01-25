import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public abstract class Class14_Sub3_Sub6 extends Class14_Sub3 {

	@OriginalMember(owner = "client!dja", name = "z", descriptor = "I")
	public final int anInt8329;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(I)V")
	protected Class14_Sub3_Sub6(@OriginalArg(0) int arg0) {
		this.anInt8329 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)Z")
	public abstract boolean method6921();

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6923();
}
