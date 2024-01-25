import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class3_Sub3_Sub12 extends Class3_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
	private int anInt4185 = -1;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
	private int anInt4171 = -1;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_16;

	@OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
	private final int anInt4183;

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
	public final int anInt4179;

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
	public final int anInt4176;

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
	private int anInt4173;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
	public final int anInt4184;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!us;III)V")
	public Class3_Sub3_Sub12(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass43_Sub3_16 = arg0;
		this.anInt4183 = arg1;
		this.anInt4179 = arg2;
		this.anInt4176 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static321.anIntArray447, 0);
		this.anInt4173 = Static321.anIntArray447[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4173);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4183, this.anInt4179, this.anInt4176);
		this.anInt4184 = this.anInt4176 * this.anInt4179 * this.aClass43_Sub3_16.method7276(this.anInt4183);
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!us;IIII)V")
	public Class3_Sub3_Sub12(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4176 = arg3;
		this.aClass43_Sub3_16 = arg0;
		this.anInt4183 = arg1;
		this.anInt4179 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static321.anIntArray447, 0);
		this.anInt4173 = Static321.anIntArray447[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4173);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4183, this.anInt4179, this.anInt4176);
		this.anInt4184 = this.anInt4176 * this.anInt4179 * this.aClass43_Sub3_16.method7276(this.anInt4183);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
	public void method3697() {
		if (this.anInt4173 > 0) {
			this.aClass43_Sub3_16.method7274(this.anInt4184, this.anInt4173);
			this.anInt4173 = 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
	public void method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt4173);
		this.anInt4185 = arg0;
		this.anInt4171 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3697();
		super.finalize();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	@Override
	public void method4969() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4171, this.anInt4185, 36161, 0);
		this.anInt4185 = -1;
		this.anInt4171 = -1;
	}
}
