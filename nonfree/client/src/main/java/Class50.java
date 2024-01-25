import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public abstract class Class50 implements Interface18 {

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "Z")
	private boolean aBoolean777 = false;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "Lclient!lea;")
	protected final Class101_Sub2 aClass101_Sub2_41;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "Z")
	private boolean aBoolean778;

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
	public final int anInt10677;

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	protected final int anInt10669;

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
	private final int anInt10673;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	protected int anInt10666;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!lea;IIIZ)V")
	protected Class50(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass101_Sub2_41 = arg0;
		this.aBoolean778 = arg4;
		this.anInt10677 = arg1;
		this.anInt10669 = arg2;
		this.anInt10673 = arg3;
		OpenGL.glGenTextures(1, Static580.anIntArray512, 0);
		this.anInt10666 = Static580.anIntArray512[0];
		this.method9135(0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
	public final void method9134(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean777) {
			this.aBoolean777 = arg0;
			this.method9144();
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
	private void method9135(@OriginalArg(1) int arg0) {
		this.aClass101_Sub2_41.anInt6320 -= arg0;
		this.aClass101_Sub2_41.anInt6320 += this.method9136();
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)I")
	private int method9136() {
		@Pc(19) int local19 = this.aClass101_Sub2_41.method5621(this.anInt10669) * this.anInt10673;
		return this.aBoolean778 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)I")
	public final int method9138() {
		return this.anInt10666;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BZ)V")
	protected final void method9139(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean778) {
			@Pc(26) int local26 = this.method9136();
			this.aBoolean778 = true;
			this.method9144();
			this.method9135(local26);
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(B)V")
	public final void method9140() {
		if (this.anInt10666 > 0) {
			this.aClass101_Sub2_41.method5655(this.method9136(), this.anInt10666);
			this.anInt10666 = 0;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)Z")
	public final boolean method9142() {
		if (!this.aClass101_Sub2_41.aBoolean463) {
			return false;
		}
		@Pc(16) int local16 = this.method9136();
		this.aClass101_Sub2_41.method5690(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10677);
		this.aBoolean778 = true;
		this.method9144();
		this.method9135(local16);
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9140();
		super.finalize();
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(B)V")
	private void method9144() {
		this.aClass101_Sub2_41.method5690(this);
		if (this.aBoolean777) {
			OpenGL.glTexParameteri(this.anInt10677, 10241, this.aBoolean778 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10677, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10677, 10241, this.aBoolean778 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10677, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public abstract void method9133();
}
