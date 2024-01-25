import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class125 implements Interface2 {

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!li;")
	private final Class199 aClass199_3 = new Class199(256);

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_47;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!jo;")
	private final Class168 aClass168_48;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	private final int anInt4067;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[Lclient!td;")
	private final Class296[] aClass296Array1;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!jo;Lclient!jo;Lclient!jo;)V")
	public Class125(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_47 = arg2;
		this.aClass168_48 = arg1;
		@Pc(24) Class6_Sub26 local24 = new Class6_Sub26(arg0.method4435(0, 0));
		this.anInt4067 = local24.method4999();
		this.aClass296Array1 = new Class296[this.anInt4067];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4067; local36++) {
			if (local24.method4966() == 1) {
				this.aClass296Array1[local36] = new Class296();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt4067; local61++) {
			if (this.aClass296Array1[local61] != null) {
				this.aClass296Array1[local61].aBoolean656 = local24.method4966() == 0;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt4067; local94++) {
			if (this.aClass296Array1[local94] != null) {
				this.aClass296Array1[local94].aBoolean652 = local24.method4966() == 1;
			}
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt4067; local127++) {
			if (this.aClass296Array1[local127] != null) {
				this.aClass296Array1[local127].aBoolean661 = local24.method4966() == 1;
			}
		}
		for (@Pc(158) int local158 = 0; local158 < this.anInt4067; local158++) {
			if (this.aClass296Array1[local158] != null) {
				this.aClass296Array1[local158].aBoolean660 = local24.method4966() == 1;
			}
		}
		for (@Pc(191) int local191 = 0; local191 < this.anInt4067; local191++) {
			if (this.aClass296Array1[local191] != null) {
				this.aClass296Array1[local191].aByte101 = local24.method4972();
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt4067; local217++) {
			if (this.aClass296Array1[local217] != null) {
				this.aClass296Array1[local217].aByte103 = local24.method4972();
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.anInt4067; local239++) {
			if (this.aClass296Array1[local239] != null) {
				this.aClass296Array1[local239].aByte104 = local24.method4972();
			}
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt4067; local265++) {
			if (this.aClass296Array1[local265] != null) {
				this.aClass296Array1[local265].aByte102 = local24.method4972();
			}
		}
		for (@Pc(291) int local291 = 0; local291 < this.anInt4067; local291++) {
			if (this.aClass296Array1[local291] != null) {
				this.aClass296Array1[local291].aShort125 = (short) local24.method4999();
			}
		}
		for (@Pc(314) int local314 = 0; local314 < this.anInt4067; local314++) {
			if (this.aClass296Array1[local314] != null) {
				this.aClass296Array1[local314].aByte105 = local24.method4972();
			}
		}
		for (@Pc(340) int local340 = 0; local340 < this.anInt4067; local340++) {
			if (this.aClass296Array1[local340] != null) {
				this.aClass296Array1[local340].aByte107 = local24.method4972();
			}
		}
		for (@Pc(362) int local362 = 0; local362 < this.anInt4067; local362++) {
			if (this.aClass296Array1[local362] != null) {
				this.aClass296Array1[local362].aBoolean654 = local24.method4966() == 1;
			}
		}
		for (@Pc(393) int local393 = 0; local393 < this.anInt4067; local393++) {
			if (this.aClass296Array1[local393] != null) {
				this.aClass296Array1[local393].aBoolean657 = local24.method4966() == 1;
			}
		}
		for (@Pc(426) int local426 = 0; local426 < this.anInt4067; local426++) {
			if (this.aClass296Array1[local426] != null) {
				this.aClass296Array1[local426].aByte106 = local24.method4972();
			}
		}
		for (@Pc(448) int local448 = 0; local448 < this.anInt4067; local448++) {
			if (this.aClass296Array1[local448] != null) {
				this.aClass296Array1[local448].aBoolean658 = local24.method4966() == 1;
			}
		}
		for (@Pc(479) int local479 = 0; local479 < this.anInt4067; local479++) {
			if (this.aClass296Array1[local479] != null) {
				this.aClass296Array1[local479].aBoolean655 = local24.method4966() == 1;
			}
		}
		for (@Pc(508) int local508 = 0; local508 < this.anInt4067; local508++) {
			if (this.aClass296Array1[local508] != null) {
				this.aClass296Array1[local508].aBoolean653 = local24.method4966() == 1;
			}
		}
		for (@Pc(541) int local541 = 0; local541 < this.anInt4067; local541++) {
			if (this.aClass296Array1[local541] != null) {
				this.aClass296Array1[local541].anInt8779 = local24.method4966();
			}
		}
		for (@Pc(567) int local567 = 0; local567 < this.anInt4067; local567++) {
			if (this.aClass296Array1[local567] != null) {
				this.aClass296Array1[local567].anInt8778 = local24.method5000();
			}
		}
		for (@Pc(589) int local589 = 0; local589 < this.anInt4067; local589++) {
			if (this.aClass296Array1[local589] != null) {
				this.aClass296Array1[local589].aBoolean659 = local24.method4966() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3583(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub4_Sub11 local8 = this.method3590(arg0);
		return local8 != null && local8.method5765(this, this.aClass168_47);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IFIZIZ)[I")
	@Override
	public int[] method3581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method3590(arg0).method5770((double) arg1, this.aClass296Array1[arg0].aBoolean657, this.aClass168_47, arg2, this, arg3);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Lclient!td;")
	@Override
	public Class296 method3585(@OriginalArg(1) int arg0) {
		return this.aClass296Array1[arg0];
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)Lclient!nv;")
	private Class6_Sub4_Sub11 method3590(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub4 local10 = this.aClass199_3.method4863((long) arg0);
		if (local10 != null) {
			return (Class6_Sub4_Sub11) local10;
		}
		@Pc(26) byte[] local26 = this.aClass168_48.method4438(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class6_Sub4_Sub11 local38 = new Class6_Sub4_Sub11(new Class6_Sub26(local26));
			this.aClass199_3.method4858(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)I")
	@Override
	public int method3584() {
		return this.anInt4067;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZFBIII)[F")
	@Override
	public float[] method3586(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method3590(arg1).method5766(this.aClass296Array1[arg1].aBoolean657, arg3, arg2, this, this.aClass168_47);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(FIZIII)[I")
	@Override
	public int[] method3582(@OriginalArg(0) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3590(arg3).method5767((double) arg0, arg1, arg2, this, arg4, this.aClass168_47, this.aClass296Array1[arg3].aBoolean657);
	}
}
