import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class3_Sub7_Sub4 extends Class3_Sub7 implements Interface10 {

	@OriginalMember(owner = "client!df", name = "q", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[16384];

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	private int anInt2281 = -1;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_7;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "I")
	public final int anInt2291;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public final int anInt2278;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	private final int anInt2292;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	private int anInt2279;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	private final int anInt2284;

	static {
		@Pc(82) double local82 = 3.834951969714103E-4D;
		for (@Pc(84) int local84 = 0; local84 < 16384; local84++) {
			aFloatArray13[local84] = (float) Math.sin((double) local84 * local82);
			aFloatArray14[local84] = (float) Math.cos(local82 * (double) local84);
		}
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!aq;III)V")
	public Class3_Sub7_Sub4(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass22_Sub1_7 = arg0;
		this.anInt2291 = arg2;
		this.anInt2278 = arg3;
		this.anInt2292 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static124.anIntArray149, 0);
		this.anInt2279 = Static124.anIntArray149[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2279);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2292, this.anInt2291, this.anInt2278);
		this.anInt2284 = this.anInt2278 * this.anInt2291 * this.aClass22_Sub1_7.method969(this.anInt2292);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!aq;IIII)V")
	public Class3_Sub7_Sub4(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass22_Sub1_7 = arg0;
		this.anInt2278 = arg3;
		this.anInt2291 = arg2;
		this.anInt2292 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static124.anIntArray149, 0);
		this.anInt2279 = Static124.anIntArray149[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2279);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2292, this.anInt2291, this.anInt2278);
		this.anInt2284 = this.anInt2291 * this.anInt2278 * this.aClass22_Sub1_7.method969(this.anInt2292);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
	public void method2113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2279);
		this.anInt2282 = arg1;
		this.anInt2281 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2115();
		super.finalize();
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public void method2115() {
		if (this.anInt2279 > 0) {
			this.aClass22_Sub1_7.method954(this.anInt2284, this.anInt2279);
			this.anInt2279 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method9208() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2282, this.anInt2281, 36161, 0);
		this.anInt2282 = -1;
		this.anInt2281 = -1;
	}
}
