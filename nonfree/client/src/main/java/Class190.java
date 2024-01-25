import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class190 implements Interface17 {

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "Lclient!vea;")
	public final Class347 aClass347_5;

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
	public final int anInt4721;

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
	public final int anInt4720;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "Z")
	public final boolean aBoolean364;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
	public final int anInt4719;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public final int anInt4714;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
	public final int anInt4712;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
	public final int anInt4718;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "Lclient!tca;")
	public final Class322 aClass322_5;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	public final int anInt4716;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
	public final int anInt4713;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILclient!tca;Lclient!vea;IIIIIIIZ)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass347_5 = arg2;
		this.anInt4721 = arg0;
		this.anInt4720 = arg9;
		this.aBoolean364 = arg10;
		this.anInt4719 = arg4;
		this.anInt4714 = arg5;
		this.anInt4712 = arg3;
		this.anInt4718 = arg8;
		this.aClass322_5 = arg1;
		this.anInt4716 = arg6;
		this.anInt4713 = arg7;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static262.aClass225_17;
	}
}
