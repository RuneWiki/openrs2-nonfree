import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class113 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	private int anInt3427;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(II)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3426 = arg0;
		this.anInt3427 = Static162.anInt3245;
	}

	@OriginalMember(owner = "client!mo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static162.method2801(this.anInt3426, this.anInt3427);
		super.finalize();
	}
}
