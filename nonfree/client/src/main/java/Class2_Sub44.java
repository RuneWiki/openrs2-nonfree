import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public final int anInt8463;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
	public final int anInt8465;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public final int anInt8461;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString180;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public int anInt8460;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "J")
	public final long aLong215;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Z")
	public final boolean aBoolean611;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public final int anInt8464;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Ljava/lang/String;")
	public String aString179;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
	public final boolean aBoolean610;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub44(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8463 = arg6;
		this.anInt8465 = arg4;
		this.anInt8461 = arg7;
		this.aString180 = arg0;
		this.anInt8460 = arg3;
		this.aLong215 = arg5;
		this.aBoolean611 = arg8;
		this.anInt8464 = arg2;
		this.aString179 = arg1;
		this.aBoolean610 = arg9;
	}
}
