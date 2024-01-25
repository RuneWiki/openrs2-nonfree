import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
	public final boolean aBoolean452;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
	public int anInt6532;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "J")
	public final long aLong192;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "Z")
	public final boolean aBoolean453;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
	public final int anInt6528;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	public final int anInt6531;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	public final int anInt6524;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	public final int anInt6525;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub38(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean452 = arg8;
		this.anInt6532 = arg3;
		this.aLong192 = arg5;
		this.aString59 = arg1;
		this.aBoolean453 = arg9;
		this.anInt6528 = arg4;
		this.aString60 = arg0;
		this.anInt6531 = arg7;
		this.anInt6524 = arg2;
		this.anInt6525 = arg6;
	}
}
