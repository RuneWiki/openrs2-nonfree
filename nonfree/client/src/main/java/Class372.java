import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class372 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public final int anInt10652;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
	public Class372(@OriginalArg(0) int arg0) {
		this.anInt10652 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
