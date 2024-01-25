import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class189 implements Interface7 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!da;")
	private Class69 aClass69_6;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_66;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!gj;")
	private final Class143 aClass143_67;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!eja;")
	private final Class103 aClass103_1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!eja;)V")
	public Class189(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class103 arg2) {
		this.aClass143_66 = arg1;
		this.aClass143_67 = arg0;
		this.aClass103_1 = arg2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass143_67.method3130(this.aClass103_1.anInt2602)) {
			local10 = false;
		}
		if (!this.aClass143_66.method3130(this.aClass103_1.anInt2602)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		@Pc(18) int local18 = this.aClass103_1.aClass92_3.method2199(Static507.anInt8484, this.aClass103_1.anInt2601) + this.aClass103_1.anInt2606;
		@Pc(34) int local34 = this.aClass103_1.aClass65_6.method1786(Static581.anInt9218, this.aClass103_1.anInt2607) + this.aClass103_1.anInt2603;
		this.aClass69_6.method7452(this.aClass103_1.aString28, local34, this.aClass103_1.anInt2605, this.aClass103_1.anInt2601, (Class1) null, 0, 0, this.aClass103_1.anInt2610, this.aClass103_1.anInt2607, this.aClass103_1.anInt2600, this.aClass103_1.anInt2609, (int[]) null, (Class102[]) null, local18, this.aClass103_1.anInt2608);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
		@Pc(19) Class202 local19 = Static199.method8735(this.aClass103_1.anInt2602, this.aClass143_66);
		this.aClass69_6 = Static582.aClass16_12.method8117(local19, Static683.method3281(this.aClass143_67, this.aClass103_1.anInt2602));
	}
}
