import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class190 implements Interface5 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	private int anInt6232 = -1;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_37;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	public final int anInt6231;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public final int anInt6230;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	private final int anInt6228;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	private int anInt6229;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	private final int anInt6233;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ao;III)V")
	public Class190(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_Sub1_37 = arg0;
		this.anInt6231 = arg2;
		this.anInt6230 = arg3;
		this.anInt6228 = arg1;
		@Pc(20) opengl local20 = this.aClass4_Sub1_37.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static309.anIntArray458, 0);
		this.anInt6229 = Static309.anIntArray458[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6229);
		local20.glRenderbufferStorageEXT(36161, this.anInt6228, this.anInt6231, this.anInt6230);
		this.anInt6233 = this.anInt6231 * this.anInt6230 * this.aClass4_Sub1_37.method605(this.anInt6228);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
	@Override
	public void method5891() {
		this.aClass4_Sub1_37.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt6232, 36161, 0);
		this.anInt6232 = -1;
	}

	@OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5421();
		super.finalize();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
	public void method5421() {
		if (this.anInt6229 > 0) {
			this.aClass4_Sub1_37.method577(this.anInt6229, this.anInt6233);
			this.anInt6229 = 0;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public void method5422(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_37.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6229);
		this.anInt6232 = arg0;
	}
}
