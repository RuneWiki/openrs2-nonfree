import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class5_Sub5_Sub20 extends Class5_Sub5 implements Interface27 {

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
	private int anInt10443 = -1;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
	private int anInt10449 = -1;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	public final int anInt10445;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public final int anInt10448;

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
	private final int anInt10444;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_40;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	private int anInt10454;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
	private final int anInt10452;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!ffa;III)V")
	public Class5_Sub5_Sub20(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10445 = arg2;
		this.anInt10448 = arg3;
		this.anInt10444 = arg1;
		this.aClass57_Sub2_40 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static96.anIntArray83, 0);
		this.anInt10454 = Static96.anIntArray83[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10454);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt10444, this.anInt10445, this.anInt10448);
		this.anInt10452 = this.anInt10445 * this.anInt10448 * this.aClass57_Sub2_40.method2338(this.anInt10444);
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!ffa;IIII)V")
	public Class5_Sub5_Sub20(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10445 = arg2;
		this.aClass57_Sub2_40 = arg0;
		this.anInt10448 = arg3;
		this.anInt10444 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static96.anIntArray83, 0);
		this.anInt10454 = Static96.anIntArray83[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10454);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt10444, this.anInt10445, this.anInt10448);
		this.anInt10452 = this.anInt10448 * this.anInt10445 * this.aClass57_Sub2_40.method2338(this.anInt10444);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V")
	public void method8967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt10454);
		this.anInt10443 = arg0;
		this.anInt10449 = arg1;
	}

	@OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method8970();
		super.finalize();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	public void method8970() {
		if (this.anInt10454 > 0) {
			this.aClass57_Sub2_40.method2321(this.anInt10452, this.anInt10454);
			this.anInt10454 = 0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public void method8965() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt10443, this.anInt10449, 36161, 0);
		this.anInt10443 = -1;
		this.anInt10449 = -1;
	}
}
