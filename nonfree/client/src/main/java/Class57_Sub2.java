import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	private int anInt3772;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	private int anInt3771 = -1;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	private int anInt3775 = -1;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	private int anInt3776 = 0;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	private int anInt3773 = 0;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt3770 = arg0;
		this.anInt3763 = arg1;
		this.anInt3762 = arg2;
		this.anInt3769 = arg3;
		this.anInt3768 = arg4;
		this.anInt3766 = arg5;
		this.method3336(arg6, arg7);
		this.method3334();
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class57_Sub2(@OriginalArg(0) Class57_Sub1 arg0) {
		this.anInt3768 = arg0.anInt3768;
		this.anInt3766 = arg0.anInt3766;
		this.anInt3762 = arg0.anInt3762;
		this.anInt3769 = arg0.anInt3769;
		this.anInt3770 = arg0.anInt3770;
		this.anInt3763 = arg0.anInt3763;
		this.method3336(arg0.aByteArray59, arg0.anIntArray136);
		this.method3334();
	}

	@OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3775 != -1) {
			Static162.method2793(this.anInt3775, this.anInt3773, this.anInt3772);
			this.anInt3775 = -1;
			this.anInt3773 = 0;
		}
		if (this.anInt3771 != -1) {
			Static162.method2797(this.anInt3771, this.anInt3772);
			this.anInt3771 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!ko;)V")
	public void method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5_Sub6_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		Static71.method1396();
		Static71.method1400(arg2.anInt3630);
		arg2.method3209(1);
		@Pc(11) GL local11 = Static71.aGL1;
		Static71.method1400(this.anInt3775);
		this.method3335();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt3630);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static93.anInt1944) / (float) arg2.anInt3628;
		@Pc(56) float local56 = (float) (arg1 - Static93.anInt1942) / (float) arg2.anInt3632;
		@Pc(68) float local68 = (float) (arg0 + this.anInt3768 - Static93.anInt1944) / (float) arg2.anInt3628;
		@Pc(80) float local80 = (float) (arg1 + this.anInt3766 - Static93.anInt1942) / (float) arg2.anInt3632;
		@Pc(85) int local85 = arg0 + this.anInt3762;
		@Pc(90) int local90 = arg1 + this.anInt3769;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt3768 / (float) this.anInt3777;
		@Pc(115) float local115 = (float) this.anInt3766 / (float) this.anInt3774;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt3768), (float) (Static71.anInt1537 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static71.anInt1537 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static71.anInt1537 - local90 - this.anInt3766));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt3768), (float) (Static71.anInt1537 - local90 - this.anInt3766));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	private void method3334() {
		@Pc(7) float local7 = (float) this.anInt3768 / (float) this.anInt3777;
		@Pc(15) float local15 = (float) this.anInt3766 / (float) this.anInt3774;
		@Pc(17) GL local17 = Static71.aGL1;
		if (this.anInt3771 == -1) {
			this.anInt3771 = local17.glGenLists(1);
			this.anInt3772 = Static162.anInt3245;
		}
		local17.glNewList(this.anInt3771, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt3768, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt3766);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt3768, (float) -this.anInt3766);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	private void method3335() {
		if (this.anInt3776 != 1) {
			this.anInt3776 = 1;
			@Pc(9) GL local9 = Static71.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	@Override
	public void method3328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static71.method1397();
		@Pc(5) int local5 = arg0 + this.anInt3762;
		@Pc(10) int local10 = arg1 + this.anInt3769;
		@Pc(12) GL local12 = Static71.aGL1;
		Static71.method1400(this.anInt3775);
		this.method3335();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static71.anInt1537 - local10), 0.0F);
		local12.glCallList(this.anInt3771);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([B[I)V")
	private void method3336(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3777 = Static138.method3842(this.anInt3768);
		this.anInt3774 = Static138.method3842(this.anInt3766);
		@Pc(20) byte[] local20 = new byte[this.anInt3777 * this.anInt3774 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt3766; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt3768; local32++) {
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
			local22 += (this.anInt3777 - this.anInt3768) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static71.aGL1;
		if (this.anInt3775 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3775 = local102[0];
			this.anInt3772 = Static162.anInt3245;
		}
		Static71.method1400(this.anInt3775);
		local95.glTexImage2D(3553, 0, 6408, this.anInt3777, this.anInt3774, 0, 6408, 5121, local93);
		Static162.anInt3247 += local93.limit() - this.anInt3773;
		this.anInt3773 = local93.limit();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
	@Override
	public void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static71.method1396();
		@Pc(5) int local5 = arg0 + this.anInt3762;
		@Pc(10) int local10 = arg1 + this.anInt3769;
		@Pc(12) GL local12 = Static71.aGL1;
		Static71.method1400(this.anInt3775);
		this.method3335();
		local12.glTranslatef((float) local5, (float) (Static71.anInt1537 - local10), 0.0F);
		local12.glCallList(this.anInt3771);
		local12.glLoadIdentity();
	}
}
