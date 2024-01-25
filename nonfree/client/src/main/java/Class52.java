import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public abstract class Class52 implements Interface5 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!ig;")
	protected final Class47_Sub2 aClass47_Sub2_42;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public final int anInt6685;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	protected final int anInt6684;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	private final int anInt6686;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	protected int anInt6683;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ig;IIIZ)V")
	protected Class52(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass47_Sub2_42 = arg0;
		this.anInt6685 = arg1;
		this.anInt6684 = arg2;
		this.aBoolean483 = arg4;
		this.anInt6686 = arg3;
		this.aClass47_Sub2_42.anOpengl2.glGenTextures(1, Static71.anIntArray509, 0);
		this.anInt6683 = Static71.anIntArray509[0];
		this.method5611(0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	protected final void method5603(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean483 != arg0) {
			@Pc(6) int local6 = this.method5614();
			this.aBoolean483 = true;
			this.method5605();
			this.method5611(local6);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public final void method5604(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean482 != arg0) {
			this.aBoolean482 = arg0;
			this.method5605();
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
	private void method5605() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_42.anOpengl2;
		this.aClass47_Sub2_42.method2772(this);
		if (this.aBoolean482) {
			local3.glTexParameteri(this.anInt6685, 10241, this.aBoolean483 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6685, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6685, 10241, this.aBoolean483 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6685, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "()Z")
	public final boolean method5607() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_42.anOpengl2;
		if (!this.aClass47_Sub2_42.aBoolean228) {
			return false;
		}
		@Pc(10) int local10 = this.method5614();
		this.aClass47_Sub2_42.method2772(this);
		local3.glGenerateMipmapEXT(this.anInt6685);
		this.aBoolean483 = true;
		this.method5605();
		this.method5611(local10);
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5612();
		super.finalize();
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "()I")
	public final int method5610() {
		return this.anInt6683;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	private void method5611(@OriginalArg(0) int arg0) {
		this.aClass47_Sub2_42.anInt3058 -= arg0;
		this.aClass47_Sub2_42.anInt3058 += this.method5614();
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "()V")
	public final void method5612() {
		if (this.anInt6683 > 0) {
			this.aClass47_Sub2_42.method2807(this.anInt6683, this.method5614());
			this.anInt6683 = 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "()I")
	private int method5614() {
		@Pc(8) int local8 = this.aClass47_Sub2_42.method2781(this.anInt6684) * this.anInt6686;
		return this.aBoolean483 ? local8 * 4 / 3 : local8;
	}
}
