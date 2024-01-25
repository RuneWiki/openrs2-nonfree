import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!km;")
	private Class119 aClass119_4;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class17_Sub5(@OriginalArg(0) Class46_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean398) {
			@Pc(12) opengl local12 = this.aClass46_Sub2_37.anOpengl1;
			this.aClass119_4 = new Class119(arg0, 2);
			this.aClass119_4.method3303(0);
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5248(34165, 7681);
			this.aClass46_Sub2_37.method5261(2, 34168, 770);
			this.aClass46_Sub2_37.method5236(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass46_Sub2_37.method5225(0);
			this.aClass119_4.method3302();
			this.aClass119_4.method3303(1);
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5248(8448, 8448);
			this.aClass46_Sub2_37.method5261(2, 34166, 770);
			this.aClass46_Sub2_37.method5236(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass46_Sub2_37.method5225(0);
			this.aClass119_4.method3302();
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
		this.aClass46_Sub2_37.method5248(8448, 7681);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
		this.aClass46_Sub2_37.method5251(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		if (this.aBoolean333) {
			this.aClass119_4.method3301('\u0001');
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(null);
			this.aClass46_Sub2_37.method5225(0);
		} else {
			this.aClass46_Sub2_37.method5236(0, 5890);
		}
		this.aClass46_Sub2_37.method5248(8448, 8448);
		this.aBoolean333 = false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class8_Sub4 local3 = this.aClass46_Sub2_37.method5246();
		if (this.aClass119_4 == null || local3 == null || !arg0) {
			this.aClass46_Sub2_37.method5236(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_4.method3301('\u0000');
		this.aClass46_Sub2_37.method5225(1);
		this.aClass46_Sub2_37.method5251(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass46_Sub2_37.aClass51_Sub2_2.method3563(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass46_Sub2_37.method5225(0);
		this.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
	}
}
