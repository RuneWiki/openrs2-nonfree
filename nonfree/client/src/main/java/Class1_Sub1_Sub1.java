import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
	public static final int[] anIntArray441 = new int[32];

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "S")
	private final short aShort30;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Z")
	private final boolean aBoolean172;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!n;")
	public Class66 aClass66_3;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!dh;")
	private Class2_Sub10_Sub3 aClass2_Sub10_Sub3_3;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray441[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIZIIZ)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static142.method2675(arg7, arg8));
		this.aByte16 = (byte) arg7;
		this.aBoolean171 = arg9;
		this.aShort30 = (short) arg1.anInt4131;
		this.aBoolean170 = arg6;
		this.aByte14 = (byte) arg8;
		this.aBoolean169 = arg1.anInt4140 != 0 && !arg6;
		super.anInt6597 = (short) arg3;
		this.aByte15 = (byte) arg2;
		super.anInt6596 = (short) arg5;
		this.aBoolean172 = arg0.method2036() && arg1.aBoolean319 && !this.aBoolean170 && Static202.anInt3721 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean171) {
			local70 |= 0x8000;
		}
		@Pc(85) Class37 local85 = this.method2211(this.aBoolean172, local70, arg0);
		if (local85 != null) {
			this.aClass66_3 = local85.aClass66_2;
			this.aClass2_Sub10_Sub3_3 = local85.aClass2_Sub10_Sub3_2;
			if (this.aBoolean171) {
				this.aClass66_3 = this.aClass66_3.method5119((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return this.aBoolean171;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass66_3 == null) {
			return null;
		}
		@Pc(11) Class44 local11 = arg0.method2024();
		local11.method3541(super.anInt6597, super.anInt6595, super.anInt6596);
		@Pc(21) Class10_Sub3 local21 = null;
		if (this.aBoolean169) {
			local21 = Static299.method4461(1);
		}
		this.aClass66_3.method5126(local11, local21 == null ? null : local21.aClass10_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub1_Sub1) {
			@Pc(10) Class1_Sub1_Sub1 local10 = (Class1_Sub1_Sub1) arg4;
			if (this.aClass66_3 != null && local10.aClass66_3 != null) {
				this.aClass66_3.method5125(local10.aClass66_3, arg2, arg5, arg3, arg0);
			}
		} else if (arg4 instanceof Class1_Sub5_Sub4) {
			@Pc(33) Class1_Sub5_Sub4 local33 = (Class1_Sub5_Sub4) arg4;
			if (this.aClass66_3 != null && local33.aClass66_6 != null) {
				this.aClass66_3.method5125(local33.aClass66_6, arg2, arg5, arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZILclient!vc;)Lclient!co;")
	private Class37 method2211(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(18) Class172 local18 = Static221.aClass118_6.method2858(this.aShort30 & 0xFFFF);
		@Pc(43) Class107 local43;
		@Pc(29) Class107 local29;
		if (this.aBoolean170) {
			local29 = Static90.aClass107Array1[0];
			local43 = Static94.aClass107Array2[this.aByte15];
		} else {
			if (this.aByte15 >= 3) {
				local29 = null;
			} else {
				local29 = Static90.aClass107Array1[this.aByte15 + 1];
			}
			local43 = Static90.aClass107Array1[this.aByte15];
		}
		return local18.method3787(super.anInt6596, local29, arg0, this.aByte14, arg1, arg2, super.anInt6597, this.aByte16, super.anInt6595, local43);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!vc;I)Lclient!n;")
	private Class66 method2212(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass66_3 != null && arg0.method2051(this.aClass66_3.method5127(), arg1) == 0) {
			return this.aClass66_3;
		} else {
			@Pc(31) Class37 local31 = this.method2211(false, arg1, arg0);
			return local31 == null ? null : local31.aClass66_2;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		this.aBoolean171 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.method5118(this.aClass66_3.method5127() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.method2212(arg1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class66 local9 = this.method2212(arg0, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class44 local19 = arg0.method2024();
			local19.method3541(super.anInt6597, super.anInt6595, super.anInt6596);
			return local9.method5131(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		@Pc(20) Class2_Sub10_Sub3 local20;
		if (this.aClass2_Sub10_Sub3_3 == null && this.aBoolean172) {
			@Pc(31) Class37 local31 = this.method2211(true, 131072, arg0);
			local20 = local31 == null ? null : local31.aClass2_Sub10_Sub3_2;
		} else {
			local20 = this.aClass2_Sub10_Sub3_3;
			this.aClass2_Sub10_Sub3_3 = null;
		}
		if (local20 != null) {
			Static43.method733(local20, this.aByte15, super.anInt6597, super.anInt6596, null);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aShort30 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aBoolean172;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
		if (this.aClass66_3 != null) {
			this.aClass66_3.method5150();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		@Pc(25) Class2_Sub10_Sub3 local25;
		if (this.aClass2_Sub10_Sub3_3 == null && this.aBoolean172) {
			@Pc(18) Class37 local18 = this.method2211(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub10_Sub3_2;
		} else {
			local25 = this.aClass2_Sub10_Sub3_3;
			this.aClass2_Sub10_Sub3_3 = null;
		}
		if (local25 != null) {
			Static258.method4008(local25, this.aByte15, super.anInt6597, super.anInt6596, null);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}
}
