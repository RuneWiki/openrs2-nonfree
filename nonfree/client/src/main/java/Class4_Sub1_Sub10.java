import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
	public int anInt3100;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
	public int anInt3102;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "Lclient!tb;")
	public final Class239 aClass239_1;

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "Lclient!lr;")
	public final Class150 aClass150_1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!tb;Lclient!uh;)V")
	public Class4_Sub1_Sub10(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class71_Sub6 arg1) {
		this.aClass239_1 = arg0;
		this.aClass150_1 = this.aClass239_1.method5453();
		this.method2764();
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
	public void method2764() {
		this.anInt3103 = this.aClass239_1.anInt6765;
		this.anInt3102 = this.aClass239_1.anInt6761;
		this.anInt3101 = this.aClass239_1.anInt6758;
		if (this.aClass239_1.aClass72_6 != null) {
			this.aClass239_1.aClass72_6.N(this.aClass150_1.anInt4593, this.aClass150_1.anInt4594, this.aClass150_1.anInt4601, Static86.anIntArray172);
		}
		this.anInt3105 = Static86.anIntArray172[0];
		this.anInt3100 = Static86.anIntArray172[2];
	}
}
