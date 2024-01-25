import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class7_Sub39 extends Class7 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public final int anInt5890;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public final int anInt5891;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	public final int anInt5896;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
	public final int anInt5895;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Z")
	public final boolean aBoolean392;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "J")
	public final long aLong186;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
	public final boolean aBoolean391;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class7_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5890 = arg7;
		this.anInt5891 = arg2;
		this.aString59 = arg0;
		this.aString60 = arg1;
		this.anInt5896 = arg6;
		this.anInt5895 = arg4;
		this.aBoolean392 = arg8;
		this.anInt5893 = arg3;
		this.aLong186 = arg5;
		this.aBoolean391 = arg9;
	}
}
