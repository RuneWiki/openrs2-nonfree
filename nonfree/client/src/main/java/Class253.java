import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class253 {

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	public final int anInt6627;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
	private final int anInt6624;

	static {
		new Class55(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(II)V")
	public Class253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6627 = arg1;
		this.anInt6624 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	public int method5225() {
		return this.anInt6624;
	}
}
