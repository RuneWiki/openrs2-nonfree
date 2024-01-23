import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
	private int anInt3601;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	private int anInt3603;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
	private int anInt3604;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	private int anInt3602 = -1;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
	private int anInt3605 = 0;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	private int anInt3600 = -1;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	private int anInt3606 = 0;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5021 = arg0;
		this.anInt5020 = arg1;
		this.anInt5028 = arg2;
		this.anInt5022 = arg3;
		this.anInt5018 = arg4;
		this.anInt5026 = arg5;
		this.method2895(arg6, arg7);
		this.method2896();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([B[I)V")
	private void method2895(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3604 = Static161.method2789(this.anInt5018);
		this.anInt3601 = Static161.method2789(this.anInt5026);
		@Pc(20) byte[] local20 = new byte[this.anInt3604 * this.anInt3601 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5026; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5018; local32++) {
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
			local22 += (this.anInt3604 - this.anInt5018) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static277.aGL1;
		if (this.anInt3602 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3602 = local102[0];
			this.anInt3603 = Static94.anInt2207;
		}
		Static277.method4212(this.anInt3602);
		local95.glTexImage2D(3553, 0, 6408, this.anInt3604, this.anInt3601, 0, 6408, 5121, local93);
		Static94.anInt2208 += local93.limit() - this.anInt3606;
		this.anInt3606 = local93.limit();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
	@Override
	public void method3922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static277.method4200();
		@Pc(5) int local5 = arg0 + this.anInt5028;
		@Pc(10) int local10 = arg1 + this.anInt5022;
		@Pc(12) GL local12 = Static277.aGL1;
		Static277.method4212(this.anInt3602);
		this.method2897();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static277.anInt5360 - local10), 0.0F);
		local12.glCallList(this.anInt3600);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	@Override
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static277.method4188();
		@Pc(5) int local5 = arg0 + this.anInt5028;
		@Pc(10) int local10 = arg1 + this.anInt5022;
		@Pc(12) GL local12 = Static277.aGL1;
		Static277.method4212(this.anInt3602);
		this.method2897();
		local12.glTranslatef((float) local5, (float) (Static277.anInt5360 - local10), 0.0F);
		local12.glCallList(this.anInt3600);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
	private void method2896() {
		@Pc(7) float local7 = (float) this.anInt5018 / (float) this.anInt3604;
		@Pc(15) float local15 = (float) this.anInt5026 / (float) this.anInt3601;
		@Pc(17) GL local17 = Static277.aGL1;
		if (this.anInt3600 == -1) {
			this.anInt3600 = local17.glGenLists(1);
			this.anInt3603 = Static94.anInt2207;
		}
		local17.glNewList(this.anInt3600, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5018, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5026);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5018, (float) -this.anInt5026);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method2897() {
		if (this.anInt3605 != 1) {
			this.anInt3605 = 1;
			@Pc(9) GL local9 = Static277.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3602 != -1) {
			Static94.method1746(this.anInt3602, this.anInt3606, this.anInt3603);
			this.anInt3602 = -1;
			this.anInt3606 = 0;
		}
		if (this.anInt3600 != -1) {
			Static94.method1743(this.anInt3600, this.anInt3603);
			this.anInt3600 = -1;
		}
		super.finalize();
	}
}
