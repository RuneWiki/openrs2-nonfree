import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	public final int anInt7821;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "J")
	public final long aLong199;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
	public final boolean aBoolean592;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	public final boolean aBoolean590;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public final int anInt7818;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public final int anInt7817;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt7819;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString88;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public final int anInt7820;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub40(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt7821 = arg7;
		this.aLong199 = arg5;
		this.aBoolean592 = arg9;
		this.aBoolean590 = arg8;
		this.anInt7818 = arg4;
		this.anInt7817 = arg6;
		this.aString89 = arg1;
		this.anInt7819 = arg3;
		this.aString88 = arg0;
		this.anInt7820 = arg2;
	}
}
