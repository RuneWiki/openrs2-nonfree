import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	public int anInt160;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	public int anInt162;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	public int anInt163;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
	public int anInt164;

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	public Class8_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method8175() {
		@Pc(3) Class8_Sub1 local3 = new Class8_Sub1();
		local3.anInt169 = this.anInt169;
		local3.anInt163 = this.anInt163;
		local3.anInt168 = this.anInt168;
		local3.anInt161 = this.anInt161;
		local3.anInt160 = this.anInt160;
		local3.anInt164 = this.anInt164;
		local3.anInt165 = this.anInt165;
		local3.anInt170 = this.anInt170;
		local3.anInt167 = this.anInt167;
		local3.anInt171 = this.anInt171;
		local3.anInt166 = this.anInt166;
		local3.anInt162 = this.anInt162;
		return local3;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt164 = 16384;
		this.anInt169 = this.anInt166 = Class179.anIntArray757[arg0 & 0x3FFF];
		this.anInt168 = Class179.anIntArray756[arg0 & 0x3FFF];
		this.anInt167 = -this.anInt168;
		this.anInt163 = this.anInt161 = this.anInt160 = this.anInt165 = this.anInt170 = this.anInt171 = this.anInt162 = 0;
	}

	@OriginalMember(owner = "client!aea", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt169 = 16384;
		this.anInt164 = this.anInt166 = Class179.anIntArray757[arg0 & 0x3FFF];
		this.anInt171 = Class179.anIntArray756[arg0 & 0x3FFF];
		this.anInt165 = -this.anInt171;
		this.anInt163 = this.anInt168 = this.anInt161 = this.anInt160 = this.anInt170 = this.anInt167 = this.anInt162 = 0;
	}

	@OriginalMember(owner = "client!aea", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class179.anIntArray757[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class179.anIntArray756[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class179.anIntArray757[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class179.anIntArray756[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class179.anIntArray757[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class179.anIntArray756[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt169 = local17 * local29 + local23 * local47 >> 14;
		this.anInt160 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt167 = local23 * local5 >> 14;
		this.anInt163 = local5 * local35 >> 14;
		this.anInt164 = local5 * local29 >> 14;
		this.anInt171 = -local11;
		this.anInt168 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt165 = local23 * local35 + local17 * local41 >> 14;
		this.anInt166 = local17 * local5 >> 14;
		this.anInt161 = -arg0 * this.anInt169 - arg1 * this.anInt163 - arg2 * this.anInt168 >> 14;
		this.anInt170 = -arg0 * this.anInt160 - arg1 * this.anInt164 - arg2 * this.anInt165 >> 14;
		this.anInt162 = -arg0 * this.anInt167 - arg1 * this.anInt171 - arg2 * this.anInt166 >> 14;
	}

	@OriginalMember(owner = "client!aea", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt160 = this.anInt167 = this.anInt163 = this.anInt171 = this.anInt168 = this.anInt165 = 0;
		this.anInt169 = this.anInt164 = this.anInt166 = 16384;
		this.anInt161 = arg0;
		this.anInt170 = arg1;
		this.anInt162 = arg2;
	}

	@OriginalMember(owner = "client!aea", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class179.anIntArray757[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class179.anIntArray756[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt160;
		@Pc(17) int local17 = this.anInt164;
		@Pc(20) int local20 = this.anInt165;
		@Pc(23) int local23 = this.anInt170;
		this.anInt160 = local14 * local5 - this.anInt167 * local11 >> 14;
		this.anInt167 = local14 * local11 + this.anInt167 * local5 >> 14;
		this.anInt164 = local17 * local5 - this.anInt171 * local11 >> 14;
		this.anInt171 = local17 * local11 + this.anInt171 * local5 >> 14;
		this.anInt165 = local20 * local5 - this.anInt166 * local11 >> 14;
		this.anInt166 = local20 * local11 + this.anInt166 * local5 >> 14;
		this.anInt170 = local23 * local5 - this.anInt162 * local11 >> 14;
		this.anInt162 = local23 * local11 + this.anInt162 * local5 >> 14;
	}

	@OriginalMember(owner = "client!aea", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt169 * arg0 + this.anInt163 * arg1 + this.anInt168 * arg2 >> 14;
		arg3[1] = this.anInt160 * arg0 + this.anInt164 * arg1 + this.anInt165 * arg2 >> 14;
		arg3[2] = this.anInt167 * arg0 + this.anInt171 * arg1 + this.anInt166 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!aea", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt166 = 16384;
		this.anInt169 = this.anInt164 = Class179.anIntArray757[arg0 & 0x3FFF];
		this.anInt160 = Class179.anIntArray756[arg0 & 0x3FFF];
		this.anInt163 = -this.anInt160;
		this.anInt168 = this.anInt161 = this.anInt165 = this.anInt170 = this.anInt167 = this.anInt171 = this.anInt162 = 0;
	}

	@OriginalMember(owner = "client!aea", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt160 = this.anInt167 = this.anInt163 = this.anInt171 = this.anInt168 = this.anInt165 = this.anInt161 = this.anInt170 = this.anInt162 = 0;
		this.anInt169 = this.anInt164 = this.anInt166 = 16384;
	}

	@OriginalMember(owner = "client!aea", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class8 arg0) {
		@Pc(2) Class8_Sub1 local2 = (Class8_Sub1) arg0;
		this.anInt169 = local2.anInt169;
		this.anInt163 = local2.anInt163;
		this.anInt168 = local2.anInt168;
		this.anInt161 = local2.anInt161;
		this.anInt160 = local2.anInt160;
		this.anInt164 = local2.anInt164;
		this.anInt165 = local2.anInt165;
		this.anInt170 = local2.anInt170;
		this.anInt167 = local2.anInt167;
		this.anInt171 = local2.anInt171;
		this.anInt166 = local2.anInt166;
		this.anInt162 = local2.anInt162;
	}

	@OriginalMember(owner = "client!aea", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt161;
		@Pc(13) int local13 = arg0[1] - this.anInt170;
		@Pc(20) int local20 = arg0[2] - this.anInt162;
		arg0[0] = this.anInt169 * local6 + this.anInt160 * local13 + this.anInt167 * local20 >> 14;
		arg0[1] = this.anInt163 * local6 + this.anInt164 * local13 + this.anInt171 * local20 >> 14;
		arg0[2] = this.anInt168 * local6 + this.anInt165 * local13 + this.anInt166 * local20 >> 14;
	}

	@OriginalMember(owner = "client!aea", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt161 += arg0;
		this.anInt170 += arg1;
		this.anInt162 += arg2;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt161 + (this.anInt169 * arg0 + this.anInt163 * arg1 + this.anInt168 * arg2 >> 14);
		arg3[1] = this.anInt170 + (this.anInt160 * arg0 + this.anInt164 * arg1 + this.anInt165 * arg2 >> 14);
		arg3[2] = this.anInt162 + (this.anInt167 * arg0 + this.anInt171 * arg1 + this.anInt166 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!aea", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class179.anIntArray757[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class179.anIntArray756[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt169;
		@Pc(17) int local17 = this.anInt163;
		@Pc(20) int local20 = this.anInt168;
		@Pc(23) int local23 = this.anInt161;
		this.anInt169 = local14 * local5 + this.anInt167 * local11 >> 14;
		this.anInt167 = this.anInt167 * local5 - local14 * local11 >> 14;
		this.anInt163 = local17 * local5 + this.anInt171 * local11 >> 14;
		this.anInt171 = this.anInt171 * local5 - local17 * local11 >> 14;
		this.anInt168 = local20 * local5 + this.anInt166 * local11 >> 14;
		this.anInt166 = this.anInt166 * local5 - local20 * local11 >> 14;
		this.anInt161 = local23 * local5 + this.anInt162 * local11 >> 14;
		this.anInt162 = this.anInt162 * local5 - local23 * local11 >> 14;
	}
}
