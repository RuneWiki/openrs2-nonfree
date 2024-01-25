import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	private Class3_Sub45() {
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString103 = arg0;
	}
}
