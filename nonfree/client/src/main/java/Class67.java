import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class67 implements Interface4 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	private int anInt1556 = -1;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_17;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public final int anInt1557;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public final int anInt1558;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	private int anInt1560;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	private final int anInt1559;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!mm;III)V")
	public Class67(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass55_Sub1_17 = arg0;
		this.anInt1557 = arg2;
		this.anInt1558 = arg3;
		this.anInt1561 = arg1;
		@Pc(20) opengl local20 = this.aClass55_Sub1_17.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static83.anIntArray130, 0);
		this.anInt1560 = Static83.anIntArray130[0];
		local20.glBindRenderbufferEXT(36161, this.anInt1560);
		local20.glRenderbufferStorageEXT(36161, this.anInt1561, this.anInt1557, this.anInt1558);
		this.anInt1559 = this.anInt1557 * this.anInt1558 * this.aClass55_Sub1_17.method3681(this.anInt1561);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method1501(@OriginalArg(0) int arg0) {
		this.aClass55_Sub1_17.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt1560);
		this.anInt1556 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1502();
		super.finalize();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
	public void method1502() {
		if (this.anInt1560 > 0) {
			this.aClass55_Sub1_17.method3653(this.anInt1560, this.anInt1559);
			this.anInt1560 = 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	@Override
	public void method5833() {
		this.aClass55_Sub1_17.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt1556, 36161, 0);
		this.anInt1556 = -1;
	}
}
