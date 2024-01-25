import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public final class Class29_Sub14 extends Class29 {

	@OriginalMember(owner = "client!nia", name = "s", descriptor = "I")
	private final int anInt6795;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
	private final int anInt6792;

	@OriginalMember(owner = "client!nia", name = "q", descriptor = "I")
	private final int anInt6794;

	@OriginalMember(owner = "client!nia", name = "p", descriptor = "I")
	private final int anInt6791;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub14(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt6795 = arg0.method2028(-14795);
		this.anInt6792 = arg0.method2048(255);
		this.anInt6794 = arg0.method2048(255);
		this.anInt6791 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static355.method9493(this.anInt6794, this.anInt6792, this.anInt6791, this.anInt6795, 0);
	}
}
