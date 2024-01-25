import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class Class153 implements Interface17 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	public final int anInt9315;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public final int anInt9313;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Lclient!tca;")
	public final Class322 aClass322_13;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	public final int anInt9314;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public final int anInt9316;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
	public final int anInt9312;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public final int anInt9310;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Lclient!vea;")
	public final Class347 aClass347_13;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
	public final int anInt9317;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!tca;Lclient!vea;IIIIIII)V")
	public Class153(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9315 = arg3;
		this.anInt9313 = arg7;
		this.aClass322_13 = arg0;
		this.anInt9314 = arg2;
		this.anInt9316 = arg4;
		this.anInt9312 = arg5;
		this.anInt9310 = arg8;
		this.aClass347_13 = arg1;
		this.anInt9317 = arg6;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return null;
	}
}
