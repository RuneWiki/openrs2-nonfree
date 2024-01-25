import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class168 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_33;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	private final int anInt4915;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!hd;I)V")
	public Class168(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass89_Sub1_33 = arg0;
		this.anInt4915 = this.aClass89_Sub1_33.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	public void method4285() {
		this.aClass89_Sub1_33.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method4286(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_33.anOpengl2.glNewList(this.anInt4915 + arg0, 4864);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(C)V")
	public void method4287(@OriginalArg(0) char arg0) {
		this.aClass89_Sub1_33.anOpengl2.glCallList(this.anInt4915 + arg0);
	}
}
