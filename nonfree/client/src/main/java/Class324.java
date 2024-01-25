import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class324 implements Interface18 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public final int anInt8834;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class324(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8834 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
