import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class219 {

	@OriginalMember(owner = "client!mha", name = "g", descriptor = "[B")
	public static final byte[] aByteArray64 = new byte[32896];

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "[Lclient!tca;")
	public Class85_Sub3[] aClass85_Sub3Array3 = null;

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "Lclient!sk;")
	public Class85_Sub4 aClass85_Sub4_1 = null;

	@OriginalMember(owner = "client!mha", name = "e", descriptor = "Lclient!sk;")
	public Class85_Sub4 aClass85_Sub4_2 = null;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "[Lclient!tca;")
	public Class85_Sub3[] aClass85_Sub3Array4 = null;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "Lclient!sk;")
	public Class85_Sub4 aClass85_Sub4_3 = null;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "Z")
	public final boolean aBoolean431;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray64[local4++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class219(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aBoolean431 = arg0.aBoolean167;
		Static296.method4577(arg0);
		if (this.aBoolean431) {
			@Pc(31) byte[] local31 = Static289.method4549(Static224.anObject7, false);
			this.aClass85_Sub4_2 = new Class85_Sub4(arg0, 6410, 128, 128, 16, local31, 6410);
			@Pc(48) byte[] local48 = Static289.method4549(Static356.anObject9, false);
			this.aClass85_Sub4_1 = new Class85_Sub4(arg0, 6410, 128, 128, 16, local48, 6410);
			@Pc(63) Class207 local63 = arg0.aClass207_1;
			if (local63.method5252()) {
				local31 = Static289.method4549(Static592.anObject20, false);
				this.aClass85_Sub4_3 = new Class85_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(93) Class85_Sub4 local93 = new Class85_Sub4(arg0, 6409, 128, 128, 16, local31, 6409);
				if (local63.method5254(2.0F, this.aClass85_Sub4_3, local93)) {
					this.aClass85_Sub4_3.method7878();
				} else {
					this.aClass85_Sub4_3.method7870();
					this.aClass85_Sub4_3 = null;
				}
				local93.method7870();
				return;
			}
		} else {
			this.aClass85_Sub3Array4 = new Class85_Sub3[16];
			for (@Pc(124) int local124 = 0; local124 < 16; local124++) {
				@Pc(135) byte[] local135 = Static434.method6202(local124 * 256 * 128, Static224.anObject7);
				this.aClass85_Sub3Array4[local124] = new Class85_Sub3(arg0, 3553, 6410, 128, 128, true, local135, 6410, false);
			}
			this.aClass85_Sub3Array3 = new Class85_Sub3[16];
			for (@Pc(163) int local163 = 0; local163 < 16; local163++) {
				@Pc(174) byte[] local174 = Static434.method6202(local163 * 16384 * 2, Static356.anObject9);
				this.aClass85_Sub3Array3[local163] = new Class85_Sub3(arg0, 3553, 6410, 128, 128, true, local174, 6410, false);
			}
		}
	}
}
