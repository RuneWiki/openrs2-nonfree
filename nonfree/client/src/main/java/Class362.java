import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class362 {

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Z")
	public boolean aBoolean695 = true;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	private int anInt9825 = -1;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	private final int anInt9827;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_44;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	private final int anInt9821;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!waa;")
	private final Class351 aClass351_2;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	private final int anInt9824;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!gaa;")
	private Class114_Sub1 aClass114_Sub1_5;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Lclient!qn;")
	private Interface18 anInterface18_5;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Lclient!fl;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!no;Lclient!waa;Lclient!sm;IIIII)V")
	public Class362(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class351 arg1, @OriginalArg(2) Class16_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt9827 = arg7;
		this.aClass66_Sub3_44 = arg0;
		this.anInt9821 = arg6;
		this.aClass351_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt9838 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray32[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt9824 = local27;
		if (local27 <= 0) {
			this.aClass114_Sub1_5 = null;
		} else {
			@Pc(89) Class4_Sub9 local89 = new Class4_Sub9(local27 * 2);
			@Pc(108) int local108;
			@Pc(116) short[] local116;
			@Pc(120) int local120;
			@Pc(106) int local106;
			if (this.aClass66_Sub3_44.aBoolean476) {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = (local50 + local35) * arg2.anInt9838 + local31;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray32[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method6012(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = arg2.anInt9838 * (local50 + local35) + local31;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray32[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method5989(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface18_5 = this.aClass66_Sub3_44.method5377(false, local89.aByteArray97, local89.anInt7219);
			this.aClass20_Sub2_2 = new Class20_Sub2(this.aClass66_Sub3_44, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public void method8032() {
		this.method8034(this.anInt9824, this.anInterface18_5);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[B)V")
	public void method8033(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass20_Sub2_2.method6570(arg0 * this.aClass66_Sub3_44.method5379(5123), arg1);
		this.method8034(arg0, this.aClass20_Sub2_2);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZLclient!qn;)V")
	private void method8034(@OriginalArg(0) int arg0, @OriginalArg(2) Interface18 arg1) {
		if (arg0 != 0) {
			this.method8036();
			this.aClass66_Sub3_44.method5382(this.aClass114_Sub1_5);
			this.aClass66_Sub3_44.method5357(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	private void method8036() {
		if (!this.aBoolean695) {
			return;
		}
		this.aBoolean695 = false;
		@Pc(16) byte[] local16 = this.aClass351_2.aByteArray117;
		@Pc(20) byte[] local20 = this.aClass66_Sub3_44.aByteArray65;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass351_2.anInt9531;
		@Pc(37) int local37 = this.anInt9821 + this.anInt9827 * this.aClass351_2.anInt9531;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass114_Sub1_5 != null && local22 == this.anInt9825) {
			this.aBoolean695 = false;
			return;
		}
		this.anInt9825 = local22;
		local50 = 0;
		local37 = this.anInt9821 + this.anInt9827 * local26;
		for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
			for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
				if (local16[local37] == 0) {
					@Pc(122) int local122 = 0;
					if (local16[local37 - 1] != 0) {
						local122++;
					}
					if (local16[local37 + 1] != 0) {
						local122++;
					}
					if (local16[local37 - local26] != 0) {
						local122++;
					}
					if (local16[local26 + local37] != 0) {
						local122++;
					}
					local20[local50++] = (byte) (local122 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass351_2.anInt9531 - 128;
		}
		if (this.aClass114_Sub1_5 == null) {
			this.aClass114_Sub1_5 = new Class114_Sub1(this.aClass66_Sub3_44, 3553, 6406, 128, 128, false, this.aClass66_Sub3_44.aByteArray65, 6406, false);
			this.aClass114_Sub1_5.method5008(false, false);
			this.aClass114_Sub1_5.method4999(true);
		} else {
			this.aClass114_Sub1_5.method5014(6406, 128, this.aClass66_Sub3_44.aByteArray65, 128, false);
		}
	}
}
