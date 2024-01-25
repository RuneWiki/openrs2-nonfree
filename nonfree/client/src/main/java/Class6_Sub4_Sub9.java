import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class6_Sub4_Sub9 extends Class6_Sub4 implements Interface3 {

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
	private int anInt5260 = -1;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
	private int anInt5266 = -1;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_28;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
	public final int anInt5261;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	public final int anInt5259;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
	private final int anInt5265;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
	private int anInt5263;

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
	private final int anInt5264;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!pq;III)V")
	public Class6_Sub4_Sub9(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass132_Sub3_28 = arg0;
		this.anInt5261 = arg3;
		this.anInt5259 = arg2;
		this.anInt5265 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static659.anIntArray507, 0);
		this.anInt5263 = Static659.anIntArray507[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5263);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5265, this.anInt5259, this.anInt5261);
		this.anInt5264 = this.anInt5261 * this.anInt5259 * this.aClass132_Sub3_28.method6797(this.anInt5265);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!pq;IIII)V")
	public Class6_Sub4_Sub9(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass132_Sub3_28 = arg0;
		this.anInt5259 = arg2;
		this.anInt5265 = arg1;
		this.anInt5261 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static659.anIntArray507, 0);
		this.anInt5263 = Static659.anIntArray507[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5263);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5265, this.anInt5259, this.anInt5261);
		this.anInt5264 = this.anInt5261 * this.anInt5259 * this.aClass132_Sub3_28.method6797(this.anInt5265);
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4441();
		super.finalize();
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V")
	public void method4441() {
		if (this.anInt5263 > 0) {
			this.aClass132_Sub3_28.method6753(this.anInt5264, this.anInt5263);
			this.anInt5263 = 0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)V")
	public void method4442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5263);
		this.anInt5266 = arg0;
		this.anInt5260 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method8284() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5266, this.anInt5260, 36161, 0);
		this.anInt5260 = -1;
		this.anInt5266 = -1;
	}
}
