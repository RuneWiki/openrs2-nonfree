import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public abstract class Class62 implements Interface1 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Lclient!bt;")
	protected final Class30_Sub1 aClass30_Sub1_40;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	protected final int anInt6634;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	private final int anInt6636;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	public final int anInt6644;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	protected int anInt6638;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!bt;IIIZ)V")
	protected Class62(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass30_Sub1_40 = arg0;
		this.anInt6634 = arg2;
		this.anInt6636 = arg3;
		this.anInt6644 = arg1;
		this.aBoolean482 = arg4;
		OpenGL.glGenTextures(1, Static108.anIntArray201, 0);
		this.anInt6638 = Static108.anIntArray201[0];
		this.method5354(0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZB)V")
	public final void method5349(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean481) {
			this.aBoolean481 = arg0;
			this.method5350();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	private void method5350() {
		this.aClass30_Sub1_40.method730(this);
		if (this.aBoolean481) {
			OpenGL.glTexParameteri(this.anInt6644, 10241, this.aBoolean482 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6644, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6644, 10241, this.aBoolean482 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6644, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)I")
	private int method5351() {
		@Pc(13) int local13 = this.aClass30_Sub1_40.method700(this.anInt6634) * this.anInt6636;
		return this.aBoolean482 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
	public final boolean method5352() {
		if (!this.aClass30_Sub1_40.aBoolean60) {
			return false;
		}
		@Pc(18) int local18 = this.method5351();
		this.aClass30_Sub1_40.method730(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6644);
		this.aBoolean482 = true;
		this.method5350();
		this.method5354(local18);
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public final void method5353() {
		if (this.anInt6638 > 0) {
			this.aClass30_Sub1_40.method746(this.method5351(), this.anInt6638);
			this.anInt6638 = 0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	private void method5354(@OriginalArg(0) int arg0) {
		this.aClass30_Sub1_40.anInt847 -= arg0;
		this.aClass30_Sub1_40.anInt847 += this.method5351();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
	public final int method5356() {
		return this.anInt6638;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)V")
	protected final void method5358(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean482 != arg0) {
			@Pc(17) int local17 = this.method5351();
			this.aBoolean482 = true;
			this.method5350();
			this.method5354(local17);
		}
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5353();
		super.finalize();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public abstract void method5348();
}
