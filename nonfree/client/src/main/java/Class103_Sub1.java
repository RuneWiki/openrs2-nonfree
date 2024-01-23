import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	private int anInt3043;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	private int anInt3045;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	private int anInt3047;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	private int anInt3044 = 0;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private int anInt3046 = -1;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	private int anInt3048 = -1;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	private int anInt3049 = 0;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class103_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5860 = arg0;
		this.anInt5856 = arg1;
		this.anInt5851 = arg2;
		this.anInt5854 = arg3;
		this.anInt5857 = arg4;
		this.anInt5858 = arg5;
		this.method2437(arg6, arg7);
		this.method2438();
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!wi;)V")
	public Class103_Sub1(@OriginalArg(0) Class103_Sub2 arg0) {
		this.anInt5857 = arg0.anInt5857;
		this.anInt5858 = arg0.anInt5858;
		this.anInt5851 = arg0.anInt5851;
		this.anInt5854 = arg0.anInt5854;
		this.anInt5860 = arg0.anInt5860;
		this.anInt5856 = arg0.anInt5856;
		this.method2437(arg0.aByteArray74, arg0.anIntArray534);
		this.method2438();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([B[I)V")
	private void method2437(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3047 = Static203.method3254(this.anInt5857);
		this.anInt3043 = Static203.method3254(this.anInt5858);
		@Pc(20) byte[] local20 = new byte[this.anInt3047 * this.anInt3043 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5858; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5857; local32++) {
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
			local22 += (this.anInt3047 - this.anInt5857) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static291.aGL1;
		if (this.anInt3048 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3048 = local102[0];
			this.anInt3045 = Static74.anInt1419;
		}
		Static291.method4310(this.anInt3048);
		local95.glTexImage2D(3553, 0, 6408, this.anInt3047, this.anInt3043, 0, 6408, 5121, local93);
		Static74.anInt1417 += local93.limit() - this.anInt3049;
		this.anInt3049 = local93.limit();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	private void method2438() {
		@Pc(7) float local7 = (float) this.anInt5857 / (float) this.anInt3047;
		@Pc(15) float local15 = (float) this.anInt5858 / (float) this.anInt3043;
		@Pc(17) GL local17 = Static291.aGL1;
		if (this.anInt3046 == -1) {
			this.anInt3046 = local17.glGenLists(1);
			this.anInt3045 = Static74.anInt1419;
		}
		local17.glNewList(this.anInt3046, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5857, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5858);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5857, (float) -this.anInt5858);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!bg;)V")
	public void method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3_Sub1 arg2) {
		if (arg2 == null) {
			return;
		}
		Static291.method4311();
		Static291.method4310(arg2.anInt5892);
		arg2.method4645(1);
		@Pc(11) GL local11 = Static291.aGL1;
		Static291.method4310(this.anInt3048);
		this.method2440();
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt5892);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static133.anInt2675) / (float) arg2.anInt5890;
		@Pc(56) float local56 = (float) (arg1 - Static133.anInt2677) / (float) arg2.anInt5891;
		@Pc(68) float local68 = (float) (arg0 + this.anInt5857 - Static133.anInt2675) / (float) arg2.anInt5890;
		@Pc(80) float local80 = (float) (arg1 + this.anInt5858 - Static133.anInt2677) / (float) arg2.anInt5891;
		@Pc(85) int local85 = arg0 + this.anInt5851;
		@Pc(90) int local90 = arg1 + this.anInt5854;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt5857 / (float) this.anInt3047;
		@Pc(115) float local115 = (float) this.anInt5858 / (float) this.anInt3043;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt5857), (float) (Static291.anInt5512 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static291.anInt5512 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static291.anInt5512 - local90 - this.anInt5858));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt5857), (float) (Static291.anInt5512 - local90 - this.anInt5858));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	private void method2440() {
		if (this.anInt3044 != 1) {
			this.anInt3044 = 1;
			@Pc(9) GL local9 = Static291.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3048 != -1) {
			Static74.method1187(this.anInt3048, this.anInt3049, this.anInt3045);
			this.anInt3048 = -1;
			this.anInt3049 = 0;
		}
		if (this.anInt3046 != -1) {
			Static74.method1191(this.anInt3046, this.anInt3045);
			this.anInt3046 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	@Override
	public void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static291.method4311();
		@Pc(5) int local5 = arg0 + this.anInt5851;
		@Pc(10) int local10 = arg1 + this.anInt5854;
		@Pc(12) GL local12 = Static291.aGL1;
		Static291.method4310(this.anInt3048);
		this.method2440();
		local12.glTranslatef((float) local5, (float) (Static291.anInt5512 - local10), 0.0F);
		local12.glCallList(this.anInt3046);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	@Override
	public void method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static291.method4327();
		@Pc(5) int local5 = arg0 + this.anInt5851;
		@Pc(10) int local10 = arg1 + this.anInt5854;
		@Pc(12) GL local12 = Static291.aGL1;
		Static291.method4310(this.anInt3048);
		this.method2440();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static291.anInt5512 - local10), 0.0F);
		local12.glCallList(this.anInt3046);
		local12.glLoadIdentity();
	}
}
