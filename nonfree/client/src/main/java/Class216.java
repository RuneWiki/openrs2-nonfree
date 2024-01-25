import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class216 {

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	private int anInt6550 = -1;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!mb;")
	private final Class130 aClass130_2;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	private final int anInt6548;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_41;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	private final int anInt6549;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	private final int anInt6551;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Lclient!d;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Lclient!et;")
	private Class23_Sub2 aClass23_Sub2_2;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Lclient!qb;")
	private Class19_Sub3 aClass19_Sub3_7;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ks;Lclient!mb;Lclient!dl;IIIII)V")
	public Class216(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) Class36_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass130_2 = arg1;
		this.anInt6548 = arg7;
		this.aClass63_Sub1_41 = arg0;
		this.anInt6549 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(53) int local53;
		@Pc(55) int local55;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local53 = (local33 + local35) * arg2.anInt4858 + local29;
			for (local55 = 0; local55 < local23; local55++) {
				@Pc(64) short[] local64 = arg2.aShortArrayArray3[local53++];
				if (local64 != null) {
					local25 += local64.length;
				}
			}
		}
		this.anInt6551 = local25;
		if (local25 > 0) {
			@Pc(91) Class1_Sub7 local91 = new Class1_Sub7(local25 * 2);
			@Pc(128) short[] local128;
			@Pc(133) int local133;
			@Pc(115) int local115;
			if (this.aClass63_Sub1_41.lb) {
				for (local53 = 0; local53 < local23; local53++) {
					local55 = arg2.anInt4858 * (local33 + local53) + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray3[local55++];
						if (local128 != null) {
							for (local133 = 0; local133 < local128.length; local133++) {
								local91.method2144(local128[local133] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local53 = 0; local53 < local23; local53++) {
					local55 = arg2.anInt4858 * (local33 + local53) + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray3[local55++];
						if (local128 != null) {
							for (local133 = 0; local133 < local128.length; local133++) {
								local91.method2125(local128[local133] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_5 = this.aClass63_Sub1_41.method3376(local91.aByteArray41, local91.anInt2219, false);
			this.aClass23_Sub2_2 = new Class23_Sub2(this.aClass63_Sub1_41, 5123, null, 1);
		} else {
			this.aClass19_Sub3_7 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!d;I)V")
	private void method5764(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5766();
			this.aClass63_Sub1_41.method3355(this.aClass19_Sub3_7);
			this.aClass63_Sub1_41.method3334(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	public void method5765() {
		this.method5764(this.anInterface1_5, this.anInt6551);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
	private void method5766() {
		if (!this.aBoolean487) {
			return;
		}
		this.aBoolean487 = false;
		@Pc(17) byte[] local17 = this.aClass130_2.aByteArray71;
		@Pc(19) byte[] local19 = Static348.aByteArray95;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = this.aClass130_2.anInt3877;
		@Pc(35) int local35 = this.anInt6549 + this.anInt6548 * this.aClass130_2.anInt3877;
		@Pc(37) int local37;
		@Pc(48) int local48;
		for (local37 = -128; local37 < 0; local37++) {
			local21 = (local21 << 8) - local21;
			for (local48 = -128; local48 < 0; local48++) {
				if (local17[local35++] != 0) {
					local21++;
				}
			}
			local35 += local25 - 128;
		}
		if (this.aClass19_Sub3_7 != null && this.anInt6550 == local21) {
			this.aBoolean487 = false;
			return;
		}
		this.anInt6550 = local21;
		local37 = 0;
		local35 = local25 * this.anInt6548 + this.anInt6549;
		for (local48 = -128; local48 < 0; local48++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local17[local35] == 0) {
					@Pc(124) int local124 = 0;
					if (local17[local35 - 1] != 0) {
						local124++;
					}
					if (local17[local35 + 1] != 0) {
						local124++;
					}
					if (local17[local35 - local25] != 0) {
						local124++;
					}
					if (local17[local25 + local35] != 0) {
						local124++;
					}
					local19[local37++] = (byte) (local124 * 17);
				} else {
					local19[local37++] = 68;
				}
				local35++;
			}
			local35 += this.aClass130_2.anInt3877 - 128;
		}
		if (this.aClass19_Sub3_7 == null) {
			this.aClass19_Sub3_7 = new Class19_Sub3(this.aClass63_Sub1_41, 3553, 6406, 128, 128, false, Static348.aByteArray95, 6406, false);
			this.aClass19_Sub3_7.method3681(false, false);
			this.aClass19_Sub3_7.method4238(true);
		} else {
			this.aClass19_Sub3_7.method3679(128, 128, Static348.aByteArray95, 6406, false);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III[B)V")
	public void method5767(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass23_Sub2_2.method2055(arg1, arg0 * this.aClass63_Sub1_41.method3368(5123));
		this.method5764(this.aClass23_Sub2_2, arg0);
	}
}
