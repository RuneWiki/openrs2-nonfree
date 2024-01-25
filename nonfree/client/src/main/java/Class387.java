import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class387 {

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
	private final int anInt10663;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
	public final int anInt10659;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(II)V")
	public Class387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10663 = arg0;
		this.anInt10659 = arg1;
	}

	@OriginalMember(owner = "client!wia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)I")
	public int method9175() {
		return this.anInt10663;
	}
}
