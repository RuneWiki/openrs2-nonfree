import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public final class Class4_Sub6_Sub14 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
	public int anInt6328;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
	public int anInt6329;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
	public int anInt6330;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
	public int anInt6333;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "Lclient!cea;")
	public final Class52 aClass52_2;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "Lclient!rba;")
	public final Class286 aClass286_1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!cea;Lclient!hda;)V")
	public Class4_Sub6_Sub14(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class21_Sub5 arg1) {
		this.aClass52_2 = arg0;
		this.aClass286_1 = this.aClass52_2.method1379();
		this.method4986();
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	public void method4986() {
		this.anInt6328 = this.aClass52_2.anInt1621;
		this.anInt6330 = this.aClass52_2.anInt1625;
		this.anInt6333 = this.aClass52_2.anInt1622;
		if (this.aClass52_2.aClass81_2 != null) {
			this.aClass52_2.aClass81_2.wa(this.aClass286_1.anInt8554, this.aClass286_1.anInt8550, this.aClass286_1.anInt8557, Static521.anIntArray546);
		}
		this.anInt6329 = Static521.anIntArray546[2];
		this.anInt6332 = Static521.anIntArray546[0];
	}
}
