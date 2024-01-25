import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class78 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_22;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	private final int anInt2530;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ks;I)V")
	public Class78(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass63_Sub1_22 = arg0;
		this.anInt2530 = this.aClass63_Sub1_22.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public void method2431(@OriginalArg(0) int arg0) {
		this.aClass63_Sub1_22.anOpengl1.glNewList(this.anInt2530 + arg0, 4864);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	public void method2432() {
		this.aClass63_Sub1_22.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(C)V")
	public void method2433(@OriginalArg(0) char arg0) {
		this.aClass63_Sub1_22.anOpengl1.glCallList(this.anInt2530 + arg0);
	}
}
