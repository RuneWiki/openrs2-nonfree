import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class273 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	private int anInt7736 = -1;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "Z")
	public boolean aBoolean517 = true;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_43;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	private final int anInt7734;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!tj;")
	private final Class238 aClass238_2;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	private final int anInt7739;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private final int anInt7733;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!tb;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Lclient!vo;")
	private Class170_Sub2 aClass170_Sub2_2;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Lclient!sa;")
	private Class64_Sub4 aClass64_Sub4_5;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!na;Lclient!tj;Lclient!hk;IIIII)V")
	public Class273(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class22_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass75_Sub2_43 = arg0;
		this.anInt7734 = arg6;
		this.aClass238_2 = arg1;
		this.anInt7739 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local35 + local37) * arg2.anInt2819;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray4[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt7733 = local27;
		if (local27 <= 0) {
			this.aClass64_Sub4_5 = null;
		} else {
			@Pc(92) Class2_Sub17 local92 = new Class2_Sub17(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass75_Sub2_43.aBoolean349) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + (local35 + local50) * arg2.anInt2819;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray4[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method6130(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = (local50 + local35) * arg2.anInt2819 + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray4[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local92.method6160(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface11_5 = this.aClass75_Sub2_43.method3818(local92.anInt7523, false, local92.aByteArray94);
			this.aClass170_Sub2_2 = new Class170_Sub2(this.aClass75_Sub2_43, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public void method6246() {
		this.method6249(this.anInterface11_5, this.anInt7733);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIII)V")
	public void method6247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass170_Sub2_2.method5887(this.aClass75_Sub2_43.method3834(5123) * arg1, arg0);
		this.method6249(this.aClass170_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	private void method6248() {
		if (!this.aBoolean517) {
			return;
		}
		this.aBoolean517 = false;
		@Pc(16) byte[] local16 = this.aClass238_2.aByteArray79;
		@Pc(20) byte[] local20 = this.aClass75_Sub2_43.aByteArray55;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = this.aClass238_2.anInt6755;
		@Pc(45) int local45 = this.anInt7734 + this.aClass238_2.anInt6755 * this.anInt7739;
		@Pc(58) int local58;
		for (@Pc(47) int local47 = -128; local47 < 0; local47++) {
			local30 = (local30 << 8) - local30;
			for (local58 = -128; local58 < 0; local58++) {
				if (local16[local45++] != 0) {
					local30++;
				}
			}
			local45 += local34 - 128;
		}
		if (this.aClass64_Sub4_5 != null && local30 == this.anInt7736) {
			this.aBoolean517 = false;
			return;
		}
		this.anInt7736 = local30;
		local58 = 0;
		local45 = this.anInt7734 + this.anInt7739 * local34;
		for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
			for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
				if (local16[local45] == 0) {
					@Pc(130) int local130 = 0;
					if (local16[local45 - 1] != 0) {
						local130++;
					}
					if (local16[local45 + 1] != 0) {
						local130++;
					}
					if (local16[local45 - local34] != 0) {
						local130++;
					}
					if (local16[local34 + local45] != 0) {
						local130++;
					}
					local20[local58++] = (byte) (local130 * 17);
				} else {
					local20[local58++] = 68;
				}
				local45++;
			}
			local45 += this.aClass238_2.anInt6755 - 128;
		}
		if (this.aClass64_Sub4_5 == null) {
			this.aClass64_Sub4_5 = new Class64_Sub4(this.aClass75_Sub2_43, 3553, 6406, 128, 128, false, this.aClass75_Sub2_43.aByteArray55, 6406, false);
			this.aClass64_Sub4_5.method3530(false, false);
			this.aClass64_Sub4_5.method3523(true);
		} else {
			this.aClass64_Sub4_5.method3534(128, 6406, this.aClass75_Sub2_43.aByteArray55, false, 128);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!tb;II)V")
	private void method6249(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method6248();
			this.aClass75_Sub2_43.method3844(this.aClass64_Sub4_5);
			this.aClass75_Sub2_43.method3841(arg0, 0, arg1);
		}
	}
}
