import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class29_Sub12_Sub1 extends Class29_Sub12 {

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	private final int anInt4949;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	private final int anInt4948;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	private final int anInt4952;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub12_Sub1(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt4949 = arg0.method2028(-14795);
		this.anInt4948 = arg0.method2048(255);
		this.anInt4952 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt4949].method249().method7480(this.anInt4948, false, super.anInt6809, super.anInt6807 << 16, super.anInt6808, this.anInt4952);
	}
}
