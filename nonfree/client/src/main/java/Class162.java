import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class162 {

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	public final int anInt4926;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class162(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString56 = arg0;
		this.anInt4926 = arg1;
	}

	@OriginalMember(owner = "client!jda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
