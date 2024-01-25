import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class27 {

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	private int anInt561 = -1;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Z")
	public boolean aBoolean38 = true;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	private final int anInt560;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
	private final int anInt562;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_6;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!om;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	private final int anInt563;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "Lclient!ko;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!ir;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!nf;Lclient!om;Lclient!kk;IIIII)V")
	public Class27(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class12_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt560 = arg6;
		this.anInt562 = arg7;
		this.aClass105_Sub1_6 = arg0;
		this.aClass152_1 = arg1;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + (local33 + local35) * arg2.anInt3162;
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray10[local47++];
				if (local58 != null) {
					local25 += local58.length;
				}
			}
		}
		this.anInt563 = local25;
		if (local25 > 0) {
			@Pc(84) Class1_Sub21 local84 = new Class1_Sub21(local25 * 2);
			@Pc(117) short[] local117;
			@Pc(122) int local122;
			@Pc(108) int local108;
			if (this.aClass105_Sub1_6.aBoolean316) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = (local33 + local47) * arg2.anInt3162 + local29;
					for (local108 = 0; local108 < local23; local108++) {
						local117 = arg2.aShortArrayArray10[local49++];
						if (local117 != null) {
							for (local122 = 0; local122 < local117.length; local122++) {
								local84.method5698(local117[local122]);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = arg2.anInt3162 * (local33 + local47) + local29;
					for (local108 = 0; local108 < local23; local108++) {
						local117 = arg2.aShortArrayArray10[local49++];
						if (local117 != null) {
							for (local122 = 0; local122 < local117.length; local122++) {
								local84.method5731(local117[local122]);
							}
						}
					}
				}
			}
			this.anInterface8_1 = this.aClass105_Sub1_6.method3598(local84.aByteArray82, local84.anInt6611, false);
		} else {
			this.aClass44_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZILclient!ko;)V")
	public void method506(@OriginalArg(1) int arg0, @OriginalArg(2) Interface8 arg1) {
		if (arg0 != 0) {
			this.method507();
			this.aClass105_Sub1_6.method3591(this.aClass44_Sub1_1);
			this.aClass105_Sub1_6.method3590(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	private void method507() {
		if (!this.aBoolean38) {
			return;
		}
		this.aBoolean38 = false;
		@Pc(10) byte[] local10 = this.aClass152_1.aByteArray51;
		@Pc(12) byte[] local12 = Static31.aByteArray3;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.aClass152_1.anInt4628;
		@Pc(28) int local28 = this.anInt560 + this.aClass152_1.anInt4628 * this.anInt562;
		@Pc(30) int local30;
		@Pc(42) int local42;
		for (local30 = -128; local30 < 0; local30++) {
			local14 = (local14 << 8) - local14;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local28++] != 0) {
					local14++;
				}
			}
			local28 += local18 - 128;
		}
		if (this.aClass44_Sub1_1 != null && local14 == this.anInt561) {
			this.aBoolean38 = false;
			return;
		}
		this.anInt561 = local14;
		local30 = 0;
		local28 = this.anInt560 + local18 * this.anInt562;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local10[local28] == 0) {
					@Pc(124) int local124 = 0;
					if (local10[local28 - 1] != 0) {
						local124++;
					}
					if (local10[local28 + 1] != 0) {
						local124++;
					}
					if (local10[local28 - local18] != 0) {
						local124++;
					}
					if (local10[local28 + local18] != 0) {
						local124++;
					}
					local12[local30++] = (byte) (local124 * 17);
				} else {
					local12[local30++] = 68;
				}
				local28++;
			}
			local28 += this.aClass152_1.anInt4628 - 128;
		}
		if (this.aClass44_Sub1_1 == null) {
			this.aClass44_Sub1_1 = new Class44_Sub1(this.aClass105_Sub1_6, 3553, 6406, 128, 128, false, Static31.aByteArray3, 6406, false);
			this.aClass44_Sub1_1.method1072(false, false);
			this.aClass44_Sub1_1.method5572(true);
		} else {
			this.aClass44_Sub1_1.method1071(128, 128, Static31.aByteArray3, 6406, false);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method508() {
		this.method506(this.anInt563, this.anInterface8_1);
	}
}
