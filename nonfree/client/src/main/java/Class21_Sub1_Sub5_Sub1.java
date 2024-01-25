import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class21_Sub1_Sub5_Sub1 extends Class21_Sub1_Sub5 implements Interface21 {

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Lclient!eh;")
	private Class93 aClass93_6;

	@OriginalMember(owner = "client!nb", name = "db", descriptor = "S")
	private final short aShort84;

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "Z")
	private final boolean aBoolean447;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!nb", name = "cb", descriptor = "Z")
	private final boolean aBoolean449;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "Lclient!da;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lclient!ha;")
	private Class4_Sub6_Sub7 aClass4_Sub6_Sub7_5;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIZ)V")
	public Class21_Sub1_Sub5_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt6683);
		this.aShort84 = (short) arg1.anInt6713;
		this.aBoolean447 = arg1.anInt6681 != 0 && !arg7;
		this.aByte103 = (byte) arg8;
		this.aBoolean446 = arg9;
		this.aBoolean448 = arg7;
		super.anInt10551 = arg4;
		super.anInt10550 = arg6;
		this.aBoolean449 = arg0.method7782() && arg1.aBoolean466 && !this.aBoolean448 && Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean446) {
			local66 |= 0x10000;
		}
		@Pc(81) Class108 local81 = this.method5230(local66, arg0, this.aBoolean449);
		if (local81 != null) {
			this.aClass65_6 = local81.aClass65_2;
			this.aClass4_Sub6_Sub7_5 = local81.aClass4_Sub6_Sub7_2;
			if (this.aBoolean446) {
				this.aClass65_6 = this.aClass65_6.method7682((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aClass65_6 == null ? false : this.aClass65_6.LA();
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return this.aBoolean446;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aShort84 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class21_Sub1_Sub5_Sub1) {
			@Pc(9) Class21_Sub1_Sub5_Sub1 local9 = (Class21_Sub1_Sub5_Sub1) arg0;
			if (this.aClass65_6 != null && local9.aClass65_6 != null) {
				this.aClass65_6.method7677(local9.aClass65_6, arg1, arg4, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aByte103;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		if (this.aClass93_6 == null) {
			this.aClass93_6 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, this.method5231(0, arg0));
		}
		return this.aClass93_6;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
		if (this.aClass65_6 != null) {
			this.aClass65_6.method7676();
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		@Pc(21) Class4_Sub6_Sub7 local21;
		if (this.aClass4_Sub6_Sub7_5 == null && this.aBoolean449) {
			@Pc(32) Class108 local32 = this.method5230(262144, arg0, true);
			local21 = local32 == null ? null : local32.aClass4_Sub6_Sub7_2;
		} else {
			local21 = this.aClass4_Sub6_Sub7_5;
			this.aClass4_Sub6_Sub7_5 = null;
		}
		if (local21 != null) {
			Static4.method1519(local21, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass65_6 == null) {
			return null;
		}
		@Pc(11) Class81 local11 = arg0.method7812();
		local11.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(21) Class21_Sub4 local21 = null;
		if (this.aBoolean447) {
			local21 = Static227.method3708(1);
		}
		if (Static263.aBoolean371) {
			this.aClass65_6.method7686(local11, local21 == null ? null : local21.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			this.aClass65_6.method7679(local11, local21 == null ? null : local21.aClass21_Sub7Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(17) Class65 local17 = this.method5231(131072, arg2);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class81 local22 = arg2.method7812();
			local22.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local17.method7685(arg0, arg1, local22, false, Static18.anInt941) : local17.method7684(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return 22;
	}

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		this.aBoolean446 = false;
		if (this.aClass65_6 != null) {
			this.aClass65_6.SA(this.aClass65_6.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!r;Z)Lclient!fj;")
	private Class108 method5230(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class233 local13 = Static103.aClass298_1.method6822(this.aShort84 & 0xFFFF);
		@Pc(21) Class115 local21;
		@Pc(25) Class115 local25;
		if (this.aBoolean448) {
			local21 = Static140.aClass115Array1[super.aByte128];
			local25 = Static432.aClass115Array3[0];
		} else {
			local21 = Static432.aClass115Array3[super.aByte128];
			if (super.aByte128 < 3) {
				local25 = Static432.aClass115Array3[super.aByte128 + 1];
			} else {
				local25 = null;
			}
		}
		return local13.method5286(local25, super.anInt10554, this.aByte103, arg1, 22, super.anInt10551, local21, arg0, arg2, super.anInt10550);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		@Pc(34) Class4_Sub6_Sub7 local34;
		if (this.aClass4_Sub6_Sub7_5 == null && this.aBoolean449) {
			@Pc(27) Class108 local27 = this.method5230(262144, arg0, true);
			local34 = local27 == null ? null : local27.aClass4_Sub6_Sub7_2;
		} else {
			local34 = this.aClass4_Sub6_Sub7_5;
			this.aClass4_Sub6_Sub7_5 = null;
		}
		if (local34 != null) {
			Static440.method6502(local34, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!r;B)Lclient!da;")
	private Class65 method5231(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		if (this.aClass65_6 != null && arg1.method7793(this.aClass65_6.PA(), arg0) == 0) {
			return this.aClass65_6;
		} else {
			@Pc(31) Class108 local31 = this.method5230(arg0, arg1, false);
			return local31 == null ? null : local31.aClass65_2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass65_6 == null ? 0 : this.aClass65_6.J();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 > -102) {
			this.method7284();
		}
		return this.aClass65_6 == null ? 0 : this.aClass65_6.RA();
	}
}
