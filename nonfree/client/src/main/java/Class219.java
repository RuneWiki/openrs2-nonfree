import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class219 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
	public final int anInt6322;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class219(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6322 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
