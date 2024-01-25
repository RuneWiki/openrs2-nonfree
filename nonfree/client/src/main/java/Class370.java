import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class370 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public final int anInt10016;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10016 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
