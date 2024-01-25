import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class218 implements Interface14 {

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	public final int anInt5968;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
	public final int anInt5965;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	public final int anInt5959;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
	public final int anInt5966;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public final int anInt5961;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!ia;")
	public final Class140 aClass140_10;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Z")
	public final boolean aBoolean482;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
	public final int anInt5964;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	public final int anInt5967;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	public final int anInt5962;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "Lclient!sc;")
	public final Class300 aClass300_10;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILclient!sc;Lclient!ia;IIIIIIIZ)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class300 arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5968 = arg5;
		this.anInt5965 = arg8;
		this.anInt5959 = arg9;
		this.anInt5966 = arg7;
		this.anInt5961 = arg0;
		this.aClass140_10 = arg2;
		this.aBoolean482 = arg10;
		this.anInt5964 = arg4;
		this.anInt5967 = arg3;
		this.anInt5962 = arg6;
		this.aClass300_10 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static347.aClass260_4;
	}
}
