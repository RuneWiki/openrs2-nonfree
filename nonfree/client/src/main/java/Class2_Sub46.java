import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
	public final boolean aBoolean530;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	public final int anInt7285;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
	public final int anInt7287;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	public final int anInt7286;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString207;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Z")
	public final boolean aBoolean531;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "J")
	public final long aLong226;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Ljava/lang/String;")
	public String aString206;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	public int anInt7283;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	public final int anInt7282;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub46(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean530 = arg8;
		this.anInt7285 = arg2;
		this.anInt7287 = arg7;
		this.anInt7286 = arg6;
		this.aString207 = arg0;
		this.aBoolean531 = arg9;
		this.aLong226 = arg5;
		this.aString206 = arg1;
		this.anInt7283 = arg3;
		this.anInt7282 = arg4;
	}
}
