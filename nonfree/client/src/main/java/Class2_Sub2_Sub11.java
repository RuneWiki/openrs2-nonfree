import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "Z")
	public final boolean aBoolean300;

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
	public int anInt4369;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
	public final int anInt4364;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "J")
	public final long aLong123;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
	public final int anInt4366;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "J")
	public final long aLong122;

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
	public final int anInt4367;

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
	public final int anInt4368;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Z")
	public final boolean aBoolean299;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class2_Sub2_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean300 = arg8;
		this.anInt4369 = arg3;
		this.anInt4364 = arg4;
		this.aLong123 = arg10;
		this.aString43 = arg1;
		this.anInt4366 = arg6;
		this.aBoolean301 = arg11;
		this.aLong122 = arg5;
		this.anInt4367 = arg7;
		this.anInt4368 = arg2;
		this.aString44 = arg0;
		this.aBoolean299 = arg9;
	}
}
