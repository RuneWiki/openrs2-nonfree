import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class2_Sub7_Sub8 extends Class2_Sub7 {

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
	public int anInt6022;

	@OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
	public int anInt6024;

	@OriginalMember(owner = "client!mba", name = "B", descriptor = "I")
	public int anInt6026;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "Lclient!hv;")
	public final Class156 aClass156_2;

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "Lclient!kt;")
	public final Class206 aClass206_1;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!hv;Lclient!od;)V")
	public Class2_Sub7_Sub8(@OriginalArg(0) Class156 arg0, @OriginalArg(1) Class16_Sub7 arg1) {
		this.aClass156_2 = arg0;
		this.aClass206_1 = this.aClass156_2.method3622();
		this.method5200();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	public void method5200() {
		this.anInt6020 = this.aClass156_2.anInt4165;
		this.anInt6024 = this.aClass156_2.anInt4166;
		this.anInt6022 = this.aClass156_2.anInt4160;
		if (this.aClass156_2.aClass51_4 != null) {
			this.aClass156_2.aClass51_4.method6719(this.aClass206_1.anInt5476, this.aClass206_1.anInt5470, this.aClass206_1.anInt5474, Static376.anIntArray420);
		}
		this.anInt6019 = Static376.anIntArray420[2];
		this.anInt6026 = Static376.anIntArray420[0];
	}
}
