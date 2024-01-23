import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class175 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public int anInt5733;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	private int anInt5734;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(II)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5733 = arg0;
		this.anInt5734 = Static113.anInt2464;
	}

	@OriginalMember(owner = "client!ul", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static113.method1830(this.anInt5733, this.anInt5734);
		super.finalize();
	}
}
