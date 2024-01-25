import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class263 {

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString80;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
	public final int anInt6964;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class263(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString80 = arg0;
		this.anInt6964 = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
