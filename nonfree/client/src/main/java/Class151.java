import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class151 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_28;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	private final int anInt3714;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!mi;I)V")
	public Class151(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass155_Sub1_28 = arg0;
		this.anInt3714 = this.aClass155_Sub1_28.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(C)V")
	public void method3279(@OriginalArg(0) char arg0) {
		this.aClass155_Sub1_28.anOpengl1.glCallList(this.anInt3714 + arg0);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public void method3280() {
		this.aClass155_Sub1_28.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public void method3281(@OriginalArg(0) int arg0) {
		this.aClass155_Sub1_28.anOpengl1.glNewList(this.anInt3714 + arg0, 4864);
	}
}
