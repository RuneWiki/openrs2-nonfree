import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public abstract class Class50 implements Interface5 {

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "[I")
	public static final int[] anIntArray466 = new int[128];

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "Lclient!er;")
	protected final Class31_Sub2 aClass31_Sub2_37;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	public final int anInt7830;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
	private boolean aBoolean544;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	private final int anInt7834;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	protected final int anInt7828;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	protected int anInt7832;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray466.length; local4++) {
			anIntArray466[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray466[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray466[local33] = local33 - 71;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray466[local48] = local48 + 4;
		}
		anIntArray466[45] = anIntArray466[47] = 63;
		anIntArray466[42] = anIntArray466[43] = 62;
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!er;IIIZ)V")
	protected Class50(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass31_Sub2_37 = arg0;
		this.anInt7830 = arg1;
		this.aBoolean544 = arg4;
		this.anInt7834 = arg3;
		this.anInt7828 = arg2;
		OpenGL.glGenTextures(1, Static480.anIntArray495, 0);
		this.anInt7832 = Static480.anIntArray495[0];
		this.method6156(0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
	protected final void method6151(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean544 != arg0) {
			@Pc(11) int local11 = this.method6161();
			this.aBoolean544 = true;
			this.method6155();
			this.method6156(local11);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z")
	public final boolean method6152() {
		if (!this.aClass31_Sub2_37.aBoolean229) {
			return false;
		}
		@Pc(11) int local11 = this.method6161();
		this.aClass31_Sub2_37.method2535(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7830);
		this.aBoolean544 = true;
		this.method6155();
		this.method6156(local11);
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(ZI)V")
	public final void method6153(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean545 != arg0) {
			this.aBoolean545 = arg0;
			this.method6155();
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	private void method6155() {
		this.aClass31_Sub2_37.method2535(this);
		if (this.aBoolean545) {
			OpenGL.glTexParameteri(this.anInt7830, 10241, this.aBoolean544 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7830, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7830, 10241, this.aBoolean544 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7830, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
	private void method6156(@OriginalArg(0) int arg0) {
		this.aClass31_Sub2_37.anInt3140 -= arg0;
		this.aClass31_Sub2_37.anInt3140 += this.method6161();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	public final void method6157() {
		if (this.anInt7832 > 0) {
			this.aClass31_Sub2_37.method2528(this.method6161(), this.anInt7832);
			this.anInt7832 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6157();
		super.finalize();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I")
	public final int method6160() {
		return this.anInt7832;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
	private int method6161() {
		@Pc(19) int local19 = this.aClass31_Sub2_37.method2565(this.anInt7828) * this.anInt7834;
		return this.aBoolean544 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public abstract void method6150();
}
