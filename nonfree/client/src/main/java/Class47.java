import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class47 {

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "[[Lclient!uj;")
	private Class338[][] aClass338ArrayArray1;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "Lclient!om;")
	private final Class151_Sub1 aClass151_Sub1_1;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_3;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
	public final int anInt985;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
	private final int anInt974;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	private final int anInt975;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
	private final int anInt984;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
	private final int anInt981;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!um;Lclient!om;)V")
	public Class47(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class151_Sub1 arg1) {
		this.aClass151_Sub1_1 = arg1;
		this.aClass162_Sub1_3 = arg0;
		this.anInt985 = (this.aClass151_Sub1_1.anInt9572 * this.aClass151_Sub1_1.anInt9573 >> this.aClass162_Sub1_3.anInt4621) + 2;
		this.anInt974 = (this.aClass151_Sub1_1.anInt9573 * this.aClass151_Sub1_1.anInt9574 >> this.aClass162_Sub1_3.anInt4621) + 2;
		this.anInt975 = this.aClass162_Sub1_3.anInt4621 + 7 - this.aClass151_Sub1_1.anInt9568;
		this.aByteArray19 = new byte[this.anInt974 * this.anInt985];
		this.anInt984 = this.aClass151_Sub1_1.anInt9572 >> this.anInt975;
		this.anInt981 = this.aClass151_Sub1_1.anInt9574 >> this.anInt975;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub8 arg2) {
		@Pc(6) Class2_Sub2_Sub8_Sub1 local6 = (Class2_Sub2_Sub8_Sub1) arg2;
		arg1 += local6.anInt7953 + 1;
		arg0 += local6.anInt7947 + 1;
		@Pc(28) int local28 = arg1 + this.anInt985 * arg0;
		@Pc(31) int local31 = local6.anInt7950;
		@Pc(34) int local34 = local6.anInt7952;
		@Pc(40) int local40 = this.anInt985 - local34;
		@Pc(47) int local47;
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local28 += local47 * this.anInt985;
			arg0 = 1;
			local31 -= local47;
		}
		if (arg0 + local31 >= this.anInt974) {
			local47 = local31 + arg0 + 1 - this.anInt974;
			local31 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local40 += local47;
			arg1 = 1;
			local28 += local47;
			local34 -= local47;
		}
		if (this.anInt985 <= arg1 + local34) {
			local47 = local34 + arg1 + 1 - this.anInt985;
			local34 -= local47;
			local40 += local47;
		}
		if (local34 > 0 && local31 > 0) {
			local40 += this.anInt985 * 7;
			return Static2.method7(local28, local40, local34, local31, this.aByteArray19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public void method946() {
		this.aClass338ArrayArray1 = new Class338[this.anInt984][this.anInt981];
		for (@Pc(19) int local19 = 0; local19 < this.anInt981; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt984; local23++) {
				this.aClass338ArrayArray1[local23][local19] = new Class338(this.aClass162_Sub1_3, this, this.aClass151_Sub1_1, local23, local19, this.anInt975, local23 * 128 + 1, local19 * 128 + 1);
				if (this.aClass338ArrayArray1[local23][local19].anInt8867 == 0) {
					this.aClass338ArrayArray1[local23][local19] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIII)V")
	private void method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass338ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(23) int local23 = arg3 + arg0 - 2 >> 7;
		@Pc(29) int local29 = arg2 - 1 >> 7;
		@Pc(40) int local40 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(42) int local42 = local15; local42 <= local23; local42++) {
			@Pc(49) Class338[] local49 = this.aClass338ArrayArray1[local42];
			for (@Pc(51) int local51 = local29; local51 <= local40; local51++) {
				if (local49[local51] != null) {
					local49[local51].aBoolean752 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!ha;III)V")
	public void method949(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub2_Sub8_Sub1 local12 = (Class2_Sub2_Sub8_Sub1) arg0;
		arg2 += local12.anInt7947 + 1;
		arg1 += local12.anInt7953 + 1;
		@Pc(33) int local33 = arg2 * this.anInt985 + arg1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local12.anInt7950;
		@Pc(41) int local41 = local12.anInt7952;
		@Pc(47) int local47 = this.anInt985 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local38 -= local57;
			local35 = local41 * local57;
			arg2 = 1;
			local33 += local57 * this.anInt985;
		}
		@Pc(78) int local78 = 0;
		if (arg2 + local38 >= this.anInt974) {
			local57 = local38 + arg2 + 1 - this.anInt974;
			local38 -= local57;
		}
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			local78 = local57;
			local41 -= local57;
			local47 += local57;
			arg1 = 1;
			local33 += local57;
			local35 += local57;
		}
		if (this.anInt985 <= arg1 + local41) {
			local57 = local41 + arg1 + 1 - this.anInt985;
			local78 += local57;
			local41 -= local57;
			local47 += local57;
		}
		if (local41 > 0 && local38 > 0) {
			Static368.method6712(this.aByteArray19, local33, local12.aByteArray86, local35, local41, local38, local47, local78);
			this.method948(arg1, local38, arg2, local41);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BIII[[ZZ)V")
	public void method950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		this.aClass162_Sub1_3.method3836(false);
		this.aClass162_Sub1_3.method3940(false);
		this.aClass162_Sub1_3.method3957(1);
		this.aClass162_Sub1_3.method3906(1);
		this.aClass162_Sub1_3.method3943(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass162_Sub1_3.anInt4606 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg4) {
			for (local45 = 0; local45 < this.anInt981; local45++) {
				local52 = local45 << this.anInt975;
				local59 = local45 + 1 << this.anInt975;
				label87: for (local61 = 0; local61 < this.anInt984; local61++) {
					if (this.aClass338ArrayArray1[local61][local45] != null) {
						@Pc(315) int local315 = local61 << this.anInt975;
						@Pc(322) int local322 = local61 + 1 << this.anInt975;
						for (@Pc(324) int local324 = local315; local324 < local322; local324++) {
							if (local324 - arg1 >= -arg2 && local324 - arg1 <= arg2) {
								for (@Pc(344) int local344 = local52; local344 < local59; local344++) {
									if (local344 - arg0 >= -arg2 && arg2 >= local344 - arg0 && arg3[local324 + arg2 - arg1][local344 + arg2 - arg0]) {
										@Pc(379) Class25_Sub2 local379 = this.aClass162_Sub1_3.method3899();
										local379.method2696(local41, 1.0F, local41);
										local379.U(-local61, -local45, 0);
										this.aClass162_Sub1_3.method3919(Static194.aClass348_4);
										this.aClass338ArrayArray1[local61][local45].method7060();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt981; local45++) {
				local52 = local45 << this.anInt975;
				local59 = local45 + 1 << this.anInt975;
				for (local61 = 0; local61 < this.anInt984; local61++) {
					@Pc(70) Class338 local70 = this.aClass338ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface13 local81 = this.aClass162_Sub1_3.method3860(local70.anInt8867 * 3);
						@Pc(86) Buffer local86 = local81.method7034();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass162_Sub1_3.method3907(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt975;
							@Pc(108) int local108 = local61 + 1 << this.anInt975;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (local110 - arg0 >= -arg2 && local110 - arg0 <= arg2) {
									@Pc(140) int local140 = this.aClass151_Sub1_1.anInt9572 * local110 + local101;
									for (@Pc(142) int local142 = local101; local142 < local108; local142++) {
										if (-arg2 <= local142 - arg1 && local142 - arg1 <= arg2 && arg3[local142 + arg2 - arg1][arg2 + local110 - arg0]) {
											@Pc(176) short[] local176 = this.aClass151_Sub1_1.aShortArrayArray13[local140];
											if (local176 != null) {
												@Pc(182) int local182;
												if (Stream.b()) {
													for (local182 = 0; local182 < local176.length; local182++) {
														local94.e(local176[local182] & 0xFFFF);
														local96++;
													}
												} else {
													for (local182 = 0; local182 < local176.length; local182++) {
														local94.b(local176[local182] & 0xFFFF);
														local96++;
													}
												}
											}
										}
										local140++;
									}
								}
							}
							local94.c();
							if (local81.method7033() && local96 > 0) {
								@Pc(242) Class25_Sub2 local242 = this.aClass162_Sub1_3.method3899();
								local242.method2696(local41, 1.0F, local41);
								local242.U(-local61, -local45, 0);
								this.aClass162_Sub1_3.method3919(Static194.aClass348_4);
								local70.method7065(local81, local96 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass162_Sub1_3.method3855();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!ha;IB)V")
	public void method951(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub8 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub8_Sub1 local6 = (Class2_Sub2_Sub8_Sub1) arg1;
		arg0 += local6.anInt7953 + 1;
		arg2 += local6.anInt7947 + 1;
		@Pc(27) int local27 = arg2 * this.anInt985 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7950;
		@Pc(35) int local35 = local6.anInt7952;
		@Pc(40) int local40 = this.anInt985 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local27 += local52 * this.anInt985;
			local29 = local35 * local52;
			arg2 = 1;
			local32 -= local52;
		}
		if (this.anInt974 <= local32 + arg2) {
			local52 = arg2 + local32 + 1 - this.anInt974;
			local32 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local40 += local52;
			local35 -= local52;
			local42 = local52;
			arg0 = 1;
			local29 += local52;
			local27 += local52;
		}
		if (this.anInt985 <= arg0 + local35) {
			local52 = local35 + arg0 + 1 - this.anInt985;
			local40 += local52;
			local35 -= local52;
			local42 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static271.method3965(local27, local6.aByteArray86, this.aByteArray19, local29, local32, local40, local42, local35);
			this.method948(arg0, local32, arg2, local35);
		}
	}
}
