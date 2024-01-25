import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public final int anInt5952;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
	public int anInt5954;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "Z")
	public final boolean aBoolean390;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "J")
	public final long aLong176;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public final int anInt5951;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Z")
	public final boolean aBoolean389;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
	public final int anInt5955;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub33(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5952 = arg2;
		this.anInt5954 = arg3;
		this.aBoolean390 = arg9;
		this.aLong176 = arg5;
		this.aString51 = arg0;
		this.anInt5951 = arg6;
		this.aBoolean389 = arg8;
		this.aString52 = arg1;
		this.anInt5956 = arg7;
		this.anInt5955 = arg4;
	}
}
