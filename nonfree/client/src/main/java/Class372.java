import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class372 implements Interface4 {

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!vj;")
	private final Class378 aClass378_6 = new Class378(256);

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!rg;")
	private final Class310 aClass310_125;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!rg;")
	private final Class310 aClass310_126;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	private final int anInt10505;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[Lclient!dba;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!rg;)V")
	public Class372(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_125 = arg2;
		this.aClass310_126 = arg1;
		@Pc(24) Class14_Sub21 local24 = new Class14_Sub21(arg0.method7803(0, 0));
		this.anInt10505 = local24.method7717(-1978450544);
		this.aClass69Array1 = new Class69[this.anInt10505];
		for (@Pc(36) int local36 = 0; local36 < this.anInt10505; local36++) {
			if (local24.method7695(103) == 1) {
				this.aClass69Array1[local36] = new Class69();
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt10505; local67++) {
			if (this.aClass69Array1[local67] != null) {
				this.aClass69Array1[local67].aBoolean110 = local24.method7695(105) == 0;
			}
		}
		for (@Pc(103) int local103 = 0; local103 < this.anInt10505; local103++) {
			if (this.aClass69Array1[local103] != null) {
				this.aClass69Array1[local103].aBoolean113 = local24.method7695(97) == 1;
			}
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt10505; local143++) {
			if (this.aClass69Array1[local143] != null) {
				this.aClass69Array1[local143].aBoolean114 = local24.method7695(116) == 1;
			}
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt10505; local181++) {
			if (this.aClass69Array1[local181] != null) {
				this.aClass69Array1[local181].aByte20 = local24.method7720();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < this.anInt10505; local213++) {
			if (this.aClass69Array1[local213] != null) {
				this.aClass69Array1[local213].aByte22 = local24.method7720();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < this.anInt10505; local241++) {
			if (this.aClass69Array1[local241] != null) {
				this.aClass69Array1[local241].aByte19 = local24.method7720();
			}
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt10505; local269++) {
			if (this.aClass69Array1[local269] != null) {
				this.aClass69Array1[local269].aByte18 = local24.method7720();
			}
		}
		for (@Pc(301) int local301 = 0; local301 < this.anInt10505; local301++) {
			if (this.aClass69Array1[local301] != null) {
				this.aClass69Array1[local301].aShort5 = (short) local24.method7717(-1978450544);
			}
		}
		for (@Pc(334) int local334 = 0; local334 < this.anInt10505; local334++) {
			if (this.aClass69Array1[local334] != null) {
				this.aClass69Array1[local334].aByte23 = local24.method7720();
			}
		}
		for (@Pc(362) int local362 = 0; local362 < this.anInt10505; local362++) {
			if (this.aClass69Array1[local362] != null) {
				this.aClass69Array1[local362].aByte24 = local24.method7720();
			}
		}
		for (@Pc(394) int local394 = 0; local394 < this.anInt10505; local394++) {
			if (this.aClass69Array1[local394] != null) {
				this.aClass69Array1[local394].aBoolean116 = local24.method7695(103) == 1;
			}
		}
		for (@Pc(430) int local430 = 0; local430 < this.anInt10505; local430++) {
			if (this.aClass69Array1[local430] != null) {
				this.aClass69Array1[local430].aBoolean111 = local24.method7695(108) == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < this.anInt10505; local466++) {
			if (this.aClass69Array1[local466] != null) {
				this.aClass69Array1[local466].aByte21 = local24.method7720();
			}
		}
		for (@Pc(494) int local494 = 0; local494 < this.anInt10505; local494++) {
			if (this.aClass69Array1[local494] != null) {
				this.aClass69Array1[local494].aBoolean112 = local24.method7695(122) == 1;
			}
		}
		for (@Pc(534) int local534 = 0; local534 < this.anInt10505; local534++) {
			if (this.aClass69Array1[local534] != null) {
				this.aClass69Array1[local534].aBoolean117 = local24.method7695(101) == 1;
			}
		}
		for (@Pc(570) int local570 = 0; local570 < this.anInt10505; local570++) {
			if (this.aClass69Array1[local570] != null) {
				this.aClass69Array1[local570].aBoolean115 = local24.method7695(106) == 1;
			}
		}
		for (@Pc(604) int local604 = 0; local604 < this.anInt10505; local604++) {
			if (this.aClass69Array1[local604] != null) {
				this.aClass69Array1[local604].anInt1680 = local24.method7695(110);
			}
		}
		for (@Pc(632) int local632 = 0; local632 < this.anInt10505; local632++) {
			if (this.aClass69Array1[local632] != null) {
				this.aClass69Array1[local632].anInt1677 = local24.method7748();
			}
		}
		for (@Pc(664) int local664 = 0; local664 < this.anInt10505; local664++) {
			if (this.aClass69Array1[local664] != null) {
				this.aClass69Array1[local664].anInt1679 = local24.method7695(119);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IFIIIZ)[F")
	@Override
	public float[] method8978(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8981(arg3).method8629(arg1, this.aClass310_125, this, arg2, this.aClass69Array1[arg3].aBoolean111);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8974(@OriginalArg(1) int arg0) {
		@Pc(8) Class14_Sub2_Sub21 local8 = this.method8981(arg0);
		return local8 != null && local8.method8628(this, this.aClass310_125);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lclient!dba;")
	@Override
	public Class69 method8975(@OriginalArg(0) int arg0) {
		return this.aClass69Array1[arg0];
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method8979(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method8981(arg2).method8632(this.aClass310_125, arg3, this, -16777216, arg0, (double) arg1, this.aClass69Array1[arg2].aBoolean111);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.anInt10505;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FIIIIZ)[I")
	@Override
	public int[] method8977(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method8981(arg1).method8630(this, arg4, this.aClass69Array1[arg1].aBoolean111, arg3, arg2, (double) arg0, this.aClass310_125);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)Lclient!uf;")
	private Class14_Sub2_Sub21 method8981(@OriginalArg(1) int arg0) {
		@Pc(16) Class14_Sub2 local16 = this.aClass378_6.method9082((long) arg0);
		if (local16 != null) {
			return (Class14_Sub2_Sub21) local16;
		}
		@Pc(28) byte[] local28 = this.aClass310_126.method7795(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(41) Class14_Sub2_Sub21 local41 = new Class14_Sub2_Sub21(new Class14_Sub21(local28));
			this.aClass378_6.method9078(local41, (long) arg0);
			return local41;
		}
	}
}
