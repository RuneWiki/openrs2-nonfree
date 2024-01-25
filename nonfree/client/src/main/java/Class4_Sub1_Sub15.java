import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!po", name = "C", descriptor = "I")
	private int anInt5537 = -1;

	@OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
	private int anInt5546 = -1;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "I")
	public final int anInt5541;

	@OriginalMember(owner = "client!po", name = "I", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_35;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	public final int anInt5540;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "I")
	private final int anInt5535;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	private int anInt5534;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "I")
	private final int anInt5538;

	static {
		new Class242("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!bv;III)V")
	public Class4_Sub1_Sub15(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5541 = arg3;
		this.aClass30_Sub1_35 = arg0;
		this.anInt5540 = arg2;
		this.anInt5535 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static60.anIntArray101, 0);
		this.anInt5534 = Static60.anIntArray101[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5534);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5535, this.anInt5540, this.anInt5541);
		this.anInt5538 = this.anInt5540 * this.anInt5541 * this.aClass30_Sub1_35.method929(this.anInt5535);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!bv;IIII)V")
	public Class4_Sub1_Sub15(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5541 = arg3;
		this.anInt5540 = arg2;
		this.aClass30_Sub1_35 = arg0;
		this.anInt5535 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static60.anIntArray101, 0);
		this.anInt5534 = Static60.anIntArray101[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5534);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5535, this.anInt5540, this.anInt5541);
		this.anInt5538 = this.anInt5540 * this.anInt5541 * this.aClass30_Sub1_35.method929(this.anInt5535);
	}

	@OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4258();
		super.finalize();
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
	public void method4258() {
		if (this.anInt5534 > 0) {
			this.aClass30_Sub1_35.method937(this.anInt5534, this.anInt5538);
			this.anInt5534 = 0;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	@Override
	public void method4264() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5546, this.anInt5537, 36161, 0);
		this.anInt5537 = -1;
		this.anInt5546 = -1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public void method4259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt5534);
		this.anInt5546 = arg1;
		this.anInt5537 = arg0;
	}
}
