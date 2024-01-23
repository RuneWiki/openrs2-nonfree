import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	private int anInt3415;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	private int anInt3418 = -1;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	private int anInt3420 = 0;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	private int anInt3414 = -1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class56_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt3412 = arg0;
		this.anInt3410 = arg1;
		this.anInt3404 = arg2;
		this.anInt3405 = arg3;
		this.anInt3408 = arg4;
		this.anInt3413 = arg5;
		this.method2832(arg6, arg7);
		this.method2830();
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class56_Sub2(@OriginalArg(0) Class56_Sub1 arg0) {
		this.anInt3408 = arg0.anInt3408;
		this.anInt3413 = arg0.anInt3413;
		this.anInt3404 = arg0.anInt3404;
		this.anInt3405 = arg0.anInt3405;
		this.anInt3412 = arg0.anInt3412;
		this.anInt3410 = arg0.anInt3410;
		this.method2832(arg0.aByteArray15, arg0.anIntArray120);
		this.method2830();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	@Override
	public void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static94.method1596();
		@Pc(5) int local5 = arg0 + this.anInt3404;
		@Pc(10) int local10 = arg1 + this.anInt3405;
		@Pc(12) GL local12 = Static94.aGL1;
		Static94.method1600(this.anInt3418);
		this.method2831();
		local12.glTranslatef((float) local5, (float) (Static94.anInt2083 - local10), 0.0F);
		local12.glCallList(this.anInt3414);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3418 != -1) {
			Static173.method2735(this.anInt3418, this.anInt3419, this.anInt3415);
			this.anInt3418 = -1;
			this.anInt3419 = 0;
		}
		if (this.anInt3414 != -1) {
			Static173.method2730(this.anInt3414, this.anInt3415);
			this.anInt3414 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	private void method2830() {
		@Pc(7) float local7 = (float) this.anInt3408 / (float) this.anInt3416;
		@Pc(15) float local15 = (float) this.anInt3413 / (float) this.anInt3417;
		@Pc(17) GL local17 = Static94.aGL1;
		if (this.anInt3414 == -1) {
			this.anInt3414 = local17.glGenLists(1);
			this.anInt3415 = Static173.anInt3332;
		}
		local17.glNewList(this.anInt3414, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt3408, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt3413);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt3408, (float) -this.anInt3413);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	@Override
	public void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static94.method1625();
		@Pc(5) int local5 = arg0 + this.anInt3404;
		@Pc(10) int local10 = arg1 + this.anInt3405;
		@Pc(12) GL local12 = Static94.aGL1;
		Static94.method1600(this.anInt3418);
		this.method2831();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static94.anInt2083 - local10), 0.0F);
		local12.glCallList(this.anInt3414);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	private void method2831() {
		if (this.anInt3420 != 1) {
			this.anInt3420 = 1;
			@Pc(9) GL local9 = Static94.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([B[I)V")
	private void method2832(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3416 = Static161.method2608(this.anInt3408);
		this.anInt3417 = Static161.method2608(this.anInt3413);
		@Pc(20) byte[] local20 = new byte[this.anInt3416 * this.anInt3417 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt3413; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt3408; local32++) {
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
			local22 += (this.anInt3416 - this.anInt3408) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static94.aGL1;
		if (this.anInt3418 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3418 = local102[0];
			this.anInt3415 = Static173.anInt3332;
		}
		Static94.method1600(this.anInt3418);
		local95.glTexImage2D(3553, 0, 6408, this.anInt3416, this.anInt3417, 0, 6408, 5121, local93);
		Static173.anInt3333 += local93.limit() - this.anInt3419;
		this.anInt3419 = local93.limit();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!oa;)V")
	public void method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub3_Sub14_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		Static94.method1596();
		Static94.method1600(arg2.anInt5615);
		arg2.method4558(1);
		@Pc(11) GL local11 = Static94.aGL1;
		Static94.method1600(this.anInt3418);
		this.method2831();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt5615);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static104.anInt2150) / (float) arg2.anInt5618;
		@Pc(56) float local56 = (float) (arg1 - Static104.anInt2152) / (float) arg2.anInt5621;
		@Pc(68) float local68 = (float) (arg0 + this.anInt3408 - Static104.anInt2150) / (float) arg2.anInt5618;
		@Pc(80) float local80 = (float) (arg1 + this.anInt3413 - Static104.anInt2152) / (float) arg2.anInt5621;
		@Pc(85) int local85 = arg0 + this.anInt3404;
		@Pc(90) int local90 = arg1 + this.anInt3405;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt3408 / (float) this.anInt3416;
		@Pc(115) float local115 = (float) this.anInt3413 / (float) this.anInt3417;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt3408), (float) (Static94.anInt2083 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static94.anInt2083 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static94.anInt2083 - local90 - this.anInt3413));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt3408), (float) (Static94.anInt2083 - local90 - this.anInt3413));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}
}
