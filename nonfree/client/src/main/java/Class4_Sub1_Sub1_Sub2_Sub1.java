import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class4_Sub1_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ip", name = "ad", descriptor = "Lclient!uaa;")
	public Class359 aClass359_1;

	@OriginalMember(owner = "client!ip", name = "Od", descriptor = "I")
	public int anInt4537;

	@OriginalMember(owner = "client!ip", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!ip", name = "Fd", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!ip", name = "xd", descriptor = "I")
	public int anInt4549;

	@OriginalMember(owner = "client!ip", name = "Sd", descriptor = "I")
	private int anInt4556;

	@OriginalMember(owner = "client!ip", name = "Rd", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ip", name = "Hd", descriptor = "I")
	public int anInt4534 = -1;

	@OriginalMember(owner = "client!ip", name = "qd", descriptor = "I")
	public int anInt4530 = 0;

	@OriginalMember(owner = "client!ip", name = "Id", descriptor = "I")
	public int anInt4548 = 0;

	@OriginalMember(owner = "client!ip", name = "Gd", descriptor = "I")
	public int anInt4547 = 0;

	@OriginalMember(owner = "client!ip", name = "Pc", descriptor = "I")
	public int anInt4539 = -1;

	@OriginalMember(owner = "client!ip", name = "id", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!ip", name = "nd", descriptor = "I")
	public int anInt4545 = 0;

	@OriginalMember(owner = "client!ip", name = "ld", descriptor = "B")
	private byte aByte67 = 0;

	@OriginalMember(owner = "client!ip", name = "Vc", descriptor = "I")
	public int anInt4554 = 255;

	@OriginalMember(owner = "client!ip", name = "ud", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!ip", name = "Jd", descriptor = "B")
	private byte aByte68 = 0;

	@OriginalMember(owner = "client!ip", name = "hd", descriptor = "I")
	public int anInt4562 = -1;

	@OriginalMember(owner = "client!ip", name = "sd", descriptor = "I")
	public int anInt4558 = -1;

	@OriginalMember(owner = "client!ip", name = "Yc", descriptor = "I")
	public int anInt4532 = -1;

	@OriginalMember(owner = "client!ip", name = "wd", descriptor = "I")
	public int anInt4536 = -1;

	@OriginalMember(owner = "client!ip", name = "Wc", descriptor = "I")
	public int anInt4565 = 0;

	@OriginalMember(owner = "client!ip", name = "Ad", descriptor = "I")
	public int anInt4564 = -1;

	@OriginalMember(owner = "client!ip", name = "kd", descriptor = "I")
	public int anInt4542 = -1;

	@OriginalMember(owner = "client!ip", name = "md", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ip", name = "od", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!ip", name = "Kd", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!ip", name = "Qc", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method4077() {
		return this.aString44;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)I")
	@Override
	protected int method5934() {
		return this.anInt4556;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ha;Lclient!sj;IIIILclient!ka;Z)V")
	private void method4079(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class43 arg6) {
		@Pc(12) int local12 = arg2 * arg2 + arg4 * arg4;
		if (local12 < 262144 || local12 > arg5) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg4) * 2607.5945876176133D - (double) super.aClass49_7.method978()) & 0x3FFF;
		@Pc(51) Class43 local51 = Static388.method5738(local39, arg3, super.anInt6842, arg0, super.anInt6885, super.anInt6859);
		if (local51 != null) {
			arg0.C(false);
			local51.method8849(arg1, (Class4_Sub8) null, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ka;IIILclient!ha;IILclient!sj;)V")
	private void method4082(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class100 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class10 arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg2 * arg2;
		if (local11 < 262144 || arg6 < local11) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg2, (double) arg4) * 2607.5945876176133D - (double) super.aClass49_7.method978()) & 0x3FFF;
		@Pc(57) Class43 local57 = Static388.method5738(local40, arg3, super.anInt6842, arg5, super.anInt6885, super.anInt6859);
		if (local57 != null) {
			arg5.C(false);
			local57.method8846(arg7, (Class4_Sub8) null, arg0, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 > -41) {
			Static250.method4089((Class137_Sub1) null, (byte[][]) null);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIBI)V")
	public void method4083(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6895 < 9) {
			super.anInt6895++;
		}
		for (@Pc(22) int local22 = super.anInt6895; local22 > 0; local22--) {
			super.anIntArray405[local22] = super.anIntArray405[local22 - 1];
			super.anIntArray404[local22] = super.anIntArray404[local22 - 1];
			super.aByteArray76[local22] = super.aByteArray76[local22 - 1];
		}
		super.anIntArray405[0] = arg0;
		super.aByteArray76[0] = arg1;
		super.anIntArray404[0] = arg2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return -1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4084() {
		@Pc(7) String local7 = "";
		if (Static196.aStringArray19 != null) {
			local7 = local7 + Static196.aStringArray19[this.aByte66];
		}
		@Pc(33) int[] local33;
		if (this.aByte67 == 1 && Static192.anIntArray441 != null) {
			local33 = Static192.anIntArray441;
		} else {
			local33 = Static180.anIntArray155;
		}
		if (local33 != null && local33[this.aByte66] != -1) {
			@Pc(64) Class127 local64 = Static116.aClass237_3.method5240(local33[this.aByte66]);
			if (local64.aChar3 == 's') {
				local7 = local7 + local64.method3102(this.aByte68 & 0xFF);
			} else {
				Static522.method7115(new Throwable(), "gdn1");
				local33[this.aByte66] = -1;
			}
		}
		local7 = local7 + this.aString43;
		if (Static562.aStringArray38 != null) {
			local7 = local7 + Static562.aStringArray38[this.aByte66];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		if (this.aClass359_1 == null || !super.aBoolean458 && !this.method4090(0, arg0)) {
			return;
		}
		@Pc(28) Class10 local28 = arg0.method8610();
		local28.method4217(super.aClass49_7.method978());
		local28.method4225(super.anInt9805, super.anInt9797 - 5, super.anInt9803);
		this.method5938(arg0, super.aBoolean458, local28, super.aClass43Array3);
		for (@Pc(57) int local57 = 0; local57 < super.aClass43Array3.length; local57++) {
			super.aClass43Array3[local57] = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)V")
	public void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt6897 = 0;
		super.anInt6896 = 0;
		super.anIntArray405[0] = arg0;
		super.anInt6895 = 0;
		super.anIntArray404[0] = arg1;
		@Pc(31) int local31 = this.method5932();
		super.anInt9803 = local31 * 256 + super.anIntArray404[0] * 512;
		super.anInt9805 = super.anIntArray405[0] * 512 + local31 * 256;
		if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == this) {
			Static8.method134();
		}
		if (super.aClass4_Sub9_6 != null) {
			super.aClass4_Sub9_6.method8045();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BIIB)V")
	public void method4086(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (super.anInt6872 != -1 && Static315.aClass14_1.method227(super.anInt6872).anInt7035 == 1) {
			super.anInt6872 = -1;
			super.anIntArray403 = null;
		}
		for (@Pc(30) int local30 = 0; local30 < super.aClass337Array3.length; local30++) {
			if (super.aClass337Array3[local30].anInt8754 != -1) {
				@Pc(50) Class295 local50 = Static463.aClass352_1.method8006(super.aClass337Array3[local30].anInt8754);
				if (local50.aBoolean514 && local50.anInt7610 != -1 && Static315.aClass14_1.method227(local50.anInt7610).anInt7035 == 1) {
					super.aClass337Array3[local30].anInt8754 = -1;
				}
			}
		}
		if (arg3 >= -52) {
			return;
		}
		this.anInt4558 = -1;
		if (arg1 < 0 || arg1 >= Static271.anInt4910 || arg2 < 0 || Static613.anInt9909 <= arg2) {
			this.method4085(arg1, arg2);
		} else if (super.anIntArray405[0] >= 0 && Static271.anInt4910 > super.anIntArray405[0] && super.anIntArray404[0] >= 0 && Static613.anInt9909 > super.anIntArray404[0]) {
			if (arg0 == 2) {
				Static349.method5149(arg2, arg1, this);
			}
			this.method4083(arg1, arg0, arg2);
		} else {
			this.method4085(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)I")
	@Override
	public int method5932() {
		return this.aClass359_1 == null || this.aClass359_1.anInt9559 == -1 ? super.method5932() : Static378.aClass369_2.method8471(this.aClass359_1.anInt9559).anInt2811;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10) {
			this.aString44 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		if (this.aClass359_1 == null || !this.method4090(131072, arg2)) {
			return false;
		}
		@Pc(28) Class10 local28 = arg2.method8610();
		@Pc(33) int local33 = super.aClass49_7.method978();
		local28.method4217(local33);
		local28.method4225(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; super.aClass43Array3.length > local48; local48++) {
			if (super.aClass43Array3[local48] != null && (Static305.aBoolean339 ? super.aClass43Array3[local48].method8844(arg1, arg0, local28, true, 0, Static216.anInt1170) : super.aClass43Array3[local48].method8852(arg1, arg0, local28, true, 0))) {
				local46 = true;
				break;
			}
		}
		super.aClass43Array3[0] = super.aClass43Array3[1] = super.aClass43Array3[2] = null;
		return local46;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass359_1 == null || !this.method4090(2048, arg0)) {
			return null;
		}
		@Pc(30) Class10 local30 = arg0.method8610();
		@Pc(35) int local35 = super.aClass49_7.method978();
		local30.method4217(local35);
		@Pc(53) Class128 local53 = Static283.aClass128ArrayArrayArray1[super.aByte139][super.anInt9805 >> Static314.anInt5377][super.anInt9803 >> Static314.anInt5377];
		if (local53 == null || local53.aClass4_Sub1_Sub3_1 == null) {
			super.anInt6849 = (int) ((float) super.anInt6849 - (float) super.anInt6849 / 10.0F);
		} else {
			@Pc(68) int local68 = super.anInt6849 - local53.aClass4_Sub1_Sub3_1.aShort48;
			super.anInt6849 = (int) ((float) super.anInt6849 - (float) local68 / 10.0F);
		}
		local30.method4225(super.anInt9805, -super.anInt6849 + super.anInt9797 - 20, super.anInt9803);
		super.aBoolean459 = false;
		@Pc(114) Class4_Sub6 local114 = null;
		if (Static577.aClass5_Sub19_25.aClass17_Sub8_1.method3164() == 1) {
			@Pc(126) Class92 local126 = this.method5930();
			if (local126.aBoolean137 && (this.aClass359_1.anInt9559 == -1 || Static378.aClass369_2.method8471(this.aClass359_1.anInt9559).aBoolean207)) {
				@Pc(171) Class264 local171 = super.anInt6872 != -1 && super.anInt6886 == 0 ? Static315.aClass14_1.method227(super.anInt6872) : null;
				@Pc(199) Class264 local199 = super.anInt6837 == -1 || this.aBoolean301 || super.aBoolean456 && local171 != null ? null : Static315.aClass14_1.method227(super.anInt6837);
				@Pc(233) Class43 local233 = Static64.method1077(local199 == null ? super.anInt6839 : super.anInt6854, 160, local35, 0, super.anInt6842, local199 == null ? local171 : local199, super.anInt6859, super.anInt6885, arg0, 1, 240, super.aClass43Array3[0], 0);
				if (local233 != null) {
					local114 = Static281.method4512(true, super.aClass43Array3.length + 1);
					super.aBoolean459 = true;
					arg0.C(false);
					if (Static305.aBoolean339) {
						local233.method8846(local30, local114.aClass4_Sub8Array1[super.aClass43Array3.length], Static216.anInt1170, 0);
					} else {
						local233.method8849(local30, local114.aClass4_Sub8Array1[super.aClass43Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(290) int local290;
		if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == this) {
			for (local290 = Static8.aClass212Array1.length - 1; local290 >= 0; local290--) {
				@Pc(296) Class212 local296 = Static8.aClass212Array1[local290];
				if (local296 != null && local296.anInt5373 != -1) {
					@Pc(333) int local333;
					if (local296.anInt5367 == 1) {
						@Pc(321) Class5_Sub9 local321 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local296.anInt5376);
						if (local321 != null) {
							@Pc(326) Class4_Sub1_Sub1_Sub2_Sub2 local326 = local321.aClass4_Sub1_Sub1_Sub2_Sub2_1;
							local333 = local326.anInt9805 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
							@Pc(339) int local339 = local326.anInt9803 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
							if (Static305.aBoolean339) {
								this.method4082(Static216.anInt1170, super.aClass43Array3[0], local333, local296.anInt5373, local339, arg0, 92160000, local30);
							} else {
								this.method4079(arg0, local30, local333, local296.anInt5373, local339, 92160000, super.aClass43Array3[0]);
							}
						}
					}
					@Pc(396) int local396;
					if (local296.anInt5367 == 2) {
						@Pc(389) int local389 = local296.anInt5366 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
						local396 = local296.anInt5374 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
						local333 = local296.anInt5375 << 9;
						local333 *= local333;
						if (Static305.aBoolean339) {
							this.method4082(Static216.anInt1170, super.aClass43Array3[0], local389, local296.anInt5373, local396, arg0, local333, local30);
						} else {
							this.method4079(arg0, local30, local389, local296.anInt5373, local396, local333, super.aClass43Array3[0]);
						}
					}
					if (local296.anInt5367 == 10 && local296.anInt5376 >= 0 && local296.anInt5376 < Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(470) Class4_Sub1_Sub1_Sub2_Sub1 local470 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local296.anInt5376];
						if (local470 != null) {
							local396 = local470.anInt9805 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
							local333 = local470.anInt9803 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
							if (Static305.aBoolean339) {
								this.method4082(Static216.anInt1170, super.aClass43Array3[0], local396, local296.anInt5373, local333, arg0, 92160000, local30);
							} else {
								this.method4079(arg0, local30, local396, local296.anInt5373, local333, 92160000, super.aClass43Array3[0]);
							}
						}
					}
				}
			}
			local30.method4217(local35);
			local30.method4225(super.anInt9805, super.anInt9797, super.anInt9803);
		}
		local30.method4217(local35);
		local30.method4225(super.anInt9805, -super.anInt6849 + super.anInt9797 - 5, super.anInt9803);
		if (local114 == null) {
			local114 = Static281.method4512(true, super.aClass43Array3.length);
		}
		this.method5938(arg0, false, local30, super.aClass43Array3);
		if (Static305.aBoolean339) {
			for (local290 = 0; local290 < super.aClass43Array3.length; local290++) {
				if (super.aClass43Array3[local290] != null) {
					super.aClass43Array3[local290].method8846(local30, local114.aClass4_Sub8Array1[local290], Static216.anInt1170, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == this ? 1 : 0);
				}
			}
		} else {
			for (local290 = 0; super.aClass43Array3.length > local290; local290++) {
				if (super.aClass43Array3[local290] != null) {
					super.aClass43Array3[local290].method8849(local30, local114.aClass4_Sub8Array1[local290], Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass4_Sub9_6 != null) {
			@Pc(670) Class336 local670 = super.aClass4_Sub9_6.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local670, Static216.anInt1170);
			} else {
				arg0.method8586(local670);
			}
		}
		for (local290 = 0; super.aClass43Array3.length > local290; local290++) {
			if (super.aClass43Array3[local290] != null) {
				super.aBoolean459 |= super.aClass43Array3[local290].F();
			}
			super.aClass43Array3[local290] = null;
		}
		super.anInt6841 = Static154.anInt3001;
		return local114;
	}

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "(B)Z")
	public boolean method4088() {
		return this.aClass359_1 != null;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method4090(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class92 local11 = this.method5930();
		@Pc(29) Class264 local29 = super.anInt6872 != -1 && super.anInt6886 == 0 ? Static315.aClass14_1.method227(super.anInt6872) : null;
		@Pc(56) Class264 local56 = super.anInt6837 == -1 || this.aBoolean301 || super.aBoolean456 && local29 != null ? null : Static315.aClass14_1.method227(super.anInt6837);
		@Pc(59) int local59 = local11.anInt1898;
		@Pc(62) int local62 = local11.anInt1901;
		if (local59 != 0 || local62 != 0 || local11.anInt1917 != 0 || local11.anInt1899 != 0) {
			arg0 |= 0x7;
		}
		@Pc(91) int local91 = super.aClass49_7.method978();
		@Pc(118) boolean local118 = super.aByte102 != 0 && super.anInt6856 <= Static565.anInt8921 && Static565.anInt8921 < super.anInt6832;
		if (local118) {
			arg0 |= 0x80000;
		}
		@Pc(163) Class43 local163 = super.aClass43Array3[0] = this.aClass359_1.method8160(local91, super.anInt6869, Static591.aClass148_2, super.anInt6854, Static239.aClass294_1, Static315.aClass14_1, Static82.aClass134_1, local56, Static23.aClass247_1, super.aClass64Array3, super.anInt6867, arg0, Static378.aClass369_2, super.anInt6836, local29, super.anIntArray398, arg1, Static87.aClass133_1, super.anInt6879, super.anInt6839);
		@Pc(166) int local166 = Static162.method2997();
		if (Static21.anInt299 < 96 && local166 > 50) {
			Static222.method3531();
		}
		if (Static387.aClass242_8 != Static670.aClass242_7 && local166 < 50) {
			@Pc(207) int local207 = 50 - local166;
			while (Static126.anInt2113 < local207) {
				Static123.aByteArrayArray6[Static126.anInt2113] = new byte[102400];
				Static126.anInt2113++;
			}
			while (local207 < Static126.anInt2113) {
				Static126.anInt2113--;
				Static123.aByteArrayArray6[Static126.anInt2113] = null;
			}
		} else if (Static670.aClass242_7 != Static387.aClass242_8) {
			Static123.aByteArrayArray6 = new byte[50][];
			Static126.anInt2113 = 0;
		}
		if (local163 == null) {
			return false;
		}
		super.anInt6865 = local163.fa();
		super.anInt6833 = local163.ma();
		this.method5922(local163);
		if (local59 == 0 && local62 == 0) {
			this.method5937(0, this.method5932() << 9, this.method5932() << 9, 0, local91);
		} else {
			this.method5937(local11.anInt1924, local62, local59, local11.anInt1929, local91);
			if (super.anInt6885 != 0) {
				local163.FA(super.anInt6885);
			}
			if (super.anInt6859 != 0) {
				local163.VA(super.anInt6859);
			}
			if (super.anInt6842 != 0) {
				local163.H(0, super.anInt6842, 0);
			}
		}
		if (local118) {
			local163.method8845(super.aByte100, super.aByte103, super.aByte104, super.aByte102 & 0xFF);
		}
		if (!this.aBoolean301) {
			this.method5924(local7, (byte) -127, local59, local91, local62, local11, arg1);
		}
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!wq;Z)V")
	public void method4091(@OriginalArg(0) Class5_Sub36 arg0) {
		arg0.anInt8456 = 0;
		@Pc(12) int local12 = arg0.method7291();
		this.aByte67 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean305;
		this.aBoolean305 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method5932();
		this.method5931((local12 >> 3 & 0x7) + 1);
		this.aByte66 = (byte) (local12 >> 6 & 0x3);
		super.anInt9805 += this.method5932() - local44 << 8;
		super.anInt9803 += this.method5932() - local44 << 8;
		this.aByte68 = arg0.method7318();
		this.anInt4564 = arg0.method7318();
		this.anInt4542 = arg0.method7318();
		this.aBoolean300 = arg0.method7318() == 1;
		if (Static387.aClass242_8 == Static670.aClass242_7 && Static296.anInt5190 >= 2) {
			this.aBoolean300 = false;
		}
		@Pc(140) int local140 = -1;
		this.anInt4548 = 0;
		@Pc(148) int[] local148 = new int[Static87.aClass133_1.anIntArray159.length];
		@Pc(153) Class192[] local153 = new Class192[Static87.aClass133_1.anIntArray159.length];
		@Pc(158) Class246[] local158 = new Class246[Static87.aClass133_1.anIntArray159.length];
		@Pc(176) int local176;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(247) int local247;
		for (@Pc(160) int local160 = 0; local160 < Static87.aClass133_1.anIntArray159.length; local160++) {
			if (Static87.aClass133_1.anIntArray159[local160] != 1) {
				local176 = arg0.method7291();
				if (local176 == 0) {
					local148[local160] = 0;
				} else {
					local190 = arg0.method7291();
					local196 = (local176 << 8) + local190;
					if (local160 == 0 && local196 == 65535) {
						local140 = arg0.method7333();
						this.anInt4548 = arg0.method7291();
						break;
					}
					if (local196 >= 32768) {
						local196 = Static557.anIntArray499[local196 - 32768];
						local148[local160] = local196 | 0x40000000;
						local158[local160] = Static82.aClass134_1.method3191(local196);
						local247 = local158[local160].anInt6515;
						if (local247 != 0) {
							this.anInt4548 = local247;
						}
					} else {
						local148[local160] = local196 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local140 == -1) {
			local176 = arg0.method7333();
			local190 = 0;
			for (local196 = 0; local196 < Static87.aClass133_1.anIntArray159.length; local196++) {
				if (Static87.aClass133_1.anIntArray159[local196] == 0) {
					if ((local176 & 0x1 << local190) != 0) {
						local153[local196] = Static617.method8470(local158[local196], arg0);
					}
					local190++;
				}
			}
		}
		@Pc(337) int[] local337 = new int[5];
		for (local190 = 0; local190 < 5; local190++) {
			local196 = arg0.method7291();
			if (Static467.aShortArrayArrayArray4.length < 1 || local196 < 0 || local196 >= Static467.aShortArrayArrayArray4[0][local190].length) {
				local196 = 0;
			}
			local337[local190] = local196;
		}
		this.anInt4556 = arg0.method7333();
		this.aString43 = arg0.method7281();
		this.aString44 = this.aString43;
		if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 == this) {
			Static177.aString31 = this.aString43;
		}
		this.anInt4565 = arg0.method7291();
		if (local40) {
			this.anInt4530 = arg0.method7333();
			if (this.anInt4530 == 65535) {
				this.anInt4530 = -1;
			}
			this.anInt4547 = this.anInt4565;
			this.anInt4532 = -1;
		} else {
			this.anInt4530 = 0;
			this.anInt4547 = arg0.method7291();
			this.anInt4532 = arg0.method7291();
			if (this.anInt4532 == 255) {
				this.anInt4532 = -1;
			}
		}
		local196 = this.anInt4545;
		this.anInt4545 = arg0.method7291();
		@Pc(491) int local491;
		if (this.anInt4545 == 0) {
			Static22.method358(this);
		} else {
			local247 = this.anInt4534;
			@Pc(488) int local488 = this.anInt4539;
			local491 = this.anInt4536;
			@Pc(494) int local494 = this.anInt4562;
			@Pc(497) int local497 = this.anInt4554;
			this.anInt4534 = arg0.method7333();
			this.anInt4539 = arg0.method7333();
			this.anInt4536 = arg0.method7333();
			this.anInt4562 = arg0.method7333();
			this.anInt4554 = arg0.method7291();
			if (local21 != this.aBoolean305 || local196 != this.anInt4545 || this.anInt4534 != local247 || local488 != this.anInt4539 || this.anInt4536 != local491 || this.anInt4562 != local494 || local497 != this.anInt4554) {
				Static353.method5199(this);
			}
		}
		if (this.aClass359_1 == null) {
			this.aClass359_1 = new Class359();
		}
		local247 = this.aClass359_1.anInt9559;
		@Pc(607) int[] local607 = this.aClass359_1.anIntArray536;
		this.aClass359_1.method8151(this.aByte67 == 1, local153, local337, local140, local148, this.method5934());
		if (local247 != local140) {
			super.anInt9805 = (super.anIntArray405[0] << 9) + (this.method5932() << 8);
			super.anInt9803 = (super.anIntArray404[0] << 9) + (this.method5932() << 8);
		}
		if (Static649.anInt10621 == super.anInt6843 && local607 != null) {
			for (local491 = 0; local491 < local337.length; local491++) {
				if (local337[local491] != local607[local491]) {
					Static82.aClass134_1.method3194();
					break;
				}
			}
		}
		if (super.aClass4_Sub9_6 != null) {
			super.aClass4_Sub9_6.method8045();
		}
		if (super.anInt6837 == -1 || !super.aBoolean456) {
			return;
		}
		@Pc(723) Class92 local723 = this.method5930();
		if (!local723.method1749(super.anInt6837)) {
			super.anInt6837 = -1;
			super.aBoolean456 = false;
			return;
		}
	}
}
