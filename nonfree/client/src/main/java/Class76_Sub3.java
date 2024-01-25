import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "F")
	public float aFloat209;

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "F")
	public float aFloat211;

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "F")
	public float aFloat212;

	@OriginalMember(owner = "client!wga", name = "F", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!wga", name = "G", descriptor = "F")
	public float aFloat214;

	@OriginalMember(owner = "client!wga", name = "H", descriptor = "F")
	public float aFloat215;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "()V")
	public Class76_Sub3() {
		this.method9631();
	}

	@OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)V")
	@Override
	public void method9637(@OriginalArg(0) int arg0) {
		this.aFloat215 = 1.0F;
		this.aFloat214 = this.aFloat207 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat205 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat204 = this.aFloat209 = this.aFloat210 = this.aFloat212 = this.aFloat211 = this.aFloat206 = this.aFloat213 = 0.0F;
		this.aFloat208 = -this.aFloat205;
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V")
	@Override
	public void method9634(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat215;
		@Pc(21) float local21 = this.aFloat204;
		@Pc(24) float local24 = this.aFloat209;
		this.aFloat215 = local18 * local9 + this.aFloat206 * local15;
		@Pc(37) float local37 = this.aFloat210;
		this.aFloat206 = this.aFloat206 * local9 - local15 * local18;
		this.aFloat204 = local9 * local21 + this.aFloat205 * local15;
		this.aFloat209 = local15 * this.aFloat207 + local9 * local24;
		this.aFloat205 = this.aFloat205 * local9 - local21 * local15;
		this.aFloat207 = this.aFloat207 * local9 - local15 * local24;
		this.aFloat210 = local15 * this.aFloat213 + local37 * local9;
		this.aFloat213 = local9 * this.aFloat213 - local15 * local37;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
	@Override
	public void method9632(@OriginalArg(0) int arg0) {
		this.aFloat207 = 1.0F;
		this.aFloat215 = this.aFloat214 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat212 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat209 = this.aFloat210 = this.aFloat208 = this.aFloat211 = this.aFloat206 = this.aFloat205 = this.aFloat213 = 0.0F;
		this.aFloat204 = -this.aFloat212;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat209 + (float) arg0 * this.aFloat215 + (float) arg1 * this.aFloat204);
		arg3[2] = (int) (this.aFloat205 * (float) arg1 + this.aFloat206 * (float) arg0 + (float) arg2 * this.aFloat207);
		arg3[1] = (int) ((float) arg2 * this.aFloat208 + this.aFloat214 * (float) arg1 + (float) arg0 * this.aFloat212);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method9629(@OriginalArg(0) Class76 arg0) {
		@Pc(6) Class76_Sub3 local6 = (Class76_Sub3) arg0;
		this.aFloat214 = local6.aFloat214;
		this.aFloat210 = local6.aFloat210;
		this.aFloat209 = local6.aFloat209;
		this.aFloat207 = local6.aFloat207;
		this.aFloat208 = local6.aFloat208;
		this.aFloat212 = local6.aFloat212;
		this.aFloat215 = local6.aFloat215;
		this.aFloat213 = local6.aFloat213;
		this.aFloat206 = local6.aFloat206;
		this.aFloat204 = local6.aFloat204;
		this.aFloat205 = local6.aFloat205;
		this.aFloat211 = local6.aFloat211;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V")
	@Override
	public void method9639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat215 = this.aFloat214 = this.aFloat207 = 1.0F;
		this.aFloat212 = this.aFloat206 = this.aFloat204 = this.aFloat205 = this.aFloat209 = this.aFloat208 = 0.0F;
		this.aFloat213 = (float) arg2;
		this.aFloat210 = (float) arg0;
		this.aFloat211 = (float) arg1;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([I)V")
	@Override
	public void method9638(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat210;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat211;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat213;
		arg0[2] = (int) (local11 * this.aFloat209 + this.aFloat208 * local20 + local29 * this.aFloat207);
		arg0[1] = (int) (local11 * this.aFloat204 + this.aFloat214 * local20 + local29 * this.aFloat205);
		arg0[0] = (int) (this.aFloat206 * local29 + this.aFloat212 * local20 + this.aFloat215 * local11);
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method9643() {
		@Pc(7) Class76_Sub3 local7 = new Class76_Sub3();
		local7.aFloat214 = this.aFloat214;
		local7.aFloat204 = this.aFloat204;
		local7.aFloat215 = this.aFloat215;
		local7.aFloat207 = this.aFloat207;
		local7.aFloat210 = this.aFloat210;
		local7.aFloat208 = this.aFloat208;
		local7.aFloat211 = this.aFloat211;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat212 = this.aFloat212;
		local7.aFloat205 = this.aFloat205;
		local7.aFloat213 = this.aFloat213;
		local7.aFloat209 = this.aFloat209;
		return local7;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public void method9627(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat215;
		@Pc(21) float local21 = this.aFloat204;
		@Pc(24) float local24 = this.aFloat209;
		this.aFloat215 = local9 * local18 - local15 * this.aFloat212;
		@Pc(37) float local37 = this.aFloat210;
		this.aFloat212 = local15 * local18 + local9 * this.aFloat212;
		this.aFloat204 = local9 * local21 - this.aFloat214 * local15;
		this.aFloat209 = local9 * local24 - this.aFloat208 * local15;
		this.aFloat214 = this.aFloat214 * local9 + local15 * local21;
		this.aFloat210 = local9 * local37 - this.aFloat211 * local15;
		this.aFloat208 = this.aFloat208 * local9 + local15 * local24;
		this.aFloat211 = local37 * local15 + local9 * this.aFloat211;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub43.aFloatArray53[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub43.aFloatArray54[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub43.aFloatArray53[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub43.aFloatArray54[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat212 = -local21 * local39 + local43 * local27;
		this.aFloat207 = local9 * local21;
		this.aFloat205 = -local15;
		this.aFloat204 = local9 * local39;
		this.aFloat208 = local39 * local27 + local21 * local43;
		this.aFloat209 = local21 * local47 + local33 * -local27;
		this.aFloat214 = local9 * local33;
		this.aFloat215 = local47 * local27 + local21 * local33;
		this.aFloat206 = local9 * local27;
		this.aFloat213 = -(this.aFloat207 * (float) arg2) + (float) -arg0 * this.aFloat206 - this.aFloat205 * (float) arg1;
		this.aFloat210 = -(this.aFloat204 * (float) arg1) + this.aFloat215 * (float) -arg0 - this.aFloat209 * (float) arg2;
		this.aFloat211 = -((float) arg2 * this.aFloat208) - (float) arg1 * this.aFloat214 + this.aFloat212 * (float) -arg0;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
	@Override
	public void method9630(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat212;
		@Pc(21) float local21 = this.aFloat214;
		@Pc(24) float local24 = this.aFloat208;
		this.aFloat212 = local18 * local9 - local15 * this.aFloat206;
		@Pc(37) float local37 = this.aFloat211;
		this.aFloat214 = local9 * local21 - local15 * this.aFloat205;
		this.aFloat206 = local15 * local18 + this.aFloat206 * local9;
		this.aFloat208 = local9 * local24 - local15 * this.aFloat207;
		this.aFloat205 = local9 * this.aFloat205 + local21 * local15;
		this.aFloat211 = local37 * local9 - local15 * this.aFloat213;
		this.aFloat207 = local15 * local24 + this.aFloat207 * local9;
		this.aFloat213 = this.aFloat213 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat211);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat210);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat213);
		arg3[0] = (int) ((float) local10 * this.aFloat212 + this.aFloat215 * (float) local17 + this.aFloat206 * (float) local24);
		arg3[1] = (int) ((float) local24 * this.aFloat205 + (float) local17 * this.aFloat204 + (float) local10 * this.aFloat214);
		arg3[2] = (int) (this.aFloat207 * (float) local24 + this.aFloat209 * (float) local17 + (float) local10 * this.aFloat208);
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)V")
	@Override
	public void method9633(@OriginalArg(0) int arg0) {
		this.aFloat214 = 1.0F;
		this.aFloat215 = this.aFloat207 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat209 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat206 = -this.aFloat209;
		this.aFloat204 = this.aFloat210 = this.aFloat212 = this.aFloat208 = this.aFloat211 = this.aFloat205 = this.aFloat213 = 0.0F;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "()V")
	@Override
	public void method9631() {
		this.aFloat212 = this.aFloat206 = this.aFloat204 = this.aFloat205 = this.aFloat209 = this.aFloat208 = this.aFloat210 = this.aFloat211 = this.aFloat213 = 0.0F;
		this.aFloat215 = this.aFloat214 = this.aFloat207 = 1.0F;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(III)V")
	@Override
	public void method9640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat210 += (float) arg0;
		this.aFloat213 += (float) arg2;
		this.aFloat211 += (float) arg1;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat213 + (float) arg0 * this.aFloat206 + (float) arg1 * this.aFloat205 + this.aFloat207 * (float) arg2);
		arg3[0] = (int) (this.aFloat204 * (float) arg1 + this.aFloat215 * (float) arg0 + this.aFloat209 * (float) arg2 + this.aFloat210);
		arg3[1] = (int) (this.aFloat208 * (float) arg2 + this.aFloat214 * (float) arg1 + (float) arg0 * this.aFloat212 + this.aFloat211);
	}
}
