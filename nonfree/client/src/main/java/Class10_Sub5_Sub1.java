import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class10_Sub5_Sub1 extends Class10_Sub5 {

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "[I")
	public static final int[] anIntArray278 = new int[256];

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
	public int anInt2773;

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
	public int anInt2775;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
	public int anInt2784;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	public int anInt2776 = -1;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	public int anInt2781 = -1;

	static {
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(22) int local22 = local19;
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				if ((local22 & 0x1) == 1) {
					local22 = local22 >>> 1 ^ 0xEDB88320;
				} else {
					local22 >>>= 0x1;
				}
			}
			anIntArray278[local19] = local22;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		@Pc(6) Class31 local6 = arg0.method4304();
		local6.method3187(super.anInt2766, super.anInt2762, super.anInt2761);
		@Pc(18) Class7_Sub3 local18 = Static44.method908(3);
		@Pc(38) Class40 local38;
		if (this.anInt2776 != -1) {
			local38 = Static348.method5333(this.anInt2776).method1987(0, 0, 1024, this.anInt2779, null, arg0, null, -1);
			if (local38 != null) {
				local38.method4587(local6, local18.aClass7_Sub6Array1[2], 0);
			}
		}
		if (this.anInt2781 != -1) {
			local38 = Static348.method5333(this.anInt2781).method1987(0, 0, 1024, this.anInt2773, null, arg0, null, -1);
			if (local38 != null) {
				local38.method4587(local6, local18.aClass7_Sub6Array1[1], 0);
			}
		}
		local38 = Static348.method5333(this.anInt2775).method1987(0, 0, 1024, this.anInt2784, null, arg0, null, -1);
		if (local38 != null) {
			local38.method4587(local6, local18.aClass7_Sub6Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(6) Class31 local6 = arg2.method4304();
		local6.method3187(super.anInt2766, super.anInt2762, super.anInt2761);
		@Pc(37) Class40 local37 = Static348.method5333(this.anInt2775).method1987(0, 0, 65536, this.anInt2784, null, arg2, null, -1);
		if (local37 != null && local37.method4614(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt2781 != -1) {
			local37 = Static348.method5333(this.anInt2781).method1987(0, 0, 65536, this.anInt2773, null, arg2, null, -1);
			if (local37 != null && local37.method4614(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt2776 != -1) {
			local37 = Static348.method5333(this.anInt2776).method1987(0, 0, 65536, this.anInt2779, null, arg2, null, -1);
			if (local37 != null && local37.method4614(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
