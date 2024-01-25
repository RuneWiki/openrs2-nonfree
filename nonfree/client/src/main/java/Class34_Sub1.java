import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public int anInt2121;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public int anInt2122;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!gj", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class34 arg0) {
		@Pc(2) Class34_Sub1 local2 = (Class34_Sub1) arg0;
		this.anInt2118 = local2.anInt2118;
		this.anInt2123 = local2.anInt2123;
		this.anInt2122 = local2.anInt2122;
		this.anInt2126 = local2.anInt2126;
		this.anInt2124 = local2.anInt2124;
		this.anInt2127 = local2.anInt2127;
		this.anInt2125 = local2.anInt2125;
		this.anInt2117 = local2.anInt2117;
		this.anInt2116 = local2.anInt2116;
		this.anInt2121 = local2.anInt2121;
		this.anInt2119 = local2.anInt2119;
		this.anInt2120 = local2.anInt2120;
	}

	@OriginalMember(owner = "client!gj", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub29.anIntArray536[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub29.anIntArray537[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2124;
		@Pc(17) int local17 = this.anInt2127;
		@Pc(20) int local20 = this.anInt2125;
		@Pc(23) int local23 = this.anInt2117;
		this.anInt2124 = local14 * local5 - this.anInt2116 * local11 >> 15;
		this.anInt2116 = local14 * local11 + this.anInt2116 * local5 >> 15;
		this.anInt2127 = local17 * local5 - this.anInt2121 * local11 >> 15;
		this.anInt2121 = local17 * local11 + this.anInt2121 * local5 >> 15;
		this.anInt2125 = local20 * local5 - this.anInt2119 * local11 >> 15;
		this.anInt2119 = local20 * local11 + this.anInt2119 * local5 >> 15;
		this.anInt2117 = local23 * local5 - this.anInt2120 * local11 >> 15;
		this.anInt2120 = local23 * local11 + this.anInt2120 * local5 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class34 method4361() {
		@Pc(3) Class34_Sub1 local3 = new Class34_Sub1();
		local3.anInt2118 = this.anInt2118;
		local3.anInt2123 = this.anInt2123;
		local3.anInt2122 = this.anInt2122;
		local3.anInt2126 = this.anInt2126;
		local3.anInt2124 = this.anInt2124;
		local3.anInt2127 = this.anInt2127;
		local3.anInt2125 = this.anInt2125;
		local3.anInt2117 = this.anInt2117;
		local3.anInt2116 = this.anInt2116;
		local3.anInt2121 = this.anInt2121;
		local3.anInt2119 = this.anInt2119;
		local3.anInt2120 = this.anInt2120;
		return local3;
	}

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2126 += arg0;
		this.anInt2117 += arg1;
		this.anInt2120 += arg2;
	}

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2118 * arg0 + this.anInt2123 * arg1 + this.anInt2122 * arg2 >> 15;
		arg3[1] = this.anInt2124 * arg0 + this.anInt2127 * arg1 + this.anInt2125 * arg2 >> 15;
		arg3[2] = this.anInt2116 * arg0 + this.anInt2121 * arg1 + this.anInt2119 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt2119 = 32768;
		this.anInt2118 = this.anInt2127 = Class1_Sub29.anIntArray536[arg0 & 0x3FFF];
		this.anInt2124 = Class1_Sub29.anIntArray537[arg0 & 0x3FFF];
		this.anInt2123 = -this.anInt2124;
		this.anInt2122 = this.anInt2126 = this.anInt2125 = this.anInt2117 = this.anInt2116 = this.anInt2121 = this.anInt2120 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt2124 = this.anInt2116 = this.anInt2123 = this.anInt2121 = this.anInt2122 = this.anInt2125 = this.anInt2126 = this.anInt2117 = this.anInt2120 = 0;
		this.anInt2118 = this.anInt2127 = this.anInt2119 = 32768;
	}

	@OriginalMember(owner = "client!gj", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub29.anIntArray536[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub29.anIntArray537[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2118;
		@Pc(17) int local17 = this.anInt2123;
		@Pc(20) int local20 = this.anInt2122;
		@Pc(23) int local23 = this.anInt2126;
		this.anInt2118 = local14 * local5 + this.anInt2116 * local11 >> 15;
		this.anInt2116 = this.anInt2116 * local5 - local14 * local11 >> 15;
		this.anInt2123 = local17 * local5 + this.anInt2121 * local11 >> 15;
		this.anInt2121 = this.anInt2121 * local5 - local17 * local11 >> 15;
		this.anInt2122 = local20 * local5 + this.anInt2119 * local11 >> 15;
		this.anInt2119 = this.anInt2119 * local5 - local20 * local11 >> 15;
		this.anInt2126 = local23 * local5 + this.anInt2120 * local11 >> 15;
		this.anInt2120 = this.anInt2120 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2124 = this.anInt2116 = this.anInt2123 = this.anInt2121 = this.anInt2122 = this.anInt2125 = 0;
		this.anInt2118 = this.anInt2127 = this.anInt2119 = 32768;
		this.anInt2126 = arg0;
		this.anInt2117 = arg1;
		this.anInt2120 = arg2;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2126 + (this.anInt2118 * arg0 + this.anInt2123 * arg1 + this.anInt2122 * arg2 >> 15);
		arg3[1] = this.anInt2117 + (this.anInt2124 * arg0 + this.anInt2127 * arg1 + this.anInt2125 * arg2 >> 15);
		arg3[2] = this.anInt2120 + (this.anInt2116 * arg0 + this.anInt2121 * arg1 + this.anInt2119 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!gj", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2126;
		@Pc(13) int local13 = arg0[1] - this.anInt2117;
		@Pc(20) int local20 = arg0[2] - this.anInt2120;
		arg0[0] = this.anInt2118 * local6 + this.anInt2124 * local13 + this.anInt2116 * local20 >> 15;
		arg0[1] = this.anInt2123 * local6 + this.anInt2127 * local13 + this.anInt2121 * local20 >> 15;
		arg0[2] = this.anInt2122 * local6 + this.anInt2125 * local13 + this.anInt2119 * local20 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub29.anIntArray536[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub29.anIntArray537[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub29.anIntArray536[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub29.anIntArray537[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub29.anIntArray536[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub29.anIntArray537[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2118 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2124 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2116 = local23 * local5 >> 15;
		this.anInt2123 = local5 * local35 >> 15;
		this.anInt2127 = local5 * local29 >> 15;
		this.anInt2121 = -local11;
		this.anInt2122 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2125 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2119 = local17 * local5 >> 15;
		this.anInt2126 = -arg0 * this.anInt2118 - arg1 * this.anInt2123 - arg2 * this.anInt2122 >> 15;
		this.anInt2117 = -arg0 * this.anInt2124 - arg1 * this.anInt2127 - arg2 * this.anInt2125 >> 15;
		this.anInt2120 = -arg0 * this.anInt2116 - arg1 * this.anInt2121 - arg2 * this.anInt2119 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt2118 = 32768;
		this.anInt2127 = this.anInt2119 = Class1_Sub29.anIntArray536[arg0 & 0x3FFF];
		this.anInt2121 = Class1_Sub29.anIntArray537[arg0 & 0x3FFF];
		this.anInt2125 = -this.anInt2121;
		this.anInt2123 = this.anInt2122 = this.anInt2126 = this.anInt2124 = this.anInt2117 = this.anInt2116 = this.anInt2120 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt2127 = 32768;
		this.anInt2118 = this.anInt2119 = Class1_Sub29.anIntArray536[arg0 & 0x3FFF];
		this.anInt2122 = Class1_Sub29.anIntArray537[arg0 & 0x3FFF];
		this.anInt2116 = -this.anInt2122;
		this.anInt2123 = this.anInt2126 = this.anInt2124 = this.anInt2125 = this.anInt2117 = this.anInt2121 = this.anInt2120 = 0;
	}
}
