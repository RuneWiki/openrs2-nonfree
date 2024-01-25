import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public int anInt3220;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
	public int anInt3221;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	public int anInt3222;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
	public int anInt3225;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Lclient!pf;")
	public final Class179 aClass179_1;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "Lclient!ah;")
	public final Class8 aClass8_1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!pf;Lclient!ao;)V")
	public Class4_Sub1_Sub12(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		this.aClass179_1 = arg0;
		this.aClass8_1 = this.aClass179_1.method4106();
		this.method2732();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public void method2732() {
		this.anInt3222 = this.aClass179_1.anInt5340;
		this.anInt3220 = this.aClass179_1.anInt5342;
		this.anInt3225 = this.aClass179_1.anInt5347;
		if (this.aClass179_1.aClass31_4 != null) {
			this.aClass179_1.aClass31_4.p(this.aClass8_1.anInt128, this.aClass8_1.anInt125, this.aClass8_1.anInt132, Static344.anIntArray414);
		}
		this.anInt3221 = Static344.anIntArray414[2];
		this.anInt3218 = Static344.anIntArray414[0];
	}
}
