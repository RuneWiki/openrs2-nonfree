import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class380 implements Interface9 {

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	public final int anInt10623;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
	public final int anInt10626;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public final int anInt10614;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
	public final int anInt10621;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public final int anInt10613;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "Lclient!jn;")
	public final Class183 aClass183_13;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public final int anInt10617;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "Lclient!nha;")
	public final Class245 aClass245_16;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public final int anInt10618;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	public final int anInt10624;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public final int anInt10620;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	public final int anInt10612;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!nha;Lclient!jn;IIIIIIIIII)V")
	public Class380(@OriginalArg(0) String arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class183 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt10623 = arg12;
		this.anInt10626 = arg8;
		this.anInt10614 = arg11;
		this.anInt10621 = arg10;
		this.anInt10613 = arg3;
		this.aClass183_13 = arg2;
		this.anInt10617 = arg7;
		this.aClass245_16 = arg1;
		this.anInt10618 = arg9;
		this.anInt10624 = arg4;
		this.aString107 = arg0;
		this.anInt10620 = arg6;
		this.anInt10612 = arg5;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static343.aClass365_13;
	}
}
