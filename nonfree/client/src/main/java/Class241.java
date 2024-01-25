import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class241 {

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
	public final int anInt6670;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
	private final int anInt6669;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(II)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6670 = arg1;
		this.anInt6669 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
	public int method5928() {
		return this.anInt6669;
	}
}
