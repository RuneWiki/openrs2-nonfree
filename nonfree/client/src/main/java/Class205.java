import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class205 implements Interface13 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public final int anInt5725;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!oe;")
	public final Class249 aClass249_10;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public final int anInt5729;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public final int anInt5731;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public final int anInt5724;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public final int anInt5728;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public final int anInt5721;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!ada;")
	public final Class7 aClass7_7;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public final int anInt5722;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public final int anInt5726;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public final int anInt5723;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public final int anInt5732;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ada;Lclient!oe;IIIIIIIIII)V")
	public Class205(@OriginalArg(0) String arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt5725 = arg10;
		this.aClass249_10 = arg2;
		this.anInt5729 = arg8;
		this.anInt5731 = arg5;
		this.anInt5724 = arg9;
		this.anInt5728 = arg4;
		this.anInt5721 = arg6;
		this.aString73 = arg0;
		this.aClass7_7 = arg1;
		this.anInt5722 = arg7;
		this.anInt5726 = arg12;
		this.anInt5723 = arg11;
		this.anInt5732 = arg3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static656.aClass251_8;
	}
}
