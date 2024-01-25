import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class103 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public final int anInt2500;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class103(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2500 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
	public int method2128() {
		return this.anInt2500;
	}

	@OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
