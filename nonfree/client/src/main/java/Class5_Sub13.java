import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!cia", name = "k", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "()V")
	private Class5_Sub13() {
	}

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString10 = arg0;
	}
}
