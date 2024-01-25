import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class9 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	private int anInt320 = -1;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	private final int anInt327;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!dc;")
	private final Class61 aClass61_2;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	private final int anInt325;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	private final int anInt328;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!wj;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!wm;")
	private Class138_Sub2 aClass138_Sub2_1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Lclient!rr;")
	private Class164_Sub3 aClass164_Sub3_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!mh;Lclient!dc;Lclient!ae;IIIII)V")
	public Class9(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class7_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt327 = arg7;
		this.aClass61_2 = arg1;
		this.anInt325 = arg6;
		this.aClass4_Sub3_2 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + arg2.anInt9577 * (local35 + local37);
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt328 = local27;
		if (local27 <= 0) {
			this.aClass164_Sub3_1 = null;
		} else {
			@Pc(90) Class1_Sub17 local90 = new Class1_Sub17(local27 * 2);
			@Pc(109) int local109;
			@Pc(117) short[] local117;
			@Pc(121) int local121;
			@Pc(107) int local107;
			if (this.aClass4_Sub3_2.aBoolean421) {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = arg2.anInt9577 * (local51 + local35) + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray1[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method4473(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = arg2.anInt9577 * (local51 + local35) + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray1[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method4455(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface20_1 = this.aClass4_Sub3_2.method5304(local90.aByteArray58, false, local90.anInt4872);
			this.aClass138_Sub2_1 = new Class138_Sub2(this.aClass4_Sub3_2, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLclient!wj;)V")
	private void method513(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1) {
		if (arg0 != 0) {
			this.method518();
			this.aClass4_Sub3_2.method5250(this.aClass164_Sub3_1);
			this.aClass4_Sub3_2.method5287(arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method514() {
		this.method513(this.anInt328, this.anInterface20_1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[BII)V")
	public void method517(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass138_Sub2_1.method8129(this.aClass4_Sub3_2.method5231(5123) * arg1, arg0);
		this.method513(arg1, this.aClass138_Sub2_1);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	private void method518() {
		if (!this.aBoolean19) {
			return;
		}
		this.aBoolean19 = false;
		@Pc(16) byte[] local16 = this.aClass61_2.aByteArray16;
		@Pc(20) byte[] local20 = this.aClass4_Sub3_2.aByteArray76;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass61_2.anInt1828;
		@Pc(37) int local37 = this.anInt325 + this.aClass61_2.anInt1828 * this.anInt327;
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
		if (this.aClass164_Sub3_1 != null && this.anInt320 == local22) {
			this.aBoolean19 = false;
			return;
		}
		this.anInt320 = local22;
		local37 = this.anInt327 * local26 + this.anInt325;
		local50 = 0;
		for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
			for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
				if (local16[local37] == 0) {
					@Pc(120) int local120 = 0;
					if (local16[local37 - 1] != 0) {
						local120++;
					}
					if (local16[local37 + 1] != 0) {
						local120++;
					}
					if (local16[local37 - local26] != 0) {
						local120++;
					}
					if (local16[local37 + local26] != 0) {
						local120++;
					}
					local20[local50++] = (byte) (local120 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass61_2.anInt1828 - 128;
		}
		if (this.aClass164_Sub3_1 == null) {
			this.aClass164_Sub3_1 = new Class164_Sub3(this.aClass4_Sub3_2, 3553, 6406, 128, 128, false, this.aClass4_Sub3_2.aByteArray76, 6406, false);
			this.aClass164_Sub3_1.method8159(false, false);
			this.aClass164_Sub3_1.method8154(true);
		} else {
			this.aClass164_Sub3_1.method8161(false, 6406, this.aClass4_Sub3_2.aByteArray76, 128, 128);
		}
	}
}
