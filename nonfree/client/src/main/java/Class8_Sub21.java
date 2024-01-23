import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class8_Sub21 extends Class8 {

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Ljava/lang/String;")
	public String aString119;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class8_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString119 = arg0;
	}
}
