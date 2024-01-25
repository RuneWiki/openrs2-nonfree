import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	private Class4_Sub24() {
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString32 = arg0;
	}
}
