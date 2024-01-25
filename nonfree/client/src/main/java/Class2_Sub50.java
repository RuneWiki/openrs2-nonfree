import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Ljava/lang/String;")
	public String aString213;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	private Class2_Sub50() {
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub50(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString213 = arg0;
	}
}
