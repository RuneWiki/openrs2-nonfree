import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class41 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public int anInt1363;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1363 = arg0;
		this.anInt1362 = Static239.anInt4726;
	}

	@OriginalMember(owner = "client!ef", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static239.method3676(this.anInt1363, this.anInt1362);
		super.finalize();
	}
}
