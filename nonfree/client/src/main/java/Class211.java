import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class211 implements Interface11 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	private int anInt5971 = -1;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_31;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public final int anInt5968;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public final int anInt5966;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	private final int anInt5967;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	private int anInt5970;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	private final int anInt5969;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ic;III)V")
	public Class211(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass48_Sub2_31 = arg0;
		this.anInt5968 = arg2;
		this.anInt5966 = arg3;
		this.anInt5967 = arg1;
		@Pc(20) opengl local20 = this.aClass48_Sub2_31.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static325.anIntArray520, 0);
		this.anInt5970 = Static325.anIntArray520[0];
		local20.glBindRenderbufferEXT(36161, this.anInt5970);
		local20.glRenderbufferStorageEXT(36161, this.anInt5967, this.anInt5968, this.anInt5966);
		this.anInt5969 = this.anInt5968 * this.anInt5966 * this.aClass48_Sub2_31.method2590(this.anInt5967);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "()V")
	public void method5236() {
		if (this.anInt5970 > 0) {
			this.aClass48_Sub2_31.method2621(this.anInt5970, this.anInt5969);
			this.anInt5970 = 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method5237(@OriginalArg(0) int arg0) {
		this.aClass48_Sub2_31.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5970);
		this.anInt5971 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "()V")
	@Override
	public void method5235() {
		this.aClass48_Sub2_31.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt5971, 36161, 0);
		this.anInt5971 = -1;
	}

	@OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5236();
		super.finalize();
	}
}
