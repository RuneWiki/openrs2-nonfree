import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "J")
	public final long aLong199;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	public final int anInt5870;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
	public final int anInt5874;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
	public final int anInt5869;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	public final int anInt5872;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub38(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aLong199 = arg5;
		this.aString57 = arg1;
		this.aString58 = arg0;
		this.anInt5870 = arg7;
		this.anInt5874 = arg6;
		this.aBoolean413 = arg8;
		this.aBoolean412 = arg9;
		this.anInt5875 = arg3;
		this.anInt5869 = arg4;
		this.anInt5872 = arg2;
	}
}
