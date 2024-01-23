import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private int anInt1328;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt1329;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	private int anInt1334;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt1330 = 0;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt1331 = 0;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt1332 = -1;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt1333 = -1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5711 = arg0;
		this.anInt5713 = arg1;
		this.anInt5708 = arg2;
		this.anInt5712 = arg3;
		this.anInt5710 = arg4;
		this.anInt5709 = arg5;
		this.method951(arg6, arg7);
		this.method952();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([B[I)V")
	private void method951(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt1334 = Static95.method1518(this.anInt5710);
		this.anInt1329 = Static95.method1518(this.anInt5709);
		@Pc(20) byte[] local20 = new byte[this.anInt1334 * this.anInt1329 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5709; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt5710; local32++) {
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
			local22 += (this.anInt1334 - this.anInt5710) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL local95 = Static116.aGL1;
		if (this.anInt1333 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt1333 = local102[0];
			this.anInt1328 = Static166.anInt3350;
		}
		Static116.method1897(this.anInt1333);
		local95.glTexImage2D(3553, 0, 6408, this.anInt1334, this.anInt1329, 0, 6408, 5121, local93);
		Static166.anInt3352 += local93.limit() - this.anInt1330;
		this.anInt1330 = local93.limit();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	@Override
	public void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.method1882();
		@Pc(5) int local5 = arg0 + this.anInt5708;
		@Pc(10) int local10 = arg1 + this.anInt5712;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1897(this.anInt1333);
		this.method953();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2363 - local10), 0.0F);
		local12.glCallList(this.anInt1332);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	private void method952() {
		@Pc(7) float local7 = (float) this.anInt5710 / (float) this.anInt1334;
		@Pc(15) float local15 = (float) this.anInt5709 / (float) this.anInt1329;
		@Pc(17) GL local17 = Static116.aGL1;
		if (this.anInt1332 == -1) {
			this.anInt1332 = local17.glGenLists(1);
			this.anInt1328 = Static166.anInt3350;
		}
		local17.glNewList(this.anInt1332, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5710, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5709);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5710, (float) -this.anInt5709);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1333 != -1) {
			Static166.method2638(this.anInt1333, this.anInt1330, this.anInt1328);
			this.anInt1333 = -1;
			this.anInt1330 = 0;
		}
		if (this.anInt1332 != -1) {
			Static166.method2633(this.anInt1332, this.anInt1328);
			this.anInt1332 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	@Override
	public void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.method1873();
		@Pc(5) int local5 = arg0 + this.anInt5708;
		@Pc(10) int local10 = arg1 + this.anInt5712;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1897(this.anInt1333);
		this.method953();
		local12.glTranslatef((float) local5, (float) (Static116.anInt2363 - local10), 0.0F);
		local12.glCallList(this.anInt1332);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	private void method953() {
		if (this.anInt1331 != 1) {
			this.anInt1331 = 1;
			@Pc(9) GL local9 = Static116.aGL1;
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}
}
