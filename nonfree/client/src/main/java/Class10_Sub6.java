import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class10_Sub6() {
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class10_Sub6(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString7 = arg0;
	}
}
