import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Ljava/lang/String;")
	public String aString248;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString248 = arg0;
	}
}
