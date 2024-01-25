import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class23_Sub6 extends Class23 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!el;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class23_Sub6(@OriginalArg(0) Class59_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean354) {
			@Pc(12) opengl local12 = this.aClass59_Sub1_41.anOpengl2;
			this.aClass57_5 = new Class57(arg0, 2);
			this.aClass57_5.method1600(0);
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4311(34165, 7681);
			this.aClass59_Sub1_41.method4297(2, 34168, 770);
			this.aClass59_Sub1_41.method4298(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass59_Sub1_41.method4273(0);
			this.aClass57_5.method1599();
			this.aClass57_5.method1600(1);
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4311(8448, 8448);
			this.aClass59_Sub1_41.method4297(2, 34166, 770);
			this.aClass59_Sub1_41.method4298(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass59_Sub1_41.method4273(0);
			this.aClass57_5.method1599();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class11_Sub2 local3 = this.aClass59_Sub1_41.method4326();
		if (this.aClass57_5 == null || local3 == null || !arg0) {
			this.aClass59_Sub1_41.method4298(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_5.method1598('\u0000');
		this.aClass59_Sub1_41.method4273(1);
		this.aClass59_Sub1_41.method4296(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass59_Sub1_41.aClass112_Sub2_2.method3600(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass59_Sub1_41.method4273(0);
		this.aBoolean396 = true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		if (this.aBoolean396) {
			this.aClass57_5.method1598('\u0001');
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(null);
			this.aClass59_Sub1_41.method4273(0);
		} else {
			this.aClass59_Sub1_41.method4298(0, 5890);
		}
		this.aClass59_Sub1_41.method4311(8448, 8448);
		this.aBoolean396 = false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
		this.aClass59_Sub1_41.method4311(8448, 7681);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
		this.aClass59_Sub1_41.method4296(arg0);
	}
}
