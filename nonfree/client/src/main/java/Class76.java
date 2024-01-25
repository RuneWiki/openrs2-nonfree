import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class76 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_18;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	private final int anInt1672;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ge;I)V")
	public Class76(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass81_Sub1_18 = arg0;
		this.anInt1672 = this.aClass81_Sub1_18.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	public void method1584() {
		this.aClass81_Sub1_18.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public void method1585(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_18.anOpengl1.glNewList(this.anInt1672 + arg0, 4864);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(C)V")
	public void method1586(@OriginalArg(0) char arg0) {
		this.aClass81_Sub1_18.anOpengl1.glCallList(this.anInt1672 + arg0);
	}
}
