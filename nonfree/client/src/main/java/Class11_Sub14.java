import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class11_Sub14 extends Class11 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public final int anInt1763;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public final int anInt1764;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public final int anInt1766;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "J")
	public final long aLong67;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public int anInt1765;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class11_Sub14(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1763 = arg6;
		this.anInt1764 = arg5;
		this.aString16 = arg0;
		this.anInt1766 = arg2;
		this.aLong67 = arg4;
		this.anInt1765 = arg3;
		this.aString17 = arg1;
	}
}
