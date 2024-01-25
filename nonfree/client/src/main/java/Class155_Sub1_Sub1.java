import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class155_Sub1_Sub1 extends Class155_Sub1 {

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_26;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "Lclient!vg;")
	private final Class55_Sub4 aClass55_Sub4_1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ef;I)V")
	public Class155_Sub1_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass49_Sub2_26 = arg0;
		this.aClass55_Sub4_1 = new Class55_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)I")
	public int method3595() {
		return this.aClass55_Sub4_1.anInt7045;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)Lclient!vg;")
	@Override
	public Class55_Sub4 method3951() {
		return this.aClass55_Sub4_1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!vg;ILclient!vg;F)Z")
	public boolean method3596(@OriginalArg(0) Class55_Sub4 arg0, @OriginalArg(2) Class55_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class127 local11 = this.aClass49_Sub2_26.aClass127_1;
		@Pc(15) Class127 local15 = this.aClass49_Sub2_26.aClass127_2;
		if (arg0.anInt7045 != this.aClass49_Sub2_26.aClass55_Sub3_3.anInt6487 || arg0.anInt7045 != this.aClass49_Sub2_26.aClass55_Sub3_3.anInt6491) {
			this.aClass49_Sub2_26.aClass55_Sub3_3 = new Class55_Sub3(this.aClass49_Sub2_26, 3553, 6408, arg0.anInt7045, arg0.anInt7045);
		}
		if (this.aClass49_Sub2_26.aClass55_Sub3_2.anInt6487 != arg1.anInt7045 || arg1.anInt7045 != this.aClass49_Sub2_26.aClass55_Sub3_2.anInt6491) {
			this.aClass49_Sub2_26.aClass55_Sub3_2 = new Class55_Sub3(this.aClass49_Sub2_26, 3553, 6408, arg1.anInt7045, arg1.anInt7045);
		}
		this.aClass49_Sub2_26.da(Static140.anIntArray266);
		this.aClass49_Sub2_26.e();
		this.aClass49_Sub2_26.method1614();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass55_Sub4_1.anInt7045, this.aClass55_Sub4_1.anInt7045);
		this.aClass49_Sub2_26.method1582(false);
		this.aClass49_Sub2_26.method1587(false);
		this.aClass49_Sub2_26.method1588(false);
		this.aClass49_Sub2_26.method1635(false);
		this.aClass49_Sub2_26.method1594(-2);
		this.aClass49_Sub2_26.method1600(1);
		this.aClass49_Sub2_26.method1621(arg2, 0.0F, 0.0F, 0.0F);
		this.aClass49_Sub2_26.method1613(34165, 34165);
		this.aClass49_Sub2_26.method1646(null);
		this.aClass49_Sub2_26.method1600(0);
		this.aClass49_Sub2_26.method1624(1);
		this.aClass49_Sub2_26.method1646(null);
		@Pc(188) int local188 = 0;
		while (local188 < 6) {
			@Pc(194) int local194 = local188 + 34069;
			this.aClass49_Sub2_26.method1651(local11);
			local11.method2872(local194, arg0);
			this.aClass49_Sub2_26.method1633(local15);
			local15.method2883(0, this.aClass49_Sub2_26.aClass55_Sub3_3);
			if (local11.method2871() && local15.method2871()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt7045, arg0.anInt7045, 0, 0, arg0.anInt7045, arg0.anInt7045, 16384, 9728);
				local11.method2872(local194, arg1);
				local15.method2883(0, this.aClass49_Sub2_26.aClass55_Sub3_2);
				if (local11.method2871() && local15.method2871()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg0.anInt7045, arg0.anInt7045, 0, 0, arg0.anInt7045, arg0.anInt7045, 16384, 9728);
					local11.method2875(0);
					this.aClass49_Sub2_26.method1644(local11);
					local15.method2875(0);
					this.aClass49_Sub2_26.method1602(local15);
					this.aClass49_Sub2_26.method1589(local11);
					local11.method2872(local194, this.aClass55_Sub4_1);
					if (!local11.method2871()) {
						local11.method2875(0);
						this.aClass49_Sub2_26.method1659(local11);
						local7 = false;
						break;
					}
					this.aClass49_Sub2_26.method1600(1);
					this.aClass49_Sub2_26.method1646(this.aClass49_Sub2_26.aClass55_Sub3_2);
					this.aClass49_Sub2_26.method1600(0);
					this.aClass49_Sub2_26.method1646(this.aClass49_Sub2_26.aClass55_Sub3_3);
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
					this.aClass49_Sub2_26.method1600(1);
					this.aClass49_Sub2_26.method1646(null);
					this.aClass49_Sub2_26.method1600(0);
					this.aClass49_Sub2_26.method1646(null);
					local11.method2875(0);
					this.aClass49_Sub2_26.method1659(local11);
					local188++;
					continue;
				}
				local11.method2875(0);
				this.aClass49_Sub2_26.method1644(local11);
				local15.method2875(0);
				local7 = false;
				this.aClass49_Sub2_26.method1602(local15);
				break;
			}
			local11.method2875(0);
			this.aClass49_Sub2_26.method1644(local11);
			local15.method2875(0);
			this.aClass49_Sub2_26.method1602(local15);
			local7 = false;
			break;
		}
		this.aClass49_Sub2_26.method1600(1);
		this.aClass49_Sub2_26.method1613(8448, 8448);
		this.aClass49_Sub2_26.method1600(0);
		OpenGL.glPopAttrib();
		this.aClass49_Sub2_26.OA(Static140.anIntArray266[0], Static140.anIntArray266[1], Static140.anIntArray266[2], Static140.anIntArray266[3]);
		if (local7) {
			this.aClass55_Sub4_1.method5554();
		}
		return local7;
	}
}
