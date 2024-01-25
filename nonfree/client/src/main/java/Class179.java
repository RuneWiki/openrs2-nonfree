import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class179 implements Interface6 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public final int anInt4703;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class179(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4703 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
