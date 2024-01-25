import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class86 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_22;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	private final int anInt2236;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!mm;I)V")
	public Class86(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass55_Sub1_22 = arg0;
		this.anInt2236 = this.aClass55_Sub1_22.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public void method2104(@OriginalArg(0) int arg0) {
		this.aClass55_Sub1_22.anOpengl1.glNewList(this.anInt2236 + arg0, 4864);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	public void method2105() {
		this.aClass55_Sub1_22.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(C)V")
	public void method2106(@OriginalArg(0) char arg0) {
		this.aClass55_Sub1_22.anOpengl1.glCallList(this.anInt2236 + arg0);
	}
}
