import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	private int anInt8979 = -1;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
	private int anInt8982 = -1;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	private final int anInt8983;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	public final int anInt8985;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_32;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public final int anInt8987;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
	private int anInt8986;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
	private final int anInt8976;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!lea;III)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8983 = arg1;
		this.anInt8985 = arg3;
		this.aClass101_Sub2_32 = arg0;
		this.anInt8987 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static642.anIntArray579, 0);
		this.anInt8986 = Static642.anIntArray579[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8986);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt8983, this.anInt8987, this.anInt8985);
		this.anInt8976 = this.anInt8985 * this.anInt8987 * this.aClass101_Sub2_32.method5621(this.anInt8983);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!lea;IIII)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass101_Sub2_32 = arg0;
		this.anInt8987 = arg2;
		this.anInt8983 = arg1;
		this.anInt8985 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static642.anIntArray579, 0);
		this.anInt8986 = Static642.anIntArray579[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8986);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt8983, this.anInt8987, this.anInt8985);
		this.anInt8976 = this.anInt8985 * this.anInt8987 * this.aClass101_Sub2_32.method5621(this.anInt8983);
	}

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7894();
		super.finalize();
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
	public void method7894() {
		if (this.anInt8986 > 0) {
			this.aClass101_Sub2_32.method5668(this.anInt8986, this.anInt8976);
			this.anInt8986 = 0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	@Override
	public void method9133() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt8979, this.anInt8982, 36161, 0);
		this.anInt8979 = -1;
		this.anInt8982 = -1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)V")
	public void method7895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt8986);
		this.anInt8982 = arg1;
		this.anInt8979 = arg0;
	}
}
