import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
	private int anInt6986 = -1;

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
	private int anInt6983 = -1;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_39;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
	public final int anInt6982;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	public final int anInt6979;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	private final int anInt6980;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
	private int anInt6978;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	private final int anInt6977;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!na;III)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass75_Sub2_39 = arg0;
		this.anInt6982 = arg3;
		this.anInt6979 = arg2;
		this.anInt6980 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static205.anIntArray294, 0);
		this.anInt6978 = Static205.anIntArray294[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6978);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt6980, this.anInt6979, this.anInt6982);
		this.anInt6977 = this.anInt6979 * this.anInt6982 * this.aClass75_Sub2_39.method3797(this.anInt6980);
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!na;IIII)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6980 = arg1;
		this.aClass75_Sub2_39 = arg0;
		this.anInt6982 = arg3;
		this.anInt6979 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static205.anIntArray294, 0);
		this.anInt6978 = Static205.anIntArray294[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt6978);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt6980, this.anInt6979, this.anInt6982);
		this.anInt6977 = this.anInt6982 * this.anInt6979 * this.aClass75_Sub2_39.method3797(this.anInt6980);
	}

	@OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5598();
		super.finalize();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
	public void method5597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt6978);
		this.anInt6986 = arg1;
		this.anInt6983 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method5596() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt6986, this.anInt6983, 36161, 0);
		this.anInt6986 = -1;
		this.anInt6983 = -1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method5598() {
		if (this.anInt6978 > 0) {
			this.aClass75_Sub2_39.method3851(this.anInt6978, this.anInt6977);
			this.anInt6978 = 0;
		}
	}
}
