import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class15_Sub5_Sub2 extends Class15_Sub5 {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public final int anInt10147 = (int) (Static342.method5463() / 1000L);

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString108;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class15_Sub5_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort118 = (short) arg1;
		this.aString108 = arg0;
	}
}
