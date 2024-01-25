import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class269 implements Interface4 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public final int anInt7969;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public final int anInt7977;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public final int anInt7967;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public final int anInt7973;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public final int anInt7976;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public final int anInt7972;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public final int anInt7971;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public final int anInt7970;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!eda;")
	public final Class83 aClass83_10;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public final boolean aBoolean554;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!cga;")
	public final Class50 aClass50_11;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!eda;Lclient!cga;IIIIIIIZ)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt7969 = arg3;
		this.anInt7977 = arg7;
		this.anInt7967 = arg9;
		this.anInt7973 = arg6;
		this.anInt7976 = arg5;
		this.anInt7972 = arg4;
		this.anInt7971 = arg0;
		this.anInt7970 = arg8;
		this.aClass83_10 = arg1;
		this.aBoolean554 = arg10;
		this.aClass50_11 = arg2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static447.aClass146_6;
	}
}
