import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class35_Sub5 extends Class35 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!eq;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class35_Sub5(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean41) {
			@Pc(12) opengl local12 = this.aClass4_Sub1_35.anOpengl1;
			this.aClass57_5 = new Class57(arg0, 2);
			this.aClass57_5.method1811(0);
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method580(34165, 7681);
			this.aClass4_Sub1_35.method590(2, 34168, 770);
			this.aClass4_Sub1_35.method588(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass4_Sub1_35.method600(0);
			this.aClass57_5.method1810();
			this.aClass57_5.method1811(1);
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method580(8448, 8448);
			this.aClass4_Sub1_35.method590(2, 34166, 770);
			this.aClass4_Sub1_35.method588(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass4_Sub1_35.method600(0);
			this.aClass57_5.method1810();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lp;)V")
	@Override
	public void method5196(@OriginalArg(0) Class124 arg0) {
		this.aClass4_Sub1_35.method602(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5200(@OriginalArg(0) boolean arg0) {
		this.aClass4_Sub1_35.method580(8448, 7681);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	@Override
	public void method5197() {
		if (this.aBoolean421) {
			this.aClass57_5.method1809('\u0001');
			this.aClass4_Sub1_35.method600(1);
			this.aClass4_Sub1_35.method602(null);
			this.aClass4_Sub1_35.method600(0);
		} else {
			this.aClass4_Sub1_35.method588(0, 5890);
		}
		this.aClass4_Sub1_35.method580(8448, 8448);
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method5198(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()Z")
	@Override
	public boolean method5199() {
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5195(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class124_Sub3 local3 = this.aClass4_Sub1_35.method557();
		if (this.aClass57_5 == null || local3 == null || !arg0) {
			this.aClass4_Sub1_35.method588(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass4_Sub1_35.anOpengl1;
		this.aClass57_5.method1809('\u0000');
		this.aClass4_Sub1_35.method600(1);
		this.aClass4_Sub1_35.method602(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass4_Sub1_35.aClass133_Sub2_2.method4343(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass4_Sub1_35.method600(0);
		this.aBoolean421 = true;
	}
}
