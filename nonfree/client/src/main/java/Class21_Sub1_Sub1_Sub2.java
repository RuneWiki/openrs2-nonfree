import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class21_Sub1_Sub1_Sub2 extends Class21_Sub1_Sub1 {

	@OriginalMember(owner = "client!iq", name = "cb", descriptor = "Lclient!hda;")
	private Class21_Sub5 aClass21_Sub5_5;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
	private int anInt4719 = 0;

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
	private int anInt4713 = 0;

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
	private final int anInt4717 = -1;

	@OriginalMember(owner = "client!iq", name = "eb", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
	private int anInt4714 = 0;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	private int anInt4718 = 0;

	@OriginalMember(owner = "client!iq", name = "ib", descriptor = "Z")
	private boolean aBoolean317 = false;

	@OriginalMember(owner = "client!iq", name = "hb", descriptor = "I")
	private int anInt4734 = 0;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "I")
	private final int anInt4724;

	@OriginalMember(owner = "client!iq", name = "kb", descriptor = "I")
	public final int anInt4736;

	@OriginalMember(owner = "client!iq", name = "gb", descriptor = "Lclient!fo;")
	private Class111 aClass111_2;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class21_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4724 = arg0;
		this.anInt4736 = arg1 + arg2;
		this.anInt4713 = arg12;
		@Pc(53) Class49 local53 = Static342.aClass132_2.method2958(this.anInt4724);
		@Pc(56) int local56 = local53.anInt1459;
		if (local56 == -1) {
			this.aBoolean316 = true;
		} else {
			this.aClass111_2 = Static17.aClass254_1.method5936(local56);
			this.aBoolean316 = false;
		}
		if (arg2 == this.anInt4736) {
			Static593.method8263(this.anInt4734, this, this.aClass111_2);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
	public void method3673(@OriginalArg(1) int arg0) {
		if (this.aBoolean316) {
			return;
		}
		this.anInt4714 += arg0;
		while (this.anInt4714 > this.aClass111_2.anIntArray150[this.anInt4734]) {
			this.anInt4714 -= this.aClass111_2.anIntArray150[this.anInt4734];
			this.anInt4734++;
			if (this.anInt4734 >= this.aClass111_2.anIntArray153.length) {
				this.aBoolean316 = true;
				break;
			}
		}
		if (!this.aBoolean316) {
			Static593.method8263(this.anInt4734, this, this.aClass111_2);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!da;Lclient!r;Lclient!q;)V")
	private void method3674(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class81 arg2) {
		arg0.method7665(arg2);
		@Pc(9) Class190[] local9 = arg0.method7675();
		@Pc(12) Class52[] local12 = arg0.method7688();
		if ((this.aClass21_Sub5_5 == null || this.aClass21_Sub5_5.aBoolean281) && (local9 != null || local12 != null)) {
			this.aClass21_Sub5_5 = Static185.method3047(Static306.anInt6122, true);
		}
		if (this.aClass21_Sub5_5 != null) {
			this.aClass21_Sub5_5.method3046(arg1, (long) Static306.anInt6122, local9, local12);
			this.aClass21_Sub5_5.method3054(super.aByte127, super.aShort119, super.aShort120, super.aShort121, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub5_5 != null) {
			this.aClass21_Sub5_5.method3051();
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		@Pc(17) Class65 local17 = this.method3676(this.anInt4724, 0, arg0);
		if (local17 != null) {
			@Pc(22) Class81 local22 = arg0.method7812();
			local22.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			this.method3674(local17, arg0, local22);
		}
	}

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 > -102) {
			this.anInt4719 = -50;
		}
		return this.anInt4718;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILclient!r;)Lclient!da;")
	private Class65 method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(15) Class49 local15 = Static342.aClass132_2.method2958(arg0);
		@Pc(20) Class115 local20 = Static432.aClass115Array3[super.aByte127];
		@Pc(35) Class115 local35 = super.aByte128 >= 3 ? null : Static432.aClass115Array3[super.aByte128 + 1];
		return this.aBoolean316 ? local15.method1284(super.anInt10554, 0, local20, local35, -1, super.anInt10550, Static17.aClass254_1, -1, super.anInt10551, arg2, arg1) : local15.method1284(super.anInt10554, this.anInt4714, local20, local35, this.anInt4734, super.anInt10550, Static17.aClass254_1, this.anInt4717, super.anInt10551, arg2, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.anInt4719;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(23) Class65 local23 = this.method3676(this.anInt4724, (this.anInt4713 == 0 ? 0 : 5) | 0x800, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt4713 != 0) {
			local23.M(this.anInt4713 * 2048);
		}
		@Pc(42) Class81 local42 = arg0.method7812();
		local42.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		this.method3674(local23, arg0, local42);
		if (Static263.aBoolean371) {
			local23.method7686(local42, null, Static18.anInt941, 0);
		} else {
			local23.method7679(local42, null, 0);
		}
		if (this.aClass21_Sub5_5 != null) {
			@Pc(78) Class276 local78 = this.aClass21_Sub5_5.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local78, Static18.anInt941);
			} else {
				arg0.method7777(local78);
			}
		}
		this.aBoolean317 = local23.LA();
		this.anInt4719 = local23.J();
		this.anInt4718 = local23.RA();
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	public void method3677() {
		if (this.aClass21_Sub5_5 != null) {
			this.aClass21_Sub5_5.method3051();
		}
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean317;
	}
}
