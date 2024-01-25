import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class4_Sub5_Sub13 extends Class4_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	private int anInt7069 = -1;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
	private int anInt7072 = -1;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public final int anInt7068;

	@OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
	private final int anInt7071;

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
	public final int anInt7075;

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_28;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
	private int anInt7070;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
	public final int anInt7065;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!kga;III)V")
	public Class4_Sub5_Sub13(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7068 = arg2;
		this.anInt7071 = arg1;
		this.anInt7075 = arg3;
		this.aClass44_Sub3_28 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static118.anIntArray190, 0);
		this.anInt7070 = Static118.anIntArray190[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7070);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt7071, this.anInt7068, this.anInt7075);
		this.anInt7065 = this.anInt7068 * this.anInt7075 * this.aClass44_Sub3_28.method4666(this.anInt7071);
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!kga;IIII)V")
	public Class4_Sub5_Sub13(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7071 = arg1;
		this.anInt7075 = arg3;
		this.aClass44_Sub3_28 = arg0;
		this.anInt7068 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static118.anIntArray190, 0);
		this.anInt7070 = Static118.anIntArray190[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7070);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt7071, this.anInt7068, this.anInt7075);
		this.anInt7065 = this.anInt7075 * this.anInt7068 * this.aClass44_Sub3_28.method4666(this.anInt7071);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	public void method5875() {
		if (this.anInt7070 > 0) {
			this.aClass44_Sub3_28.method4649(this.anInt7070, this.anInt7065);
			this.anInt7070 = 0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7064() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt7072, this.anInt7069, 36161, 0);
		this.anInt7069 = -1;
		this.anInt7072 = -1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIB)V")
	public void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt7070);
		this.anInt7072 = arg1;
		this.anInt7069 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5875();
		super.finalize();
	}
}
