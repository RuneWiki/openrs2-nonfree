import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class263 implements Interface2 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	public final int anInt7725;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	public final int anInt7720;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public final int anInt7718;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public final int anInt7721;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "Lclient!ti;")
	public final Class339 aClass339_11;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public final int anInt7713;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	public final int anInt7723;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	public final int anInt7719;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public final int anInt7717;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public final int anInt7715;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public final int anInt7724;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!in;")
	public final Class168 aClass168_11;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!in;Lclient!ti;IIIIIIIIII)V")
	public Class263(@OriginalArg(0) String arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class339 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt7725 = arg8;
		this.anInt7720 = arg3;
		this.anInt7718 = arg5;
		this.anInt7721 = arg6;
		this.aClass339_11 = arg2;
		this.anInt7713 = arg11;
		this.anInt7723 = arg9;
		this.anInt7719 = arg4;
		this.anInt7717 = arg7;
		this.anInt7715 = arg10;
		this.aString77 = arg0;
		this.anInt7724 = arg12;
		this.aClass168_11 = arg1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static339.aClass310_9;
	}
}
