import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Z")
	private boolean aBoolean303 = false;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!gi;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class87_Sub1(@OriginalArg(0) Class92_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean466) {
			@Pc(12) opengl local12 = this.aClass92_Sub2_40.anOpengl2;
			this.aClass81_1 = new Class81(arg0, 2);
			this.aClass81_1.method1877(0);
			this.aClass92_Sub2_40.method4568(1);
			this.aClass92_Sub2_40.method4569(34165, 7681);
			this.aClass92_Sub2_40.method4578(2, 34168, 770);
			this.aClass92_Sub2_40.method4556(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass92_Sub2_40.method4568(0);
			this.aClass81_1.method1876();
			this.aClass81_1.method1877(1);
			this.aClass92_Sub2_40.method4568(1);
			this.aClass92_Sub2_40.method4569(8448, 8448);
			this.aClass92_Sub2_40.method4578(2, 34166, 770);
			this.aClass92_Sub2_40.method4556(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass92_Sub2_40.method4568(0);
			this.aClass81_1.method1876();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	@Override
	public void method5655(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
		this.aClass92_Sub2_40.method4569(8448, 7681);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!na;)V")
	@Override
	public void method5654(@OriginalArg(0) Class70 arg0) {
		this.aClass92_Sub2_40.method4548(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
	@Override
	public void method5651() {
		if (this.aBoolean303) {
			this.aClass81_1.method1875('\u0001');
			this.aClass92_Sub2_40.method4568(1);
			this.aClass92_Sub2_40.method4548(null);
			this.aClass92_Sub2_40.method4568(0);
		} else {
			this.aClass92_Sub2_40.method4556(0, 5890);
		}
		this.aClass92_Sub2_40.method4569(8448, 8448);
		this.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(Z)V")
	@Override
	public void method5653(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class70_Sub2 local3 = this.aClass92_Sub2_40.method4565();
		if (this.aClass81_1 == null || local3 == null || !arg0) {
			this.aClass92_Sub2_40.method4556(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass92_Sub2_40.anOpengl2;
		this.aClass81_1.method1875('\u0000');
		this.aClass92_Sub2_40.method4568(1);
		this.aClass92_Sub2_40.method4548(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass92_Sub2_40.aClass23_Sub1_1.method463(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass92_Sub2_40.method4568(0);
		this.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()Z")
	@Override
	public boolean method5656() {
		return true;
	}
}
