import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
	public final int anInt7125;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Z")
	public final boolean aBoolean509;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "J")
	public final long aLong212;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Z")
	public final boolean aBoolean510;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
	public final int anInt7120;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	public int anInt7126;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
	public final int anInt7122;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt7125 = arg2;
		this.anInt7124 = arg4;
		this.aBoolean509 = arg8;
		this.aLong212 = arg5;
		this.aBoolean510 = arg9;
		this.anInt7120 = arg7;
		this.aString63 = arg1;
		this.anInt7126 = arg3;
		this.aString64 = arg0;
		this.anInt7122 = arg6;
	}
}
