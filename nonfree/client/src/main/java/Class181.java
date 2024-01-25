import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class181 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	private int anInt5053 = -1;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Z")
	public boolean aBoolean371 = true;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
	private final int anInt5055;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_28;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!vb;")
	private final Class236 aClass236_1;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
	private final int anInt5056;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	private final int anInt5054;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Lclient!hs;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Lclient!lh;")
	private Class99_Sub2 aClass99_Sub2_1;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "Lclient!tr;")
	private Class81_Sub2 aClass81_Sub2_6;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!ic;Lclient!vb;Lclient!to;IIIII)V")
	public Class181(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class149_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5055 = arg6;
		this.aClass48_Sub2_28 = arg0;
		this.aClass236_1 = arg1;
		this.anInt5056 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(48) int local48;
		@Pc(50) int local50;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local48 = (local33 + local35) * arg2.anInt6741 + local29;
			for (local50 = 0; local50 < local23; local50++) {
				@Pc(63) short[] local63 = arg2.aShortArrayArray26[local48++];
				if (local63 != null) {
					local25 += local63.length;
				}
			}
		}
		this.anInt5054 = local25;
		if (local25 > 0) {
			@Pc(89) Class2_Sub24 local89 = new Class2_Sub24(local25 * 2);
			@Pc(119) short[] local119;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass48_Sub2_28.aBoolean218) {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = local29 + arg2.anInt6741 * (local33 + local48);
					for (local110 = 0; local110 < local23; local110++) {
						local119 = arg2.aShortArrayArray26[local50++];
						if (local119 != null) {
							for (local124 = 0; local124 < local119.length; local124++) {
								local89.method5721(local119[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = (local33 + local48) * arg2.anInt6741 + local29;
					for (local110 = 0; local110 < local23; local110++) {
						local119 = arg2.aShortArrayArray26[local50++];
						if (local119 != null) {
							for (local124 = 0; local124 < local119.length; local124++) {
								local89.method5717(local119[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface6_4 = this.aClass48_Sub2_28.method2598(local89.aByteArray100, local89.anInt6669, false);
			this.aClass99_Sub2_1 = new Class99_Sub2(this.aClass48_Sub2_28, 5123, null, 1);
		} else {
			this.aClass81_Sub2_6 = null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIIB)V")
	public void method4526(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass99_Sub2_1.method5136(arg0, this.aClass48_Sub2_28.method2610(5123) * arg1);
		this.method4528(this.aClass99_Sub2_1, arg1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public void method4527() {
		this.method4528(this.anInterface6_4, this.anInt5054);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!hs;I)V")
	private void method4528(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4529();
			this.aClass48_Sub2_28.method2573(this.aClass81_Sub2_6);
			this.aClass48_Sub2_28.method2580(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	private void method4529() {
		if (!this.aBoolean371) {
			return;
		}
		this.aBoolean371 = false;
		@Pc(10) byte[] local10 = this.aClass236_1.aByteArray99;
		@Pc(12) byte[] local12 = Static267.aByteArray76;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.aClass236_1.anInt6609;
		@Pc(29) int local29 = this.anInt5055 + this.aClass236_1.anInt6609 * this.anInt5056;
		@Pc(31) int local31;
		@Pc(44) int local44;
		for (local31 = -128; local31 < 0; local31++) {
			local14 = (local14 << 8) - local14;
			for (local44 = -128; local44 < 0; local44++) {
				if (local10[local29++] != 0) {
					local14++;
				}
			}
			local29 += local18 - 128;
		}
		if (this.aClass81_Sub2_6 != null && local14 == this.anInt5053) {
			this.aBoolean371 = false;
			return;
		}
		this.anInt5053 = local14;
		local31 = 0;
		local29 = local18 * this.anInt5056 + this.anInt5055;
		for (local44 = -128; local44 < 0; local44++) {
			for (@Pc(115) int local115 = -128; local115 < 0; local115++) {
				if (local10[local29] == 0) {
					@Pc(127) int local127 = 0;
					if (local10[local29 - 1] != 0) {
						local127++;
					}
					if (local10[local29 + 1] != 0) {
						local127++;
					}
					if (local10[local29 - local18] != 0) {
						local127++;
					}
					if (local10[local18 + local29] != 0) {
						local127++;
					}
					local12[local31++] = (byte) (local127 * 17);
				} else {
					local12[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass236_1.anInt6609 - 128;
		}
		if (this.aClass81_Sub2_6 == null) {
			this.aClass81_Sub2_6 = new Class81_Sub2(this.aClass48_Sub2_28, 3553, 6406, 128, 128, false, Static267.aByteArray76, 6406, false);
			this.aClass81_Sub2_6.method3640(false, false);
			this.aClass81_Sub2_6.method4350(true);
		} else {
			this.aClass81_Sub2_6.method3639(128, 128, Static267.aByteArray76, 6406, false);
		}
	}
}
