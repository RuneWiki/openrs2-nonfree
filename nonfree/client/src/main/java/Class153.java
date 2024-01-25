import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class153 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
	public boolean aBoolean285 = true;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private int anInt4516 = -1;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_30;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!qj;")
	private final Class207 aClass207_2;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	private final int anInt4514;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	private final int anInt4510;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private final int anInt4511;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!ah;")
	private Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!oi;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!ac;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ih;Lclient!qj;Lclient!gk;IIIII)V")
	public Class153(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class96_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass106_Sub2_30 = arg0;
		this.aClass207_2 = arg1;
		this.anInt4514 = arg7;
		this.anInt4510 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt5777;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4511 = local27;
		if (local27 <= 0) {
			this.aClass8_Sub1_3 = null;
		} else {
			@Pc(89) Class1_Sub3 local89 = new Class1_Sub3(local27 * 2);
			@Pc(108) int local108;
			@Pc(116) short[] local116;
			@Pc(120) int local120;
			@Pc(106) int local106;
			if (this.aClass106_Sub2_30.aBoolean227) {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + arg2.anInt5777 * (local50 + local35);
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray1[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method1227(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + arg2.anInt5777 * (local50 + local35);
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray1[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method1199(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_4 = this.aClass106_Sub2_30.method2921(local89.aByteArray14, false, local89.anInt1710);
			this.aClass4_Sub1_1 = new Class4_Sub1(this.aClass106_Sub2_30, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!oi;IZ)V")
	private void method3478(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method3481();
			this.aClass106_Sub2_30.method2912(this.aClass8_Sub1_3);
			this.aClass106_Sub2_30.method2848(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII[B)V")
	public void method3479(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass4_Sub1_1.method5857(arg1, this.aClass106_Sub2_30.method2903(5123) * arg0);
		this.method3478(this.aClass4_Sub1_1, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	private void method3481() {
		if (!this.aBoolean285) {
			return;
		}
		this.aBoolean285 = false;
		@Pc(16) byte[] local16 = this.aClass207_2.aByteArray76;
		@Pc(20) byte[] local20 = this.aClass106_Sub2_30.aByteArray44;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass207_2.anInt6082;
		@Pc(37) int local37 = this.anInt4510 + this.anInt4514 * this.aClass207_2.anInt6082;
		@Pc(49) int local49;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass8_Sub1_3 != null && local22 == this.anInt4516) {
			this.aBoolean285 = false;
			return;
		}
		this.anInt4516 = local22;
		local49 = 0;
		local37 = local26 * this.anInt4514 + this.anInt4510;
		for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local16[local37] == 0) {
					@Pc(126) int local126 = 0;
					if (local16[local37 - 1] != 0) {
						local126++;
					}
					if (local16[local37 + 1] != 0) {
						local126++;
					}
					if (local16[local37 - local26] != 0) {
						local126++;
					}
					if (local16[local37 + local26] != 0) {
						local126++;
					}
					local20[local49++] = (byte) (local126 * 17);
				} else {
					local20[local49++] = 68;
				}
				local37++;
			}
			local37 += this.aClass207_2.anInt6082 - 128;
		}
		if (this.aClass8_Sub1_3 == null) {
			this.aClass8_Sub1_3 = new Class8_Sub1(this.aClass106_Sub2_30, 3553, 6406, 128, 128, false, this.aClass106_Sub2_30.aByteArray44, 6406, false);
			this.aClass8_Sub1_3.method2252(false, false);
			this.aClass8_Sub1_3.method3073(true);
		} else {
			this.aClass8_Sub1_3.method2258(128, false, this.aClass106_Sub2_30.aByteArray44, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method3483() {
		this.method3478(this.anInterface10_4, this.anInt4511);
	}
}
