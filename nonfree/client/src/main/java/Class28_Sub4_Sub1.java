import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class28_Sub4_Sub1 extends Class28_Sub4 {

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public final int anInt8233 = (int) (Static524.method7320() / 1000L);

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString99;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class28_Sub4_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString99 = arg0;
		this.aShort87 = (short) arg1;
	}
}
