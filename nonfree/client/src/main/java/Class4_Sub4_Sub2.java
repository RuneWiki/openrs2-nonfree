import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
	public final int anInt10036 = (int) (Static480.method6763() / 1000L);

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString115;

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString115 = arg0;
		this.aShort118 = (short) arg1;
	}
}
