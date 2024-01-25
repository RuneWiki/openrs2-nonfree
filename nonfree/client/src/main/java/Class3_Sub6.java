import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ala")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!ala", name = "j", descriptor = "[I")
	public final int[] anIntArray49;

	@OriginalMember(owner = "client!ala", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub6(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anIntArray49 = new int[arg1];
		this.aString5 = arg0;
	}
}
