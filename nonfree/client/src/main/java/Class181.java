import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class181 {

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	private int anInt5261 = -1;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Z")
	public boolean aBoolean408 = true;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!pia;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	private final int anInt5262;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	private final int anInt5260;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_15;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	private final int anInt5266;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "Lclient!me;")
	private Class88_Sub2 aClass88_Sub2_1;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "Lclient!ff;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "Lclient!on;")
	private Class232_Sub2 aClass232_Sub2_2;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!oea;Lclient!pia;Lclient!uea;IIIII)V")
	public Class181(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class112_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass260_1 = arg1;
		this.anInt5262 = arg7;
		this.anInt5260 = arg6;
		this.aClass87_Sub2_15 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt9348 * (local35 + local37);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray30[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt5266 = local27;
		if (local27 <= 0) {
			this.aClass88_Sub2_1 = null;
		} else {
			@Pc(100) Class2_Sub34 local100 = new Class2_Sub34(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass87_Sub2_15.aBoolean559) {
				for (local50 = 0; local50 < local25; local50++) {
					local118 = (local35 + local50) * arg2.anInt9348 + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray30[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local100.method6854(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local118 = local31 + arg2.anInt9348 * (local35 + local50);
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray30[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local100.method6868(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface9_4 = this.aClass87_Sub2_15.method6157(local100.anInt8188, false, local100.aByteArray77);
			this.aClass232_Sub2_2 = new Class232_Sub2(this.aClass87_Sub2_15, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	private void method4395() {
		if (!this.aBoolean408) {
			return;
		}
		this.aBoolean408 = false;
		@Pc(16) byte[] local16 = this.aClass260_1.aByteArray73;
		@Pc(20) byte[] local20 = this.aClass87_Sub2_15.aByteArray71;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass260_1.anInt7739;
		@Pc(37) int local37 = this.anInt5260 + this.aClass260_1.anInt7739 * this.anInt5262;
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
		if (this.aClass88_Sub2_1 != null && this.anInt5261 == local22) {
			this.aBoolean408 = false;
			return;
		}
		this.anInt5261 = local22;
		local37 = this.anInt5260 + local26 * this.anInt5262;
		local50 = 0;
		for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
			for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
				if (local16[local37] == 0) {
					@Pc(127) int local127 = 0;
					if (local16[local37 - 1] != 0) {
						local127++;
					}
					if (local16[local37 + 1] != 0) {
						local127++;
					}
					if (local16[local37 - local26] != 0) {
						local127++;
					}
					if (local16[local26 + local37] != 0) {
						local127++;
					}
					local20[local50++] = (byte) (local127 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass260_1.anInt7739 - 128;
		}
		if (this.aClass88_Sub2_1 == null) {
			this.aClass88_Sub2_1 = new Class88_Sub2(this.aClass87_Sub2_15, 3553, 6406, 128, 128, false, this.aClass87_Sub2_15.aByteArray71, 6406, false);
			this.aClass88_Sub2_1.method5202(false, false);
			this.aClass88_Sub2_1.method6981(true);
		} else {
			this.aClass88_Sub2_1.method5201(false, 128, 6406, this.aClass87_Sub2_15.aByteArray71, 128);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[BZI)V")
	public void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass232_Sub2_2.method6318(this.aClass87_Sub2_15.method6164(5123) * arg0, arg1);
		this.method4397(arg0, this.aClass232_Sub2_2);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLclient!ff;)V")
	private void method4397(@OriginalArg(0) int arg0, @OriginalArg(2) Interface9 arg1) {
		if (arg0 != 0) {
			this.method4395();
			this.aClass87_Sub2_15.method6167(this.aClass88_Sub2_1);
			this.aClass87_Sub2_15.method6162(arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public void method4399() {
		this.method4397(this.anInt5266, this.anInterface9_4);
	}
}
