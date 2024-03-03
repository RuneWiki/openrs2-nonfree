import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class3 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!h;")
	public static final Class89 aClass89_6 = new Class89(1, 6);

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
	public static final int[] anIntArray2 = new int[1000];

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_7 = new Class145(69, 3);

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	public int anInt74;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z", line = 4)
	public final boolean method66() {
		return (this.anInt74 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z", line = 16)
	public final boolean method67() {
		return (this.anInt74 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z", line = 56)
	public final boolean method69() {
		return (this.anInt74 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)Z", line = 86)
	public final boolean method71() {
		return (this.anInt74 & 0x2) != 0;
	}
}
