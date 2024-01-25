import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class54_Sub3 extends Class54 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!fr;")
	private Class76 aClass76_3;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class54_Sub3(@OriginalArg(0) Class81_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean139) {
			@Pc(12) opengl local12 = this.aClass81_Sub1_37.anOpengl1;
			this.aClass76_3 = new Class76(arg0, 2);
			this.aClass76_3.method1585(0);
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method1965(34165, 7681);
			this.aClass81_Sub1_37.method1986(2, 34168, 770);
			this.aClass81_Sub1_37.method1984(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass81_Sub1_37.method1953(0);
			this.aClass76_3.method1584();
			this.aClass76_3.method1585(1);
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method1965(8448, 8448);
			this.aClass81_Sub1_37.method1986(2, 34166, 770);
			this.aClass81_Sub1_37.method1984(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass81_Sub1_37.method1953(0);
			this.aClass76_3.method1584();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
		this.aClass81_Sub1_37.method1965(8448, 7681);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		if (this.aBoolean212) {
			this.aClass76_3.method1586('\u0001');
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(null);
			this.aClass81_Sub1_37.method1953(0);
		} else {
			this.aClass81_Sub1_37.method1984(0, 5890);
		}
		this.aClass81_Sub1_37.method1965(8448, 8448);
		this.aBoolean212 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class28_Sub1 local3 = this.aClass81_Sub1_37.method1952();
		if (this.aClass76_3 == null || local3 == null || !arg0) {
			this.aClass81_Sub1_37.method1984(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_3.method1586('\u0000');
		this.aClass81_Sub1_37.method1953(1);
		this.aClass81_Sub1_37.method2022(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass81_Sub1_37.aClass72_Sub1_2.method1533(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass81_Sub1_37.method1953(0);
		this.aBoolean212 = true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
		this.aClass81_Sub1_37.method2022(arg0);
	}
}
