import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class62_Sub6 extends Class62 {

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "Z")
	private boolean aBoolean446 = false;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "Lclient!ih;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class62_Sub6(@OriginalArg(0) Class49_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean128) {
			this.aClass117_5 = new Class117(arg0, 2);
			this.aClass117_5.method2648(0);
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1613(34165, 7681);
			super.aClass49_Sub2_43.method1625(34168, 770, 2);
			super.aClass49_Sub2_43.method1623(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass49_Sub2_43.method1600(0);
			this.aClass117_5.method2647();
			this.aClass117_5.method2648(1);
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1613(8448, 8448);
			super.aClass49_Sub2_43.method1625(34166, 770, 2);
			super.aClass49_Sub2_43.method1623(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass49_Sub2_43.method1600(0);
			this.aClass117_5.method2647();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass49_Sub2_43.method1613(8448, 7681);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		if (this.aBoolean446) {
			this.aClass117_5.method2645('\u0001');
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(null);
			super.aClass49_Sub2_43.method1600(0);
		} else {
			super.aClass49_Sub2_43.method1623(5890, 0);
		}
		super.aClass49_Sub2_43.method1613(8448, 8448);
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		super.aClass49_Sub2_43.method1646(arg0);
		super.aClass49_Sub2_43.method1624(arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class55_Sub4 local8 = super.aClass49_Sub2_43.method1609();
		if (this.aClass117_5 == null || local8 == null || !arg0) {
			super.aClass49_Sub2_43.method1623(34168, 0);
			return;
		}
		this.aClass117_5.method2645('\u0000');
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1646(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass49_Sub2_43.aClass35_Sub2_4.method5053(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass49_Sub2_43.method1600(0);
		this.aBoolean446 = true;
	}
}
