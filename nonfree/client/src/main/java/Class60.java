import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class60 implements Interface4 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!mm;")
	protected final Class55_Sub1 aClass55_Sub1_40;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	public final int anInt6572;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	protected final int anInt6570;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private final int anInt6569;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	protected int anInt6571;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!mm;IIIZ)V")
	protected Class60(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass55_Sub1_40 = arg0;
		this.anInt6572 = arg1;
		this.anInt6570 = arg2;
		this.aBoolean569 = arg4;
		this.anInt6569 = arg3;
		this.aClass55_Sub1_40.anOpengl1.glGenTextures(1, Static302.anIntArray613, 0);
		this.anInt6571 = Static302.anIntArray613[0];
		this.method5835(0);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()I")
	private int method5834() {
		@Pc(8) int local8 = this.aClass55_Sub1_40.method3681(this.anInt6570) * this.anInt6569;
		return this.aBoolean569 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	private void method5835(@OriginalArg(0) int arg0) {
		this.aClass55_Sub1_40.anInt3998 -= arg0;
		this.aClass55_Sub1_40.anInt3998 += this.method5834();
	}

	@OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5845();
		super.finalize();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public final void method5836(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean568 != arg0) {
			this.aBoolean568 = arg0;
			this.method5843();
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()Z")
	public final boolean method5838() {
		@Pc(3) opengl local3 = this.aClass55_Sub1_40.anOpengl1;
		if (!this.aClass55_Sub1_40.aBoolean309) {
			return false;
		}
		@Pc(10) int local10 = this.method5834();
		this.aClass55_Sub1_40.method3677(this);
		local3.glGenerateMipmapEXT(this.anInt6572);
		this.aBoolean569 = true;
		this.method5843();
		this.method5835(local10);
		return true;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
	protected final void method5842(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean569 != arg0) {
			@Pc(6) int local6 = this.method5834();
			this.aBoolean569 = true;
			this.method5843();
			this.method5835(local6);
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	private void method5843() {
		@Pc(3) opengl local3 = this.aClass55_Sub1_40.anOpengl1;
		this.aClass55_Sub1_40.method3677(this);
		if (this.aBoolean568) {
			local3.glTexParameteri(this.anInt6572, 10241, this.aBoolean569 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6572, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6572, 10241, this.aBoolean569 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6572, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
	public final void method5845() {
		if (this.anInt6571 > 0) {
			this.aClass55_Sub1_40.method3698(this.anInt6571, this.method5834());
			this.anInt6571 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()I")
	public final int method5846() {
		return this.anInt6571;
	}
}
