import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class215 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public final int anInt5941;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class215(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5941 = arg1;
	}

	@OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	public int method5134() {
		return this.anInt5941;
	}
}
