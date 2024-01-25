import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Lclient!wm;")
	private Class218 aClass218_4;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class22_Sub5(@OriginalArg(0) Class2_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean202) {
			@Pc(12) opengl local12 = this.aClass2_Sub1_41.anOpengl1;
			this.aClass218_4 = new Class218(arg0, 2);
			this.aClass218_4.method5674(0);
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2351(34165, 7681);
			this.aClass2_Sub1_41.method2372(2, 34168, 770);
			this.aClass2_Sub1_41.method2346(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass2_Sub1_41.method2373(0);
			this.aClass218_4.method5675();
			this.aClass218_4.method5674(1);
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2351(8448, 8448);
			this.aClass2_Sub1_41.method2372(2, 34166, 770);
			this.aClass2_Sub1_41.method2346(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass2_Sub1_41.method2373(0);
			this.aClass218_4.method5675();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		this.aClass2_Sub1_41.method2351(8448, 7681);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!nj;)V")
	@Override
	public void method5718(@OriginalArg(0) Class18 arg0) {
		this.aClass2_Sub1_41.method2376(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "()Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V")
	@Override
	public void method5716(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class18_Sub2 local3 = this.aClass2_Sub1_41.method2345();
		if (this.aClass218_4 == null || local3 == null || !arg0) {
			this.aClass2_Sub1_41.method2346(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass2_Sub1_41.anOpengl1;
		this.aClass218_4.method5676('\u0000');
		this.aClass2_Sub1_41.method2373(1);
		this.aClass2_Sub1_41.method2376(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass2_Sub1_41.aClass21_Sub1_1.method796(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass2_Sub1_41.method2373(0);
		this.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
	@Override
	public void method5717() {
		if (this.aBoolean249) {
			this.aClass218_4.method5676('\u0001');
			this.aClass2_Sub1_41.method2373(1);
			this.aClass2_Sub1_41.method2376(null);
			this.aClass2_Sub1_41.method2373(0);
		} else {
			this.aClass2_Sub1_41.method2346(0, 5890);
		}
		this.aClass2_Sub1_41.method2351(8448, 8448);
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0) {
	}
}
