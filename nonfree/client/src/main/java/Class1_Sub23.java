import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public final int anInt3591;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "J")
	public final long aLong121;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public final int anInt3587;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public int anInt3588;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public final int anInt3589;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class1_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3591 = arg2;
		this.aLong121 = arg4;
		this.anInt3587 = arg5;
		this.anInt3588 = arg3;
		this.aString34 = arg1;
		this.anInt3589 = arg6;
		this.aString35 = arg0;
	}
}
