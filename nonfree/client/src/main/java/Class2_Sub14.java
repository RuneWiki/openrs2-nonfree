import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!cia", name = "o", descriptor = "[I")
	public final int[] anIntArray114;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub14(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anIntArray114 = new int[arg1];
		this.aString9 = arg0;
	}
}
