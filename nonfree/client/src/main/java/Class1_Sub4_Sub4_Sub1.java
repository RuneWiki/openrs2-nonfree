import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class1_Sub4_Sub4_Sub1 extends Class1_Sub4_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "Lclient!sr;")
	private Class308 aClass308_2;

	@OriginalMember(owner = "client!kn", name = "kb", descriptor = "S")
	private final short aShort75;

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!kn", name = "bb", descriptor = "Z")
	private boolean aBoolean429;

	@OriginalMember(owner = "client!kn", name = "U", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!kn", name = "S", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!kn", name = "pb", descriptor = "Lclient!ha;")
	private Class4_Sub5_Sub6 aClass4_Sub5_Sub6_2;

	@OriginalMember(owner = "client!kn", name = "jb", descriptor = "Lclient!da;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIZ)V")
	public Class1_Sub4_Sub4_Sub1(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt2933);
		this.aShort75 = (short) arg1.anInt2942;
		this.aBoolean428 = arg1.anInt2924 != 0 && !arg7;
		this.aByte63 = (byte) arg8;
		super.anInt9934 = arg4;
		this.aBoolean429 = arg9;
		this.aBoolean427 = arg7;
		super.anInt9935 = arg6;
		this.aBoolean426 = arg0.method4975() && arg1.aBoolean228 && !this.aBoolean427 && Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean429) {
			local60 |= 0x10000;
		}
		@Pc(75) Class99 local75 = this.method4813(local60, arg0, this.aBoolean426);
		if (local75 != null) {
			this.aClass4_Sub5_Sub6_2 = local75.aClass4_Sub5_Sub6_1;
			this.aClass57_2 = local75.aClass57_1;
			if (this.aBoolean429) {
				this.aClass57_2 = this.aClass57_2.method7912((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aClass57_2 == null ? false : this.aClass57_2.LA();
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return true;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return this.aBoolean429;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class57 local15 = this.method4814(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg0.method5007();
			local20.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local15.method7924(arg1, arg2, local20, false, Static6.anInt161) : local15.method7933(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		this.aBoolean429 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.SA(this.aClass57_2.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aShort75 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		@Pc(31) Class4_Sub5_Sub6 local31;
		if (this.aClass4_Sub5_Sub6_2 == null && this.aBoolean426) {
			@Pc(24) Class99 local24 = this.method4813(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass4_Sub5_Sub6_1;
		} else {
			local31 = this.aClass4_Sub5_Sub6_2;
			this.aClass4_Sub5_Sub6_2 = null;
		}
		if (local31 != null) {
			Static144.method2749(local31, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
		if (this.aClass57_2 != null) {
			this.aClass57_2.method7929();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return 22;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		if (!(arg4 instanceof Class1_Sub4_Sub4_Sub1)) {
			return;
		}
		@Pc(15) Class1_Sub4_Sub4_Sub1 local15 = (Class1_Sub4_Sub4_Sub1) arg4;
		if (this.aClass57_2 != null && local15.aClass57_2 != null) {
			this.aClass57_2.method7922(local15.aClass57_2, arg5, arg1, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass57_2 == null ? 0 : this.aClass57_2.J();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!r;Z)Lclient!fe;")
	private Class99 method4813(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class101 local13 = Static204.aClass139_8.method3309(this.aShort75 & 0xFFFF);
		@Pc(21) Class83 local21;
		@Pc(25) Class83 local25;
		if (this.aBoolean427) {
			local21 = Static183.aClass83Array6[super.aByte127];
			local25 = Static444.aClass83Array7[0];
		} else {
			local21 = Static444.aClass83Array7[super.aByte127];
			if (super.aByte127 >= 3) {
				local25 = null;
			} else {
				local25 = Static444.aClass83Array7[super.aByte127 + 1];
			}
		}
		return local13.method2715(super.anInt9935, arg1, 22, local25, arg0, arg2, super.anInt9934, super.anInt9932, this.aByte63, local21);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		if (this.aClass308_2 == null) {
			this.aClass308_2 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, this.method4814(arg0, 0));
		}
		return this.aClass308_2;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		@Pc(25) Class4_Sub5_Sub6 local25;
		if (this.aClass4_Sub5_Sub6_2 == null && this.aBoolean426) {
			@Pc(18) Class99 local18 = this.method4813(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass4_Sub5_Sub6_1;
		} else {
			local25 = this.aClass4_Sub5_Sub6_2;
			this.aClass4_Sub5_Sub6_2 = null;
		}
		if (local25 != null) {
			Static456.method6974(local25, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.method7829();
		}
		return this.aClass57_2 == null ? 0 : this.aClass57_2.RA();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class57 method4814(@OriginalArg(1) Class44 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_2 != null && arg0.method5010(this.aClass57_2.PA(), arg1) == 0) {
			return this.aClass57_2;
		} else {
			@Pc(23) Class99 local23 = this.method4813(arg1, arg0, false);
			return local23 == null ? null : local23.aClass57_1;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass57_2 == null) {
			return null;
		}
		@Pc(18) Class8 local18 = arg0.method5007();
		local18.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(28) Class1_Sub8 local28 = null;
		if (this.aBoolean428) {
			local28 = Static361.method5833(1);
		}
		if (Static361.aBoolean500) {
			this.aClass57_2.method7919(local18, local28 == null ? null : local28.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			this.aClass57_2.method7927(local18, local28 == null ? null : local28.aClass1_Sub9Array1[0], 0);
		}
		return local28;
	}
}
