import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class254_Sub3 extends Class254 {

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "F")
	public float aFloat182;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class254_Sub3() {
		this.method7357();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	@Override
	public void method7347(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat180;
		@Pc(21) float local21 = this.aFloat176;
		@Pc(24) float local24 = this.aFloat185;
		@Pc(27) float local27 = this.aFloat175;
		this.aFloat180 = local18 * local9 - local15 * this.aFloat183;
		this.aFloat176 = local21 * local9 - this.aFloat181 * local15;
		this.aFloat183 = local18 * local15 + this.aFloat183 * local9;
		this.aFloat181 = local15 * local21 + local9 * this.aFloat181;
		this.aFloat185 = local9 * local24 - this.aFloat174 * local15;
		this.aFloat175 = local27 * local9 - local15 * this.aFloat182;
		this.aFloat174 = local24 * local15 + local9 * this.aFloat174;
		this.aFloat182 = local15 * local27 + local9 * this.aFloat182;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "()V")
	@Override
	public void method7357() {
		this.aFloat183 = this.aFloat178 = this.aFloat176 = this.aFloat179 = this.aFloat185 = this.aFloat174 = this.aFloat175 = this.aFloat182 = this.aFloat177 = 0.0F;
		this.aFloat180 = this.aFloat181 = this.aFloat184 = 1.0F;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)V")
	@Override
	public void method7361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat177 = (float) arg2;
		this.aFloat182 = (float) arg1;
		this.aFloat183 = this.aFloat178 = this.aFloat176 = this.aFloat179 = this.aFloat185 = this.aFloat174 = 0.0F;
		this.aFloat180 = this.aFloat181 = this.aFloat184 = 1.0F;
		this.aFloat175 = (float) arg0;
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	@Override
	public void method7352(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat183;
		@Pc(21) float local21 = this.aFloat181;
		@Pc(24) float local24 = this.aFloat174;
		@Pc(27) float local27 = this.aFloat182;
		this.aFloat183 = local9 * local18 - local15 * this.aFloat178;
		this.aFloat181 = local9 * local21 - this.aFloat179 * local15;
		this.aFloat178 = local15 * local18 + this.aFloat178 * local9;
		this.aFloat174 = local24 * local9 - local15 * this.aFloat184;
		this.aFloat179 = local9 * this.aFloat179 + local21 * local15;
		this.aFloat182 = local9 * local27 - this.aFloat177 * local15;
		this.aFloat184 = local15 * local24 + this.aFloat184 * local9;
		this.aFloat177 = local15 * local27 + this.aFloat177 * local9;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([I)V")
	@Override
	public void method7351(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat175;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat182;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat177;
		arg0[2] = (int) (local30 * this.aFloat184 + local12 * this.aFloat185 + local21 * this.aFloat174);
		arg0[1] = (int) (this.aFloat179 * local30 + local21 * this.aFloat181 + local12 * this.aFloat176);
		arg0[0] = (int) (this.aFloat178 * local30 + this.aFloat183 * local21 + local12 * this.aFloat180);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method7353() {
		@Pc(7) Class254_Sub3 local7 = new Class254_Sub3();
		local7.aFloat175 = this.aFloat175;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat183 = this.aFloat183;
		local7.aFloat180 = this.aFloat180;
		local7.aFloat185 = this.aFloat185;
		local7.aFloat181 = this.aFloat181;
		local7.aFloat178 = this.aFloat178;
		local7.aFloat182 = this.aFloat182;
		local7.aFloat177 = this.aFloat177;
		local7.aFloat179 = this.aFloat179;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat184 = this.aFloat184;
		return local7;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat176 + (float) arg0 * this.aFloat180 + this.aFloat185 * (float) arg2 + this.aFloat175);
		arg3[2] = (int) ((float) arg1 * this.aFloat179 + this.aFloat178 * (float) arg0 + (float) arg2 * this.aFloat184 + this.aFloat177);
		arg3[1] = (int) (this.aFloat182 + (float) arg2 * this.aFloat174 + this.aFloat181 * (float) arg1 + (float) arg0 * this.aFloat183);
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V")
	@Override
	public void method7354(@OriginalArg(0) int arg0) {
		this.aFloat180 = 1.0F;
		this.aFloat181 = this.aFloat184 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat179 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat174 = -this.aFloat179;
		this.aFloat176 = this.aFloat185 = this.aFloat175 = this.aFloat183 = this.aFloat182 = this.aFloat178 = this.aFloat177 = 0.0F;
	}

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V")
	@Override
	public void method7363(@OriginalArg(0) int arg0) {
		this.aFloat184 = 1.0F;
		this.aFloat180 = this.aFloat181 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat183 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat185 = this.aFloat175 = this.aFloat174 = this.aFloat182 = this.aFloat178 = this.aFloat179 = this.aFloat177 = 0.0F;
		this.aFloat176 = -this.aFloat183;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	@Override
	public void method7350(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat180;
		@Pc(21) float local21 = this.aFloat176;
		@Pc(24) float local24 = this.aFloat185;
		this.aFloat180 = local18 * local9 + this.aFloat178 * local15;
		@Pc(37) float local37 = this.aFloat175;
		this.aFloat176 = local9 * local21 + this.aFloat179 * local15;
		this.aFloat178 = this.aFloat178 * local9 - local15 * local18;
		this.aFloat179 = this.aFloat179 * local9 - local21 * local15;
		this.aFloat185 = local9 * local24 + this.aFloat184 * local15;
		this.aFloat184 = this.aFloat184 * local9 - local24 * local15;
		this.aFloat175 = local9 * local37 + local15 * this.aFloat177;
		this.aFloat177 = this.aFloat177 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method7356(@OriginalArg(0) Class254 arg0) {
		@Pc(6) Class254_Sub3 local6 = (Class254_Sub3) arg0;
		this.aFloat178 = local6.aFloat178;
		this.aFloat183 = local6.aFloat183;
		this.aFloat182 = local6.aFloat182;
		this.aFloat179 = local6.aFloat179;
		this.aFloat174 = local6.aFloat174;
		this.aFloat177 = local6.aFloat177;
		this.aFloat176 = local6.aFloat176;
		this.aFloat184 = local6.aFloat184;
		this.aFloat175 = local6.aFloat175;
		this.aFloat185 = local6.aFloat185;
		this.aFloat181 = local6.aFloat181;
		this.aFloat180 = local6.aFloat180;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub1_Sub8.aFloatArray62[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub8.aFloatArray63[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub1_Sub8.aFloatArray62[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub1_Sub8.aFloatArray63[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub1_Sub8.aFloatArray62[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub1_Sub8.aFloatArray63[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat183 = local27 * local43 + local39 * -local21;
		this.aFloat181 = local9 * local33;
		this.aFloat185 = -local27 * local33 + local21 * local47;
		this.aFloat176 = local39 * local9;
		this.aFloat174 = local43 * local21 + local27 * local39;
		this.aFloat184 = local9 * local21;
		this.aFloat178 = local27 * local9;
		this.aFloat180 = local21 * local33 + local47 * local27;
		this.aFloat179 = -local15;
		this.aFloat182 = this.aFloat183 * (float) -arg0 - this.aFloat181 * (float) arg1 - this.aFloat174 * (float) arg2;
		this.aFloat175 = -(this.aFloat185 * (float) arg2) + (float) -arg0 * this.aFloat180 - (float) arg1 * this.aFloat176;
		this.aFloat177 = (float) -arg0 * this.aFloat178 - this.aFloat179 * (float) arg1 - (float) arg2 * this.aFloat184;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	@Override
	public void method7346(@OriginalArg(0) int arg0) {
		this.aFloat181 = 1.0F;
		this.aFloat180 = this.aFloat184 = Class5_Sub1_Sub8.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat185 = Class5_Sub1_Sub8.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat176 = this.aFloat175 = this.aFloat183 = this.aFloat174 = this.aFloat182 = this.aFloat179 = this.aFloat177 = 0.0F;
		this.aFloat178 = -this.aFloat185;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat178 + (float) arg1 * this.aFloat179 + this.aFloat184 * (float) arg2);
		arg3[1] = (int) (this.aFloat174 * (float) arg2 + (float) arg1 * this.aFloat181 + this.aFloat183 * (float) arg0);
		arg3[0] = (int) (this.aFloat180 * (float) arg0 + this.aFloat176 * (float) arg1 + this.aFloat185 * (float) arg2);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat177);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat175);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat182);
		arg3[0] = (int) ((float) local10 * this.aFloat178 + this.aFloat180 * (float) local17 + (float) local24 * this.aFloat183);
		arg3[1] = (int) (this.aFloat179 * (float) local10 + this.aFloat181 * (float) local24 + this.aFloat176 * (float) local17);
		arg3[2] = (int) (this.aFloat185 * (float) local17 + this.aFloat174 * (float) local24 + (float) local10 * this.aFloat184);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
	@Override
	public void method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat177 += (float) arg2;
		this.aFloat175 += (float) arg0;
		this.aFloat182 += (float) arg1;
	}
}
