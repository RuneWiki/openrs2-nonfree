import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!pa;")
	private Class155 aClass155_6;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class20_Sub7(@OriginalArg(0) Class105_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean315) {
			@Pc(12) opengl local12 = this.aClass105_Sub1_42.anOpengl1;
			this.aClass155_6 = new Class155(arg0, 2);
			this.aClass155_6.method4111(0);
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3562(34165, 7681);
			this.aClass105_Sub1_42.method3568(2, 34168, 770);
			this.aClass105_Sub1_42.method3628(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass105_Sub1_42.method3634(0);
			this.aClass155_6.method4110();
			this.aClass155_6.method4111(1);
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3562(8448, 8448);
			this.aClass105_Sub1_42.method3568(2, 34166, 770);
			this.aClass105_Sub1_42.method3628(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass105_Sub1_42.method3634(0);
			this.aClass155_6.method4110();
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
	@Override
	public void method5684() {
		if (this.aBoolean546) {
			this.aClass155_6.method4112('\u0001');
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3591(null);
			this.aClass105_Sub1_42.method3634(0);
		} else {
			this.aClass105_Sub1_42.method3628(0, 5890);
		}
		this.aClass105_Sub1_42.method3562(8448, 8448);
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	@Override
	public void method5681(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class44_Sub4 local3 = this.aClass105_Sub1_42.method3588();
		if (this.aClass155_6 == null || local3 == null || !arg0) {
			this.aClass105_Sub1_42.method3628(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass105_Sub1_42.anOpengl1;
		this.aClass155_6.method4112('\u0000');
		this.aClass105_Sub1_42.method3634(1);
		this.aClass105_Sub1_42.method3591(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass105_Sub1_42.aClass31_Sub2_1.method3190(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass105_Sub1_42.method3634(0);
		this.aBoolean546 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()Z")
	@Override
	public boolean method5683() {
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!me;)V")
	@Override
	public void method5680(@OriginalArg(0) Class44 arg0) {
		this.aClass105_Sub1_42.method3591(arg0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
	@Override
	public void method5682(@OriginalArg(0) boolean arg0) {
		this.aClass105_Sub1_42.method3562(8448, 7681);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	@Override
	public void method5685(@OriginalArg(0) int arg0) {
	}
}
