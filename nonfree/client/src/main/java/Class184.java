import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class184 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
	public final int anInt5327;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(II)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5327 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
