import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
	private int anInt6966 = -1;

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
	private int anInt6968 = -1;

	@OriginalMember(owner = "client!pca", name = "E", descriptor = "I")
	private final int anInt6973;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
	public final int anInt6967;

	@OriginalMember(owner = "client!pca", name = "G", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_33;

	@OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
	public final int anInt6971;

	@OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
	private int anInt6969;

	@OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
	public final int anInt6974;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!qj;III)V")
	public Class2_Sub3_Sub12(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6973 = arg1;
		this.anInt6967 = arg3;
		this.aClass100_Sub3_33 = arg0;
		this.anInt6971 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static132.anIntArray486, 0);
		this.anInt6969 = Static132.anIntArray486[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6969);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6973, this.anInt6971, this.anInt6967);
		this.anInt6974 = this.anInt6967 * this.anInt6971 * this.aClass100_Sub3_33.method6280(this.anInt6973);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!qj;IIII)V")
	public Class2_Sub3_Sub12(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6971 = arg2;
		this.anInt6967 = arg3;
		this.anInt6973 = arg1;
		this.aClass100_Sub3_33 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static132.anIntArray486, 0);
		this.anInt6969 = Static132.anIntArray486[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6969);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6973, this.anInt6971, this.anInt6967);
		this.anInt6974 = this.anInt6967 * this.anInt6971 * this.aClass100_Sub3_33.method6280(this.anInt6973);
	}

	@OriginalMember(owner = "client!pca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5833();
		super.finalize();
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
	public void method5833() {
		if (this.anInt6969 > 0) {
			this.aClass100_Sub3_33.method6337(this.anInt6974, this.anInt6969);
			this.anInt6969 = 0;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	@Override
	public void method7774() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6966, this.anInt6968, 36161, 0);
		this.anInt6966 = -1;
		this.anInt6968 = -1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	public void method5835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt6969);
		this.anInt6968 = arg0;
		this.anInt6966 = arg1;
	}
}
