import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public final class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jka", name = "x", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!jka", name = "z", descriptor = "Z")
	public final boolean aBoolean392;

	@OriginalMember(owner = "client!jka", name = "M", descriptor = "I")
	public int anInt5173;

	@OriginalMember(owner = "client!jka", name = "t", descriptor = "I")
	public final int anInt5167;

	@OriginalMember(owner = "client!jka", name = "Q", descriptor = "Z")
	public final boolean aBoolean394;

	@OriginalMember(owner = "client!jka", name = "v", descriptor = "Z")
	public final boolean aBoolean391;

	@OriginalMember(owner = "client!jka", name = "L", descriptor = "I")
	public final int anInt5168;

	@OriginalMember(owner = "client!jka", name = "N", descriptor = "I")
	public final int anInt5170;

	@OriginalMember(owner = "client!jka", name = "I", descriptor = "J")
	public final long aLong169;

	@OriginalMember(owner = "client!jka", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!jka", name = "A", descriptor = "J")
	public final long aLong170;

	@OriginalMember(owner = "client!jka", name = "P", descriptor = "I")
	public final int anInt5175;

	@OriginalMember(owner = "client!jka", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class6_Sub2_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean392 = arg11;
		this.anInt5173 = arg3;
		this.anInt5167 = arg7;
		this.aBoolean394 = arg9;
		this.aBoolean391 = arg8;
		this.anInt5168 = arg6;
		this.anInt5170 = arg2;
		this.aLong169 = arg5;
		this.aString54 = arg0;
		this.aLong170 = arg10;
		this.anInt5175 = arg4;
		this.aString55 = arg1;
	}
}
