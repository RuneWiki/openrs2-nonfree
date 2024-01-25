import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
	private int anInt4774 = -1;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
	private int anInt4778 = -1;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
	private final int anInt4772;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
	public final int anInt4780;

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
	public final int anInt4781;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_18;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
	private final int anInt4771;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!uq;III)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4772 = arg1;
		this.anInt4780 = arg3;
		this.anInt4781 = arg2;
		this.aClass122_Sub3_18 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static50.anIntArray129, 0);
		this.anInt4770 = Static50.anIntArray129[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4770);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4772, this.anInt4781, this.anInt4780);
		this.anInt4771 = this.anInt4780 * this.anInt4781 * this.aClass122_Sub3_18.method6866(this.anInt4772);
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!uq;IIII)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4781 = arg2;
		this.anInt4772 = arg1;
		this.aClass122_Sub3_18 = arg0;
		this.anInt4780 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static50.anIntArray129, 0);
		this.anInt4770 = Static50.anIntArray129[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4770);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4772, this.anInt4781, this.anInt4780);
		this.anInt4771 = this.anInt4781 * this.anInt4780 * this.aClass122_Sub3_18.method6866(this.anInt4772);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public void method4126() {
		if (this.anInt4770 > 0) {
			this.aClass122_Sub3_18.method6906(this.anInt4770, this.anInt4771);
			this.anInt4770 = 0;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	@Override
	public void method6345() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4778, this.anInt4774, 36161, 0);
		this.anInt4774 = -1;
		this.anInt4778 = -1;
	}

	@OriginalMember(owner = "client!jv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4126();
		super.finalize();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V")
	public void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt4770);
		this.anInt4778 = arg1;
		this.anInt4774 = arg0;
	}
}
