import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class11_Sub4_Sub20 extends Class11_Sub4 {

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
	public int anInt6441;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
	public int anInt6443;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
	public int anInt6446;

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
	public int anInt6448;

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "Lclient!wg;")
	public final Class212 aClass212_1;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "Lclient!cq;")
	public final Class43 aClass43_1;

	static {
		new Class117(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!wg;Lclient!e;)V")
	public Class11_Sub4_Sub20(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class10_Sub2 arg1) {
		this.aClass212_1 = arg0;
		this.aClass43_1 = Static261.method4536(arg0.anInt6645);
		this.method5499();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public void method5499() {
		this.anInt6448 = this.aClass212_1.anInt6646;
		this.anInt6446 = this.aClass212_1.anInt6641;
		this.anInt6441 = this.aClass212_1.anInt6640;
		if (this.aClass212_1.aClass61_6 != null) {
			this.aClass212_1.aClass61_6.method3656(this.aClass43_1.anInt899, this.aClass43_1.anInt906, this.aClass43_1.anInt895, Static156.anIntArray198);
		}
		this.anInt6443 = Static156.anIntArray198[0];
		this.anInt6442 = Static156.anIntArray198[2];
	}
}
