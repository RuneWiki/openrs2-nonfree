import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class239_Sub3 extends Class239 {

	@OriginalMember(owner = "client!wn", name = "lb", descriptor = "Lclient!ei;")
	public static Class79 lb;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "F")
	public float aFloat214;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "F")
	public float aFloat215;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "F")
	public float aFloat217;

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "F")
	public float aFloat218;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "F")
	public float aFloat219;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "F")
	public float aFloat220;

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "F")
	public float aFloat221;

	@OriginalMember(owner = "client!wn", name = "T", descriptor = "F")
	public float aFloat222;

	@OriginalMember(owner = "client!wn", name = "db", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!wn", name = "hb", descriptor = "F")
	public float aFloat224;

	@OriginalMember(owner = "client!wn", name = "ib", descriptor = "F")
	public float aFloat225;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class239_Sub3() {
		this.method9249();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class67.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class67.aFloatArray15[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class67.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class67.aFloatArray15[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat221 = local9 * local21;
		this.aFloat219 = local27 * local47 + local21 * local33;
		this.aFloat223 = local27 * local43 + -local21 * local39;
		this.aFloat215 = local21 * local43 + local39 * local27;
		this.aFloat214 = local33 * local9;
		this.aFloat216 = local39 * local9;
		this.aFloat225 = local33 * -local27 + local21 * local47;
		this.aFloat224 = -local15;
		this.aFloat222 = local9 * local27;
		this.aFloat217 = -((float) arg2 * this.aFloat215) + this.aFloat223 * (float) -arg0 - this.aFloat214 * (float) arg1;
		this.aFloat218 = -((float) arg2 * this.aFloat225) - (float) arg1 * this.aFloat216 + this.aFloat219 * (float) -arg0;
		this.aFloat220 = this.aFloat222 * (float) -arg0 - this.aFloat224 * (float) arg1 - this.aFloat221 * (float) arg2;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([FI)[F")
	public float[] method9251(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat223;
		arg0[8] = this.aFloat218;
		arg0[7] = 0.0F;
		arg0[2] = 0.0F;
		arg0[9] = this.aFloat217;
		arg0[6] = 0.0F;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat220;
		arg0[5] = this.aFloat214;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat216;
		arg0[12] = 0.0F;
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat219;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!uu;I)V")
	public void method9252(@OriginalArg(0) Class239 arg0) {
		@Pc(11) Class239_Sub3 local11 = (Class239_Sub3) arg0;
		@Pc(14) float local14 = this.aFloat219;
		@Pc(17) float local17 = this.aFloat223;
		@Pc(20) float local20 = this.aFloat216;
		@Pc(23) float local23 = this.aFloat214;
		@Pc(26) float local26 = this.aFloat225;
		@Pc(29) float local29 = this.aFloat215;
		@Pc(32) float local32 = this.aFloat218;
		this.aFloat219 = this.aFloat222 * local11.aFloat225 + local11.aFloat216 * local17 + local14 * local11.aFloat219;
		@Pc(52) float local52 = this.aFloat217;
		this.aFloat223 = local11.aFloat215 * this.aFloat222 + local11.aFloat223 * local14 + local17 * local11.aFloat214;
		this.aFloat222 = local11.aFloat224 * local17 + local11.aFloat222 * local14 + this.aFloat222 * local11.aFloat221;
		this.aFloat214 = this.aFloat224 * local11.aFloat215 + local23 * local11.aFloat214 + local11.aFloat223 * local20;
		this.aFloat216 = this.aFloat224 * local11.aFloat225 + local23 * local11.aFloat216 + local11.aFloat219 * local20;
		this.aFloat224 = local20 * local11.aFloat222 + local11.aFloat224 * local23 + local11.aFloat221 * this.aFloat224;
		this.aFloat225 = this.aFloat221 * local11.aFloat225 + local11.aFloat216 * local29 + local11.aFloat219 * local26;
		this.aFloat215 = local26 * local11.aFloat223 + local29 * local11.aFloat214 + local11.aFloat215 * this.aFloat221;
		this.aFloat221 = this.aFloat221 * local11.aFloat221 + local11.aFloat224 * local29 + local26 * local11.aFloat222;
		this.aFloat218 = local11.aFloat216 * local52 + local11.aFloat219 * local32 + local11.aFloat225 * this.aFloat220 + local11.aFloat218;
		this.aFloat217 = local11.aFloat217 + local11.aFloat215 * this.aFloat220 + local11.aFloat214 * local52 + local11.aFloat223 * local32;
		this.aFloat220 = local32 * local11.aFloat222 + local11.aFloat224 * local52 + this.aFloat220 * local11.aFloat221 + local11.aFloat220;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFBF)F")
	public float method9253(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat225 * arg2 + this.aFloat219 * arg0 + this.aFloat216 * arg1 + this.aFloat218;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	@Override
	public void method9242(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat223;
		@Pc(21) float local21 = this.aFloat214;
		@Pc(24) float local24 = this.aFloat215;
		this.aFloat223 = local9 * local18 - this.aFloat222 * local15;
		@Pc(38) float local38 = this.aFloat217;
		this.aFloat222 = local9 * this.aFloat222 + local15 * local18;
		this.aFloat214 = local21 * local9 - this.aFloat224 * local15;
		this.aFloat215 = local24 * local9 - local15 * this.aFloat221;
		this.aFloat224 = local21 * local15 + local9 * this.aFloat224;
		this.aFloat217 = local9 * local38 - local15 * this.aFloat220;
		this.aFloat221 = local24 * local15 + this.aFloat221 * local9;
		this.aFloat220 = local15 * local38 + this.aFloat220 * local9;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!uu;)V")
	public void method9254(@OriginalArg(1) Class239 arg0) {
		@Pc(6) Class239_Sub3 local6 = (Class239_Sub3) arg0;
		this.aFloat216 = local6.aFloat223;
		this.aFloat225 = local6.aFloat222;
		this.aFloat219 = local6.aFloat219;
		this.aFloat223 = local6.aFloat216;
		this.aFloat215 = local6.aFloat224;
		this.aFloat222 = local6.aFloat225;
		this.aFloat214 = local6.aFloat214;
		this.aFloat221 = local6.aFloat221;
		this.aFloat218 = -(this.aFloat225 * local6.aFloat220 + this.aFloat216 * local6.aFloat217 + local6.aFloat218 * this.aFloat219);
		this.aFloat224 = local6.aFloat215;
		this.aFloat217 = -(this.aFloat214 * local6.aFloat217 + this.aFloat223 * local6.aFloat218 + local6.aFloat220 * this.aFloat215);
		this.aFloat220 = -(this.aFloat222 * local6.aFloat218 + this.aFloat224 * local6.aFloat217 + this.aFloat221 * local6.aFloat220);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat217 + (float) arg2 * this.aFloat215 + this.aFloat214 * (float) arg1 + (float) arg0 * this.aFloat223);
		arg3[0] = (int) (this.aFloat218 + this.aFloat219 * (float) arg0 + this.aFloat216 * (float) arg1 + this.aFloat225 * (float) arg2);
		arg3[2] = (int) (this.aFloat220 + (float) arg2 * this.aFloat221 + (float) arg0 * this.aFloat222 + (float) arg1 * this.aFloat224);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!uu;B)V")
	public void method9255(@OriginalArg(0) Class239 arg0) {
		@Pc(6) Class239_Sub3 local6 = (Class239_Sub3) arg0;
		this.aFloat218 = 0.0F;
		this.aFloat222 = local6.aFloat222;
		this.aFloat221 = local6.aFloat221;
		this.aFloat224 = local6.aFloat224;
		this.aFloat219 = local6.aFloat219;
		this.aFloat220 = 0.0F;
		this.aFloat225 = local6.aFloat225;
		this.aFloat217 = 0.0F;
		this.aFloat215 = local6.aFloat215;
		this.aFloat223 = local6.aFloat223;
		this.aFloat216 = local6.aFloat216;
		this.aFloat214 = local6.aFloat214;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFFF)V")
	public void method9256(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat220 *= arg0;
		this.aFloat223 *= arg1;
		this.aFloat224 *= arg0;
		this.aFloat218 *= arg2;
		this.aFloat225 *= arg2;
		this.aFloat219 *= arg2;
		this.aFloat217 *= arg1;
		this.aFloat221 *= arg0;
		this.aFloat214 *= arg1;
		this.aFloat216 *= arg2;
		this.aFloat222 *= arg0;
		this.aFloat215 *= arg1;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat217);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat220);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat218);
		arg3[1] = (int) ((float) local17 * this.aFloat224 + (float) local24 * this.aFloat216 + this.aFloat214 * (float) local10);
		arg3[0] = (int) (this.aFloat222 * (float) local17 + (float) local10 * this.aFloat223 + this.aFloat219 * (float) local24);
		arg3[2] = (int) ((float) local24 * this.aFloat225 + (float) local10 * this.aFloat215 + (float) local17 * this.aFloat221);
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	@Override
	public void method9243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat219;
		@Pc(21) float local21 = this.aFloat216;
		@Pc(24) float local24 = this.aFloat225;
		@Pc(27) float local27 = this.aFloat218;
		this.aFloat219 = local18 * local9 + this.aFloat222 * local15;
		this.aFloat222 = this.aFloat222 * local9 - local15 * local18;
		this.aFloat216 = local21 * local9 + this.aFloat224 * local15;
		this.aFloat224 = local9 * this.aFloat224 - local21 * local15;
		this.aFloat225 = local24 * local9 + this.aFloat221 * local15;
		this.aFloat218 = local15 * this.aFloat220 + local9 * local27;
		this.aFloat221 = this.aFloat221 * local9 - local15 * local24;
		this.aFloat220 = this.aFloat220 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V")
	@Override
	public void method9244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat218 += (float) arg0;
		this.aFloat217 += (float) arg1;
		this.aFloat220 += (float) arg2;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIF)F")
	public float method9257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat222 * arg1 + this.aFloat224 * arg0 + this.aFloat221 * arg2 + this.aFloat220;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	@Override
	public void method9233(@OriginalArg(0) int arg0) {
		this.aFloat214 = 1.0F;
		this.aFloat219 = this.aFloat221 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat225 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat216 = this.aFloat218 = this.aFloat223 = this.aFloat215 = this.aFloat217 = this.aFloat224 = this.aFloat220 = 0.0F;
		this.aFloat222 = -this.aFloat225;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[F)[F")
	public float[] method9259(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat223;
		arg0[10] = this.aFloat221;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat214;
		arg0[2] = this.aFloat225;
		arg0[12] = 0.0F;
		arg0[9] = this.aFloat224;
		arg0[1] = this.aFloat216;
		arg0[6] = this.aFloat215;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[15] = 0.0F;
		arg0[0] = this.aFloat219;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat222;
		return arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BFFF)V")
	public void method9260(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat219 = arg0;
		this.aFloat218 = 0.0F;
		this.aFloat225 = 0.0F;
		this.aFloat217 = 0.0F;
		this.aFloat216 = 0.0F;
		this.aFloat214 = arg2;
		this.aFloat220 = 0.0F;
		this.aFloat222 = 0.0F;
		this.aFloat224 = 0.0F;
		this.aFloat215 = 0.0F;
		this.aFloat221 = arg1;
		this.aFloat223 = 0.0F;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)V")
	@Override
	public void method9248(@OriginalArg(0) int arg0) {
		this.aFloat221 = 1.0F;
		this.aFloat219 = this.aFloat214 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat223 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat216 = -this.aFloat223;
		this.aFloat225 = this.aFloat218 = this.aFloat215 = this.aFloat217 = this.aFloat222 = this.aFloat224 = this.aFloat220 = 0.0F;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()V")
	@Override
	public void method9249() {
		this.aFloat219 = this.aFloat214 = this.aFloat221 = 1.0F;
		this.aFloat223 = this.aFloat222 = this.aFloat216 = this.aFloat224 = this.aFloat225 = this.aFloat215 = this.aFloat218 = this.aFloat217 = this.aFloat220 = 0.0F;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method9247(@OriginalArg(0) Class239 arg0) {
		@Pc(6) Class239_Sub3 local6 = (Class239_Sub3) arg0;
		this.aFloat214 = local6.aFloat214;
		this.aFloat221 = local6.aFloat221;
		this.aFloat223 = local6.aFloat223;
		this.aFloat217 = local6.aFloat217;
		this.aFloat225 = local6.aFloat225;
		this.aFloat222 = local6.aFloat222;
		this.aFloat219 = local6.aFloat219;
		this.aFloat215 = local6.aFloat215;
		this.aFloat224 = local6.aFloat224;
		this.aFloat216 = local6.aFloat216;
		this.aFloat220 = local6.aFloat220;
		this.aFloat218 = local6.aFloat218;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
	@Override
	public void method9246(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class67.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat219;
		@Pc(21) float local21 = this.aFloat216;
		@Pc(24) float local24 = this.aFloat225;
		@Pc(27) float local27 = this.aFloat218;
		this.aFloat219 = local18 * local9 - local15 * this.aFloat223;
		this.aFloat223 = local9 * this.aFloat223 + local15 * local18;
		this.aFloat216 = local21 * local9 - this.aFloat214 * local15;
		this.aFloat225 = local9 * local24 - local15 * this.aFloat215;
		this.aFloat214 = local9 * this.aFloat214 + local15 * local21;
		this.aFloat215 = this.aFloat215 * local9 + local15 * local24;
		this.aFloat218 = local27 * local9 - local15 * this.aFloat217;
		this.aFloat217 = local27 * local15 + local9 * this.aFloat217;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!uu;Lclient!uu;)V")
	public void method9261(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class239 arg1) {
		@Pc(6) Class239_Sub3 local6 = (Class239_Sub3) arg0;
		@Pc(9) Class239_Sub3 local9 = (Class239_Sub3) arg1;
		this.aFloat219 = local6.aFloat219 * local9.aFloat219 + local6.aFloat216 * local9.aFloat223 + local6.aFloat225 * local9.aFloat222;
		this.aFloat223 = local9.aFloat222 * local6.aFloat215 + local9.aFloat219 * local6.aFloat223 + local6.aFloat214 * local9.aFloat223;
		this.aFloat216 = local9.aFloat224 * local6.aFloat225 + local6.aFloat219 * local9.aFloat216 + local6.aFloat216 * local9.aFloat214;
		this.aFloat222 = local9.aFloat222 * local6.aFloat221 + local9.aFloat223 * local6.aFloat224 + local9.aFloat219 * local6.aFloat222;
		this.aFloat214 = local6.aFloat215 * local9.aFloat224 + local9.aFloat216 * local6.aFloat223 + local9.aFloat214 * local6.aFloat214;
		this.aFloat224 = local9.aFloat224 * local6.aFloat221 + local9.aFloat216 * local6.aFloat222 + local6.aFloat224 * local9.aFloat214;
		this.aFloat225 = local9.aFloat215 * local6.aFloat216 + local6.aFloat219 * local9.aFloat225 + local9.aFloat221 * local6.aFloat225;
		this.aFloat215 = local6.aFloat215 * local9.aFloat221 + local9.aFloat215 * local6.aFloat214 + local9.aFloat225 * local6.aFloat223;
		this.aFloat218 = local6.aFloat219 * local9.aFloat218 + local9.aFloat217 * local6.aFloat216 + local9.aFloat220 * local6.aFloat225 + local6.aFloat218;
		this.aFloat221 = local6.aFloat221 * local9.aFloat221 + local6.aFloat222 * local9.aFloat225 + local6.aFloat224 * local9.aFloat215;
		this.aFloat217 = local9.aFloat220 * local6.aFloat215 + local6.aFloat214 * local9.aFloat217 + local9.aFloat218 * local6.aFloat223 + local6.aFloat217;
		this.aFloat220 = local6.aFloat220 + local6.aFloat221 * local9.aFloat220 + local6.aFloat224 * local9.aFloat217 + local6.aFloat222 * local9.aFloat218;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIF[F)V")
	public void method9262(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = this.aFloat221 * arg1 + this.aFloat222 * arg2 + this.aFloat224 * arg0;
		arg3[0] = this.aFloat225 * arg1 + arg2 * this.aFloat219 + this.aFloat216 * arg0;
		arg3[1] = this.aFloat215 * arg1 + arg0 * this.aFloat214 + arg2 * this.aFloat223;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([FB)[F")
	public float[] method9263(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[12] = 0.0F;
		arg0[11] = this.aFloat220;
		arg0[15] = 1.0F;
		arg0[7] = this.aFloat217;
		arg0[5] = this.aFloat214;
		arg0[3] = this.aFloat218;
		arg0[4] = this.aFloat223;
		arg0[2] = this.aFloat225;
		arg0[8] = this.aFloat222;
		arg0[1] = this.aFloat216;
		arg0[10] = this.aFloat221;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat219;
		arg0[9] = this.aFloat224;
		arg0[6] = this.aFloat215;
		return arg0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B[F)[F")
	public float[] method9264(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat216;
		arg0[6] = this.aFloat215;
		arg0[2] = this.aFloat225;
		arg0[3] = this.aFloat218;
		arg0[5] = this.aFloat214;
		arg0[7] = this.aFloat217;
		arg0[4] = this.aFloat223;
		arg0[0] = this.aFloat219;
		return arg0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "([FB)[F")
	public float[] method9266(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloat218;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat219;
		arg0[13] = this.aFloat217;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat214;
		arg0[7] = 0.0F;
		arg0[14] = this.aFloat220;
		arg0[1] = this.aFloat223;
		arg0[9] = this.aFloat215;
		arg0[4] = this.aFloat216;
		arg0[8] = this.aFloat225;
		arg0[6] = this.aFloat224;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat222;
		arg0[10] = this.aFloat221;
		return arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method9235() {
		@Pc(7) Class239_Sub3 local7 = new Class239_Sub3();
		local7.aFloat221 = this.aFloat221;
		local7.aFloat214 = this.aFloat214;
		local7.aFloat215 = this.aFloat215;
		local7.aFloat224 = this.aFloat224;
		local7.aFloat225 = this.aFloat225;
		local7.aFloat222 = this.aFloat222;
		local7.aFloat220 = this.aFloat220;
		local7.aFloat216 = this.aFloat216;
		local7.aFloat219 = this.aFloat219;
		local7.aFloat217 = this.aFloat217;
		local7.aFloat223 = this.aFloat223;
		local7.aFloat218 = this.aFloat218;
		return local7;
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
	@Override
	public void method9250(@OriginalArg(0) int arg0) {
		this.aFloat219 = 1.0F;
		this.aFloat214 = this.aFloat221 = Class67.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat224 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat216 = this.aFloat225 = this.aFloat218 = this.aFloat223 = this.aFloat217 = this.aFloat222 = this.aFloat220 = 0.0F;
		this.aFloat215 = -this.aFloat224;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFIFFFFFF)V")
	public void method9267(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat217 = 0.0F;
		this.aFloat222 = arg6;
		this.aFloat220 = (float) 0;
		this.aFloat223 = arg2;
		this.aFloat225 = arg0;
		this.aFloat215 = arg3;
		this.aFloat216 = arg1;
		this.aFloat224 = arg5;
		this.aFloat221 = arg8;
		this.aFloat219 = arg7;
		this.aFloat218 = 0.0F;
		this.aFloat214 = arg4;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFZFFII)V")
	public void method9268(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat214 = (float) (arg5 * 2);
			this.aFloat218 = arg2 - (float) arg4;
			this.aFloat223 = this.aFloat222 = this.aFloat216 = this.aFloat224 = this.aFloat225 = this.aFloat215 = 0.0F;
			this.aFloat217 = arg1 - (float) arg5;
			this.aFloat221 = 1.0F;
			this.aFloat220 = arg3;
			this.aFloat219 = (float) (arg4 * 2);
			return;
		}
		@Pc(15) float local15 = Class67.aFloatArray14[arg0 & 0x3FFF];
		@Pc(21) float local21 = Class67.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat218 = arg2 + (local21 * 0.5F - local15 * 0.5F) * (float) (arg4 * 2);
		this.aFloat223 = (float) arg4 * local21 * 2.0F;
		this.aFloat216 = (float) arg5 * local21 * -2.0F;
		this.aFloat220 = arg3;
		this.aFloat222 = this.aFloat224 = this.aFloat225 = this.aFloat215 = 0.0F;
		this.aFloat217 = (-0.5F * local21 - local15 * 0.5F) * (float) (arg5 * 2) + arg1;
		this.aFloat219 = local15 * 2.0F * (float) arg4;
		this.aFloat221 = 1.0F;
		this.aFloat214 = (float) arg5 * local15 * 2.0F;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	@Override
	public void method9234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat219 = this.aFloat214 = this.aFloat221 = 1.0F;
		this.aFloat218 = (float) arg0;
		this.aFloat217 = (float) arg1;
		this.aFloat220 = (float) arg2;
		this.aFloat223 = this.aFloat222 = this.aFloat216 = this.aFloat224 = this.aFloat225 = this.aFloat215 = 0.0F;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat221 + (float) arg0 * this.aFloat222 + (float) arg1 * this.aFloat224);
		arg3[1] = (int) ((float) arg0 * this.aFloat223 + (float) arg1 * this.aFloat214 + (float) arg2 * this.aFloat215);
		arg3[0] = (int) ((float) arg2 * this.aFloat225 + this.aFloat219 * (float) arg0 + (float) arg1 * this.aFloat216);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([I)V")
	@Override
	public void method9241(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat218;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat217;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat220;
		arg0[1] = (int) (local28 * this.aFloat224 + local11 * this.aFloat216 + local19 * this.aFloat214);
		arg0[0] = (int) (this.aFloat222 * local28 + this.aFloat223 * local19 + local11 * this.aFloat219);
		arg0[2] = (int) (this.aFloat221 * local28 + local19 * this.aFloat215 + local11 * this.aFloat225);
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(I)V")
	public void method9269() {
		this.aFloat215 = -this.aFloat215;
		this.aFloat214 = -this.aFloat214;
		this.aFloat217 = -this.aFloat217;
		this.aFloat221 = -this.aFloat221;
		this.aFloat223 = -this.aFloat223;
		this.aFloat220 = -this.aFloat220;
		this.aFloat222 = -this.aFloat222;
		this.aFloat224 = -this.aFloat224;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FIFFF[F)V")
	public void method9270(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = this.aFloat215 * arg1 + arg3 * this.aFloat223 + this.aFloat214 * arg0;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		@Pc(35) float local35;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg2 / arg3;
			local43 = local35 * this.aFloat222 + this.aFloat220;
			local51 = this.aFloat219 * local35 + this.aFloat218;
			local59 = this.aFloat217 + local35 * this.aFloat223;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local35 = -arg2 / arg0;
			local59 = this.aFloat217 + local35 * this.aFloat214;
			local51 = this.aFloat218 + local35 * this.aFloat216;
			local43 = local35 * this.aFloat224 + this.aFloat220;
		} else {
			local35 = -arg2 / arg1;
			local43 = this.aFloat220 + this.aFloat221 * local35;
			local51 = local35 * this.aFloat225 + this.aFloat218;
			local59 = local35 * this.aFloat215 + this.aFloat217;
		}
		arg4[0] = arg1 * this.aFloat225 + this.aFloat216 * arg0 + arg3 * this.aFloat219;
		arg4[2] = arg3 * this.aFloat222 + this.aFloat224 * arg0 + this.aFloat221 * arg1;
		arg4[3] = -(arg4[2] * local43 + local59 * arg4[1] + local51 * arg4[0]);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IFFF)V")
	public void method9271(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat218 += arg2;
		this.aFloat220 += arg0;
		this.aFloat217 += arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZFFF)F")
	public float method9272(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat217 + this.aFloat215 * arg0 + this.aFloat223 * arg2 + this.aFloat214 * arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFB)V")
	public void method9273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat223 = this.aFloat222 = this.aFloat216 = this.aFloat224 = this.aFloat225 = this.aFloat215 = 0.0F;
		this.aFloat219 = this.aFloat214 = this.aFloat221 = 1.0F;
		this.aFloat217 = arg2;
		this.aFloat220 = arg0;
		this.aFloat218 = arg1;
	}
}
