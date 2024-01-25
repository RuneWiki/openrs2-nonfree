import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!saa", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString105;

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
	public final int anInt7687;

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "Z")
	public final boolean aBoolean608;

	@OriginalMember(owner = "client!saa", name = "v", descriptor = "J")
	public final long aLong219;

	@OriginalMember(owner = "client!saa", name = "s", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "Z")
	public final boolean aBoolean607;

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
	public int anInt7685;

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
	public final int anInt7684;

	@OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
	public final int anInt7688;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
	public final int anInt7682;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub44(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString105 = arg0;
		this.anInt7687 = arg7;
		this.aBoolean608 = arg8;
		this.aLong219 = arg5;
		this.aString106 = arg1;
		this.aBoolean607 = arg9;
		this.anInt7685 = arg3;
		this.anInt7684 = arg6;
		this.anInt7688 = arg4;
		this.anInt7682 = arg2;
	}
}
