import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!fa;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class87_Sub1(@OriginalArg(0) Class48_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean235) {
			@Pc(12) opengl local12 = this.aClass48_Sub2_39.anOpengl2;
			this.aClass72_2 = new Class72(arg0, 2);
			this.aClass72_2.method1605(0);
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2563(34165, 7681);
			this.aClass48_Sub2_39.method2611(2, 34168, 770);
			this.aClass48_Sub2_39.method2575(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass48_Sub2_39.method2566(0);
			this.aClass72_2.method1606();
			this.aClass72_2.method1605(1);
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2563(8448, 8448);
			this.aClass48_Sub2_39.method2611(2, 34166, 770);
			this.aClass48_Sub2_39.method2575(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass48_Sub2_39.method2566(0);
			this.aClass72_2.method1606();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()V")
	@Override
	public void method5874() {
		if (this.aBoolean185) {
			this.aClass72_2.method1604('\u0001');
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2573(null);
			this.aClass48_Sub2_39.method2566(0);
		} else {
			this.aClass48_Sub2_39.method2575(0, 5890);
		}
		this.aClass48_Sub2_39.method2563(8448, 8448);
		this.aBoolean185 = false;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	@Override
	public void method5875(@OriginalArg(0) boolean arg0) {
		this.aClass48_Sub2_39.method2563(8448, 7681);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5870(@OriginalArg(0) Class81 arg0) {
		this.aClass48_Sub2_39.method2573(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5872(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class81_Sub3 local3 = this.aClass48_Sub2_39.method2616();
		if (this.aClass72_2 == null || local3 == null || !arg0) {
			this.aClass48_Sub2_39.method2575(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass72_2.method1604('\u0000');
		this.aClass48_Sub2_39.method2566(1);
		this.aClass48_Sub2_39.method2573(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass48_Sub2_39.aClass21_Sub1_2.method2684(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass48_Sub2_39.method2566(0);
		this.aBoolean185 = true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0) {
	}
}
