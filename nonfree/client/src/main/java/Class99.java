import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class99 implements Interface1 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private int anInt2425 = -1;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_14;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public final int anInt2421;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public final int anInt2420;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	private final int anInt2424;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	private int anInt2422;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	private final int anInt2423;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!mi;III)V")
	public Class99(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass155_Sub1_14 = arg0;
		this.anInt2421 = arg2;
		this.anInt2420 = arg3;
		this.anInt2424 = arg1;
		@Pc(20) opengl local20 = this.aClass155_Sub1_14.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static128.anIntArray246, 0);
		this.anInt2422 = Static128.anIntArray246[0];
		local20.glBindRenderbufferEXT(36161, this.anInt2422);
		local20.glRenderbufferStorageEXT(36161, this.anInt2424, this.anInt2421, this.anInt2420);
		this.anInt2423 = this.anInt2421 * this.anInt2420 * this.aClass155_Sub1_14.method3577(this.anInt2424);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	public void method2046() {
		if (this.anInt2422 > 0) {
			this.aClass155_Sub1_14.method3618(this.anInt2422, this.anInt2423);
			this.anInt2422 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2046();
		super.finalize();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	@Override
	public void method4599() {
		this.aClass155_Sub1_14.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt2425, 36161, 0);
		this.anInt2425 = -1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method2047(@OriginalArg(0) int arg0) {
		this.aClass155_Sub1_14.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt2422);
		this.anInt2425 = arg0;
	}
}
