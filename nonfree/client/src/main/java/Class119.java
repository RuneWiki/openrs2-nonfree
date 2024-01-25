import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class119 {

	@OriginalMember(owner = "client!fha", name = "o", descriptor = "Lclient!dka;")
	private final Class85 aClass85_20 = new Class85(64);

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "Lclient!nca;")
	private final Class254 aClass254_65;

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
	public final int anInt2999;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class119(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_65 = arg2;
		if (this.aClass254_65 == null) {
			this.anInt2999 = 0;
		} else {
			this.anInt2999 = this.aClass254_65.method6101(16);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)V")
	public void method2602() {
		@Pc(2) Class85 local2 = this.aClass85_20;
		synchronized (this.aClass85_20) {
			this.aClass85_20.method1742(5);
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public void method2607() {
		@Pc(14) Class85 local14 = this.aClass85_20;
		synchronized (this.aClass85_20) {
			this.aClass85_20.method1741();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IB)Lclient!vv;")
	public Class391 method2608(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_20;
		@Pc(16) Class391 local16;
		synchronized (this.aClass85_20) {
			local16 = (Class391) this.aClass85_20.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_65;
		@Pc(41) byte[] local41;
		synchronized (this.aClass254_65) {
			local41 = this.aClass254_65.method6087(arg0, 16);
		}
		local16 = new Class391();
		if (local41 != null) {
			local16.method9347(new Class2_Sub20(local41));
		}
		@Pc(73) Class85 local73 = this.aClass85_20;
		synchronized (this.aClass85_20) {
			this.aClass85_20.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)V")
	public void method2610() {
		@Pc(10) Class85 local10 = this.aClass85_20;
		synchronized (this.aClass85_20) {
			this.aClass85_20.method1748();
		}
	}
}
