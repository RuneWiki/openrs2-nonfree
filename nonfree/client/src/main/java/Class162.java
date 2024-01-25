import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class162 implements Interface3 {

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
	public final int anInt4953;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class162(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4953 = arg1;
	}

	@OriginalMember(owner = "client!jda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
