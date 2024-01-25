import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/lang/String;")
	public String aString120;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	private Class6_Sub20() {
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString120 = arg0;
	}
}
