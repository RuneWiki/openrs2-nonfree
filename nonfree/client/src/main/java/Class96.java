import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class Class96 implements Interface13 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Lclient!le;")
	public final Class204 aClass204_13;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public final int anInt9360;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public final int anInt9357;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public final int anInt9355;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	public final int anInt9361;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public final int anInt9354;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	public final int anInt9359;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public final int anInt9362;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Lclient!qj;")
	public final Class288 aClass288_13;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!le;Lclient!qj;IIIIIII)V")
	public Class96(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass204_13 = arg0;
		this.anInt9360 = arg4;
		this.anInt9357 = arg6;
		this.anInt9355 = arg8;
		this.anInt9361 = arg7;
		this.anInt9354 = arg2;
		this.anInt9359 = arg3;
		this.anInt9362 = arg5;
		this.aClass288_13 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return null;
	}
}
