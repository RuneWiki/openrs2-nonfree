import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class10_Sub21 extends Class10 {

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	private final int anInt10608;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	private final int anInt10612;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub21(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt10608 = arg0.method5272();
		this.anInt10612 = arg0.method5272();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt10608].method295().method6597(this.anInt10612, true);
	}
}
