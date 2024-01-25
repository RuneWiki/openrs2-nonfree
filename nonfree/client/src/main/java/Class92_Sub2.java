import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!hea", name = "y", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!hea", name = "B", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!hea", name = "C", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!hea", name = "P", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!hea", name = "X", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	public Class92_Sub2() {
		this.method3853();
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(III[I)V")
	@Override
	public void method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat82);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat74);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat83);
		arg3[0] = (int) (this.aFloat80 * (float) local17 + this.aFloat81 * (float) local6 + (float) local24 * this.aFloat85);
		arg3[2] = (int) (this.aFloat77 * (float) local17 + this.aFloat84 * (float) local6 + this.aFloat76 * (float) local24);
		arg3[1] = (int) ((float) local24 * this.aFloat79 + (float) local6 * this.aFloat75 + (float) local17 * this.aFloat78);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat83 + (float) arg2 * this.aFloat76 + (float) arg0 * this.aFloat85 + this.aFloat79 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat77 + (float) arg1 * this.aFloat78 + this.aFloat80 * (float) arg0 + this.aFloat74);
		arg3[0] = (int) ((float) arg0 * this.aFloat81 + (float) arg1 * this.aFloat75 + (float) arg2 * this.aFloat84 + this.aFloat82);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class136.aFloatArray18[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class136.aFloatArray19[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class136.aFloatArray18[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class136.aFloatArray19[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class136.aFloatArray18[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class136.aFloatArray19[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat79 = -local15;
		this.aFloat80 = -local21 * local39 + local27 * local43;
		this.aFloat76 = local21 * local9;
		this.aFloat85 = local9 * local27;
		this.aFloat75 = local9 * local39;
		this.aFloat77 = local27 * local39 + local21 * local43;
		this.aFloat78 = local33 * local9;
		this.aFloat84 = -local27 * local33 + local47 * local21;
		this.aFloat81 = local33 * local21 + local47 * local27;
		this.aFloat74 = -((float) arg2 * this.aFloat77) + this.aFloat80 * (float) -arg0 - this.aFloat78 * (float) arg1;
		this.aFloat83 = this.aFloat85 * (float) -arg0 - this.aFloat79 * (float) arg1 - (float) arg2 * this.aFloat76;
		this.aFloat82 = -(this.aFloat75 * (float) arg1) + this.aFloat81 * (float) -arg0 - this.aFloat84 * (float) arg2;
	}

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V")
	@Override
	public void method3866(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class136.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class136.aFloatArray19[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat80;
		@Pc(21) float local21 = this.aFloat78;
		@Pc(24) float local24 = this.aFloat77;
		this.aFloat80 = local18 * local9 - local15 * this.aFloat85;
		@Pc(37) float local37 = this.aFloat74;
		this.aFloat85 = this.aFloat85 * local9 + local18 * local15;
		this.aFloat78 = local21 * local9 - this.aFloat79 * local15;
		this.aFloat77 = local24 * local9 - local15 * this.aFloat76;
		this.aFloat79 = this.aFloat79 * local9 + local21 * local15;
		this.aFloat76 = local15 * local24 + this.aFloat76 * local9;
		this.aFloat74 = local37 * local9 - local15 * this.aFloat83;
		this.aFloat83 = local15 * local37 + this.aFloat83 * local9;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat78 * (float) arg1 + this.aFloat80 * (float) arg0 + (float) arg2 * this.aFloat77);
		arg3[2] = (int) (this.aFloat79 * (float) arg1 + this.aFloat85 * (float) arg0 + this.aFloat76 * (float) arg2);
		arg3[0] = (int) ((float) arg1 * this.aFloat75 + this.aFloat81 * (float) arg0 + (float) arg2 * this.aFloat84);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I)V")
	@Override
	public void method3869(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat82;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat74;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat83;
		arg0[0] = (int) (local30 * this.aFloat85 + this.aFloat81 * local12 + local21 * this.aFloat80);
		arg0[2] = (int) (local21 * this.aFloat77 + this.aFloat84 * local12 + local30 * this.aFloat76);
		arg0[1] = (int) (local21 * this.aFloat78 + this.aFloat75 * local12 + this.aFloat79 * local30);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method3857() {
		@Pc(7) Class92_Sub2 local7 = new Class92_Sub2();
		local7.aFloat79 = this.aFloat79;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat81 = this.aFloat81;
		return local7;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(III)V")
	@Override
	public void method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat81 = this.aFloat78 = this.aFloat76 = 1.0F;
		this.aFloat82 = (float) arg0;
		this.aFloat83 = (float) arg2;
		this.aFloat74 = (float) arg1;
		this.aFloat80 = this.aFloat85 = this.aFloat75 = this.aFloat79 = this.aFloat84 = this.aFloat77 = 0.0F;
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V")
	@Override
	public void method3868(@OriginalArg(0) int arg0) {
		this.aFloat76 = 1.0F;
		this.aFloat81 = this.aFloat78 = Class136.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat80 = Class136.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat75 = -this.aFloat80;
		this.aFloat84 = this.aFloat82 = this.aFloat77 = this.aFloat74 = this.aFloat85 = this.aFloat79 = this.aFloat83 = 0.0F;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!nh;)V")
	public void method3219(@OriginalArg(1) Class92 arg0) {
		@Pc(6) Class92_Sub2 local6 = (Class92_Sub2) arg0;
		this.aFloat81 = local6.aFloat81;
		this.aFloat84 = local6.aFloat85;
		this.aFloat75 = local6.aFloat80;
		this.aFloat85 = local6.aFloat84;
		this.aFloat77 = local6.aFloat79;
		this.aFloat80 = local6.aFloat75;
		this.aFloat78 = local6.aFloat78;
		this.aFloat79 = local6.aFloat77;
		this.aFloat76 = local6.aFloat76;
		this.aFloat82 = -(this.aFloat84 * local6.aFloat83 + local6.aFloat82 * this.aFloat81 + local6.aFloat74 * this.aFloat75);
		this.aFloat74 = -(local6.aFloat82 * this.aFloat80 + this.aFloat78 * local6.aFloat74 + this.aFloat77 * local6.aFloat83);
		this.aFloat83 = -(local6.aFloat83 * this.aFloat76 + this.aFloat79 * local6.aFloat74 + local6.aFloat82 * this.aFloat85);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
	@Override
	public void method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat74 += (float) arg1;
		this.aFloat82 += (float) arg0;
		this.aFloat83 += (float) arg2;
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)V")
	@Override
	public void method3861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class136.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class136.aFloatArray19[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat75;
		@Pc(24) float local24 = this.aFloat84;
		@Pc(27) float local27 = this.aFloat82;
		this.aFloat81 = local15 * this.aFloat85 + local9 * local18;
		this.aFloat85 = this.aFloat85 * local9 - local18 * local15;
		this.aFloat75 = local15 * this.aFloat79 + local21 * local9;
		this.aFloat79 = local9 * this.aFloat79 - local15 * local21;
		this.aFloat84 = local24 * local9 + local15 * this.aFloat76;
		this.aFloat82 = this.aFloat83 * local15 + local27 * local9;
		this.aFloat76 = local9 * this.aFloat76 - local24 * local15;
		this.aFloat83 = local9 * this.aFloat83 - local27 * local15;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method3865(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class92_Sub2 local6 = (Class92_Sub2) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat75 = local6.aFloat75;
		this.aFloat76 = local6.aFloat76;
		this.aFloat78 = local6.aFloat78;
		this.aFloat80 = local6.aFloat80;
		this.aFloat77 = local6.aFloat77;
		this.aFloat74 = local6.aFloat74;
		this.aFloat81 = local6.aFloat81;
		this.aFloat79 = local6.aFloat79;
		this.aFloat83 = local6.aFloat83;
		this.aFloat85 = local6.aFloat85;
		this.aFloat82 = local6.aFloat82;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFBIFII)V")
	public void method3220(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat81 = (float) arg4;
			this.aFloat80 = this.aFloat85 = this.aFloat75 = this.aFloat79 = this.aFloat84 = this.aFloat77 = 0.0F;
			this.aFloat78 = (float) arg5;
			this.aFloat76 = 1.0F;
		} else {
			@Pc(11) float local11 = Class136.aFloatArray18[arg2 & 0x3FFF];
			@Pc(17) float local17 = Class136.aFloatArray19[arg2 & 0x3FFF];
			this.aFloat80 = (float) arg4 * local17;
			this.aFloat81 = local11 * (float) arg4;
			this.aFloat75 = (float) arg5 * -local17;
			this.aFloat76 = 1.0F;
			this.aFloat85 = this.aFloat79 = this.aFloat84 = this.aFloat77 = 0.0F;
			this.aFloat78 = (float) arg5 * local11;
		}
		this.aFloat83 = arg0;
		this.aFloat74 = arg3;
		this.aFloat82 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	@Override
	public void method3858(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat81 = this.aFloat76 = Class136.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat84 = Class136.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat85 = -this.aFloat84;
		this.aFloat75 = this.aFloat82 = this.aFloat80 = this.aFloat77 = this.aFloat74 = this.aFloat79 = this.aFloat83 = 0.0F;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
	public void method3221() {
		this.aFloat79 = -this.aFloat79;
		this.aFloat85 = -this.aFloat85;
		this.aFloat76 = -this.aFloat76;
		this.aFloat80 = -this.aFloat80;
		this.aFloat74 = -this.aFloat74;
		this.aFloat77 = -this.aFloat77;
		this.aFloat78 = -this.aFloat78;
		this.aFloat83 = -this.aFloat83;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZFFFF[F)V")
	public void method3222(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		@Pc(49) float local49;
		@Pc(33) float local33;
		@Pc(41) float local41;
		@Pc(25) float local25;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local25 = -arg0 / arg3;
			local33 = this.aFloat80 * local25 + this.aFloat74;
			local41 = local25 * this.aFloat85 + this.aFloat83;
			local49 = this.aFloat82 + this.aFloat81 * local25;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local25 = -arg0 / arg1;
			local49 = local25 * this.aFloat75 + this.aFloat82;
			local33 = this.aFloat78 * local25 + this.aFloat74;
			local41 = this.aFloat83 + local25 * this.aFloat79;
		} else {
			local25 = -arg0 / arg2;
			local41 = this.aFloat76 * local25 + this.aFloat83;
			local33 = this.aFloat77 * local25 + this.aFloat74;
			local49 = this.aFloat82 + local25 * this.aFloat84;
		}
		arg4[2] = this.aFloat76 * arg2 + arg1 * this.aFloat79 + arg3 * this.aFloat85;
		arg4[1] = this.aFloat77 * arg2 + arg3 * this.aFloat80 + arg1 * this.aFloat78;
		arg4[0] = arg2 * this.aFloat84 + arg1 * this.aFloat75 + this.aFloat81 * arg3;
		arg4[3] = -(arg4[2] * local41 + local49 * arg4[0] + arg4[1] * local33);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	@Override
	public void method3852(@OriginalArg(0) int arg0) {
		this.aFloat81 = 1.0F;
		this.aFloat78 = this.aFloat76 = Class136.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat79 = Class136.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat75 = this.aFloat84 = this.aFloat82 = this.aFloat80 = this.aFloat74 = this.aFloat85 = this.aFloat83 = 0.0F;
		this.aFloat77 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)[F")
	public float[] method3224() {
		Static339.aFloatArray25[12] = 0.0F;
		Static339.aFloatArray25[10] = this.aFloat76;
		Static339.aFloatArray25[2] = this.aFloat85;
		Static339.aFloatArray25[1] = this.aFloat80;
		Static339.aFloatArray25[9] = this.aFloat77;
		Static339.aFloatArray25[6] = this.aFloat79;
		Static339.aFloatArray25[13] = 0.0F;
		Static339.aFloatArray25[14] = 0.0F;
		Static339.aFloatArray25[0] = this.aFloat81;
		Static339.aFloatArray25[5] = this.aFloat78;
		Static339.aFloatArray25[8] = this.aFloat84;
		Static339.aFloatArray25[4] = this.aFloat75;
		return Static339.aFloatArray25;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "()V")
	@Override
	public void method3853() {
		this.aFloat80 = this.aFloat85 = this.aFloat75 = this.aFloat79 = this.aFloat84 = this.aFloat77 = this.aFloat82 = this.aFloat74 = this.aFloat83 = 0.0F;
		this.aFloat81 = this.aFloat78 = this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)[F")
	public float[] method3225() {
		Static339.aFloatArray25[2] = this.aFloat85;
		Static339.aFloatArray25[4] = this.aFloat75;
		Static339.aFloatArray25[5] = this.aFloat78;
		Static339.aFloatArray25[12] = this.aFloat82;
		Static339.aFloatArray25[9] = this.aFloat77;
		Static339.aFloatArray25[10] = this.aFloat76;
		Static339.aFloatArray25[8] = this.aFloat84;
		Static339.aFloatArray25[6] = this.aFloat79;
		Static339.aFloatArray25[0] = this.aFloat81;
		Static339.aFloatArray25[14] = this.aFloat83;
		Static339.aFloatArray25[13] = this.aFloat74;
		Static339.aFloatArray25[1] = this.aFloat80;
		return Static339.aFloatArray25;
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V")
	@Override
	public void method3860(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class136.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class136.aFloatArray19[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat75;
		@Pc(24) float local24 = this.aFloat84;
		this.aFloat81 = local9 * local18 - this.aFloat80 * local15;
		@Pc(37) float local37 = this.aFloat82;
		this.aFloat75 = local9 * local21 - this.aFloat78 * local15;
		this.aFloat80 = local15 * local18 + local9 * this.aFloat80;
		this.aFloat78 = local21 * local15 + local9 * this.aFloat78;
		this.aFloat84 = local24 * local9 - local15 * this.aFloat77;
		this.aFloat77 = local15 * local24 + this.aFloat77 * local9;
		this.aFloat82 = local37 * local9 - this.aFloat74 * local15;
		this.aFloat74 = this.aFloat74 * local9 + local15 * local37;
	}
}
