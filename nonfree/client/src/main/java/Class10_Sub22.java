import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class10_Sub22 extends Class10 {

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	private final int anInt10930;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	private final int anInt10932;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub22(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt10930 = arg0.method5272();
		this.anInt10932 = arg0.method5322(-89);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static434.method5151(this.anInt10930, 0, this.anInt10932);
	}
}
