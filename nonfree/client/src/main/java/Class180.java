import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class180 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	private int anInt4693 = -1;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_32;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private final int anInt4692;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	private final int anInt4695;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!rr;")
	private final Class208 aClass208_2;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private final int anInt4694;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!kh;")
	private Class30_Sub3 aClass30_Sub3_5;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!hs;")
	private Interface4 anInterface4_4;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!ig;")
	private Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!mi;Lclient!rr;Lclient!ag;IIIII)V")
	public Class180(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class7_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass155_Sub1_32 = arg0;
		this.anInt4692 = arg6;
		this.anInt4695 = arg7;
		this.aClass208_2 = arg1;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + arg2.anInt6380 * (local33 + local35);
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local47++];
				if (local58 != null) {
					local25 += local58.length;
				}
			}
		}
		this.anInt4694 = local25;
		if (local25 <= 0) {
			this.aClass30_Sub3_5 = null;
		} else {
			@Pc(90) Class3_Sub5 local90 = new Class3_Sub5(local25 * 2);
			@Pc(124) short[] local124;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass155_Sub1_32.aBoolean298) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + arg2.anInt6380 * (local33 + local47);
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local49++];
						if (local124 != null) {
							for (local129 = 0; local129 < local124.length; local129++) {
								local90.method2749(local124[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + arg2.anInt6380 * (local47 + local33);
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local49++];
						if (local124 != null) {
							for (local129 = 0; local129 < local124.length; local129++) {
								local90.method2729(local124[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_4 = this.aClass155_Sub1_32.method3608(local90.aByteArray42, local90.anInt3121, false);
			this.aClass109_Sub1_1 = new Class109_Sub1(this.aClass155_Sub1_32, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method4209() {
		this.method4210(this.anInterface4_4, this.anInt4694);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!hs;I)V")
	private void method4210(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4211();
			this.aClass155_Sub1_32.method3585(this.aClass30_Sub3_5);
			this.aClass155_Sub1_32.method3616(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	private void method4211() {
		if (!this.aBoolean364) {
			return;
		}
		this.aBoolean364 = false;
		@Pc(11) byte[] local11 = this.aClass208_2.aByteArray72;
		@Pc(13) byte[] local13 = Static263.aByteArray59;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass208_2.anInt5278;
		@Pc(29) int local29 = this.aClass208_2.anInt5278 * this.anInt4695 + this.anInt4692;
		@Pc(35) int local35;
		@Pc(47) int local47;
		for (local35 = -128; local35 < 0; local35++) {
			local15 = (local15 << 8) - local15;
			for (local47 = -128; local47 < 0; local47++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass30_Sub3_5 != null && this.anInt4693 == local15) {
			this.aBoolean364 = false;
			return;
		}
		this.anInt4693 = local15;
		local29 = this.anInt4692 + this.anInt4695 * local19;
		local35 = 0;
		for (local47 = -128; local47 < 0; local47++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local11[local29] == 0) {
					@Pc(122) int local122 = 0;
					if (local11[local29 - 1] != 0) {
						local122++;
					}
					if (local11[local29 + 1] != 0) {
						local122++;
					}
					if (local11[local29 - local19] != 0) {
						local122++;
					}
					if (local11[local29 + local19] != 0) {
						local122++;
					}
					local13[local35++] = (byte) (local122 * 17);
				} else {
					local13[local35++] = 68;
				}
				local29++;
			}
			local29 += this.aClass208_2.anInt5278 - 128;
		}
		if (this.aClass30_Sub3_5 == null) {
			this.aClass30_Sub3_5 = new Class30_Sub3(this.aClass155_Sub1_32, 3553, 6406, 128, 128, false, Static263.aByteArray59, 6406, false);
			this.aClass30_Sub3_5.method4613(false, false);
			this.aClass30_Sub3_5.method4607(true);
		} else {
			this.aClass30_Sub3_5.method4615(128, 128, Static263.aByteArray59, 6406, false);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)V")
	public void method4212(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass109_Sub1_1.method2311(arg1, this.aClass155_Sub1_32.method3617(5123) * arg0);
		this.method4210(this.aClass109_Sub1_1, arg0);
	}
}
