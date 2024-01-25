import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "Z")
	public final boolean aBoolean172;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "Z")
	public final boolean aBoolean173;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
	public final int anInt2365;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
	public final int anInt2362;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public final int anInt2361;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "J")
	public final long aLong42;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public final int anInt2359;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean172 = arg9;
		this.aString45 = arg1;
		this.aBoolean173 = arg8;
		this.anInt2365 = arg4;
		this.anInt2362 = arg6;
		this.anInt2361 = arg2;
		this.aLong42 = arg5;
		this.anInt2364 = arg3;
		this.aString44 = arg0;
		this.anInt2359 = arg7;
	}
}
