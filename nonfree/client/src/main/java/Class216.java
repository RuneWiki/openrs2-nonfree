import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class216 {

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	private int anInt6635 = -1;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
	public boolean aBoolean443 = true;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_42;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	private final int anInt6636;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	private final int anInt6634;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!lb;")
	private final Class125 aClass125_2;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private final int anInt6637;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!mq;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!so;")
	private Class182_Sub1 aClass182_Sub1_2;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!ai;")
	private Class8_Sub1 aClass8_Sub1_7;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!sq;Lclient!lb;Lclient!kg;IIIII)V")
	public Class216(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) Class114_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass46_Sub2_42 = arg0;
		this.anInt6636 = arg6;
		this.anInt6634 = arg7;
		this.aClass125_2 = arg1;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + (local33 + local35) * arg2.anInt3871;
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray4[local47++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt6637 = local25;
		if (local25 > 0) {
			@Pc(89) Class14_Sub4 local89 = new Class14_Sub4(local25 * 2);
			@Pc(123) short[] local123;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass46_Sub2_42.aBoolean397) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = arg2.anInt3871 * (local47 + local33) + local29;
					for (local114 = 0; local114 < local23; local114++) {
						local123 = arg2.aShortArrayArray4[local49++];
						if (local123 != null) {
							for (local128 = 0; local128 < local123.length; local128++) {
								local89.method2509(local123[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = (local33 + local47) * arg2.anInt3871 + local29;
					for (local114 = 0; local114 < local23; local114++) {
						local123 = arg2.aShortArrayArray4[local49++];
						if (local123 != null) {
							for (local128 = 0; local128 < local123.length; local128++) {
								local89.method2545(local123[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_5 = this.aClass46_Sub2_42.method5234(local89.aByteArray74, local89.anInt2637, false);
			this.aClass182_Sub1_2 = new Class182_Sub1(this.aClass46_Sub2_42, 5123, null, 1);
		} else {
			this.aClass8_Sub1_7 = null;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method5914() {
		this.method5915(this.anInterface5_5, this.anInt6637);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!mq;II)V")
	private void method5915(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5917();
			this.aClass46_Sub2_42.method5251(this.aClass8_Sub1_7);
			this.aClass46_Sub2_42.method5231(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIII)V")
	public void method5916(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass182_Sub1_2.method5081(arg0, arg1 * this.aClass46_Sub2_42.method5232(5123));
		this.method5915(this.aClass182_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	private void method5917() {
		if (!this.aBoolean443) {
			return;
		}
		this.aBoolean443 = false;
		@Pc(16) byte[] local16 = this.aClass125_2.aByteArray99;
		@Pc(18) byte[] local18 = Static350.aByteArray213;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass125_2.anInt3582;
		@Pc(34) int local34 = this.anInt6636 + this.anInt6634 * this.aClass125_2.anInt3582;
		@Pc(36) int local36;
		@Pc(47) int local47;
		for (local36 = -128; local36 < 0; local36++) {
			local20 = (local20 << 8) - local20;
			for (local47 = -128; local47 < 0; local47++) {
				if (local16[local34++] != 0) {
					local20++;
				}
			}
			local34 += local24 - 128;
		}
		if (this.aClass8_Sub1_7 != null && local20 == this.anInt6635) {
			this.aBoolean443 = false;
			return;
		}
		this.anInt6635 = local20;
		local34 = this.anInt6636 + local24 * this.anInt6634;
		local36 = 0;
		for (local47 = -128; local47 < 0; local47++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local16[local34] == 0) {
					@Pc(118) int local118 = 0;
					if (local16[local34 - 1] != 0) {
						local118++;
					}
					if (local16[local34 + 1] != 0) {
						local118++;
					}
					if (local16[local34 - local24] != 0) {
						local118++;
					}
					if (local16[local24 + local34] != 0) {
						local118++;
					}
					local18[local36++] = (byte) (local118 * 17);
				} else {
					local18[local36++] = 68;
				}
				local34++;
			}
			local34 += this.aClass125_2.anInt3582 - 128;
		}
		if (this.aClass8_Sub1_7 == null) {
			this.aClass8_Sub1_7 = new Class8_Sub1(this.aClass46_Sub2_42, 3553, 6406, 128, 128, false, Static350.aByteArray213, 6406, false);
			this.aClass8_Sub1_7.method3370(false, false);
			this.aClass8_Sub1_7.method4741(true);
		} else {
			this.aClass8_Sub1_7.method3373(128, 128, Static350.aByteArray213, 6406, false);
		}
	}
}
