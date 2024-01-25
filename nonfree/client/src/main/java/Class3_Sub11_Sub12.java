import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class3_Sub11_Sub12 extends Class3_Sub11 implements Interface24 {

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
	private int anInt5364 = -1;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
	private int anInt5374 = -1;

	@OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
	public final int anInt5371;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_18;

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	private final int anInt5366;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
	public final int anInt5368;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
	private int anInt5373;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
	private final int anInt5363;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!dia;III)V")
	public Class3_Sub11_Sub12(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5371 = arg2;
		this.aClass13_Sub2_18 = arg0;
		this.anInt5366 = arg1;
		this.anInt5368 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static141.anIntArray231, 0);
		this.anInt5373 = Static141.anIntArray231[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5373);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5366, this.anInt5371, this.anInt5368);
		this.anInt5363 = this.anInt5371 * this.anInt5368 * this.aClass13_Sub2_18.method2016(this.anInt5366);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!dia;IIII)V")
	public Class3_Sub11_Sub12(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5371 = arg2;
		this.anInt5368 = arg3;
		this.aClass13_Sub2_18 = arg0;
		this.anInt5366 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static141.anIntArray231, 0);
		this.anInt5373 = Static141.anIntArray231[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5373);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5366, this.anInt5371, this.anInt5368);
		this.anInt5363 = this.anInt5368 * this.anInt5371 * this.aClass13_Sub2_18.method2016(this.anInt5366);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)V")
	public void method4916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5373);
		this.anInt5374 = arg1;
		this.anInt5364 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public void method4917() {
		if (this.anInt5373 > 0) {
			this.aClass13_Sub2_18.method1972(this.anInt5363, this.anInt5373);
			this.anInt5373 = 0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	@Override
	public void method7868() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5364, this.anInt5374, 36161, 0);
		this.anInt5374 = -1;
		this.anInt5364 = -1;
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4917();
		super.finalize();
	}
}
