import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class1_Sub4_Sub2_Sub3 extends Class1_Sub4_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!ufa", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ufa", name = "tb", descriptor = "Lclient!sr;")
	private Class308 aClass308_7;

	@OriginalMember(owner = "client!ufa", name = "ib", descriptor = "Z")
	private boolean aBoolean670;

	@OriginalMember(owner = "client!ufa", name = "N", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!ufa", name = "R", descriptor = "B")
	private final byte aByte119;

	@OriginalMember(owner = "client!ufa", name = "Z", descriptor = "S")
	private final short aShort111;

	@OriginalMember(owner = "client!ufa", name = "T", descriptor = "Z")
	private final boolean aBoolean668;

	@OriginalMember(owner = "client!ufa", name = "kb", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!ufa", name = "eb", descriptor = "Z")
	private final boolean aBoolean669;

	@OriginalMember(owner = "client!ufa", name = "Q", descriptor = "Lclient!ha;")
	private Class4_Sub5_Sub6 aClass4_Sub5_Sub6_6;

	@OriginalMember(owner = "client!ufa", name = "U", descriptor = "Lclient!da;")
	public Class57 aClass57_6;

	static {
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			aRectangleArray2[local9] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIIIIIIZ)V")
	public Class1_Sub4_Sub2_Sub3(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2922 == 1, Static483.method7220(arg12, arg13));
		this.aBoolean670 = arg14;
		this.aBoolean667 = arg1.anInt2924 != 0 && !arg7;
		this.aByte119 = (byte) arg12;
		this.aShort111 = (short) arg1.anInt2942;
		this.aBoolean668 = arg7;
		super.aByte127 = (byte) arg3;
		this.aByte120 = (byte) arg13;
		this.aBoolean669 = arg0.method4975() && arg1.aBoolean228 && !this.aBoolean668 && Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean670) {
			local78 |= 0x10000;
		}
		@Pc(93) Class99 local93 = this.method7742(this.aBoolean669, local78, arg0);
		if (local93 != null) {
			this.aClass4_Sub5_Sub6_6 = local93.aClass4_Sub5_Sub6_1;
			this.aClass57_6 = local93.aClass57_1;
			if (this.aBoolean670) {
				this.aClass57_6 = this.aClass57_6.method7912((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class57 method7739(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		if (this.aClass57_6 != null && arg1.method5010(this.aClass57_6.PA(), arg0) == 0) {
			return this.aClass57_6;
		} else {
			@Pc(34) Class99 local34 = this.method7742(false, arg0, arg1);
			return local34 == null ? null : local34.aClass57_1;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aShort111 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		@Pc(32) Class4_Sub5_Sub6 local32;
		if (this.aClass4_Sub5_Sub6_6 == null && this.aBoolean669) {
			@Pc(25) Class99 local25 = this.method7742(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass4_Sub5_Sub6_1;
		} else {
			local32 = this.aClass4_Sub5_Sub6_6;
			this.aClass4_Sub5_Sub6_6 = null;
		}
		if (local32 != null) {
			Static144.method2749(local32, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass57_6 == null ? 0 : this.aClass57_6.J();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aByte120;
	}

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		this.aBoolean670 = false;
		if (this.aClass57_6 != null) {
			this.aClass57_6.SA(this.aClass57_6.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class57 local15 = this.method7739(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg0.method5007();
			local20.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local15.method7924(arg1, arg2, local20, false, Static6.anInt161) : local15.method7933(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
		if (this.aClass57_6 != null) {
			this.aClass57_6.method7929();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub4_Sub5_Sub2) {
			@Pc(28) Class1_Sub4_Sub5_Sub2 local28 = (Class1_Sub4_Sub5_Sub2) arg4;
			if (this.aClass57_6 != null && local28.aClass57_5 != null) {
				this.aClass57_6.method7922(local28.aClass57_5, arg5, arg1, arg0, arg2);
			}
		} else if (arg4 instanceof Class1_Sub4_Sub2_Sub3) {
			@Pc(8) Class1_Sub4_Sub2_Sub3 local8 = (Class1_Sub4_Sub2_Sub3) arg4;
			if (this.aClass57_6 != null && local8.aClass57_6 != null) {
				this.aClass57_6.method7922(local8.aClass57_6, arg5, arg1, arg0, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return true;
	}

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.method8114();
		}
		return this.aClass57_6 == null ? 0 : this.aClass57_6.RA();
	}

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "(B)I")
	public int method7741() {
		return this.aClass57_6 == null ? 15 : this.aClass57_6.K() / 4;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZILclient!r;B)Lclient!fe;")
	private Class99 method7742(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2) {
		@Pc(18) Class101 local18 = Static204.aClass139_8.method3309(this.aShort111 & 0xFFFF);
		@Pc(30) Class83 local30;
		@Pc(25) Class83 local25;
		if (this.aBoolean668) {
			local25 = Static444.aClass83Array7[0];
			local30 = Static183.aClass83Array6[super.aByte127];
		} else {
			if (super.aByte127 < 3) {
				local25 = Static444.aClass83Array7[super.aByte127 + 1];
			} else {
				local25 = null;
			}
			local30 = Static444.aClass83Array7[super.aByte127];
		}
		return local18.method2715(super.anInt9935, arg2, this.aByte119 == 11 ? 10 : this.aByte119, local25, arg1, arg0, super.anInt9934, super.anInt9932, this.aByte119 == 11 ? this.aByte120 + 4 : this.aByte120, local30);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass57_6 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5007();
		local11.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(26) Class1_Sub8 local26 = null;
		if (this.aBoolean667) {
			local26 = Static361.method5833(1);
		}
		if (Static361.aBoolean500) {
			this.aClass57_6.method7919(local11, local26 == null ? null : local26.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			this.aClass57_6.method7927(local11, local26 == null ? null : local26.aClass1_Sub9Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aBoolean669;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aByte119;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		@Pc(21) Class4_Sub5_Sub6 local21;
		if (this.aClass4_Sub5_Sub6_6 == null && this.aBoolean669) {
			@Pc(32) Class99 local32 = this.method7742(true, 262144, arg0);
			local21 = local32 == null ? null : local32.aClass4_Sub5_Sub6_1;
		} else {
			local21 = this.aClass4_Sub5_Sub6_6;
			this.aClass4_Sub5_Sub6_6 = null;
		}
		if (local21 != null) {
			Static456.method6974(local21, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aClass57_6 == null ? false : this.aClass57_6.LA();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		if (this.aClass308_7 == null) {
			this.aClass308_7 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, this.method7739(0, arg0));
		}
		return this.aClass308_7;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return this.aBoolean670;
	}
}
