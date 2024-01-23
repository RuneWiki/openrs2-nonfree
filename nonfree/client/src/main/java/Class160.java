import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class160 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt4909;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	private int anInt4908;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4909 = arg0;
		this.anInt4908 = Static256.anInt5185;
	}

	@OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static256.method4125(this.anInt4909, this.anInt4908);
		super.finalize();
	}
}
