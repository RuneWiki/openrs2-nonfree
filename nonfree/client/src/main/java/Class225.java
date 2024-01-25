import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class225 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public final int anInt5523;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5523 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
