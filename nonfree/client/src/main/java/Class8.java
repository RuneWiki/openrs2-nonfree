import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public abstract class Class8 implements Interface1 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "[I")
	private static final int[] anIntArray478 = new int[1];

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_40;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	protected final int anInt6870;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	private final int anInt6871;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	protected int anInt6868;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!bf;IIIZ)V", line = 416)
	protected Class8(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub1_40 = arg0;
		this.anInt6869 = arg1;
		this.anInt6870 = arg2;
		this.aBoolean467 = arg4;
		this.anInt6871 = arg3;
		this.aClass19_Sub1_40.anOpengl1.glGenTextures(1, anIntArray478, 0);
		this.anInt6868 = anIntArray478[0];
		this.method6155(0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 99)
	private void method6155(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_40.anInt585 -= arg0;
		this.aClass19_Sub1_40.anInt585 += this.method6163();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V", line = 131)
	public final void method6157() {
		if (this.anInt6868 > 0) {
			this.aClass19_Sub1_40.method803(this.anInt6868, this.method6163());
			this.anInt6868 = 0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()I", line = 229)
	public final int method6159() {
		return this.anInt6868;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()Z", line = 233)
	public final boolean method6160() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		if (!this.aClass19_Sub1_40.aBoolean36) {
			return false;
		}
		@Pc(10) int local10 = this.method6163();
		this.aClass19_Sub1_40.method848(this);
		local3.glGenerateMipmapEXT(this.anInt6869);
		this.aBoolean467 = true;
		this.method6162();
		this.method6155(local10);
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 253)
	public final void method6161(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			this.aBoolean468 = arg0;
			this.method6162();
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()V", line = 265)
	private void method6162() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		if (this.aBoolean468) {
			local3.glTexParameteri(this.anInt6869, 10241, this.aBoolean467 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6869, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6869, 10241, this.aBoolean467 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6869, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "()I", line = 281)
	private int method6163() {
		@Pc(8) int local8 = this.aClass19_Sub1_40.method778(this.anInt6870) * this.anInt6871;
		return this.aBoolean467 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V", line = 286)
	@Override
	public final void finalize() throws Throwable {
		this.method6157();
		super.finalize();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V", line = 429)
	protected final void method6166(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean467 != arg0) {
			@Pc(6) int local6 = this.method6163();
			this.aBoolean467 = true;
			this.method6162();
			this.method6155(local6);
		}
	}
}
