import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class38 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public int anInt1530;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	private int anInt1532;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1530 = arg0;
		this.anInt1532 = Static124.anInt2871;
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static124.method2208(this.anInt1530, this.anInt1532);
		super.finalize();
	}
}
