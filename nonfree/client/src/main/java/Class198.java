import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class198 implements Interface11 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	public final int anInt5422;

	static {
		new Class267(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class198(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5422 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
