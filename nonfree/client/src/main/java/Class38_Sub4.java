import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Lclient!pb;")
	private Class184 aClass184_3;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class38_Sub4(@OriginalArg(0) Class34_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean776) {
			this.aClass184_3 = new Class184(arg0, 2);
			this.aClass184_3.method4094(0);
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5526(34165, 7681);
			super.aClass34_Sub2_41.method5486(34168, 2, 770);
			super.aClass34_Sub2_41.method5534(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass34_Sub2_41.method5507(0);
			this.aClass184_3.method4095();
			this.aClass184_3.method4094(1);
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5526(8448, 8448);
			super.aClass34_Sub2_41.method5486(34166, 2, 770);
			super.aClass34_Sub2_41.method5534(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass34_Sub2_41.method5507(0);
			this.aClass184_3.method4095();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass34_Sub2_41.method5526(8448, 7681);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		if (this.aBoolean322) {
			this.aClass184_3.method4096('\u0001');
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(null);
			super.aClass34_Sub2_41.method5507(0);
		} else {
			super.aClass34_Sub2_41.method5534(0, 5890);
		}
		super.aClass34_Sub2_41.method5526(8448, 8448);
		this.aBoolean322 = false;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class10_Sub3 local12 = super.aClass34_Sub2_41.method5525();
		if (this.aClass184_3 == null || local12 == null || !arg0) {
			super.aClass34_Sub2_41.method5534(0, 34168);
			return;
		}
		this.aClass184_3.method4096('\u0000');
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass34_Sub2_41.aClass32_Sub2_3.method3240(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass34_Sub2_41.method5507(0);
		this.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass34_Sub2_41.method5493(arg0);
		super.aClass34_Sub2_41.method5517(arg1);
	}
}
