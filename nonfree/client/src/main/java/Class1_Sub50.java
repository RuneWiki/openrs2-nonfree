import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class1_Sub50 extends Class1 {

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	public final int anInt8979;

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "I")
	public int anInt8983;

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
	public final int anInt8980;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Z")
	public final boolean aBoolean621;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
	public final boolean aBoolean620;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
	public final int anInt8981;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "J")
	public final long aLong236;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
	public final int anInt8977;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub50(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt8979 = arg7;
		this.anInt8983 = arg3;
		this.aString83 = arg1;
		this.aString82 = arg0;
		this.anInt8980 = arg4;
		this.aBoolean621 = arg9;
		this.aBoolean620 = arg8;
		this.anInt8981 = arg6;
		this.aLong236 = arg5;
		this.anInt8977 = arg2;
	}
}
