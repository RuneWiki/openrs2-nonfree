import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!jb;")
	private Class115 aClass115_3;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class7_Sub4(@OriginalArg(0) Class63_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean164) {
			@Pc(12) opengl local12 = this.aClass63_Sub2_41.anOpengl2;
			this.aClass115_3 = new Class115(arg0, 2);
			this.aClass115_3.method2846(0);
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2091(34165, 7681);
			this.aClass63_Sub2_41.method2081(2, 34168, 770);
			this.aClass63_Sub2_41.method2064(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass63_Sub2_41.method2115(0);
			this.aClass115_3.method2848();
			this.aClass115_3.method2846(1);
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2091(8448, 8448);
			this.aClass63_Sub2_41.method2081(2, 34166, 770);
			this.aClass63_Sub2_41.method2064(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass63_Sub2_41.method2115(0);
			this.aClass115_3.method2848();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
		this.aClass63_Sub2_41.method2068(arg0);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub2_41.method2091(8448, 7681);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		if (this.aBoolean278) {
			this.aClass115_3.method2847('\u0001');
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(null);
			this.aClass63_Sub2_41.method2115(0);
		} else {
			this.aClass63_Sub2_41.method2064(0, 5890);
		}
		this.aClass63_Sub2_41.method2091(8448, 8448);
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class20_Sub1 local3 = this.aClass63_Sub2_41.method2093();
		if (this.aClass115_3 == null || local3 == null || !arg0) {
			this.aClass63_Sub2_41.method2064(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_3.method2847('\u0000');
		this.aClass63_Sub2_41.method2115(1);
		this.aClass63_Sub2_41.method2068(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass63_Sub2_41.aClass44_Sub2_2.method3545(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass63_Sub2_41.method2115(0);
		this.aBoolean278 = true;
	}
}
