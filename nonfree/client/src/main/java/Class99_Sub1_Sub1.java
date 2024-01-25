import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class99_Sub1_Sub1 extends Class99_Sub1 {

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_18;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Lclient!im;")
	private final Class6_Sub4 aClass6_Sub4_1;

	static {
		new Class83("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!fd;I)V")
	public Class99_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub2_18 = arg0;
		this.aClass6_Sub4_1 = new Class6_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lclient!im;")
	@Override
	public Class6_Sub4 method3232() {
		return this.aClass6_Sub4_1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!im;FLclient!im;I)Z")
	public boolean method2666(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class6_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class150 local11 = this.aClass19_Sub2_18.aClass150_2;
		@Pc(15) Class150 local15 = this.aClass19_Sub2_18.aClass150_1;
		if (arg2.anInt3257 != this.aClass19_Sub2_18.aClass6_Sub1_2.anInt5466 || this.aClass19_Sub2_18.aClass6_Sub1_2.anInt5458 != arg2.anInt3257) {
			this.aClass19_Sub2_18.aClass6_Sub1_2 = new Class6_Sub1(this.aClass19_Sub2_18, 3553, 6408, arg2.anInt3257, arg2.anInt3257);
		}
		if (this.aClass19_Sub2_18.aClass6_Sub1_1.anInt5466 != arg0.anInt3257 || this.aClass19_Sub2_18.aClass6_Sub1_1.anInt5458 != arg0.anInt3257) {
			this.aClass19_Sub2_18.aClass6_Sub1_1 = new Class6_Sub1(this.aClass19_Sub2_18, 3553, 6408, arg0.anInt3257, arg0.anInt3257);
		}
		this.aClass19_Sub2_18.da(Static266.anIntArray319);
		this.aClass19_Sub2_18.e();
		this.aClass19_Sub2_18.method1898();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass6_Sub4_1.anInt3257, this.aClass6_Sub4_1.anInt3257);
		this.aClass19_Sub2_18.method1918(false);
		this.aClass19_Sub2_18.method1906(false);
		this.aClass19_Sub2_18.method1951(false);
		this.aClass19_Sub2_18.method1911(false);
		this.aClass19_Sub2_18.method1957(-2);
		this.aClass19_Sub2_18.method1936(1);
		this.aClass19_Sub2_18.method1913(0.0F, arg1, 0.0F, 0.0F);
		this.aClass19_Sub2_18.method1912(34165, 34165);
		this.aClass19_Sub2_18.method1905(null);
		this.aClass19_Sub2_18.method1936(0);
		this.aClass19_Sub2_18.method1900(1);
		this.aClass19_Sub2_18.method1905(null);
		@Pc(176) int local176 = 0;
		while (local176 < 6) {
			this.aClass19_Sub2_18.method1940(local11);
			@Pc(187) int local187 = local176 + 34069;
			local11.method3619(arg2, local187);
			this.aClass19_Sub2_18.method1956(local15);
			local15.method3621(this.aClass19_Sub2_18.aClass6_Sub1_2, 0);
			if (local11.method3616() && local15.method3616()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt3257, arg2.anInt3257, 0, 0, arg2.anInt3257, arg2.anInt3257, 16384, 9728);
				local11.method3619(arg0, local187);
				local15.method3621(this.aClass19_Sub2_18.aClass6_Sub1_1, 0);
				if (local11.method3616() && local15.method3616()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt3257, arg2.anInt3257, 0, 0, arg2.anInt3257, arg2.anInt3257, 16384, 9728);
					local11.method3611(0);
					this.aClass19_Sub2_18.method1935(local11);
					local15.method3611(0);
					this.aClass19_Sub2_18.method1949(local15);
					this.aClass19_Sub2_18.method1922(local11);
					local11.method3619(this.aClass6_Sub4_1, local187);
					if (!local11.method3616()) {
						local11.method3611(0);
						local7 = false;
						this.aClass19_Sub2_18.method1971(local11);
						break;
					}
					this.aClass19_Sub2_18.method1936(1);
					this.aClass19_Sub2_18.method1905(this.aClass19_Sub2_18.aClass6_Sub1_1);
					this.aClass19_Sub2_18.method1936(0);
					this.aClass19_Sub2_18.method1905(this.aClass19_Sub2_18.aClass6_Sub1_2);
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
					this.aClass19_Sub2_18.method1936(1);
					this.aClass19_Sub2_18.method1905(null);
					this.aClass19_Sub2_18.method1936(0);
					this.aClass19_Sub2_18.method1905(null);
					local11.method3611(0);
					this.aClass19_Sub2_18.method1971(local11);
					local176++;
					continue;
				}
				local11.method3611(0);
				this.aClass19_Sub2_18.method1935(local11);
				local15.method3611(0);
				local7 = false;
				this.aClass19_Sub2_18.method1949(local15);
				break;
			}
			local11.method3611(0);
			this.aClass19_Sub2_18.method1935(local11);
			local15.method3611(0);
			this.aClass19_Sub2_18.method1949(local15);
			local7 = false;
			break;
		}
		this.aClass19_Sub2_18.method1936(1);
		this.aClass19_Sub2_18.method1912(8448, 8448);
		this.aClass19_Sub2_18.method1936(0);
		OpenGL.glPopAttrib();
		this.aClass19_Sub2_18.OA(Static266.anIntArray319[0], Static266.anIntArray319[1], Static266.anIntArray319[2], Static266.anIntArray319[3]);
		if (local7) {
			this.aClass6_Sub4_1.method4189();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Z)I")
	public int method2668() {
		return this.aClass6_Sub4_1.anInt3257;
	}
}
