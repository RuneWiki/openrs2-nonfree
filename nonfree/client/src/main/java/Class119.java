import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class119 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_21;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	private final int anInt3513;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!sq;I)V")
	public Class119(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass46_Sub2_21 = arg0;
		this.anInt3513 = this.aClass46_Sub2_21.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(C)V")
	public void method3301(@OriginalArg(0) char arg0) {
		this.aClass46_Sub2_21.anOpengl1.glCallList(this.anInt3513 + arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
	public void method3302() {
		this.aClass46_Sub2_21.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public void method3303(@OriginalArg(0) int arg0) {
		this.aClass46_Sub2_21.anOpengl1.glNewList(this.anInt3513 + arg0, 4864);
	}
}
