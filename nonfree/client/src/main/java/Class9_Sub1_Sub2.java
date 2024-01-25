import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_9;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!rc;")
	private final Class5_Sub4 aClass5_Sub4_2;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass128_Sub2_9 = arg0;
		this.aClass5_Sub4_2 = new Class5_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FILclient!rc;Lclient!rc;)Z")
	public boolean method1537(@OriginalArg(0) float arg0, @OriginalArg(2) Class5_Sub4 arg1, @OriginalArg(3) Class5_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class87 local11 = this.aClass128_Sub2_9.aClass87_4;
		@Pc(15) Class87 local15 = this.aClass128_Sub2_9.aClass87_3;
		if (this.aClass128_Sub2_9.aClass5_Sub1_5.anInt7338 != arg1.anInt5595 || this.aClass128_Sub2_9.aClass5_Sub1_5.anInt7341 != arg1.anInt5595) {
			this.aClass128_Sub2_9.aClass5_Sub1_5 = new Class5_Sub1(this.aClass128_Sub2_9, 3553, 6408, arg1.anInt5595, arg1.anInt5595);
		}
		if (arg2.anInt5595 != this.aClass128_Sub2_9.aClass5_Sub1_6.anInt7338 || this.aClass128_Sub2_9.aClass5_Sub1_6.anInt7341 != arg2.anInt5595) {
			this.aClass128_Sub2_9.aClass5_Sub1_6 = new Class5_Sub1(this.aClass128_Sub2_9, 3553, 6408, arg2.anInt5595, arg2.anInt5595);
		}
		this.aClass128_Sub2_9.u(Static397.anIntArray399);
		this.aClass128_Sub2_9.va();
		this.aClass128_Sub2_9.method3643();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass5_Sub4_2.anInt5595, this.aClass5_Sub4_2.anInt5595);
		this.aClass128_Sub2_9.method3656(false);
		this.aClass128_Sub2_9.method3621(false);
		this.aClass128_Sub2_9.method3659(false);
		this.aClass128_Sub2_9.method3668(false);
		this.aClass128_Sub2_9.method3652(-2);
		this.aClass128_Sub2_9.method3667(1);
		this.aClass128_Sub2_9.method3661(0.0F, 0.0F, 0.0F, arg0);
		this.aClass128_Sub2_9.method3622(34165, 34165);
		this.aClass128_Sub2_9.method3691(null);
		this.aClass128_Sub2_9.method3667(0);
		this.aClass128_Sub2_9.method3677(1);
		this.aClass128_Sub2_9.method3691(null);
		@Pc(191) int local191 = 0;
		while (local191 < 6) {
			@Pc(197) int local197 = local191 + 34069;
			this.aClass128_Sub2_9.method3671(local11);
			local11.method1769(local197, arg1);
			this.aClass128_Sub2_9.method3660(local15);
			local15.method1774(this.aClass128_Sub2_9.aClass5_Sub1_5, 0);
			if (local11.method1773() && local15.method1773()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt5595, arg1.anInt5595, 0, 0, arg1.anInt5595, arg1.anInt5595, 16384, 9728);
				local11.method1769(local197, arg2);
				local15.method1774(this.aClass128_Sub2_9.aClass5_Sub1_6, 0);
				if (local11.method1773() && local15.method1773()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg1.anInt5595, arg1.anInt5595, 0, 0, arg1.anInt5595, arg1.anInt5595, 16384, 9728);
					local11.method1776(0);
					this.aClass128_Sub2_9.method3615(local11);
					local15.method1776(0);
					this.aClass128_Sub2_9.method3625(local15);
					this.aClass128_Sub2_9.method3628(local11);
					local11.method1769(local197, this.aClass5_Sub4_2);
					if (!local11.method1773()) {
						local11.method1776(0);
						local7 = false;
						this.aClass128_Sub2_9.method3624(local11);
						break;
					}
					this.aClass128_Sub2_9.method3667(1);
					this.aClass128_Sub2_9.method3691(this.aClass128_Sub2_9.aClass5_Sub1_6);
					this.aClass128_Sub2_9.method3667(0);
					this.aClass128_Sub2_9.method3691(this.aClass128_Sub2_9.aClass5_Sub1_5);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					this.aClass128_Sub2_9.method3667(1);
					this.aClass128_Sub2_9.method3691(null);
					this.aClass128_Sub2_9.method3667(0);
					this.aClass128_Sub2_9.method3691(null);
					local11.method1776(0);
					this.aClass128_Sub2_9.method3624(local11);
					local191++;
					continue;
				}
				local11.method1776(0);
				this.aClass128_Sub2_9.method3615(local11);
				local15.method1776(0);
				local7 = false;
				this.aClass128_Sub2_9.method3625(local15);
				break;
			}
			local11.method1776(0);
			this.aClass128_Sub2_9.method3615(local11);
			local15.method1776(0);
			local7 = false;
			this.aClass128_Sub2_9.method3625(local15);
			break;
		}
		this.aClass128_Sub2_9.method3667(1);
		this.aClass128_Sub2_9.method3622(8448, 8448);
		this.aClass128_Sub2_9.method3667(0);
		OpenGL.glPopAttrib();
		this.aClass128_Sub2_9.pa(Static397.anIntArray399[0], Static397.anIntArray399[1], Static397.anIntArray399[2], Static397.anIntArray399[3]);
		if (local7) {
			this.aClass5_Sub4_2.method5533();
		}
		return local7;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Lclient!rc;")
	@Override
	public Class5_Sub4 method1534() {
		return this.aClass5_Sub4_2;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
	public int method1539() {
		return this.aClass5_Sub4_2.anInt5595;
	}
}
