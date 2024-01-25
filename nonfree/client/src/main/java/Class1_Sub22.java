import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "J")
	public final long aLong104;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Z")
	public final boolean aBoolean204;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	public final int anInt2826;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public final int anInt2821;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	public final int anInt2828;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	public int anInt2822;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Z")
	public final boolean aBoolean203;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJIIZZ)V")
	public Class1_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8) {
		this.aLong104 = arg4;
		this.aBoolean204 = arg7;
		this.anInt2826 = arg2;
		this.anInt2821 = arg6;
		this.anInt2828 = arg5;
		this.aString22 = arg1;
		this.aString21 = arg0;
		this.anInt2822 = arg3;
		this.aBoolean203 = arg8;
	}
}
