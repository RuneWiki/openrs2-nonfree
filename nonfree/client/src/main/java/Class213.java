import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class213 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public final int anInt5406;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class213(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5406 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I")
	public int method4814() {
		return this.anInt5406;
	}
}
