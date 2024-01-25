import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private final int anInt2176;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub5(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt2176 = arg0.method5272();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt2176].method290();
	}
}
