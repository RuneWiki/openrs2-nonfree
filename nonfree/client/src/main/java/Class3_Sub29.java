import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	private Class3_Sub29() {
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub29(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString44 = arg0;
	}
}
