import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class9_Sub2_Sub1_Sub4 extends Class9_Sub2_Sub1 {

	@OriginalMember(owner = "client!io", name = "mb", descriptor = "Lclient!nha;")
	private Class9_Sub8 aClass9_Sub8_5;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "I")
	private int anInt4864 = 0;

	@OriginalMember(owner = "client!io", name = "Y", descriptor = "I")
	private int anInt4871 = 0;

	@OriginalMember(owner = "client!io", name = "V", descriptor = "I")
	private final int anInt4869 = -1;

	@OriginalMember(owner = "client!io", name = "bb", descriptor = "I")
	private int anInt4874 = 0;

	@OriginalMember(owner = "client!io", name = "X", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!io", name = "qb", descriptor = "I")
	private int anInt4886 = 0;

	@OriginalMember(owner = "client!io", name = "sb", descriptor = "I")
	private int anInt4887 = 0;

	@OriginalMember(owner = "client!io", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!io", name = "R", descriptor = "I")
	public final int anInt4866;

	@OriginalMember(owner = "client!io", name = "rb", descriptor = "Lclient!pia;")
	private Class267 aClass267_2;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class9_Sub2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.lb = arg0;
		this.anInt4886 = arg12;
		this.anInt4866 = arg2 + arg1;
		@Pc(53) Class207 local53 = Static266.aClass135_1.method3108(this.lb);
		@Pc(56) int local56 = local53.anInt6225;
		if (local56 == -1) {
			this.aBoolean355 = true;
		} else {
			this.aClass267_2 = Static474.aClass264_2.method6574(local56);
			this.aBoolean355 = false;
		}
		if (arg2 == this.anInt4866) {
			Static522.method7586(this.anInt4887, this, this.aClass267_2);
		}
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!ha;B)Lclient!ka;")
	private Class75 method4162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		@Pc(8) Class207 local8 = Static266.aClass135_1.method3108(arg0);
		@Pc(19) Class91 local19 = Static518.aClass91Array2[super.aByte127];
		@Pc(32) Class91 local32 = super.aByte128 < 3 ? Static518.aClass91Array2[super.aByte128 + 1] : null;
		return this.aBoolean355 ? local8.method5372(super.anInt10158, arg1, -1, Static474.aClass264_2, super.anInt10152, -1, super.anInt10154, local32, arg2, local19, 0) : local8.method5372(super.anInt10158, arg1, this.anInt4887, Static474.aClass264_2, super.anInt10152, this.anInt4869, super.anInt10154, local32, arg2, local19, this.anInt4864);
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean354;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method4163(@OriginalArg(1) int arg0) {
		if (this.aBoolean355) {
			return;
		}
		this.anInt4864 += arg0;
		while (this.anInt4864 > this.aClass267_2.anIntArray456[this.anInt4887]) {
			this.anInt4864 -= this.aClass267_2.anIntArray456[this.anInt4887];
			this.anInt4887++;
			if (this.anInt4887 >= this.aClass267_2.anIntArray458.length) {
				this.aBoolean355 = true;
				break;
			}
		}
		if (!this.aBoolean355) {
			Static522.method7586(this.anInt4887, this, this.aClass267_2);
		}
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.anInt4874;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		@Pc(17) Class75 local17 = this.method4162(this.lb, 0, arg0);
		if (local17 != null) {
			@Pc(22) Class31 local22 = arg0.method6125();
			local22.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			this.method4165(local17, local22, arg0);
		}
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub8_5 != null) {
			this.aClass9_Sub8_5.method5945();
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.method8597();
		}
		return this.anInt4871;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V")
	public void method4164() {
		if (this.aClass9_Sub8_5 != null) {
			this.aClass9_Sub8_5.method5945();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ka;ZLclient!ih;Lclient!ha;)V")
	private void method4165(@OriginalArg(0) Class75 arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) Class82 arg2) {
		arg0.method6797(arg1);
		@Pc(19) Class228[] local19 = arg0.method6794();
		@Pc(22) Class232[] local22 = arg0.method6801();
		if ((this.aClass9_Sub8_5 == null || this.aClass9_Sub8_5.aBoolean493) && (local19 != null || local22 != null)) {
			this.aClass9_Sub8_5 = Static375.method5938(Static304.anInt8391, true);
		}
		if (this.aClass9_Sub8_5 != null) {
			this.aClass9_Sub8_5.method5936(arg2, (long) Static304.anInt8391, local19, local22);
			this.aClass9_Sub8_5.method5946(super.aByte127, super.aShort126, super.aShort127, super.aShort124, super.aShort125);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(23) Class75 local23 = this.method4162(this.lb, (this.anInt4886 == 0 ? 0 : 5) | 0x800, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt4886 != 0) {
			local23.a(this.anInt4886 * 2048);
		}
		@Pc(39) Class31 local39 = arg0.method6125();
		local39.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		this.method4165(local23, local39, arg0);
		@Pc(58) Class9_Sub10 local58 = Static635.method8548(1, false);
		if (Static40.aBoolean34) {
			local23.method6788(local39, local58.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			local23.method6799(local39, local58.aClass9_Sub5Array1[0], 0);
		}
		if (this.aClass9_Sub8_5 != null) {
			@Pc(86) Class162 local86 = this.aClass9_Sub8_5.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local86, Static562.anInt9327);
			} else {
				arg0.method6161(local86);
			}
		}
		this.aBoolean354 = local23.F();
		this.anInt4874 = local23.fa();
		this.anInt4871 = local23.ma();
		return local58;
	}
}
