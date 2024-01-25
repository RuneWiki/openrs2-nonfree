import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class1_Sub51 extends Class1 {

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
	public final int anInt9640;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
	public final boolean aBoolean753;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "Z")
	public final boolean aBoolean754;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString100;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
	public final int anInt9642;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
	public int anInt9638;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
	public final int anInt9643;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
	public final int anInt9641;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "J")
	public final long aLong302;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub51(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt9640 = arg7;
		this.aBoolean753 = arg9;
		this.aBoolean754 = arg8;
		this.aString100 = arg0;
		this.aString99 = arg1;
		this.anInt9642 = arg2;
		this.anInt9638 = arg3;
		this.anInt9643 = arg4;
		this.anInt9641 = arg6;
		this.aLong302 = arg5;
	}
}
