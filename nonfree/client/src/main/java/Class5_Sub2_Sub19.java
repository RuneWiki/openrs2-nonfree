import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public int anInt9331;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public int anInt9333;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	public int anInt9334;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public int anInt9335;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public int anInt9336;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!rf;")
	public final Class303 aClass303_2;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Lclient!oha;")
	public final Class257 aClass257_1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!rf;Lclient!qo;)V")
	public Class5_Sub2_Sub19(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class41_Sub7 arg1) {
		this.aClass303_2 = arg0;
		this.aClass257_1 = this.aClass303_2.method7243();
		this.method7809();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method7809() {
		this.anInt9334 = this.aClass303_2.anInt8518;
		this.anInt9336 = this.aClass303_2.anInt8517;
		this.anInt9333 = this.aClass303_2.anInt8520;
		if (this.aClass303_2.aClass56_12 != null) {
			this.aClass303_2.aClass56_12.method8398(this.aClass257_1.anInt7537, this.aClass257_1.anInt7533, this.aClass257_1.anInt7547, Static71.anIntArray63);
		}
		this.anInt9331 = Static71.anIntArray63[0];
		this.anInt9335 = Static71.anIntArray63[2];
	}
}
