import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class102 implements Interface20 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!da;")
	private Class64 aClass64_4;

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "Lclient!cn;")
	private final Class57 aClass57_1;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!eq;")
	private final Class97 aClass97_34;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!eq;")
	private final Class97 aClass97_35;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!cn;)V")
	public Class102(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class57 arg2) {
		this.aClass57_1 = arg2;
		this.aClass97_34 = arg1;
		this.aClass97_35 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		@Pc(27) int local27 = this.aClass57_1.aClass174_4.method4260(Static386.anInt6961, this.aClass57_1.anInt1561) + this.aClass57_1.anInt1563;
		@Pc(42) int local42 = this.aClass57_1.aClass176_4.method4289(this.aClass57_1.anInt1565, Static135.anInt3053) + this.aClass57_1.anInt1570;
		this.aClass64_4.method7490(this.aClass57_1.anInt1564, 0, local27, null, local42, this.aClass57_1.anInt1565, null, this.aClass57_1.anInt1569, this.aClass57_1.anInt1561, this.aClass57_1.anInt1558, this.aClass57_1.aString18, this.aClass57_1.anInt1566, this.aClass57_1.anInt1560, 0, null);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
		@Pc(15) Class114 local15 = Static528.method7370(this.aClass97_34, this.aClass57_1.anInt1559);
		this.aClass64_4 = Static600.aClass87_15.method7965(local15, Static647.method3073(this.aClass97_35, this.aClass57_1.anInt1559));
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass97_35.method2564(this.aClass57_1.anInt1559)) {
			local10 = false;
		}
		if (!this.aClass97_34.method2564(this.aClass57_1.anInt1559)) {
			local10 = false;
		}
		return local10;
	}
}
