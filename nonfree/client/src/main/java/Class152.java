import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class152 implements Interface9 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	private int anInt4620 = -1;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_32;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public final int anInt4618;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public final int anInt4623;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	private final int anInt4622;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	private final int anInt4621;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!h;III)V")
	public Class152(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass32_Sub2_32 = arg0;
		this.anInt4618 = arg2;
		this.anInt4623 = arg3;
		this.anInt4622 = arg1;
		@Pc(20) opengl local20 = this.aClass32_Sub2_32.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static220.anIntArray415, 0);
		this.anInt4619 = Static220.anIntArray415[0];
		local20.glBindRenderbufferEXT(36161, this.anInt4619);
		local20.glRenderbufferStorageEXT(36161, this.anInt4622, this.anInt4618, this.anInt4623);
		this.anInt4621 = this.anInt4618 * this.anInt4623 * this.aClass32_Sub2_32.method2261(this.anInt4622);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public void method4152(@OriginalArg(0) int arg0) {
		this.aClass32_Sub2_32.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt4619);
		this.anInt4620 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4153();
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	public void method4153() {
		if (this.anInt4619 > 0) {
			this.aClass32_Sub2_32.method2266(this.anInt4619, this.anInt4621);
			this.anInt4619 = 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	@Override
	public void method5499() {
		this.aClass32_Sub2_32.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt4620, 36161, 0);
		this.anInt4620 = -1;
	}
}
