import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class159 {

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	public final int anInt4703;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt4703 = arg0;
	}

	@OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
