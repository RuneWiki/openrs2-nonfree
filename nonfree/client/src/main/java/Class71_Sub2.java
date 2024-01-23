import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	private int anInt5777;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
	private int anInt5779;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	private int anInt5776 = 0;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	private int anInt5774 = -1;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
	private int anInt5778 = 0;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	private int anInt5775 = -1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class71_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5770 = arg0;
		this.anInt5769 = arg1;
		this.anInt5763 = arg2;
		this.anInt5764 = arg3;
		this.anInt5766 = arg4;
		this.anInt5767 = arg5;
		this.method4634(arg6, arg7);
		this.method4635();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	private void method4633() {
		if (this.anInt5778 != 1) {
			this.anInt5778 = 1;
			@Pc(9) GL local9 = Static60.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	@Override
	public void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static60.method1153();
		@Pc(5) int local5 = arg0 + this.anInt5763;
		@Pc(10) int local10 = arg1 + this.anInt5764;
		@Pc(12) GL local12 = Static60.aGL1;
		Static60.method1157(this.anInt5775);
		this.method4633();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static60.anInt1344 - local10), 0.0F);
		local12.glCallList(this.anInt5774);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([B[I)V")
	private void method4634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt5773 = Static7.method217(this.anInt5766);
		this.anInt5779 = Static7.method217(this.anInt5767);
		@Pc(20) byte[] local20 = new byte[this.anInt5773 * this.anInt5779 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5767; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5766; local32++) {
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
			local22 += (this.anInt5773 - this.anInt5766) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static60.aGL1;
		if (this.anInt5775 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt5775 = local102[0];
			this.anInt5777 = Static256.anInt5185;
		}
		Static60.method1157(this.anInt5775);
		local95.glTexImage2D(3553, 0, 6408, this.anInt5773, this.anInt5779, 0, 6408, 5121, local93);
		Static256.anInt5186 += local93.limit() - this.anInt5776;
		this.anInt5776 = local93.limit();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	private void method4635() {
		@Pc(7) float local7 = (float) this.anInt5766 / (float) this.anInt5773;
		@Pc(15) float local15 = (float) this.anInt5767 / (float) this.anInt5779;
		@Pc(17) GL local17 = Static60.aGL1;
		if (this.anInt5774 == -1) {
			this.anInt5774 = local17.glGenLists(1);
			this.anInt5777 = Static256.anInt5185;
		}
		local17.glNewList(this.anInt5774, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5766, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5767);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5766, (float) -this.anInt5767);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5775 != -1) {
			Static256.method4123(this.anInt5775, this.anInt5776, this.anInt5777);
			this.anInt5775 = -1;
			this.anInt5776 = 0;
		}
		if (this.anInt5774 != -1) {
			Static256.method4127(this.anInt5774, this.anInt5777);
			this.anInt5774 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	@Override
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static60.method1177();
		@Pc(5) int local5 = arg0 + this.anInt5763;
		@Pc(10) int local10 = arg1 + this.anInt5764;
		@Pc(12) GL local12 = Static60.aGL1;
		Static60.method1157(this.anInt5775);
		this.method4633();
		local12.glTranslatef((float) local5, (float) (Static60.anInt1344 - local10), 0.0F);
		local12.glCallList(this.anInt5774);
		local12.glLoadIdentity();
	}
}
