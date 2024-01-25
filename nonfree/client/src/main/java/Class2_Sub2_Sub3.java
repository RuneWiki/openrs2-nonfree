import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
	private int anInt1651 = -1;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
	private int anInt1659 = -1;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public final int anInt1648;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	public final int anInt1658;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
	private final int anInt1653;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_7;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	private int anInt1649;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	public final int anInt1650;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!uca;III)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1648 = arg2;
		this.anInt1658 = arg3;
		this.anInt1653 = arg1;
		this.aClass162_Sub3_7 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static222.anIntArray267, 0);
		this.anInt1649 = Static222.anIntArray267[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1649);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt1653, this.anInt1648, this.anInt1658);
		this.anInt1650 = this.anInt1648 * this.anInt1658 * this.aClass162_Sub3_7.method6970(this.anInt1653);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!uca;IIII)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1658 = arg3;
		this.anInt1653 = arg1;
		this.anInt1648 = arg2;
		this.aClass162_Sub3_7 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static222.anIntArray267, 0);
		this.anInt1649 = Static222.anIntArray267[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt1649);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt1653, this.anInt1648, this.anInt1658);
		this.anInt1650 = this.anInt1658 * this.anInt1648 * this.aClass162_Sub3_7.method6970(this.anInt1653);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public void method1385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt1649);
		this.anInt1659 = arg1;
		this.anInt1651 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1386();
		super.finalize();
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
	public void method1386() {
		if (this.anInt1649 > 0) {
			this.aClass162_Sub3_7.method6910(this.anInt1649, this.anInt1650);
			this.anInt1649 = 0;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	@Override
	public void method5566() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt1659, this.anInt1651, 36161, 0);
		this.anInt1651 = -1;
		this.anInt1659 = -1;
	}
}
