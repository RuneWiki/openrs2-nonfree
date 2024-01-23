import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	private int anInt1668;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt1669;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	private int anInt1672;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	private int anInt1670 = -1;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	private int anInt1674 = -1;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
	private int anInt1673 = 0;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
	private int anInt1671 = 0;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class48_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4745 = arg0;
		this.anInt4749 = arg1;
		this.anInt4752 = arg2;
		this.anInt4748 = arg3;
		this.anInt4754 = arg4;
		this.anInt4746 = arg5;
		this.method1461(arg6, arg7);
		this.method1462();
	}

	@OriginalMember(owner = "client!gh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1674 != -1) {
			Static154.method2370(this.anInt1674, this.anInt1671, this.anInt1669);
			this.anInt1674 = -1;
			this.anInt1671 = 0;
		}
		if (this.anInt1670 != -1) {
			Static154.method2378(this.anInt1670, this.anInt1669);
			this.anInt1670 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	@Override
	public void method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static240.method3779();
		@Pc(5) int local5 = arg0 + this.anInt4752;
		@Pc(10) int local10 = arg1 + this.anInt4748;
		@Pc(12) GL local12 = Static240.aGL1;
		Static240.method3789(this.anInt1674);
		this.method1460();
		local12.glTranslatef((float) local5, (float) (Static240.anInt4961 - local10), 0.0F);
		local12.glCallList(this.anInt1670);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	@Override
	public void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static240.method3805();
		@Pc(5) int local5 = arg0 + this.anInt4752;
		@Pc(10) int local10 = arg1 + this.anInt4748;
		@Pc(12) GL local12 = Static240.aGL1;
		Static240.method3789(this.anInt1674);
		this.method1460();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static240.anInt4961 - local10), 0.0F);
		local12.glCallList(this.anInt1670);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	private void method1460() {
		if (this.anInt1673 != 1) {
			this.anInt1673 = 1;
			@Pc(9) GL local9 = Static240.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([B[I)V")
	private void method1461(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt1668 = Static182.method2762(this.anInt4754);
		this.anInt1672 = Static182.method2762(this.anInt4746);
		@Pc(20) byte[] local20 = new byte[this.anInt1668 * this.anInt1672 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4746; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4754; local32++) {
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
			local22 += (this.anInt1668 - this.anInt4754) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static240.aGL1;
		if (this.anInt1674 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt1674 = local102[0];
			this.anInt1669 = Static154.anInt2852;
		}
		Static240.method3789(this.anInt1674);
		local95.glTexImage2D(3553, 0, 6408, this.anInt1668, this.anInt1672, 0, 6408, 5121, local93);
		Static154.anInt2854 += local93.limit() - this.anInt1671;
		this.anInt1671 = local93.limit();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
	private void method1462() {
		@Pc(7) float local7 = (float) this.anInt4754 / (float) this.anInt1668;
		@Pc(15) float local15 = (float) this.anInt4746 / (float) this.anInt1672;
		@Pc(17) GL local17 = Static240.aGL1;
		if (this.anInt1670 == -1) {
			this.anInt1670 = local17.glGenLists(1);
			this.anInt1669 = Static154.anInt2852;
		}
		local17.glNewList(this.anInt1670, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4754, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4746);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4754, (float) -this.anInt4746);
		local17.glEnd();
		local17.glEndList();
	}
}
