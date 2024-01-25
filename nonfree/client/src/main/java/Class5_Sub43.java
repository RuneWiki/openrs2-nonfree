import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
	public int anInt6989;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	private Class5_Sub43() {
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(I)V")
	public Class5_Sub43(@OriginalArg(0) int arg0) {
		this.anInt6989 = arg0;
	}
}
