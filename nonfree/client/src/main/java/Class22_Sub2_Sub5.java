import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class22_Sub2_Sub5 extends Class22_Sub2 implements Interface1 {

	@OriginalMember(owner = "client!ua", name = "lb", descriptor = "Z")
	public static boolean lb = true;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "Z")
	private final boolean aBoolean437;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "S")
	private final short aShort85;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!ua", name = "sb", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Z")
	private final boolean aBoolean436;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!sj;")
	public Class31 aClass31_7;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "Lclient!ug;")
	private Class7_Sub1_Sub4 aClass7_Sub1_Sub4_6;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIIZIIIIIIZ)V")
	public Class22_Sub2_Sub5(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3524 == 1, Static301.method4877(arg12, arg13));
		this.aByte72 = (byte) arg12;
		this.aBoolean437 = arg1.anInt3560 != 0;
		this.aBoolean435 = arg7;
		this.aShort85 = (short) arg1.anInt3534;
		this.aByte70 = (byte) arg13;
		this.aBoolean438 = arg14;
		this.aByte71 = (byte) arg3;
		this.aBoolean436 = arg0.method5418() && arg1.aBoolean274 && !this.aBoolean435 && Static336.anInt4180 != 0;
		@Pc(72) int local72 = 1024;
		if (this.aBoolean438) {
			local72 |= 0x8000;
		}
		@Pc(87) Class104 local87 = this.method5076(local72, arg0, this.aBoolean436);
		if (local87 != null) {
			this.aClass31_7 = local87.aClass31_2;
			this.aClass7_Sub1_Sub4_6 = local87.aClass7_Sub1_Sub4_2;
			if (this.aBoolean438) {
				this.aClass31_7 = this.aClass31_7.method1917((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aBoolean436;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILclient!pe;)Lclient!sj;")
	private Class31 method5072(@OriginalArg(1) int arg0, @OriginalArg(2) Class89 arg1) {
		if (this.aClass31_7 != null && arg1.method5399(this.aClass31_7.method1912(), arg0) == 0) {
			return this.aClass31_7;
		} else {
			@Pc(27) Class104 local27 = this.method5076(arg0, arg1, false);
			return local27 == null ? null : local27.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)I")
	public int method5073() {
		return this.aClass31_7 == null ? 15 : this.aClass31_7.method1937() / 4;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return this.aClass31_7 == null ? 0 : this.aClass31_7.method1920();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		@Pc(25) Class7_Sub1_Sub4 local25;
		if (this.aClass7_Sub1_Sub4_6 == null && this.aBoolean436) {
			@Pc(18) Class104 local18 = this.method5076(131072, arg0, true);
			local25 = local18 == null ? null : local18.aClass7_Sub1_Sub4_2;
		} else {
			local25 = this.aClass7_Sub1_Sub4_6;
			this.aClass7_Sub1_Sub4_6 = null;
		}
		if (local25 != null) {
			Static86.method1826(local25, this.aByte71, super.anInt5973, super.anInt5967, null);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass31_7 == null) {
			return null;
		}
		@Pc(17) Class70 local17 = arg0.method5427();
		local17.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
		@Pc(27) Class36_Sub1 local27 = null;
		if (this.aBoolean437) {
			local27 = Static184.method3381(1);
		}
		this.aClass31_7.method1928(local17, local27 == null ? null : local27.aClass36_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.method5072(arg1, arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
		if (this.aClass31_7 != null) {
			this.aClass31_7.method1921();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		@Pc(25) Class7_Sub1_Sub4 local25;
		if (this.aClass7_Sub1_Sub4_6 == null && this.aBoolean436) {
			@Pc(18) Class104 local18 = this.method5076(131072, arg0, true);
			local25 = local18 == null ? null : local18.aClass7_Sub1_Sub4_2;
		} else {
			local25 = this.aClass7_Sub1_Sub4_6;
			this.aClass7_Sub1_Sub4_6 = null;
		}
		if (local25 != null) {
			Static33.method687(local25, this.aByte71, super.anInt5973, super.anInt5967, null);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!pe;ZZ)Lclient!il;")
	private Class104 method5076(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class122 local10 = Static245.method4227(this.aShort85 & 0xFFFF);
		@Pc(18) Class8 local18;
		@Pc(24) Class8 local24;
		if (this.aBoolean435) {
			local24 = Static136.aClass8Array3[0];
			local18 = Static251.aClass8Array6[this.aByte71];
		} else {
			local18 = Static136.aClass8Array3[this.aByte71];
			if (this.aByte71 >= 3) {
				local24 = null;
			} else {
				local24 = Static136.aClass8Array3[this.aByte71 + 1];
			}
		}
		return local10.method3229(super.anInt5967, this.aByte72 == 11 ? this.aByte70 + 4 : this.aByte70, arg2, arg1, local18, local24, this.aByte72 == 11 ? 10 : this.aByte72, super.anInt5968, arg0, super.anInt5973);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		this.aBoolean438 = false;
		if (this.aClass31_7 != null) {
			this.aClass31_7.method1908(this.aClass31_7.method1912() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class22_Sub4_Sub1) {
			@Pc(28) Class22_Sub4_Sub1 local28 = (Class22_Sub4_Sub1) arg1;
			if (this.aClass31_7 != null && local28.aClass31_1 != null) {
				this.aClass31_7.method1914(local28.aClass31_1, arg4, arg3, arg5, arg0);
			}
		} else if (arg1 instanceof Class22_Sub2_Sub5) {
			@Pc(8) Class22_Sub2_Sub5 local8 = (Class22_Sub2_Sub5) arg1;
			if (this.aClass31_7 != null && local8.aClass31_7 != null) {
				this.aClass31_7.method1914(local8.aClass31_7, arg4, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aShort85 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(9) Class31 local9 = this.method5072(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class70 local14 = arg2.method5427();
			local14.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
			return local9.method1932(arg1, arg0, local14, false);
		}
	}
}
