import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	private int anInt4362;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private int anInt4364;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private int anInt4367;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	private int anInt4365 = 0;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private int anInt4366 = -1;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	private int anInt4363 = 0;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	private int anInt4368 = -1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class93_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4361 = arg0;
		this.anInt4354 = arg1;
		this.anInt4356 = arg2;
		this.anInt4360 = arg3;
		this.anInt4355 = arg4;
		this.anInt4359 = arg5;
		this.method3565(arg6, arg7);
		this.method3567();
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class93_Sub2(@OriginalArg(0) Class93_Sub1 arg0) {
		this.anInt4355 = arg0.anInt4355;
		this.anInt4359 = arg0.anInt4359;
		this.anInt4356 = arg0.anInt4356;
		this.anInt4360 = arg0.anInt4360;
		this.anInt4361 = arg0.anInt4361;
		this.anInt4354 = arg0.anInt4354;
		this.method3565(arg0.aByteArray34, arg0.anIntArray323);
		this.method3567();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([B[I)V")
	private void method3565(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt4367 = Static305.method4628(this.anInt4355);
		this.anInt4362 = Static305.method4628(this.anInt4359);
		@Pc(20) byte[] local20 = new byte[this.anInt4367 * this.anInt4362 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4359; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4355; local32++) {
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
			local22 += (this.anInt4367 - this.anInt4355) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static116.aGL1;
		if (this.anInt4366 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt4366 = local102[0];
			this.anInt4364 = Static124.anInt2871;
		}
		Static116.method1945(this.anInt4366);
		local95.glTexImage2D(3553, 0, 6408, this.anInt4367, this.anInt4362, 0, 6408, 5121, local93);
		Static124.anInt2873 += local93.limit() - this.anInt4363;
		this.anInt4363 = local93.limit();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	private void method3566() {
		if (this.anInt4365 != 1) {
			this.anInt4365 = 1;
			@Pc(9) GL local9 = Static116.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.method1959();
		@Pc(5) int local5 = arg0 + this.anInt4356;
		@Pc(10) int local10 = arg1 + this.anInt4360;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt4366);
		this.method3566();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		local12.glCallList(this.anInt4368);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4366 != -1) {
			Static124.method2209(this.anInt4366, this.anInt4363, this.anInt4364);
			this.anInt4366 = -1;
			this.anInt4363 = 0;
		}
		if (this.anInt4368 != -1) {
			Static124.method2214(this.anInt4368, this.anInt4364);
			this.anInt4368 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	private void method3567() {
		@Pc(7) float local7 = (float) this.anInt4355 / (float) this.anInt4367;
		@Pc(15) float local15 = (float) this.anInt4359 / (float) this.anInt4362;
		@Pc(17) GL local17 = Static116.aGL1;
		if (this.anInt4368 == -1) {
			this.anInt4368 = local17.glGenLists(1);
			this.anInt4364 = Static124.anInt2871;
		}
		local17.glNewList(this.anInt4368, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4355, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4359);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4355, (float) -this.anInt4359);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	@Override
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.method1941();
		@Pc(5) int local5 = arg0 + this.anInt4356;
		@Pc(10) int local10 = arg1 + this.anInt4360;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt4366);
		this.method3566();
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		local12.glCallList(this.anInt4368);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!of;)V")
	public void method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub8_Sub1_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		Static116.method1941();
		Static116.method1945(arg2.anInt5526);
		arg2.method4382(1);
		@Pc(11) GL local11 = Static116.aGL1;
		Static116.method1945(this.anInt4366);
		this.method3566();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt5526);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static111.anInt2522) / (float) arg2.anInt5529;
		@Pc(56) float local56 = (float) (arg1 - Static111.anInt2524) / (float) arg2.anInt5530;
		@Pc(68) float local68 = (float) (arg0 + this.anInt4355 - Static111.anInt2522) / (float) arg2.anInt5529;
		@Pc(80) float local80 = (float) (arg1 + this.anInt4359 - Static111.anInt2524) / (float) arg2.anInt5530;
		@Pc(85) int local85 = arg0 + this.anInt4356;
		@Pc(90) int local90 = arg1 + this.anInt4360;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt4355 / (float) this.anInt4367;
		@Pc(115) float local115 = (float) this.anInt4359 / (float) this.anInt4362;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt4355), (float) (Static116.anInt2590 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static116.anInt2590 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static116.anInt2590 - local90 - this.anInt4359));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt4355), (float) (Static116.anInt2590 - local90 - this.anInt4359));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}
}
