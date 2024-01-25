import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub4_Sub1_Sub2 extends Class1_Sub4_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!qj", name = "Z", descriptor = "Lclient!sr;")
	private Class308 aClass308_5;

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!qj", name = "eb", descriptor = "Z")
	private final boolean aBoolean556;

	@OriginalMember(owner = "client!qj", name = "ab", descriptor = "S")
	private final short aShort88;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!qj", name = "K", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!qj", name = "bb", descriptor = "Lclient!da;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!qj", name = "fb", descriptor = "Lclient!ha;")
	private Class4_Sub5_Sub6 aClass4_Sub5_Sub6_4;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIIII)V")
	public Class1_Sub4_Sub1_Sub2(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean555 = arg1.anInt2924 != 0 && !arg7;
		super.anInt9935 = arg6;
		this.aByte83 = (byte) arg11;
		this.aBoolean556 = arg7;
		this.aShort88 = (short) arg1.anInt2942;
		this.aByte84 = (byte) arg10;
		super.anInt9934 = arg4;
		this.aBoolean554 = arg0.method4975() && arg1.aBoolean228 && !this.aBoolean556 && Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) != 0;
		@Pc(70) Class99 local70 = this.method6705(2048, arg0, this.aBoolean554);
		if (local70 != null) {
			this.aClass57_4 = local70.aClass57_1;
			this.aClass4_Sub5_Sub6_4 = local70.aClass4_Sub5_Sub6_1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
		if (this.aClass57_4 != null) {
			this.aClass57_4.method7929();
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.method8116(null, 18, -32);
		}
		return this.aClass57_4 == null ? 0 : this.aClass57_4.RA();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!r;ZB)Lclient!fe;")
	private Class99 method6705(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class101 local13 = Static204.aClass139_8.method3309(this.aShort88 & 0xFFFF);
		@Pc(21) Class83 local21;
		@Pc(34) Class83 local34;
		if (this.aBoolean556) {
			local21 = Static183.aClass83Array6[super.aByte127];
			local34 = Static444.aClass83Array7[0];
		} else {
			local21 = Static444.aClass83Array7[super.aByte127];
			if (super.aByte127 < 3) {
				local34 = Static444.aClass83Array7[super.aByte127 + 1];
			} else {
				local34 = null;
			}
		}
		return local13.method2715(super.anInt9935, arg1, this.aByte84, local34, arg0, arg2, super.anInt9934, super.anInt9932, this.aByte83, local21);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		if (this.aClass308_5 == null) {
			this.aClass308_5 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, this.method6707(arg0, 0));
		}
		return this.aClass308_5;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass57_4 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5007();
		local11.NA(super.anInt9934 + super.aShort86, super.anInt9932, super.anInt9935 + super.aShort87);
		@Pc(28) Class1_Sub8 local28 = null;
		if (this.aBoolean555) {
			local28 = Static361.method5833(1);
		}
		if (Static361.aBoolean500) {
			this.aClass57_4.method7919(local11, local28 == null ? null : local28.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			this.aClass57_4.method7927(local11, local28 == null ? null : local28.aClass1_Sub9Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aShort88 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class57 method6707(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass57_4 != null && arg0.method5010(this.aClass57_4.PA(), arg1) == 0) {
			return this.aClass57_4;
		} else {
			@Pc(33) Class99 local33 = this.method6705(arg1, arg0, false);
			return local33 == null ? null : local33.aClass57_1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class57 local15 = this.method6707(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg0.method5007();
			local20.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local15.method7924(arg1, arg2, local20, false, Static6.anInt161) : local15.method7933(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aClass57_4 == null ? false : this.aClass57_4.LA();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aBoolean554;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		@Pc(31) Class4_Sub5_Sub6 local31;
		if (this.aClass4_Sub5_Sub6_4 == null && this.aBoolean554) {
			@Pc(24) Class99 local24 = this.method6705(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass4_Sub5_Sub6_1;
		} else {
			local31 = this.aClass4_Sub5_Sub6_4;
			this.aClass4_Sub5_Sub6_4 = null;
		}
		if (local31 != null) {
			Static144.method2749(local31, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass57_4 == null ? 0 : this.aClass57_4.J();
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		@Pc(14) Class4_Sub5_Sub6 local14;
		if (this.aClass4_Sub5_Sub6_4 == null && this.aBoolean554) {
			@Pc(25) Class99 local25 = this.method6705(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass4_Sub5_Sub6_1;
		} else {
			local14 = this.aClass4_Sub5_Sub6_4;
			this.aClass4_Sub5_Sub6_4 = null;
		}
		if (local14 != null) {
			Static456.method6974(local14, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}
}
