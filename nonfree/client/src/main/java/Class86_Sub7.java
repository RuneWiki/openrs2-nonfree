import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class86_Sub7 extends Class86 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!ma;")
	private Class151 aClass151_6;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class86_Sub7(@OriginalArg(0) Class155_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean297) {
			@Pc(12) opengl local12 = this.aClass155_Sub1_39.anOpengl1;
			this.aClass151_6 = new Class151(arg0, 2);
			this.aClass151_6.method3281(0);
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3610(34165, 7681);
			this.aClass155_Sub1_39.method3624(2, 34168, 770);
			this.aClass155_Sub1_39.method3635(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass155_Sub1_39.method3590(0);
			this.aClass151_6.method3280();
			this.aClass151_6.method3281(1);
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3610(8448, 8448);
			this.aClass155_Sub1_39.method3624(2, 34166, 770);
			this.aClass155_Sub1_39.method3635(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass155_Sub1_39.method3590(0);
			this.aClass151_6.method3280();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class30_Sub4 local3 = this.aClass155_Sub1_39.method3634();
		if (this.aClass151_6 == null || local3 == null || !arg0) {
			this.aClass155_Sub1_39.method3635(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_6.method3279('\u0000');
		this.aClass155_Sub1_39.method3590(1);
		this.aClass155_Sub1_39.method3585(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass155_Sub1_39.aClass118_Sub1_2.method2483(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass155_Sub1_39.method3590(0);
		this.aBoolean457 = true;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
		this.aClass155_Sub1_39.method3610(8448, 7681);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
		this.aClass155_Sub1_39.method3585(arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		if (this.aBoolean457) {
			this.aClass151_6.method3279('\u0001');
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(null);
			this.aClass155_Sub1_39.method3590(0);
		} else {
			this.aClass155_Sub1_39.method3635(0, 5890);
		}
		this.aClass155_Sub1_39.method3610(8448, 8448);
		this.aBoolean457 = false;
	}
}
