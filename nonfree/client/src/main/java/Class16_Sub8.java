import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class16_Sub8 extends Class16 {

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "[I")
	public static final int[] anIntArray550 = new int[4096];

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
	private boolean aBoolean808 = false;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!fo;")
	private Class107 aClass107_6;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray550[local10] = Static397.method6260(local10);
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class16_Sub8(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean23) {
			this.aClass107_6 = new Class107(arg0, 2);
			this.aClass107_6.method3155(0);
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method388(7681, 34165);
			super.aClass5_Sub1_42.method329(2, 770, 34168);
			super.aClass5_Sub1_42.method375(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass5_Sub1_42.method334(0);
			this.aClass107_6.method3154();
			this.aClass107_6.method3155(1);
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method388(8448, 8448);
			super.aClass5_Sub1_42.method329(2, 770, 34166);
			super.aClass5_Sub1_42.method375(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass5_Sub1_42.method334(0);
			this.aClass107_6.method3154();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class2_Sub2 local8 = super.aClass5_Sub1_42.method316();
		if (this.aClass107_6 == null || local8 == null || !arg0) {
			super.aClass5_Sub1_42.method375(0, 34168);
			return;
		}
		this.aClass107_6.method3156('\u0000');
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub1_42.aClass115_Sub1_5.method3380(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_42.method334(0);
		this.aBoolean808 = true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_42.method352(arg0);
		super.aClass5_Sub1_42.method385(arg1);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_42.method388(7681, 8448);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (this.aBoolean808) {
			this.aClass107_6.method3156('\u0001');
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352((Class2) null);
			super.aClass5_Sub1_42.method334(0);
		} else {
			super.aClass5_Sub1_42.method375(0, 5890);
		}
		super.aClass5_Sub1_42.method388(8448, 8448);
		this.aBoolean808 = false;
	}
}
