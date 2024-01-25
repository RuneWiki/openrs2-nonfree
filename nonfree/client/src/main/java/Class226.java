import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class226 implements Interface13 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public final int anInt5983;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public final int anInt5979;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Z")
	public final boolean aBoolean499;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public final int anInt5989;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public final int anInt5985;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
	public final int anInt5991;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!qj;")
	public final Class288 aClass288_9;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public final int anInt5980;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!le;")
	public final Class204 aClass204_9;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public final int anInt5982;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	public final int anInt5990;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(ILclient!le;Lclient!qj;IIIIIIIZ)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class288 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5983 = arg8;
		this.anInt5979 = arg5;
		this.aBoolean499 = arg10;
		this.anInt5989 = arg6;
		this.anInt5985 = arg0;
		this.anInt5991 = arg9;
		this.aClass288_9 = arg2;
		this.anInt5980 = arg7;
		this.aClass204_9 = arg1;
		this.anInt5982 = arg4;
		this.anInt5990 = arg3;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static146.aClass228_1;
	}
}
