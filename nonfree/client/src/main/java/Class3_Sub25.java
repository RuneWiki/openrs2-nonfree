import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
	public boolean aBoolean230;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public final int anInt3576;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
	public final int anInt3577;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
	public final boolean aBoolean231;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!hda;")
	public final Class119_Sub1 aClass119_Sub1_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILclient!hda;IZ)V")
	public Class3_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class119_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3576 = arg2;
		this.anInt3577 = arg0;
		this.aBoolean231 = arg3;
		this.aClass119_Sub1_1 = arg1;
	}
}
