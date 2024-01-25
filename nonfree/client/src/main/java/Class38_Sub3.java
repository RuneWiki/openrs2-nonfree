import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!kja", name = "l", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "Lclient!pba;")
	private Class264 aClass264_4;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class38_Sub3(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean182) {
			this.aClass264_4 = new Class264(arg0, 2);
			this.aClass264_4.method6556(0);
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method1993(7681, 34165);
			super.aClass13_Sub2_39.method2012(34168, 770, 2);
			super.aClass13_Sub2_39.method2028(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass13_Sub2_39.method2008(0);
			this.aClass264_4.method6558();
			this.aClass264_4.method6556(1);
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method1993(8448, 8448);
			super.aClass13_Sub2_39.method2012(34166, 770, 2);
			super.aClass13_Sub2_39.method2028(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass13_Sub2_39.method2008(0);
			this.aClass264_4.method6558();
		}
	}

	@OriginalMember(owner = "client!kja", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (this.aBoolean386) {
			this.aClass264_4.method6557('\u0001');
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024((Class85) null);
			super.aClass13_Sub2_39.method2008(0);
		} else {
			super.aClass13_Sub2_39.method2028(0, 5890);
		}
		super.aClass13_Sub2_39.method1993(8448, 8448);
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass13_Sub2_39.method2024(arg0);
		super.aClass13_Sub2_39.method1960(arg1);
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub2_39.method1993(7681, 8448);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class85_Sub1 local14 = super.aClass13_Sub2_39.method1989();
		if (this.aClass264_4 == null || local14 == null || !arg0) {
			super.aClass13_Sub2_39.method2028(0, 34168);
			return;
		}
		this.aClass264_4.method6557('\u0000');
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024(local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass13_Sub2_39.aClass239_Sub2_5.method7197(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_39.method2008(0);
		this.aBoolean386 = true;
	}
}
