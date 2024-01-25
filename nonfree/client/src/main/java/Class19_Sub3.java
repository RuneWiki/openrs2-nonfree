import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "Lclient!ee;")
	private Class93 aClass93_3;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class19_Sub3(@OriginalArg(0) Class143_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean416) {
			this.aClass93_3 = new Class93(arg0, 2);
			this.aClass93_3.method1950(0);
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4940(34165, 7681);
			super.aClass143_Sub2_39.method4947(770, 2, 34168);
			super.aClass143_Sub2_39.method4933(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass143_Sub2_39.method4930(0);
			this.aClass93_3.method1948();
			this.aClass93_3.method1950(1);
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4940(8448, 8448);
			super.aClass143_Sub2_39.method4947(770, 2, 34166);
			super.aClass143_Sub2_39.method4933(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass143_Sub2_39.method4930(0);
			this.aClass93_3.method1948();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub2_39.method4940(8448, 7681);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class44_Sub3 local14 = super.aClass143_Sub2_39.method4953();
		if (this.aClass93_3 == null || local14 == null || !arg0) {
			super.aClass143_Sub2_39.method4933(34168, 0);
			return;
		}
		this.aClass93_3.method1952('\u0000');
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945(local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass143_Sub2_39.aClass56_Sub3_5.method8403(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass143_Sub2_39.method4930(0);
		this.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (this.aBoolean120) {
			this.aClass93_3.method1952('\u0001');
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945((Class44) null);
			super.aClass143_Sub2_39.method4930(0);
		} else {
			super.aClass143_Sub2_39.method4933(5890, 0);
		}
		super.aClass143_Sub2_39.method4940(8448, 8448);
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		super.aClass143_Sub2_39.method4945(arg0);
		super.aClass143_Sub2_39.method4994(arg1);
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}
}
