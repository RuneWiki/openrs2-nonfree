import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 implements Interface21 {

	@OriginalMember(owner = "client!jt", name = "F", descriptor = "[I")
	public static final int[] anIntArray292 = new int[16384];

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "[I")
	public static final int[] anIntArray293 = new int[16384];

	@OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
	private int anInt5245 = -1;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	private int anInt5249 = -1;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_21;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	public final int anInt5251;

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
	public final int anInt5247;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
	private final int anInt5246;

	@OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
	private int anInt5250;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
	private final int anInt5240;

	static {
		@Pc(73) double local73 = 3.834951969714103E-4D;
		for (@Pc(75) int local75 = 0; local75 < 16384; local75++) {
			anIntArray293[local75] = (int) (Math.sin((double) local75 * local73) * 16384.0D);
			anIntArray292[local75] = (int) (Math.cos((double) local75 * local73) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ml;III)V")
	public Class6_Sub2_Sub12(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass75_Sub3_21 = arg0;
		this.anInt5251 = arg2;
		this.anInt5247 = arg3;
		this.anInt5246 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static533.anIntArray581, 0);
		this.anInt5250 = Static533.anIntArray581[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5250);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5246, this.anInt5251, this.anInt5247);
		this.anInt5240 = this.anInt5247 * this.anInt5251 * this.aClass75_Sub3_21.method5817(this.anInt5246);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ml;IIII)V")
	public Class6_Sub2_Sub12(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass75_Sub3_21 = arg0;
		this.anInt5247 = arg3;
		this.anInt5246 = arg1;
		this.anInt5251 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static533.anIntArray581, 0);
		this.anInt5250 = Static533.anIntArray581[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5250);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5246, this.anInt5251, this.anInt5247);
		this.anInt5240 = this.anInt5251 * this.anInt5247 * this.aClass75_Sub3_21.method5817(this.anInt5246);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	@Override
	public void method9004() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5245, this.anInt5249, 36161, 0);
		this.anInt5245 = -1;
		this.anInt5249 = -1;
	}

	@OriginalMember(owner = "client!jt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4797();
		super.finalize();
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V")
	public void method4797() {
		if (this.anInt5250 > 0) {
			this.aClass75_Sub3_21.method5786(this.anInt5240, this.anInt5250);
			this.anInt5250 = 0;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZ)V")
	public void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5250);
		this.anInt5249 = arg1;
		this.anInt5245 = arg0;
	}
}
