import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class79 implements Interface9 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lclient!mea;")
	public final Class201 aClass201_7;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
	public final int anInt2636;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
	public final int anInt2643;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
	public final int anInt2633;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
	public final int anInt2639;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lclient!ja;")
	public final Class154 aClass154_8;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
	public final int anInt2638;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Z")
	public final boolean aBoolean188;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public final int anInt2635;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
	public final int anInt2640;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(ILclient!ja;Lclient!mea;IIIIIIIZ)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass201_7 = arg2;
		this.anInt2636 = arg7;
		this.anInt2643 = arg9;
		this.anInt2633 = arg6;
		this.anInt2639 = arg5;
		this.aClass154_8 = arg1;
		this.anInt2638 = arg8;
		this.aBoolean188 = arg10;
		this.anInt2635 = arg3;
		this.anInt2634 = arg4;
		this.anInt2640 = arg0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static591.aClass95_10;
	}
}
