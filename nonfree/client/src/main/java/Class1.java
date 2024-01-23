import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt2;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V")
	public Class1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2 = arg0;
		this.anInt3 = Static166.anInt3350;
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static166.method2635(this.anInt2, this.anInt3);
		super.finalize();
	}
}
