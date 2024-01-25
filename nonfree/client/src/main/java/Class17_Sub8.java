import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class17_Sub8 extends Class17 {

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
	public static final int[] anIntArray262 = new int[256];

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray262[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub8(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)I")
	public int method3305() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
	public boolean method3307() {
		return !super.aClass3_Sub15_31.method2432();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		if (super.aClass3_Sub15_31.method2432()) {
			return 2;
		} else if (super.aClass3_Sub15_31.aClass17_Sub20_1.method6399() && Static322.method5044(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.aClass3_Sub15_31.method2432()) {
			super.anInt10323 = 2;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 2) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub15_31.method2432() ? 3 : 1;
	}
}
