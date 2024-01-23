import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
	private int anInt4480;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	private int anInt4482;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
	private int anInt4483;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	private int anInt4479 = 0;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	private int anInt4481 = -1;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	private int anInt4477 = -1;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	private int anInt4478 = 0;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4476 = arg0;
		this.anInt4468 = arg1;
		this.anInt4470 = arg2;
		this.anInt4472 = arg3;
		this.anInt4473 = arg4;
		this.anInt4469 = arg5;
		this.method3915(arg6, arg7);
		this.method3913();
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class23_Sub2(@OriginalArg(0) Class23_Sub1 arg0) {
		this.anInt4473 = arg0.anInt4473;
		this.anInt4469 = arg0.anInt4469;
		this.anInt4470 = arg0.anInt4470;
		this.anInt4472 = arg0.anInt4472;
		this.anInt4476 = arg0.anInt4476;
		this.anInt4468 = arg0.anInt4468;
		this.method3915(arg0.aByteArray18, arg0.anIntArray131);
		this.method3913();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!af;)V")
	public void method3912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub1_Sub1 arg2) {
		if (arg2 == null) {
			return;
		}
		Static156.method2673();
		Static156.method2699(arg2.anInt2999);
		arg2.method2608(1);
		@Pc(11) GL local11 = Static156.aGL1;
		Static156.method2699(this.anInt4477);
		this.method3914();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt2999);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static119.anInt2496) / (float) arg2.anInt2993;
		@Pc(56) float local56 = (float) (arg1 - Static119.anInt2497) / (float) arg2.anInt2995;
		@Pc(68) float local68 = (float) (arg0 + this.anInt4473 - Static119.anInt2496) / (float) arg2.anInt2993;
		@Pc(80) float local80 = (float) (arg1 + this.anInt4469 - Static119.anInt2497) / (float) arg2.anInt2995;
		@Pc(85) int local85 = arg0 + this.anInt4470;
		@Pc(90) int local90 = arg1 + this.anInt4472;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt4473 / (float) this.anInt4483;
		@Pc(115) float local115 = (float) this.anInt4469 / (float) this.anInt4482;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt4473), (float) (Static156.anInt3095 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static156.anInt3095 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static156.anInt3095 - local90 - this.anInt4469));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt4473), (float) (Static156.anInt3095 - local90 - this.anInt4469));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	private void method3913() {
		@Pc(7) float local7 = (float) this.anInt4473 / (float) this.anInt4483;
		@Pc(15) float local15 = (float) this.anInt4469 / (float) this.anInt4482;
		@Pc(17) GL local17 = Static156.aGL1;
		if (this.anInt4481 == -1) {
			this.anInt4481 = local17.glGenLists(1);
			this.anInt4480 = Static10.anInt142;
		}
		local17.glNewList(this.anInt4481, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4473, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4469);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4473, (float) -this.anInt4469);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4477 != -1) {
			Static10.method131(this.anInt4477, this.anInt4479, this.anInt4480);
			this.anInt4477 = -1;
			this.anInt4479 = 0;
		}
		if (this.anInt4481 != -1) {
			Static10.method133(this.anInt4481, this.anInt4480);
			this.anInt4481 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	private void method3914() {
		if (this.anInt4478 != 1) {
			this.anInt4478 = 1;
			@Pc(9) GL local9 = Static156.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	@Override
	public void method3907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static156.method2678();
		@Pc(5) int local5 = arg0 + this.anInt4470;
		@Pc(10) int local10 = arg1 + this.anInt4472;
		@Pc(12) GL local12 = Static156.aGL1;
		Static156.method2699(this.anInt4477);
		this.method3914();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static156.anInt3095 - local10), 0.0F);
		local12.glCallList(this.anInt4481);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([B[I)V")
	private void method3915(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt4483 = Static218.method1098(this.anInt4473);
		this.anInt4482 = Static218.method1098(this.anInt4469);
		@Pc(20) byte[] local20 = new byte[this.anInt4483 * this.anInt4482 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4469; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4473; local32++) {
				@Pc(41) byte local41 = arg0[local24++];
				if (local41 == 0) {
					local22 += 4;
				} else {
					@Pc(47) int local47 = arg1[local41];
					local20[local22++] = (byte) (local47 >> 16);
					local20[local22++] = (byte) (local47 >> 8);
					local20[local22++] = (byte) local47;
					local20[local22++] = -1;
				}
			}
			local22 += (this.anInt4483 - this.anInt4473) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static156.aGL1;
		if (this.anInt4477 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt4477 = local102[0];
			this.anInt4480 = Static10.anInt142;
		}
		Static156.method2699(this.anInt4477);
		local95.glTexImage2D(3553, 0, 6408, this.anInt4483, this.anInt4482, 0, 6408, 5121, local93);
		Static10.anInt143 += local93.limit() - this.anInt4479;
		this.anInt4479 = local93.limit();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	@Override
	public void method3909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static156.method2673();
		@Pc(5) int local5 = arg0 + this.anInt4470;
		@Pc(10) int local10 = arg1 + this.anInt4472;
		@Pc(12) GL local12 = Static156.aGL1;
		Static156.method2699(this.anInt4477);
		this.method3914();
		local12.glTranslatef((float) local5, (float) (Static156.anInt3095 - local10), 0.0F);
		local12.glCallList(this.anInt4481);
		local12.glLoadIdentity();
	}
}
