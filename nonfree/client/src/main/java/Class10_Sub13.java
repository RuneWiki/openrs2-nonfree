import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class10_Sub13 extends Class10 {

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
	private final int anInt7307;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "I")
	private final int anInt7303;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
	private final int anInt7305;

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
	private final int anInt7309;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
	private final int anInt7302;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub13(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt7307 = arg0.method5272();
		@Pc(11) int local11 = arg0.method5312();
		this.anInt7303 = local11 >>> 16;
		this.anInt7305 = local11 & 0xFFFF;
		this.anInt7309 = arg0.method5322(-126);
		this.anInt7302 = arg0.method5285();
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt7307].method293(this.anInt7303, this.anInt7309, this.anInt7305, this.anInt7302);
	}
}
