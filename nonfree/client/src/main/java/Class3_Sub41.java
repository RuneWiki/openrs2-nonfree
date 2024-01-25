import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	private Class3_Sub41() {
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub41(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString101 = arg0;
	}
}
