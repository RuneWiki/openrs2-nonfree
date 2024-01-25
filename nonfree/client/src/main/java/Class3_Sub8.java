import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class3_Sub8() {
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub8(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString9 = arg0;
	}
}
