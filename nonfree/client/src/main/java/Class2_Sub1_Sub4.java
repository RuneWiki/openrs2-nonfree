import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!eda", name = "C", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!eda", name = "D", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!eda", name = "E", descriptor = "I")
	public int anInt2471;

	@OriginalMember(owner = "client!eda", name = "G", descriptor = "I")
	public int anInt2473;

	@OriginalMember(owner = "client!eda", name = "H", descriptor = "Lclient!gfa;")
	public final Class123 aClass123_1;

	@OriginalMember(owner = "client!eda", name = "A", descriptor = "Lclient!is;")
	public final Class172 aClass172_1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!gfa;Lclient!eea;)V")
	public Class2_Sub1_Sub4(@OriginalArg(0) Class123 arg0, @OriginalArg(1) Class15_Sub5 arg1) {
		this.aClass123_1 = arg0;
		this.aClass172_1 = this.aClass123_1.method3580();
		this.method2280();
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
	public void method2280() {
		this.anInt2471 = this.aClass123_1.anInt3874;
		this.anInt2469 = this.aClass123_1.anInt3870;
		this.anInt2473 = this.aClass123_1.anInt3869;
		if (this.aClass123_1.aClass76_6 != null) {
			this.aClass123_1.aClass76_6.method9635(this.aClass172_1.anInt5067, this.aClass172_1.anInt5068, this.aClass172_1.anInt5058, Static240.anIntArray222);
		}
		this.anInt2468 = Static240.anIntArray222[0];
		this.anInt2470 = Static240.anIntArray222[2];
	}
}
