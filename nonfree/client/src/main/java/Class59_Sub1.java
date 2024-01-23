import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	private int anInt2492;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	private int anInt2493 = -1;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
	private int anInt2497 = 0;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
	private int anInt2495 = -1;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	private int anInt2496 = 0;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class59_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4747 = arg0;
		this.anInt4749 = arg1;
		this.anInt4752 = arg2;
		this.anInt4755 = arg3;
		this.anInt4748 = arg4;
		this.anInt4753 = arg5;
		this.method1949(arg6, arg7);
		this.method1948();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	private void method1947() {
		if (this.anInt2496 != 1) {
			this.anInt2496 = 1;
			@Pc(9) GL local9 = Static178.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2493 != -1) {
			Static163.method2531(this.anInt2493, this.anInt2497, this.anInt2498);
			this.anInt2493 = -1;
			this.anInt2497 = 0;
		}
		if (this.anInt2495 != -1) {
			Static163.method2528(this.anInt2495, this.anInt2498);
			this.anInt2495 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static178.method2786();
		@Pc(5) int local5 = arg0 + this.anInt4752;
		@Pc(10) int local10 = arg1 + this.anInt4755;
		@Pc(12) GL local12 = Static178.aGL1;
		Static178.method2763(this.anInt2493);
		this.method1947();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static178.anInt3505 - local10), 0.0F);
		local12.glCallList(this.anInt2495);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	private void method1948() {
		@Pc(7) float local7 = (float) this.anInt4748 / (float) this.anInt2492;
		@Pc(15) float local15 = (float) this.anInt4753 / (float) this.anInt2494;
		@Pc(17) GL local17 = Static178.aGL1;
		if (this.anInt2495 == -1) {
			this.anInt2495 = local17.glGenLists(1);
			this.anInt2498 = Static163.anInt3218;
		}
		local17.glNewList(this.anInt2495, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4748, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4753);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4748, (float) -this.anInt4753);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([B[I)V")
	private void method1949(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt2492 = Static74.method1127(this.anInt4748);
		this.anInt2494 = Static74.method1127(this.anInt4753);
		@Pc(20) byte[] local20 = new byte[this.anInt2492 * this.anInt2494 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4753; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4748; local32++) {
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
			local22 += (this.anInt2492 - this.anInt4748) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static178.aGL1;
		if (this.anInt2493 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt2493 = local102[0];
			this.anInt2498 = Static163.anInt3218;
		}
		Static178.method2763(this.anInt2493);
		local95.glTexImage2D(3553, 0, 6408, this.anInt2492, this.anInt2494, 0, 6408, 5121, local93);
		Static163.anInt3220 += local93.limit() - this.anInt2497;
		this.anInt2497 = local93.limit();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	@Override
	public void method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static178.method2782();
		@Pc(5) int local5 = arg0 + this.anInt4752;
		@Pc(10) int local10 = arg1 + this.anInt4755;
		@Pc(12) GL local12 = Static178.aGL1;
		Static178.method2763(this.anInt2493);
		this.method1947();
		local12.glTranslatef((float) local5, (float) (Static178.anInt3505 - local10), 0.0F);
		local12.glCallList(this.anInt2495);
		local12.glLoadIdentity();
	}
}
