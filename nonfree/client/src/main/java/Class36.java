import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class36 implements Interface2 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	private int anInt1668 = 128;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt1672 = 50;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "Lclient!ve;")
	private final Class69 aClass69_19;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!ve;")
	private final Class69 aClass69_18;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!ri;")
	private Class86 aClass86_23;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;II)V")
	public Class36(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1672 = arg2;
		this.aClass69_19 = arg0;
		this.anInt1668 = arg3;
		this.aClass69_18 = arg1;
		this.aClass86_23 = new Class86(this.anInt1672);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1318(@OriginalArg(1) int arg0) {
		return this.anInt1668 == 64 || this.method1331(arg0).anInt1236 == 64;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V")
	public void method1330(@OriginalArg(0) int arg0) {
		for (@Pc(19) Class1_Sub2_Sub7 local19 = (Class1_Sub2_Sub7) this.aClass86_23.method2820(); local19 != null; local19 = (Class1_Sub2_Sub7) this.aClass86_23.method2822()) {
			if (local19.aBoolean68) {
				local19.method902(arg0);
				local19.aBoolean68 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1317(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub7 local14 = this.method1331(arg0);
		return local14.method907(this, this.anInt1668, this.aClass69_18);
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(II)Lclient!ei;")
	private Class1_Sub2_Sub7 method1331(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub2_Sub7 local7 = (Class1_Sub2_Sub7) this.aClass86_23.method2816((long) arg0);
		if (local7 != null) {
			return local7;
		}
		@Pc(22) byte[] local22 = this.aClass69_19.method2208(0, arg0);
		if (local22 == null) {
			return Static55.method1065();
		} else {
			@Pc(29) Class1_Sub7 local29 = new Class1_Sub7(local22);
			local7 = new Class1_Sub2_Sub7(local29);
			this.aClass86_23.method2821(local7, (long) arg0);
			return local7;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
	@Override
	public int method1320(@OriginalArg(0) int arg0) {
		return this.method1331(arg0).anInt1238;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1322(@OriginalArg(0) int arg0) {
		return this.method1331(arg0).aBoolean70;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(FBI)[I")
	@Override
	public int[] method1321(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub7 local13 = this.method1331(arg1);
		local13.aBoolean68 = true;
		return local13.method900(this.anInt1668, arg0, this.aClass69_18, this);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public void method1333() {
		this.aClass86_23 = new Class86(this.anInt1672);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method1323(@OriginalArg(0) int arg0) {
		return this.method1331(arg0).method903(this.aClass69_18, this);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1319(@OriginalArg(1) int arg0) {
		return this.method1331(arg0).aBoolean67;
	}
}
