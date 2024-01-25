import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class35 implements Interface1 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	private int anInt793 = -1;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_5;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public final int anInt795;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public final int anInt796;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	private final int anInt792;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	private final int anInt791;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ge;III)V")
	public Class35(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass81_Sub1_5 = arg0;
		this.anInt795 = arg2;
		this.anInt796 = arg3;
		this.anInt792 = arg1;
		@Pc(20) opengl local20 = this.aClass81_Sub1_5.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static42.anIntArray100, 0);
		this.anInt794 = Static42.anIntArray100[0];
		local20.glBindRenderbufferEXT(36161, this.anInt794);
		local20.glRenderbufferStorageEXT(36161, this.anInt792, this.anInt795, this.anInt796);
		this.anInt791 = this.anInt795 * this.anInt796 * this.aClass81_Sub1_5.method1969(this.anInt792);
	}

	@OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method707();
		super.finalize();
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	public void method707() {
		if (this.anInt794 > 0) {
			this.aClass81_Sub1_5.method1995(this.anInt794, this.anInt791);
			this.anInt794 = 0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method708(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_5.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt794);
		this.anInt793 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	@Override
	public void method4114() {
		this.aClass81_Sub1_5.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt793, 36161, 0);
		this.anInt793 = -1;
	}
}
