import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class222 {

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public final int anInt6401;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class222(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6401 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	public int method5299() {
		return this.anInt6401;
	}
}
