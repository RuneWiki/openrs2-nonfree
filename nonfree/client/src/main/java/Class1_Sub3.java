import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	private Class1_Sub3() {
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString8 = arg0;
	}
}
