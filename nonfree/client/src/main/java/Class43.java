import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class43 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt1516;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	private int anInt1518;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1516 = arg0;
		this.anInt1518 = Static94.anInt2207;
	}

	@OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static94.method1750(this.anInt1516, this.anInt1518);
		super.finalize();
	}
}
