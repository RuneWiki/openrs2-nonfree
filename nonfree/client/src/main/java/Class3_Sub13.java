import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	private Class3_Sub13() {
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString11 = arg0;
	}
}
