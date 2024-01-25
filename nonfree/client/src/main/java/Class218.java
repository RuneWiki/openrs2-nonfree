import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class218 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	public final int anInt6933;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	private final int anInt6931;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6933 = arg1;
		this.anInt6931 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
	public int method5800() {
		return this.anInt6931;
	}
}
