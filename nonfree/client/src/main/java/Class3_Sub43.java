import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public final int anInt7749;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "Z")
	public final boolean aBoolean607;

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
	public int anInt7753;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "Z")
	public final boolean aBoolean608;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
	public final int anInt7750;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
	public final int anInt7752;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "J")
	public final long aLong221;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public final int anInt7751;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt7749 = arg2;
		this.aString75 = arg0;
		this.aBoolean607 = arg9;
		this.anInt7753 = arg3;
		this.aString74 = arg1;
		this.aBoolean608 = arg8;
		this.anInt7750 = arg7;
		this.anInt7752 = arg6;
		this.aLong221 = arg5;
		this.anInt7751 = arg4;
	}
}
