import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public int anInt3921;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public int anInt3923;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt3924;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	public int anInt3925;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "Z")
	public boolean aBoolean279 = false;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public int anInt3922 = -1;

	static {
		new Class200("", 76);
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub26(@OriginalArg(0) int arg0) {
		this.anInt3922 = arg0;
	}
}
