import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class184 implements Interface1 {

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[I")
	private static final int[] anIntArray353 = new int[1];

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	private int anInt5059 = -1;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_30;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public final int anInt5057;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public final int anInt5055;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	private final int anInt5056;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	private int anInt5058;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	private final int anInt5054;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!bf;III)V", line = 39)
	public Class184(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass19_Sub1_30 = arg0;
		this.anInt5057 = arg2;
		this.anInt5055 = arg3;
		this.anInt5056 = arg1;
		@Pc(20) opengl local20 = this.aClass19_Sub1_30.anOpengl1;
		local20.glGenRenderbuffersEXT(1, anIntArray353, 0);
		this.anInt5058 = anIntArray353[0];
		local20.glBindRenderbufferEXT(36161, this.anInt5058);
		local20.glRenderbufferStorageEXT(36161, this.anInt5056, this.anInt5057, this.anInt5055);
		this.anInt5054 = this.anInt5057 * this.anInt5055 * this.aClass19_Sub1_30.method778(this.anInt5056);
	}

	@OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V", line = 3)
	@Override
	public void finalize() throws Throwable {
		this.method4651();
		super.finalize();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 7)
	public void method4650(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_30.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5058);
		this.anInt5059 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V", line = 17)
	@Override
	public void method6153() {
		this.aClass19_Sub1_30.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt5059, 36161, 0);
		this.anInt5059 = -1;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "()V", line = 23)
	public void method4651() {
		if (this.anInt5058 > 0) {
			this.aClass19_Sub1_30.method785(this.anInt5058, this.anInt5054);
			this.anInt5058 = 0;
		}
	}
}
