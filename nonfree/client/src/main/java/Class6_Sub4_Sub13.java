import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class6_Sub4_Sub13 extends Class6_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	private int anInt7942 = -1;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	private int anInt7948 = -1;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	private final int anInt7939;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public final int anInt7944;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
	public final int anInt7945;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_32;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	private int anInt7940;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	private final int anInt7941;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ap;III)V")
	public Class6_Sub4_Sub13(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7939 = arg1;
		this.anInt7944 = arg3;
		this.anInt7945 = arg2;
		this.aClass9_Sub2_32 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static203.anIntArray280, 0);
		this.anInt7940 = Static203.anIntArray280[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7940);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt7939, this.anInt7945, this.anInt7944);
		this.anInt7941 = this.anInt7944 * this.anInt7945 * this.aClass9_Sub2_32.method766(this.anInt7939);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ap;IIII)V")
	public Class6_Sub4_Sub13(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass9_Sub2_32 = arg0;
		this.anInt7944 = arg3;
		this.anInt7939 = arg1;
		this.anInt7945 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static203.anIntArray280, 0);
		this.anInt7940 = Static203.anIntArray280[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt7940);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt7939, this.anInt7945, this.anInt7944);
		this.anInt7941 = this.anInt7944 * this.anInt7945 * this.aClass9_Sub2_32.method766(this.anInt7939);
	}

	@OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6647();
		super.finalize();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	@Override
	public void method6643() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt7948, this.anInt7942, 36161, 0);
		this.anInt7948 = -1;
		this.anInt7942 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
	public void method6644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt7940);
		this.anInt7942 = arg1;
		this.anInt7948 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public void method6647() {
		if (this.anInt7940 > 0) {
			this.aClass9_Sub2_32.method778(this.anInt7940, this.anInt7941);
			this.anInt7940 = 0;
		}
	}
}
