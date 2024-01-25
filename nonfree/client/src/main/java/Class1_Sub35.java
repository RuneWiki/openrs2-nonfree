import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "Z")
	public final boolean aBoolean370;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
	public int anInt5839;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "J")
	public final long aLong166;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
	public final int anInt5841;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
	public final int anInt5843;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public final int anInt5834;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "Z")
	public final boolean aBoolean371;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
	public final int anInt5842;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub35(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean370 = arg8;
		this.anInt5839 = arg3;
		this.aLong166 = arg5;
		this.aString53 = arg0;
		this.anInt5841 = arg7;
		this.aString54 = arg1;
		this.anInt5843 = arg4;
		this.anInt5834 = arg2;
		this.aBoolean371 = arg9;
		this.anInt5842 = arg6;
	}
}
