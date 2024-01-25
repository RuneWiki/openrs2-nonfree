import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class143 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt4337 = -1;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Lclient!lo;")
	private final Class126 aClass126_2;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_31;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	private final int anInt4336;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	private final int anInt4338;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	private final int anInt4339;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!hn;")
	private Class60_Sub4 aClass60_Sub4_7;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!dc;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!aq;")
	private Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!mm;Lclient!lo;Lclient!eb;IIIII)V")
	public Class143(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class51_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass126_2 = arg1;
		this.aClass55_Sub1_31 = arg0;
		this.anInt4336 = arg7;
		this.anInt4338 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + (local35 + local33) * arg2.anInt1963;
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray2[local47++];
				if (local58 != null) {
					local25 += local58.length;
				}
			}
		}
		this.anInt4339 = local25;
		if (local25 <= 0) {
			this.aClass60_Sub4_7 = null;
		} else {
			@Pc(89) Class5_Sub12 local89 = new Class5_Sub12(local25 * 2);
			@Pc(118) short[] local118;
			@Pc(124) int local124;
			@Pc(109) int local109;
			if (this.aClass55_Sub1_31.aBoolean308) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + (local47 + local33) * arg2.anInt1963;
					for (local109 = 0; local109 < local23; local109++) {
						local118 = arg2.aShortArrayArray2[local49++];
						if (local118 != null) {
							for (local124 = 0; local124 < local118.length; local124++) {
								local89.method5084(local118[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + arg2.anInt1963 * (local47 + local33);
					for (local109 = 0; local109 < local23; local109++) {
						local118 = arg2.aShortArrayArray2[local49++];
						if (local118 != null) {
							for (local124 = 0; local124 < local118.length; local124++) {
								local89.method5080(local118[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_4 = this.aClass55_Sub1_31.method3704(local89.aByteArray90, local89.anInt5731, false);
			this.aClass12_Sub1_1 = new Class12_Sub1(this.aClass55_Sub1_31, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BILclient!dc;)V")
	private void method4003(@OriginalArg(1) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (arg0 != 0) {
			this.method4006();
			this.aClass55_Sub1_31.method3677(this.aClass60_Sub4_7);
			this.aClass55_Sub1_31.method3673(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[BI)V")
	public void method4004(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass12_Sub1_1.method5665(arg1, arg0 * this.aClass55_Sub1_31.method3687(5123));
		this.method4003(arg0, this.aClass12_Sub1_1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public void method4005() {
		this.method4003(this.anInt4339, this.anInterface1_4);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	private void method4006() {
		if (!this.aBoolean354) {
			return;
		}
		this.aBoolean354 = false;
		@Pc(11) byte[] local11 = this.aClass126_2.aByteArray53;
		@Pc(13) byte[] local13 = Static218.aByteArray60;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass126_2.anInt3693;
		@Pc(29) int local29 = this.anInt4338 + this.anInt4336 * this.aClass126_2.anInt3693;
		@Pc(31) int local31;
		@Pc(44) int local44;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local44 = -128; local44 < 0; local44++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass60_Sub4_7 != null && this.anInt4337 == local15) {
			this.aBoolean354 = false;
			return;
		}
		this.anInt4337 = local15;
		local31 = 0;
		local29 = this.anInt4338 + this.anInt4336 * local19;
		for (local44 = -128; local44 < 0; local44++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local11[local29] == 0) {
					@Pc(119) int local119 = 0;
					if (local11[local29 - 1] != 0) {
						local119++;
					}
					if (local11[local29 + 1] != 0) {
						local119++;
					}
					if (local11[local29 - local19] != 0) {
						local119++;
					}
					if (local11[local19 + local29] != 0) {
						local119++;
					}
					local13[local31++] = (byte) (local119 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass126_2.anInt3693 - 128;
		}
		if (this.aClass60_Sub4_7 == null) {
			this.aClass60_Sub4_7 = new Class60_Sub4(this.aClass55_Sub1_31, 3553, 6406, 128, 128, false, Static218.aByteArray60, 6406, false);
			this.aClass60_Sub4_7.method5849(false, false);
			this.aClass60_Sub4_7.method5836(true);
		} else {
			this.aClass60_Sub4_7.method5847(128, 128, Static218.aByteArray60, 6406, false);
		}
	}
}
