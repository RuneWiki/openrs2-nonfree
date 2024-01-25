import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public int anInt5916;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
	public int anInt5920;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public int anInt5918 = -1;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class3_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5918 = arg0;
	}
}
