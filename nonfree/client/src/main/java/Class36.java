import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class36 implements Interface17 {

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
	public final int anInt600;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
	public final int anInt605;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
	public final int anInt604;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Z")
	public final boolean aBoolean77;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
	public final int anInt594;

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
	public final int anInt593;

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Lclient!mfa;")
	public final Class239 aClass239_3;

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
	public final int anInt597;

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lclient!al;")
	public final Class18 aClass18_4;

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
	public final int anInt603;

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
	public final int anInt596;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(ILclient!al;Lclient!mfa;IIIIIIIZ)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt600 = arg9;
		this.anInt605 = arg0;
		this.anInt604 = arg7;
		this.aBoolean77 = arg10;
		this.anInt594 = arg3;
		this.anInt593 = arg6;
		this.aClass239_3 = arg2;
		this.anInt597 = arg8;
		this.aClass18_4 = arg1;
		this.anInt603 = arg5;
		this.anInt596 = arg4;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static600.aClass152_6;
	}
}
