import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!po", name = "B", descriptor = "I")
	private int anInt8536 = -1;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "I")
	private int anInt8546 = -1;

	@OriginalMember(owner = "client!po", name = "y", descriptor = "I")
	public final int anInt8545;

	@OriginalMember(owner = "client!po", name = "E", descriptor = "I")
	private final int anInt8542;

	@OriginalMember(owner = "client!po", name = "I", descriptor = "I")
	public final int anInt8540;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_33;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "I")
	private int anInt8544;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "I")
	private final int anInt8547;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!gia;III)V")
	public Class3_Sub4_Sub16(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8545 = arg2;
		this.anInt8542 = arg1;
		this.anInt8540 = arg3;
		this.aClass67_Sub2_33 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static371.anIntArray353, 0);
		this.anInt8544 = Static371.anIntArray353[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8544);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt8542, this.anInt8545, this.anInt8540);
		this.anInt8547 = this.anInt8540 * this.anInt8545 * this.aClass67_Sub2_33.method3272(this.anInt8542);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!gia;IIII)V")
	public Class3_Sub4_Sub16(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8540 = arg3;
		this.anInt8542 = arg1;
		this.aClass67_Sub2_33 = arg0;
		this.anInt8545 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static371.anIntArray353, 0);
		this.anInt8544 = Static371.anIntArray353[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8544);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt8542, this.anInt8545, this.anInt8540);
		this.anInt8547 = this.anInt8545 * this.anInt8540 * this.aClass67_Sub2_33.method3272(this.anInt8542);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	@Override
	public void method8671() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt8546, this.anInt8536, 36161, 0);
		this.anInt8536 = -1;
		this.anInt8546 = -1;
	}

	@OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7171();
		super.finalize();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)V")
	public void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt8544);
		this.anInt8546 = arg1;
		this.anInt8536 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	public void method7171() {
		if (this.anInt8544 > 0) {
			this.aClass67_Sub2_33.method3224(this.anInt8544, this.anInt8547);
			this.anInt8544 = 0;
		}
	}
}
