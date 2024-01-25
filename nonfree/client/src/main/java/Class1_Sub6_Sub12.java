import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class1_Sub6_Sub12 extends Class1_Sub6 {

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	public int anInt4691;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "Lclient!am;")
	public final Class12 aClass12_2;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Lclient!gi;")
	public final Class91 aClass91_1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!am;Lclient!hn;)V")
	public Class1_Sub6_Sub12(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class41_Sub3 arg1) {
		this.aClass12_2 = arg0;
		this.aClass91_1 = Static236.method3258(arg0.anInt187);
		this.method4144();
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	public void method4144() {
		this.anInt4698 = this.aClass12_2.anInt184;
		this.anInt4691 = this.aClass12_2.anInt182;
		this.anInt4692 = this.aClass12_2.anInt181;
		if (this.aClass12_2.aClass127_1 != null) {
			this.aClass12_2.aClass127_1.method5266(this.aClass91_1.anInt2095, this.aClass91_1.anInt2094, this.aClass91_1.anInt2102, Static65.anIntArray166);
		}
		this.anInt4696 = Static65.anIntArray166[0];
		this.anInt4697 = Static65.anIntArray166[2];
	}
}
