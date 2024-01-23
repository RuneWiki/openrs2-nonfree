import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	private int anInt4761;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
	private int anInt4764;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
	private int anInt4765;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	private int anInt4760 = -1;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	private int anInt4759 = -1;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	private int anInt4762 = 0;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	private int anInt4763 = 0;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class46_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4745 = arg0;
		this.anInt4747 = arg1;
		this.anInt4748 = arg2;
		this.anInt4752 = arg3;
		this.anInt4753 = arg4;
		this.anInt4751 = arg5;
		this.method3530(arg6, arg7);
		this.method3531();
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class46_Sub2(@OriginalArg(0) Class46_Sub1 arg0) {
		this.anInt4753 = arg0.anInt4753;
		this.anInt4751 = arg0.anInt4751;
		this.anInt4748 = arg0.anInt4748;
		this.anInt4752 = arg0.anInt4752;
		this.anInt4745 = arg0.anInt4745;
		this.anInt4747 = arg0.anInt4747;
		this.method3530(arg0.aByteArray57, arg0.anIntArray317);
		this.method3531();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	@Override
	public void method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static294.method4489();
		@Pc(5) int local5 = arg0 + this.anInt4748;
		@Pc(10) int local10 = arg1 + this.anInt4752;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt4760);
		this.method3532();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		local12.glCallList(this.anInt4759);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static294.method4520();
		@Pc(5) int local5 = arg0 + this.anInt4748;
		@Pc(10) int local10 = arg1 + this.anInt4752;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt4760);
		this.method3532();
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		local12.glCallList(this.anInt4759);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!we;)V")
	public void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub13_Sub1 arg2) {
		if (arg2 == null) {
			return;
		}
		Static294.method4520();
		Static294.method4486(arg2.anInt3658);
		arg2.method2667(1);
		@Pc(11) GL local11 = Static294.aGL1;
		Static294.method4486(this.anInt4760);
		this.method3532();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt3658);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static156.anInt3504) / (float) arg2.anInt3655;
		@Pc(56) float local56 = (float) (arg1 - Static156.anInt3501) / (float) arg2.anInt3652;
		@Pc(68) float local68 = (float) (arg0 + this.anInt4753 - Static156.anInt3504) / (float) arg2.anInt3655;
		@Pc(80) float local80 = (float) (arg1 + this.anInt4751 - Static156.anInt3501) / (float) arg2.anInt3652;
		@Pc(85) int local85 = arg0 + this.anInt4748;
		@Pc(90) int local90 = arg1 + this.anInt4752;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt4753 / (float) this.anInt4764;
		@Pc(115) float local115 = (float) this.anInt4751 / (float) this.anInt4765;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt4753), (float) (Static294.anInt5874 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static294.anInt5874 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static294.anInt5874 - local90 - this.anInt4751));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt4753), (float) (Static294.anInt5874 - local90 - this.anInt4751));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[I)V")
	private void method3530(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt4764 = Static315.method4766(this.anInt4753);
		this.anInt4765 = Static315.method4766(this.anInt4751);
		@Pc(20) byte[] local20 = new byte[this.anInt4764 * this.anInt4765 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4751; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4753; local32++) {
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
			local22 += (this.anInt4764 - this.anInt4753) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static294.aGL1;
		if (this.anInt4760 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt4760 = local102[0];
			this.anInt4761 = Static113.anInt2464;
		}
		Static294.method4486(this.anInt4760);
		local95.glTexImage2D(3553, 0, 6408, this.anInt4764, this.anInt4765, 0, 6408, 5121, local93);
		Static113.anInt2466 += local93.limit() - this.anInt4762;
		this.anInt4762 = local93.limit();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	private void method3531() {
		@Pc(7) float local7 = (float) this.anInt4753 / (float) this.anInt4764;
		@Pc(15) float local15 = (float) this.anInt4751 / (float) this.anInt4765;
		@Pc(17) GL local17 = Static294.aGL1;
		if (this.anInt4759 == -1) {
			this.anInt4759 = local17.glGenLists(1);
			this.anInt4761 = Static113.anInt2464;
		}
		local17.glNewList(this.anInt4759, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4753, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4751);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4753, (float) -this.anInt4751);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	private void method3532() {
		if (this.anInt4763 != 1) {
			this.anInt4763 = 1;
			@Pc(9) GL local9 = Static294.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4760 != -1) {
			Static113.method1833(this.anInt4760, this.anInt4762, this.anInt4761);
			this.anInt4760 = -1;
			this.anInt4762 = 0;
		}
		if (this.anInt4759 != -1) {
			Static113.method1834(this.anInt4759, this.anInt4761);
			this.anInt4759 = -1;
		}
		super.finalize();
	}
}
