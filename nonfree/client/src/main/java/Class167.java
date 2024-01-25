import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public abstract class Class167 implements Interface11 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "Lclient!rs;")
	protected final Class133_Sub3 aClass133_Sub3_34;

	@OriginalMember(owner = "client!nba", name = "A", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	public final int anInt9270;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	protected final int anInt9261;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	private final int anInt9271;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	protected int anInt9272;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!rs;IIIZ)V")
	protected Class167(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass133_Sub3_34 = arg0;
		this.aBoolean671 = arg4;
		this.anInt9270 = arg1;
		this.anInt9261 = arg2;
		this.anInt9271 = arg3;
		OpenGL.glGenTextures(1, Static578.anIntArray228, 0);
		this.anInt9272 = Static578.anIntArray228[0];
		this.method8004(0);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)I")
	public final int method8002() {
		return this.anInt9272;
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(B)Z")
	public final boolean method8003() {
		if (!this.aClass133_Sub3_34.aBoolean615) {
			return false;
		}
		@Pc(16) int local16 = this.method8006();
		this.aClass133_Sub3_34.method7375(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9270);
		this.aBoolean671 = true;
		this.method8008();
		this.method8004(local16);
		return true;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)V")
	private void method8004(@OriginalArg(0) int arg0) {
		this.aClass133_Sub3_34.anInt8536 -= arg0;
		this.aClass133_Sub3_34.anInt8536 += this.method8006();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)I")
	private int method8006() {
		@Pc(13) int local13 = this.aClass133_Sub3_34.method7381(this.anInt9261) * this.anInt9271;
		return this.aBoolean671 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	private void method8008() {
		this.aClass133_Sub3_34.method7375(this);
		if (this.aBoolean670) {
			OpenGL.glTexParameteri(this.anInt9270, 10241, this.aBoolean671 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9270, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9270, 10241, this.aBoolean671 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9270, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!nba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8011();
		super.finalize();
	}

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(B)V")
	public final void method8011() {
		if (this.anInt9272 > 0) {
			this.aClass133_Sub3_34.method7374(this.method8006(), this.anInt9272);
			this.anInt9272 = 0;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
	protected final void method8012(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean671 != arg0) {
			@Pc(15) int local15 = this.method8006();
			this.aBoolean671 = true;
			this.method8008();
			this.method8004(local15);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZZ)V")
	public final void method8013(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean670 != arg0) {
			this.aBoolean670 = arg0;
			this.method8008();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public abstract void method8000();
}
