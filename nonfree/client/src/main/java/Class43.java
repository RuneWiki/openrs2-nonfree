import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class43 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt1201;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1199 = arg0;
		this.anInt1201 = Static173.anInt3332;
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static173.method2736(this.anInt1199, this.anInt1201);
		super.finalize();
	}
}
