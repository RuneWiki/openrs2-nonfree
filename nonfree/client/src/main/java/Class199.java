import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class199 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public final int anInt5522;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class199(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5522 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)I")
	public int method4745() {
		return this.anInt5522;
	}

	@OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
