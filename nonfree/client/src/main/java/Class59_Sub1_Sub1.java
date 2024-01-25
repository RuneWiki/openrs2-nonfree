import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class59_Sub1_Sub1 extends Class59_Sub1 {

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_12;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Lclient!lr;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!bv;I)V")
	public Class59_Sub1_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass30_Sub1_12 = arg0;
		this.aClass1_Sub2_1 = new Class1_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
	public int method1484() {
		return this.aClass1_Sub2_1.anInt4346;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lr;FLclient!lr;I)Z")
	public boolean method1486(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class1_Sub2 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class142 local11 = this.aClass30_Sub1_12.aClass142_2;
		@Pc(15) Class142 local15 = this.aClass30_Sub1_12.aClass142_1;
		if (arg2.anInt4346 != this.aClass30_Sub1_12.aClass1_Sub3_2.anInt5174 || arg2.anInt4346 != this.aClass30_Sub1_12.aClass1_Sub3_2.anInt5173) {
			this.aClass30_Sub1_12.aClass1_Sub3_2 = new Class1_Sub3(this.aClass30_Sub1_12, 3553, 6408, arg2.anInt4346, arg2.anInt4346);
		}
		if (this.aClass30_Sub1_12.aClass1_Sub3_3.anInt5174 != arg0.anInt4346 || arg0.anInt4346 != this.aClass30_Sub1_12.aClass1_Sub3_3.anInt5173) {
			this.aClass30_Sub1_12.aClass1_Sub3_3 = new Class1_Sub3(this.aClass30_Sub1_12, 3553, 6408, arg0.anInt4346, arg0.anInt4346);
		}
		this.aClass30_Sub1_12.u(Static181.anIntArray317);
		this.aClass30_Sub1_12.va();
		this.aClass30_Sub1_12.method942();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass1_Sub2_1.anInt4346, this.aClass1_Sub2_1.anInt4346);
		this.aClass30_Sub1_12.method960(false);
		this.aClass30_Sub1_12.method952(false);
		this.aClass30_Sub1_12.method930(false);
		this.aClass30_Sub1_12.method956(false);
		this.aClass30_Sub1_12.method940(-2);
		this.aClass30_Sub1_12.method948(1);
		this.aClass30_Sub1_12.method964(0.0F, 0.0F, 0.0F, arg1);
		this.aClass30_Sub1_12.method905(34165, 34165);
		this.aClass30_Sub1_12.method916(null);
		this.aClass30_Sub1_12.method948(0);
		this.aClass30_Sub1_12.method923(1);
		this.aClass30_Sub1_12.method916(null);
		@Pc(188) int local188 = 0;
		while (local188 < 6) {
			@Pc(194) int local194 = local188 + 34069;
			this.aClass30_Sub1_12.method906(local11);
			local11.method3091(local194, arg2);
			this.aClass30_Sub1_12.method901(local15);
			local15.method3088(0, this.aClass30_Sub1_12.aClass1_Sub3_2);
			if (local11.method3094() && local15.method3094()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4346, arg2.anInt4346, 0, 0, arg2.anInt4346, arg2.anInt4346, 16384, 9728);
				local11.method3091(local194, arg0);
				local15.method3088(0, this.aClass30_Sub1_12.aClass1_Sub3_3);
				if (local11.method3094() && local15.method3094()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4346, arg2.anInt4346, 0, 0, arg2.anInt4346, arg2.anInt4346, 16384, 9728);
					local11.method3097(0);
					this.aClass30_Sub1_12.method951(local11);
					local15.method3097(0);
					this.aClass30_Sub1_12.method900(local15);
					this.aClass30_Sub1_12.method972(local11);
					local11.method3091(local194, this.aClass1_Sub2_1);
					if (!local11.method3094()) {
						local11.method3097(0);
						this.aClass30_Sub1_12.method908(local11);
						local7 = false;
						break;
					}
					this.aClass30_Sub1_12.method948(1);
					this.aClass30_Sub1_12.method916(this.aClass30_Sub1_12.aClass1_Sub3_3);
					this.aClass30_Sub1_12.method948(0);
					this.aClass30_Sub1_12.method916(this.aClass30_Sub1_12.aClass1_Sub3_2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					this.aClass30_Sub1_12.method948(1);
					this.aClass30_Sub1_12.method916(null);
					this.aClass30_Sub1_12.method948(0);
					this.aClass30_Sub1_12.method916(null);
					local11.method3097(0);
					this.aClass30_Sub1_12.method908(local11);
					local188++;
					continue;
				}
				local11.method3097(0);
				this.aClass30_Sub1_12.method951(local11);
				local15.method3097(0);
				local7 = false;
				this.aClass30_Sub1_12.method900(local15);
				break;
			}
			local11.method3097(0);
			this.aClass30_Sub1_12.method951(local11);
			local15.method3097(0);
			local7 = false;
			this.aClass30_Sub1_12.method900(local15);
			break;
		}
		this.aClass30_Sub1_12.method948(1);
		this.aClass30_Sub1_12.method905(8448, 8448);
		this.aClass30_Sub1_12.method948(0);
		OpenGL.glPopAttrib();
		this.aClass30_Sub1_12.pa(Static181.anIntArray317[0], Static181.anIntArray317[1], Static181.anIntArray317[2], Static181.anIntArray317[3]);
		if (local7) {
			this.aClass1_Sub2_1.method4274();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Lclient!lr;")
	@Override
	public Class1_Sub2 method4050() {
		return this.aClass1_Sub2_1;
	}
}
