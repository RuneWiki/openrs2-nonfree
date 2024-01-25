import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	private Class1_Sub45() {
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString74 = arg0;
	}
}
