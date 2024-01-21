import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class11 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!hb;")
	private final Class2_Sub1 aClass2_Sub1_13 = new Class2_Sub1();

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!kc;")
	private final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private final int anInt650;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!i;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class11(@OriginalArg(0) int arg0) {
		this.anInt650 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt649 = arg0;
		this.aClass25_1 = new Class25(local16);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJLclient!hb;)V")
	public void method430(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		if (this.anInt649 == 0) {
			@Pc(18) Class2_Sub1 local18 = this.aClass30_1.method1217();
			local18.method1820();
			local18.method1773();
			if (local18 == this.aClass2_Sub1_13) {
				local18 = this.aClass30_1.method1217();
				local18.method1820();
				local18.method1773();
			}
		} else {
			this.anInt649--;
		}
		this.aClass25_1.method990(arg1, arg0);
		this.aClass30_1.method1218(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JB)Lclient!hb;")
	public Class2_Sub1 method431(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass25_1.method991(arg0);
		if (local10 != null) {
			this.aClass30_1.method1218(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JI)V")
	public void method432(@OriginalArg(0) long arg0) {
		@Pc(18) Class2_Sub1 local18 = (Class2_Sub1) this.aClass25_1.method991(arg0);
		if (local18 != null) {
			local18.method1820();
			local18.method1773();
			this.anInt649++;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public void method435() {
		while (true) {
			@Pc(6) Class2_Sub1 local6 = this.aClass30_1.method1217();
			if (local6 == null) {
				this.anInt649 = this.anInt650;
				return;
			}
			local6.method1820();
			local6.method1773();
		}
	}
}
