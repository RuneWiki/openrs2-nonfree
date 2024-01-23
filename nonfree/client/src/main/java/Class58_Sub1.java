import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt3040;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt3042;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private int anInt3043 = 0;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	private int anInt3039 = -1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private int anInt3044 = 0;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private int anInt3045 = -1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class58_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5022 = arg0;
		this.anInt5025 = arg1;
		this.anInt5026 = arg2;
		this.anInt5027 = arg3;
		this.anInt5028 = arg4;
		this.anInt5023 = arg5;
		this.method2457(arg6, arg7);
		this.method2455();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	private void method2455() {
		@Pc(7) float local7 = (float) this.anInt5028 / (float) this.anInt3040;
		@Pc(15) float local15 = (float) this.anInt5023 / (float) this.anInt3041;
		@Pc(17) GL local17 = Static251.aGL1;
		if (this.anInt3045 == -1) {
			this.anInt3045 = local17.glGenLists(1);
			this.anInt3042 = Static239.anInt4726;
		}
		local17.glNewList(this.anInt3045, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5028, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5023);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5028, (float) -this.anInt5023);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	private void method2456() {
		if (this.anInt3043 != 1) {
			this.anInt3043 = 1;
			@Pc(9) GL local9 = Static251.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[I)V")
	private void method2457(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt3040 = Static308.method4715(this.anInt5028);
		this.anInt3041 = Static308.method4715(this.anInt5023);
		@Pc(20) byte[] local20 = new byte[this.anInt3040 * this.anInt3041 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5023; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5028; local32++) {
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
			local22 += (this.anInt3040 - this.anInt5028) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static251.aGL1;
		if (this.anInt3039 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt3039 = local102[0];
			this.anInt3042 = Static239.anInt4726;
		}
		Static251.method3892(this.anInt3039);
		local95.glTexImage2D(3553, 0, 6408, this.anInt3040, this.anInt3041, 0, 6408, 5121, local93);
		Static239.anInt4725 += local93.limit() - this.anInt3044;
		this.anInt3044 = local93.limit();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	@Override
	public void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static251.method3893();
		@Pc(5) int local5 = arg0 + this.anInt5026;
		@Pc(10) int local10 = arg1 + this.anInt5027;
		@Pc(12) GL local12 = Static251.aGL1;
		Static251.method3892(this.anInt3039);
		this.method2456();
		local12.glTranslatef((float) local5, (float) (Static251.anInt4925 - local10), 0.0F);
		local12.glCallList(this.anInt3045);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	@Override
	public void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static251.method3886();
		@Pc(5) int local5 = arg0 + this.anInt5026;
		@Pc(10) int local10 = arg1 + this.anInt5027;
		@Pc(12) GL local12 = Static251.aGL1;
		Static251.method3892(this.anInt3039);
		this.method2456();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static251.anInt4925 - local10), 0.0F);
		local12.glCallList(this.anInt3045);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3039 != -1) {
			Static239.method3675(this.anInt3039, this.anInt3044, this.anInt3042);
			this.anInt3039 = -1;
			this.anInt3044 = 0;
		}
		if (this.anInt3045 != -1) {
			Static239.method3681(this.anInt3045, this.anInt3042);
			this.anInt3045 = -1;
		}
		super.finalize();
	}
}
