import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class89_Sub1_Sub1 extends Class89_Sub1 {

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_11;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "Lclient!nm;")
	private final Class21_Sub4 aClass21_Sub4_1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!qg;I)V")
	public Class89_Sub1_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass121_Sub2_11 = arg0;
		this.aClass21_Sub4_1 = new Class21_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)Lclient!nm;")
	@Override
	public Class21_Sub4 method3813() {
		return this.aClass21_Sub4_1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!nm;FILclient!nm;)Z")
	public boolean method1795(@OriginalArg(0) Class21_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class21_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class19 local11 = this.aClass121_Sub2_11.aClass19_4;
		@Pc(15) Class19 local15 = this.aClass121_Sub2_11.aClass19_5;
		if (this.aClass121_Sub2_11.aClass21_Sub2_5.anInt4199 != arg2.anInt4566 || this.aClass121_Sub2_11.aClass21_Sub2_5.anInt4198 != arg2.anInt4566) {
			this.aClass121_Sub2_11.aClass21_Sub2_5 = new Class21_Sub2(this.aClass121_Sub2_11, 3553, 6408, arg2.anInt4566, arg2.anInt4566);
		}
		if (arg0.anInt4566 != this.aClass121_Sub2_11.aClass21_Sub2_4.anInt4199 || this.aClass121_Sub2_11.aClass21_Sub2_4.anInt4198 != arg0.anInt4566) {
			this.aClass121_Sub2_11.aClass21_Sub2_4 = new Class21_Sub2(this.aClass121_Sub2_11, 3553, 6408, arg0.anInt4566, arg0.anInt4566);
		}
		this.aClass121_Sub2_11.u(Static89.anIntArray83);
		this.aClass121_Sub2_11.va();
		this.aClass121_Sub2_11.method4682();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) 1);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass21_Sub4_1.anInt4566, this.aClass21_Sub4_1.anInt4566);
		this.aClass121_Sub2_11.method4657(false);
		this.aClass121_Sub2_11.method4663(false);
		this.aClass121_Sub2_11.method4655(false);
		this.aClass121_Sub2_11.method4691(false);
		this.aClass121_Sub2_11.method4647(-2);
		this.aClass121_Sub2_11.method4669(1);
		this.aClass121_Sub2_11.method4713(0.0F, 0.0F, arg1, 0.0F);
		this.aClass121_Sub2_11.method4709(34165, 34165);
		this.aClass121_Sub2_11.method4681(null);
		this.aClass121_Sub2_11.method4669(0);
		this.aClass121_Sub2_11.method4707(1);
		this.aClass121_Sub2_11.method4681(null);
		@Pc(187) int local187 = 0;
		while (local187 < 6) {
			@Pc(193) int local193 = local187 + 34069;
			this.aClass121_Sub2_11.method4722(local11);
			local11.method313(arg2, local193);
			this.aClass121_Sub2_11.method4701(local15);
			local15.method324(this.aClass121_Sub2_11.aClass21_Sub2_5, 0);
			if (local11.method320() && local15.method320()) {
				OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4566, arg2.anInt4566, 0, 0, arg2.anInt4566, arg2.anInt4566, 16384, 9728);
				local11.method313(arg0, local193);
				local15.method324(this.aClass121_Sub2_11.aClass21_Sub2_4, 0);
				if (local11.method320() && local15.method320()) {
					OpenGL.glBlitFramebufferEXT(0, 0, arg2.anInt4566, arg2.anInt4566, 0, 0, arg2.anInt4566, arg2.anInt4566, 16384, 9728);
					local11.method321(0);
					this.aClass121_Sub2_11.method4695(local11);
					local15.method321(0);
					this.aClass121_Sub2_11.method4698(local15);
					this.aClass121_Sub2_11.method4675(local11);
					local11.method313(this.aClass21_Sub4_1, local193);
					if (!local11.method320()) {
						local11.method321(0);
						local7 = false;
						this.aClass121_Sub2_11.method4699(local11);
						break;
					}
					this.aClass121_Sub2_11.method4669(1);
					this.aClass121_Sub2_11.method4681(this.aClass121_Sub2_11.aClass21_Sub2_4);
					this.aClass121_Sub2_11.method4669(0);
					this.aClass121_Sub2_11.method4681(this.aClass121_Sub2_11.aClass21_Sub2_5);
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
					this.aClass121_Sub2_11.method4669(1);
					this.aClass121_Sub2_11.method4681(null);
					this.aClass121_Sub2_11.method4669(0);
					this.aClass121_Sub2_11.method4681(null);
					local11.method321(0);
					this.aClass121_Sub2_11.method4699(local11);
					local187++;
					continue;
				}
				local11.method321(0);
				this.aClass121_Sub2_11.method4695(local11);
				local15.method321(0);
				local7 = false;
				this.aClass121_Sub2_11.method4698(local15);
				break;
			}
			local11.method321(0);
			this.aClass121_Sub2_11.method4695(local11);
			local15.method321(0);
			this.aClass121_Sub2_11.method4698(local15);
			local7 = false;
			break;
		}
		this.aClass121_Sub2_11.method4669(1);
		this.aClass121_Sub2_11.method4709(8448, 8448);
		this.aClass121_Sub2_11.method4669(0);
		OpenGL.glPopAttrib();
		this.aClass121_Sub2_11.pa(Static89.anIntArray83[0], Static89.anIntArray83[1], Static89.anIntArray83[2], Static89.anIntArray83[3]);
		if (local7) {
			this.aClass21_Sub4_1.method3748();
		}
		return local7;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I")
	public int method1796() {
		return this.aClass21_Sub4_1.anInt4566;
	}
}
