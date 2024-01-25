import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class60 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public final int anInt1812;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1812 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
