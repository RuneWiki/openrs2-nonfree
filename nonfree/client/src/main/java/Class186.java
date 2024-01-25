import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class186 implements Interface7 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	private int anInt5729 = -1;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_36;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public final int anInt5727;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public final int anInt5730;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	private final int anInt5732;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	private int anInt5731;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	private final int anInt5728;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!hd;III)V")
	public Class186(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass89_Sub1_36 = arg0;
		this.anInt5727 = arg2;
		this.anInt5730 = arg3;
		this.anInt5732 = arg1;
		@Pc(20) opengl local20 = this.aClass89_Sub1_36.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static295.anIntArray727, 0);
		this.anInt5731 = Static295.anIntArray727[0];
		local20.glBindRenderbufferEXT(36161, this.anInt5731);
		local20.glRenderbufferStorageEXT(36161, this.anInt5732, this.anInt5727, this.anInt5730);
		this.anInt5728 = this.anInt5727 * this.anInt5730 * this.aClass89_Sub1_36.method2406(this.anInt5732);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
	@Override
	public void method4829() {
		this.aClass89_Sub1_36.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt5729, 36161, 0);
		this.anInt5729 = -1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method4830(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_36.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5731);
		this.anInt5729 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4831();
		super.finalize();
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "()V")
	public void method4831() {
		if (this.anInt5731 > 0) {
			this.aClass89_Sub1_36.method2413(this.anInt5731, this.anInt5728);
			this.anInt5731 = 0;
		}
	}
}
