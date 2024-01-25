import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public final int anInt4363;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
	public final int anInt4371;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Z")
	public final boolean aBoolean340;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Z")
	public final boolean aBoolean341;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
	public int anInt4365;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "J")
	public final long aLong114;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString94;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
	public final int anInt4368;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public final int anInt4364;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub25(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt4363 = arg6;
		this.aString95 = arg1;
		this.anInt4371 = arg7;
		this.aBoolean340 = arg8;
		this.aBoolean341 = arg9;
		this.anInt4365 = arg3;
		this.aLong114 = arg5;
		this.aString94 = arg0;
		this.anInt4368 = arg4;
		this.anInt4364 = arg2;
	}
}
