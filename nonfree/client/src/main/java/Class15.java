import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class15 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public final int anInt268;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt268 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
