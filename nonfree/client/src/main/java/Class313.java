import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class313 implements Interface17 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!tca;")
	public final Class322 aClass322_11;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public final int anInt7793;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public final int anInt7794;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public final int anInt7801;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public final int anInt7804;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!vea;")
	public final Class347 aClass347_11;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public final int anInt7795;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public final int anInt7798;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public final int anInt7800;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public final int anInt7802;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public final int anInt7797;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public final int anInt7796;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!tca;Lclient!vea;IIIIIIIIII)V")
	public Class313(@OriginalArg(0) String arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass322_11 = arg1;
		this.anInt7793 = arg6;
		this.anInt7794 = arg10;
		this.anInt7801 = arg9;
		this.anInt7804 = arg7;
		this.aClass347_11 = arg2;
		this.aString121 = arg0;
		this.anInt7795 = arg8;
		this.anInt7798 = arg4;
		this.anInt7800 = arg12;
		this.anInt7802 = arg5;
		this.anInt7797 = arg3;
		this.anInt7796 = arg11;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static53.aClass225_30;
	}
}
