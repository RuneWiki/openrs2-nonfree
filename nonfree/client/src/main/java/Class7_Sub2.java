import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	private int anInt5435;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private int anInt5438;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	private int anInt5440;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	private int anInt5437 = 0;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	private int anInt5434 = -1;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	private int anInt5436 = 0;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private int anInt5439 = -1;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5424 = arg0;
		this.anInt5425 = arg1;
		this.anInt5429 = arg2;
		this.anInt5426 = arg3;
		this.anInt5432 = arg4;
		this.anInt5433 = arg5;
		this.method4261(arg6, arg7);
		this.method4260();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	@Override
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static296.method4802();
		@Pc(5) int local5 = arg0 + this.anInt5429;
		@Pc(10) int local10 = arg1 + this.anInt5426;
		@Pc(12) GL local12 = Static296.aGL1;
		Static296.method4812(this.anInt5439);
		this.method4262();
		local12.glTranslatef((float) local5, (float) (Static296.anInt6197 - local10), 0.0F);
		local12.glCallList(this.anInt5434);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5439 != -1) {
			Static237.method4093(this.anInt5439, this.anInt5437, this.anInt5435);
			this.anInt5439 = -1;
			this.anInt5437 = 0;
		}
		if (this.anInt5434 != -1) {
			Static237.method4096(this.anInt5434, this.anInt5435);
			this.anInt5434 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	private void method4260() {
		@Pc(7) float local7 = (float) this.anInt5432 / (float) this.anInt5440;
		@Pc(15) float local15 = (float) this.anInt5433 / (float) this.anInt5438;
		@Pc(17) GL local17 = Static296.aGL1;
		if (this.anInt5434 == -1) {
			this.anInt5434 = local17.glGenLists(1);
			this.anInt5435 = Static237.anInt5216;
		}
		local17.glNewList(this.anInt5434, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5432, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5433);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5432, (float) -this.anInt5433);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[I)V")
	private void method4261(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt5440 = Static227.method3943(this.anInt5432);
		this.anInt5438 = Static227.method3943(this.anInt5433);
		@Pc(20) byte[] local20 = new byte[this.anInt5440 * this.anInt5438 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5433; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5432; local32++) {
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
			local22 += (this.anInt5440 - this.anInt5432) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static296.aGL1;
		if (this.anInt5439 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt5439 = local102[0];
			this.anInt5435 = Static237.anInt5216;
		}
		Static296.method4812(this.anInt5439);
		local95.glTexImage2D(3553, 0, 6408, this.anInt5440, this.anInt5438, 0, 6408, 5121, local93);
		Static237.anInt5214 += local93.limit() - this.anInt5437;
		this.anInt5437 = local93.limit();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public void method4258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static296.method4837();
		@Pc(5) int local5 = arg0 + this.anInt5429;
		@Pc(10) int local10 = arg1 + this.anInt5426;
		@Pc(12) GL local12 = Static296.aGL1;
		Static296.method4812(this.anInt5439);
		this.method4262();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static296.anInt6197 - local10), 0.0F);
		local12.glCallList(this.anInt5434);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	private void method4262() {
		if (this.anInt5436 != 1) {
			this.anInt5436 = 1;
			@Pc(9) GL local9 = Static296.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}
}
