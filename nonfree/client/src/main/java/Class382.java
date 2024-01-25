import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class382 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "[[Lclient!dba;")
	private Class73[][] aClass73ArrayArray1;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Lclient!kb;")
	private final Class84_Sub2 aClass84_Sub2_3;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_22;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public final int anInt10527;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	private final int anInt10526;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[B")
	public final byte[] aByteArray109;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	private final int anInt10535;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	private final int anInt10524;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	private final int anInt10522;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!gca;Lclient!kb;)V")
	public Class382(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class84_Sub2 arg1) {
		this.aClass84_Sub2_3 = arg1;
		this.aClass100_Sub1_22 = arg0;
		this.anInt10527 = (this.aClass84_Sub2_3.anInt8883 * this.aClass84_Sub2_3.anInt8881 >> this.aClass100_Sub1_22.anInt9257) + 2;
		this.anInt10526 = (this.aClass84_Sub2_3.anInt8878 * this.aClass84_Sub2_3.anInt8881 >> this.aClass100_Sub1_22.anInt9257) + 2;
		this.aByteArray109 = new byte[this.anInt10527 * this.anInt10526];
		this.anInt10535 = this.aClass100_Sub1_22.anInt9257 + 7 - this.aClass84_Sub2_3.anInt8885;
		this.anInt10524 = this.aClass84_Sub2_3.anInt8883 >> this.anInt10535;
		this.anInt10522 = this.aClass84_Sub2_3.anInt8878 >> this.anInt10535;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	public void method8887() {
		this.aClass73ArrayArray1 = new Class73[this.anInt10524][this.anInt10522];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10522; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt10524; local18++) {
				this.aClass73ArrayArray1[local18][local14] = new Class73(this.aClass100_Sub1_22, this, this.aClass84_Sub2_3, local18, local14, this.anInt10535, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass73ArrayArray1[local18][local14].anInt1484 == 0) {
					this.aClass73ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method8889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1_Sub15 arg2) {
		@Pc(6) Class5_Sub1_Sub15_Sub2 local6 = (Class5_Sub1_Sub15_Sub2) arg2;
		arg1 += local6.anInt9739 + 1;
		arg0 += local6.anInt9746 + 1;
		@Pc(28) int local28 = arg0 + this.anInt10527 * arg1;
		@Pc(31) int local31 = local6.anInt9743;
		@Pc(34) int local34 = local6.anInt9747;
		@Pc(44) int local44;
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			arg1 = 1;
			local31 -= local44;
			local28 += local44 * this.anInt10527;
		}
		@Pc(62) int local62 = this.anInt10527 - local34;
		if (this.anInt10526 <= local31 + arg1) {
			local44 = local31 + arg1 + 1 - this.anInt10526;
			local31 -= local44;
		}
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			local34 -= local44;
			arg0 = 1;
			local28 += local44;
			local62 += local44;
		}
		if (arg0 + local34 >= this.anInt10527) {
			local44 = local34 + arg0 + 1 - this.anInt10527;
			local62 += local44;
			local34 -= local44;
		}
		if (local34 > 0 && local31 > 0) {
			local62 += this.anInt10527 * 7;
			return Static289.method4592(local31, local34, local62, local28, this.aByteArray109);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!r;ZI)V")
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub15 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub1_Sub15_Sub2 local14 = (Class5_Sub1_Sub15_Sub2) arg1;
		arg2 += local14.anInt9746 + 1;
		arg0 += local14.anInt9739 + 1;
		@Pc(35) int local35 = this.anInt10527 * arg0 + arg2;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local14.anInt9743;
		@Pc(43) int local43 = local14.anInt9747;
		@Pc(49) int local49 = this.anInt10527 - local43;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			arg0 = 1;
			local37 = local56 * local43;
			local40 -= local56;
			local35 += local56 * this.anInt10527;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt10526 <= arg0 + local40) {
			local56 = arg0 + local40 + 1 - this.anInt10526;
			local40 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local35 += local56;
			local37 += local56;
			local43 -= local56;
			arg2 = 1;
			local77 = local56;
			local49 += local56;
		}
		if (this.anInt10527 <= local43 + arg2) {
			local56 = arg2 + local43 + 1 - this.anInt10527;
			local77 += local56;
			local49 += local56;
			local43 -= local56;
		}
		if (local43 > 0 && local40 > 0) {
			Static206.method3385(local40, local37, local49, local43, this.aByteArray109, local77, local14.aByteArray100, local35);
			this.method8891(arg2, local40, arg0, local43);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V")
	private void method8891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass73ArrayArray1 == null) {
			return;
		}
		@Pc(24) int local24 = arg0 - 1 >> 7;
		@Pc(34) int local34 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg2 - 1 >> 7;
		@Pc(48) int local48 = arg1 + arg2 - 2 >> 7;
		for (@Pc(50) int local50 = local24; local50 <= local34; local50++) {
			@Pc(57) Class73[] local57 = this.aClass73ArrayArray1[local50];
			for (@Pc(59) int local59 = local40; local59 <= local48; local59++) {
				if (local57[local59] != null) {
					local57[local59].aBoolean126 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!r;I)V")
	public void method8893(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub15 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub1_Sub15_Sub2 local6 = (Class5_Sub1_Sub15_Sub2) arg1;
		arg0 += local6.anInt9746 + 1;
		arg2 += local6.anInt9739 + 1;
		@Pc(32) int local32 = arg0 + this.anInt10527 * arg2;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt9743;
		@Pc(40) int local40 = local6.anInt9747;
		@Pc(46) int local46 = this.anInt10527 - local40;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local34 = local53 * local40;
			local32 += this.anInt10527 * local53;
			local37 -= local53;
			arg2 = 1;
		}
		@Pc(74) int local74 = 0;
		if (this.anInt10526 <= local37 + arg2) {
			local53 = arg2 + local37 + 1 - this.anInt10526;
			local37 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local34 += local53;
			local32 += local53;
			local40 -= local53;
			arg0 = 1;
			local74 = local53;
			local46 += local53;
		}
		if (arg0 + local40 >= this.anInt10527) {
			local53 = local40 + arg0 + 1 - this.anInt10527;
			local74 += local53;
			local46 += local53;
			local40 -= local53;
		}
		if (local40 > 0 && local37 > 0) {
			Static551.method7501(local74, local40, local37, local6.aByteArray100, local32, this.aByteArray109, local34, local46);
			this.method8891(arg0, local37, arg2, local40);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIIII[[Z)V")
	public void method8894(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass100_Sub1_22.method7935(false);
		this.aClass100_Sub1_22.method7914(false);
		this.aClass100_Sub1_22.method7957(1);
		this.aClass100_Sub1_22.method7962(1);
		this.aClass100_Sub1_22.method7971(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass100_Sub1_22.anInt9232 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg0) {
			for (local45 = 0; local45 < this.anInt10522; local45++) {
				local52 = local45 << this.anInt10535;
				local59 = local45 + 1 << this.anInt10535;
				label87: for (local61 = 0; local61 < this.anInt10524; local61++) {
					if (this.aClass73ArrayArray1[local61][local45] != null) {
						@Pc(363) int local363 = local61 << this.anInt10535;
						@Pc(370) int local370 = local61 + 1 << this.anInt10535;
						for (@Pc(372) int local372 = local363; local372 < local370; local372++) {
							if (-arg2 <= local372 - arg1 && arg2 >= local372 - arg1) {
								for (@Pc(397) int local397 = local52; local397 < local59; local397++) {
									if (-arg2 <= local397 - arg3 && local397 - arg3 <= arg2 && arg4[arg2 + local372 - arg1][arg2 + local397 - arg3]) {
										@Pc(442) Class10_Sub2 local442 = this.aClass100_Sub1_22.method7877();
										local442.method1706(local41, local41, 1.0F);
										local442.method4225(-local61, -local45, 0);
										this.aClass100_Sub1_22.method7954(Static475.aClass16_46);
										this.aClass73ArrayArray1[local61][local45].method1384();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt10522; local45++) {
				local52 = local45 << this.anInt10535;
				local59 = local45 + 1 << this.anInt10535;
				for (local61 = 0; local61 < this.anInt10524; local61++) {
					@Pc(70) Class73 local70 = this.aClass73ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(83) Interface20 local83 = this.aClass100_Sub1_22.method7988(local70.anInt1484 * 3);
						@Pc(88) Buffer local88 = local83.method7347();
						if (local88 != null) {
							@Pc(96) Stream local96 = this.aClass100_Sub1_22.method7910(local88);
							@Pc(98) int local98 = 0;
							@Pc(103) int local103 = local61 << this.anInt10535;
							@Pc(110) int local110 = local61 + 1 << this.anInt10535;
							for (@Pc(112) int local112 = local52; local112 < local59; local112++) {
								if (-arg2 <= local112 - arg3 && arg2 >= local112 - arg3) {
									@Pc(137) int local137 = this.aClass84_Sub2_3.anInt8883 * local112 + local103;
									for (@Pc(139) int local139 = local103; local139 < local110; local139++) {
										if (local139 - arg1 >= -arg2 && arg2 >= local139 - arg1 && arg4[local139 + arg2 - arg1][arg2 + local112 - arg3]) {
											@Pc(187) short[] local187 = this.aClass84_Sub2_3.aShortArrayArray16[local137];
											if (local187 != null) {
												@Pc(195) int local195;
												if (Stream.c()) {
													for (local195 = 0; local195 < local187.length; local195++) {
														local96.c(local187[local195] & 0xFFFF);
														local98++;
													}
												} else {
													for (local195 = 0; local195 < local187.length; local195++) {
														local98++;
														local96.f(local187[local195] & 0xFFFF);
													}
												}
											}
										}
										local137++;
									}
								}
							}
							local96.b();
							if (local83.method7349() && local98 > 0) {
								@Pc(280) Class10_Sub2 local280 = this.aClass100_Sub1_22.method7877();
								local280.method1706(local41, local41, 1.0F);
								local280.method4225(-local61, -local45, 0);
								this.aClass100_Sub1_22.method7954(Static475.aClass16_46);
								local70.method1381(local83, local98 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass100_Sub1_22.method7930();
	}
}
