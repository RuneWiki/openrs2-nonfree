import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class Class54 implements Interface24 {

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
	public final int anInt4142;

	@OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
	public final int anInt4145;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	public final int anInt4143;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lclient!ut;")
	public final Class335 aClass335_10;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	public final int anInt4139;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
	public final int anInt4144;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public final int anInt4141;

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
	public final int anInt4146;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!gi;")
	public final Class122 aClass122_9;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!ut;Lclient!gi;IIIIIII)V")
	public Class54(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4142 = arg3;
		this.anInt4145 = arg4;
		this.anInt4143 = arg6;
		this.aClass335_10 = arg0;
		this.anInt4139 = arg8;
		this.anInt4144 = arg7;
		this.anInt4141 = arg5;
		this.anInt4146 = arg2;
		this.aClass122_9 = arg1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return null;
	}
}
