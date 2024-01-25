import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class10_Sub15 extends Class10 {

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
	private final int anInt7418;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	private final int anInt7414;

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
	private final int anInt7416;

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
	private final int anInt7415;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
	private final int anInt7417;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub15(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt7418 = arg0.method5272();
		@Pc(11) int local11 = arg0.method5312();
		this.anInt7414 = local11 >>> 16;
		this.anInt7416 = local11 & 0xFFFF;
		this.anInt7415 = arg0.method5322(-37);
		this.anInt7417 = arg0.method5322(-67);
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static410.aClass72Array1[this.anInt7418].method2040(this.anInt7414, this.anInt7417, this.anInt7415, this.anInt7416);
	}
}
