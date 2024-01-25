import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class155 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_29;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	private final int anInt4732;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!nf;I)V")
	public Class155(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass105_Sub1_29 = arg0;
		this.anInt4732 = this.aClass105_Sub1_29.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	public void method4110() {
		this.aClass105_Sub1_29.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method4111(@OriginalArg(0) int arg0) {
		this.aClass105_Sub1_29.anOpengl1.glNewList(this.anInt4732 + arg0, 4864);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(C)V")
	public void method4112(@OriginalArg(0) char arg0) {
		this.aClass105_Sub1_29.anOpengl1.glCallList(this.anInt4732 + arg0);
	}
}
