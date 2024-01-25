import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Lclient!ml;")
	private Class204 aClass204_4;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class8_Sub5(@OriginalArg(0) Class90_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean165) {
			this.aClass204_4 = new Class204(arg0, 2);
			this.aClass204_4.method4985(0);
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2120(7681, 34165);
			super.aClass90_Sub1_38.method2119(2, 770, 34168);
			super.aClass90_Sub1_38.method2133(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass90_Sub1_38.method2069(0);
			this.aClass204_4.method4987();
			this.aClass204_4.method4985(1);
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2120(8448, 8448);
			super.aClass90_Sub1_38.method2119(2, 770, 34166);
			super.aClass90_Sub1_38.method2133(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass90_Sub1_38.method2069(0);
			this.aClass204_4.method4987();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub1_38.method2120(7681, 8448);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		super.aClass90_Sub1_38.method2126(arg1);
		super.aClass90_Sub1_38.method2123(arg0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class16_Sub4 local8 = super.aClass90_Sub1_38.method2068();
		if (this.aClass204_4 == null || local8 == null || !arg0) {
			super.aClass90_Sub1_38.method2133(0, 34168);
			return;
		}
		this.aClass204_4.method4982('\u0000');
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2126(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass90_Sub1_38.aClass93_Sub2_3.method3569(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass90_Sub1_38.method2069(0);
		this.aBoolean346 = true;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		if (this.aBoolean346) {
			this.aClass204_4.method4982('\u0001');
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(null);
			super.aClass90_Sub1_38.method2069(0);
		} else {
			super.aClass90_Sub1_38.method2133(0, 5890);
		}
		super.aClass90_Sub1_38.method2120(8448, 8448);
		this.aBoolean346 = false;
	}
}
