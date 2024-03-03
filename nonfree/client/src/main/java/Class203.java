import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class203 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_33;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	private final int anInt5690;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!bf;I)V", line = 12)
	public Class203(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub1_33 = arg0;
		this.anInt5690 = this.aClass19_Sub1_33.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(C)V", line = 5)
	public void method5191(@OriginalArg(0) char arg0) {
		this.aClass19_Sub1_33.anOpengl1.glCallList(this.anInt5690 + arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 10)
	public void method5192() {
		this.aClass19_Sub1_33.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 21)
	public void method5193(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_33.anOpengl1.glNewList(this.anInt5690 + arg0, 4864);
	}
}
