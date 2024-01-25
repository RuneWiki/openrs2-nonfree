import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!dka;")
	private final Class85 aClass85_1 = new Class85(64);

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!nca;")
	private final Class254 aClass254_13;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!nca;")
	public final Class254 aClass254_12;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class7(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_13 = arg2;
		this.aClass254_12 = arg3;
		this.aClass254_13.method6101(3);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	public void method201() {
		@Pc(2) Class85 local2 = this.aClass85_1;
		synchronized (this.aClass85_1) {
			this.aClass85_1.method1742(5);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public void method202() {
		@Pc(6) Class85 local6 = this.aClass85_1;
		synchronized (this.aClass85_1) {
			this.aClass85_1.method1748();
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method203() {
		@Pc(8) Class85 local8 = this.aClass85_1;
		synchronized (this.aClass85_1) {
			this.aClass85_1.method1741();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!dha;")
	public Class83 method207(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_1;
		@Pc(18) Class83 local18;
		synchronized (this.aClass85_1) {
			local18 = (Class83) this.aClass85_1.method1737((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class254 local32 = this.aClass254_13;
		@Pc(41) byte[] local41;
		synchronized (this.aClass254_13) {
			local41 = this.aClass254_13.method6087(arg0, 3);
		}
		local18 = new Class83();
		local18.aClass7_2 = this;
		if (local41 != null) {
			local18.method1649(new Class2_Sub20(local41));
		}
		@Pc(73) Class85 local73 = this.aClass85_1;
		synchronized (this.aClass85_1) {
			this.aClass85_1.method1745((long) arg0, 16383, local18);
			return local18;
		}
	}
}
