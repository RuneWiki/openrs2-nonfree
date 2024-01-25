import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class302 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public final int anInt8653;

	static {
		new Class306("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class302(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8653 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)I")
	public int method7101() {
		return this.anInt8653;
	}
}
