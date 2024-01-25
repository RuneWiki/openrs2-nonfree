import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class259 implements Interface13 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public final int anInt7346;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public final int anInt7344;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	public final int anInt7347;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	public final int anInt7342;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "I")
	public final int anInt7350;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!ada;")
	public final Class7 aClass7_8;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!oe;")
	public final Class249 aClass249_11;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	public final int anInt7349;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public final int anInt7348;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Z")
	public final boolean aBoolean489;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public final int anInt7343;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(ILclient!ada;Lclient!oe;IIIIIIIZ)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt7346 = arg5;
		this.anInt7344 = arg9;
		this.anInt7347 = arg4;
		this.anInt7342 = arg8;
		this.anInt7350 = arg3;
		this.aClass7_8 = arg1;
		this.aClass249_11 = arg2;
		this.anInt7349 = arg6;
		this.anInt7348 = arg7;
		this.aBoolean489 = arg10;
		this.anInt7343 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static658.aClass251_9;
	}
}
