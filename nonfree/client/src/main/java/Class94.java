import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class94 implements Interface2 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	private int anInt2764 = -1;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_16;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public final int anInt2765;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public final int anInt2763;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	private final int anInt2762;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
	private final int anInt2766;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!se;III)V")
	public Class94(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass122_Sub2_16 = arg0;
		this.anInt2765 = arg2;
		this.anInt2763 = arg3;
		this.anInt2762 = arg1;
		@Pc(20) opengl local20 = this.aClass122_Sub2_16.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static133.anIntArray182, 0);
		this.anInt2761 = Static133.anIntArray182[0];
		local20.glBindRenderbufferEXT(36161, this.anInt2761);
		local20.glRenderbufferStorageEXT(36161, this.anInt2762, this.anInt2765, this.anInt2763);
		this.anInt2766 = this.anInt2765 * this.anInt2763 * this.aClass122_Sub2_16.method4839(this.anInt2762);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()V")
	public void method2237() {
		if (this.anInt2761 > 0) {
			this.aClass122_Sub2_16.method4814(this.anInt2761, this.anInt2766);
			this.anInt2761 = 0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2237();
		super.finalize();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public void method2238(@OriginalArg(0) int arg0) {
		this.aClass122_Sub2_16.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt2761);
		this.anInt2764 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	@Override
	public void method4037() {
		this.aClass122_Sub2_16.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt2764, 36161, 0);
		this.anInt2764 = -1;
	}
}
