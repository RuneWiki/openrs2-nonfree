import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt55 = arg0;
		this.anInt56 = Static74.anInt1419;
	}

	@OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static74.method1192(this.anInt55, this.anInt56);
		super.finalize();
	}
}
