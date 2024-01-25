import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public abstract class Class125 implements Interface10 {

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
	private final int anInt10848;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
	public final int anInt10843;

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "Lclient!aq;")
	protected final Class22_Sub1 aClass22_Sub1_41;

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
	protected final int anInt10853;

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
	protected int anInt10846;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!aq;IIIZ)V")
	protected Class125(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10848 = arg3;
		this.anInt10843 = arg1;
		this.aClass22_Sub1_41 = arg0;
		this.aBoolean737 = arg4;
		this.anInt10853 = arg2;
		OpenGL.glGenTextures(1, Static403.anIntArray482, 0);
		this.anInt10846 = Static403.anIntArray482[0];
		this.method9210(0);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)V")
	public final void method9209() {
		if (this.anInt10846 > 0) {
			this.aClass22_Sub1_41.method903(this.method9212(), this.anInt10846);
			this.anInt10846 = 0;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)V")
	private void method9210(@OriginalArg(1) int arg0) {
		this.aClass22_Sub1_41.anInt999 -= arg0;
		this.aClass22_Sub1_41.anInt999 += this.method9212();
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)I")
	public final int method9211() {
		return this.anInt10846;
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)I")
	private int method9212() {
		@Pc(19) int local19 = this.aClass22_Sub1_41.method969(this.anInt10853) * this.anInt10848;
		return this.aBoolean737 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZI)V")
	protected final void method9213(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean737 != arg0) {
			@Pc(16) int local16 = this.method9212();
			this.aBoolean737 = true;
			this.method9216();
			this.method9210(local16);
		}
	}

	@OriginalMember(owner = "client!rha", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9209();
		super.finalize();
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(B)Z")
	public final boolean method9215() {
		if (!this.aClass22_Sub1_41.aBoolean66) {
			return false;
		}
		@Pc(20) int local20 = this.method9212();
		this.aClass22_Sub1_41.method955(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10843);
		this.aBoolean737 = true;
		this.method9216();
		this.method9210(local20);
		return true;
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)V")
	private void method9216() {
		this.aClass22_Sub1_41.method955(this);
		if (this.aBoolean736) {
			OpenGL.glTexParameteri(this.anInt10843, 10241, this.aBoolean737 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10843, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10843, 10241, this.aBoolean737 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10843, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZB)V")
	public final void method9217(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean736 != arg0) {
			this.aBoolean736 = arg0;
			this.method9216();
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	public abstract void method9208();
}
