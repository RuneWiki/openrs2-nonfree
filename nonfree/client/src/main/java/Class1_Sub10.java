import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "J")
	public final long aLong31;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Z")
	public final boolean aBoolean132;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
	public final boolean aBoolean131;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public final int anInt1055;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public final int anInt1052;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
	public final int anInt1058;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public final int anInt1050;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub10(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aLong31 = arg5;
		this.aBoolean132 = arg8;
		this.aString10 = arg0;
		this.anInt1057 = arg3;
		this.aBoolean131 = arg9;
		this.anInt1055 = arg2;
		this.aString9 = arg1;
		this.anInt1052 = arg6;
		this.anInt1058 = arg7;
		this.anInt1050 = arg4;
	}
}
