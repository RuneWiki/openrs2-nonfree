import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public abstract class Class2 implements Interface3 {

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "Lclient!ac;")
	protected final Class5_Sub1 aClass5_Sub1_32;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	public final int anInt8317;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	protected final int anInt8326;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	private final int anInt8314;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
	protected int anInt8325;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!ac;IIIZ)V")
	protected Class2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub1_32 = arg0;
		this.anInt8317 = arg1;
		this.aBoolean664 = arg4;
		this.anInt8326 = arg2;
		this.anInt8314 = arg3;
		OpenGL.glGenTextures(1, Static306.anIntArray289, 0);
		this.anInt8325 = Static306.anIntArray289[0];
		this.method6981(0);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	private void method6972() {
		this.aClass5_Sub1_32.method352(this);
		if (this.aBoolean665) {
			OpenGL.glTexParameteri(this.anInt8317, 10241, this.aBoolean664 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8317, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8317, 10241, this.aBoolean664 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8317, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	public final int method6973() {
		return this.anInt8325;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	private int method6974() {
		@Pc(15) int local15 = this.aClass5_Sub1_32.method355(this.anInt8326) * this.anInt8314;
		return this.aBoolean664 ? local15 * 4 / 3 : local15;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Z")
	public final boolean method6975() {
		if (!this.aClass5_Sub1_32.aBoolean40) {
			return false;
		}
		@Pc(18) int local18 = this.method6974();
		this.aClass5_Sub1_32.method352(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8317);
		this.aBoolean664 = true;
		this.method6972();
		this.method6981(local18);
		return true;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
	public final void method6976(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean665) {
			this.aBoolean665 = arg0;
			this.method6972();
		}
	}

	@OriginalMember(owner = "client!cu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6979();
		super.finalize();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)V")
	protected final void method6977(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean664 != arg0) {
			@Pc(11) int local11 = this.method6974();
			this.aBoolean664 = true;
			this.method6972();
			this.method6981(local11);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
	public final void method6979() {
		if (this.anInt8325 > 0) {
			this.aClass5_Sub1_32.method362(this.method6974(), this.anInt8325);
			this.anInt8325 = 0;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)V")
	private void method6981(@OriginalArg(1) int arg0) {
		this.aClass5_Sub1_32.anInt367 -= arg0;
		this.aClass5_Sub1_32.anInt367 += this.method6974();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public abstract void method6971();
}
