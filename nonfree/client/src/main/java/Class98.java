import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class98 {

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
	public boolean aBoolean177 = true;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	private int anInt2345 = -1;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private final int anInt2341;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!fv;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	private final int anInt2338;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_17;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	private final int anInt2337;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!sg;")
	private Class40_Sub3 aClass40_Sub3_4;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!ph;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!oi;")
	private Class97_Sub2 aClass97_Sub2_1;

	static {
		new Class231(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!bl;Lclient!fv;Lclient!tn;IIIII)V")
	public Class98(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class84_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2341 = arg7;
		this.aClass90_1 = arg1;
		this.anInt2338 = arg6;
		this.aClass28_Sub1_17 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local35 + local37) * arg2.anInt6363;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray7[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt2337 = local27;
		if (local27 <= 0) {
			this.aClass40_Sub3_4 = null;
		} else {
			@Pc(93) Class6_Sub15 local93 = new Class6_Sub15(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass28_Sub1_17.aBoolean52) {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + (local50 + local35) * arg2.anInt6363;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray7[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method3100(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = arg2.anInt6363 * (local50 + local35) + local31;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray7[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method3114(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface8_4 = this.aClass28_Sub1_17.method669(false, local93.anInt3487, local93.aByteArray51);
			this.aClass97_Sub2_1 = new Class97_Sub2(this.aClass28_Sub1_17, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II[BI)V")
	public void method2147(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass97_Sub2_1.method4284(arg1, this.aClass28_Sub1_17.method717(5123) * arg0);
		this.method2151(this.aClass97_Sub2_1, arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public void method2148() {
		this.method2151(this.anInterface8_4, this.anInt2337);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	private void method2149() {
		if (!this.aBoolean177) {
			return;
		}
		this.aBoolean177 = false;
		@Pc(16) byte[] local16 = this.aClass90_1.aByteArray26;
		@Pc(18) byte[] local18 = Static110.aByteArray25;
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = this.aClass90_1.anInt2060;
		@Pc(38) int local38 = this.anInt2338 + this.anInt2341 * this.aClass90_1.anInt2060;
		@Pc(50) int local50;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local20 = (local20 << 8) - local20;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local38++] != 0) {
					local20++;
				}
			}
			local38 += local28 - 128;
		}
		if (this.aClass40_Sub3_4 != null && this.anInt2345 == local20) {
			this.aBoolean177 = false;
			return;
		}
		this.anInt2345 = local20;
		local38 = this.anInt2338 + this.anInt2341 * local28;
		local50 = 0;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local16[local38] == 0) {
					@Pc(118) int local118 = 0;
					if (local16[local38 - 1] != 0) {
						local118++;
					}
					if (local16[local38 + 1] != 0) {
						local118++;
					}
					if (local16[local38 - local28] != 0) {
						local118++;
					}
					if (local16[local28 + local38] != 0) {
						local118++;
					}
					local18[local50++] = (byte) (local118 * 17);
				} else {
					local18[local50++] = 68;
				}
				local38++;
			}
			local38 += this.aClass90_1.anInt2060 - 128;
		}
		if (this.aClass40_Sub3_4 == null) {
			this.aClass40_Sub3_4 = new Class40_Sub3(this.aClass28_Sub1_17, 3553, 6406, 128, 128, false, Static110.aByteArray25, 6406, false);
			this.aClass40_Sub3_4.method3021(false, false);
			this.aClass40_Sub3_4.method5148(true);
		} else {
			this.aClass40_Sub3_4.method3019(6406, Static110.aByteArray25, 128, 128, false);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ph;II)V")
	private void method2151(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method2149();
			this.aClass28_Sub1_17.method654(this.aClass40_Sub3_4);
			this.aClass28_Sub1_17.method661(0, arg1, arg0);
		}
	}
}
