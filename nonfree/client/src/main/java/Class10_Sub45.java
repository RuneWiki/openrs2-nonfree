import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class10_Sub45 extends Class10 {

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "J")
	public final long aLong261;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public int anInt7505;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public final int anInt7508;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Z")
	public final boolean aBoolean495;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public final int anInt7504;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public final int anInt7507;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
	public final boolean aBoolean494;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public final int anInt7506;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class10_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aLong261 = arg5;
		this.anInt7505 = arg3;
		this.anInt7508 = arg7;
		this.aString71 = arg0;
		this.aString72 = arg1;
		this.aBoolean495 = arg8;
		this.anInt7504 = arg2;
		this.anInt7507 = arg6;
		this.aBoolean494 = arg9;
		this.anInt7506 = arg4;
	}
}
