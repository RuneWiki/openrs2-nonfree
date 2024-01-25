import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class209 {

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
	public int anInt5036;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "Lclient!dka;")
	private final Class85 aClass85_36 = new Class85(64);

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "Lclient!dka;")
	public final Class85 aClass85_37 = new Class85(60);

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "Lclient!nca;")
	public final Class254 aClass254_97;

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "Lclient!nca;")
	private final Class254 aClass254_98;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class209(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_97 = arg3;
		this.aClass254_98 = arg2;
		@Pc(26) int local26 = this.aClass254_98.method6094() - 1;
		this.aClass254_98.method6101(local26);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
	public void method4565(@OriginalArg(1) int arg0) {
		this.anInt5036 = arg0;
		@Pc(14) Class85 local14 = this.aClass85_37;
		synchronized (this.aClass85_37) {
			this.aClass85_37.method1748();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	public void method4567() {
		@Pc(14) Class85 local14 = this.aClass85_36;
		synchronized (this.aClass85_36) {
			this.aClass85_36.method1748();
		}
		local14 = this.aClass85_37;
		synchronized (this.aClass85_37) {
			this.aClass85_37.method1748();
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)V")
	public void method4568() {
		@Pc(11) Class85 local11 = this.aClass85_36;
		synchronized (this.aClass85_36) {
			this.aClass85_36.method1742(5);
		}
		local11 = this.aClass85_37;
		synchronized (this.aClass85_37) {
			this.aClass85_37.method1742(5);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BI)Lclient!tba;")
	public Class347 method4570(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_36;
		@Pc(16) Class347 local16;
		synchronized (this.aClass85_36) {
			local16 = (Class347) this.aClass85_36.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) Class254 local40 = this.aClass254_98;
		@Pc(53) byte[] local53;
		synchronized (this.aClass254_98) {
			local53 = this.aClass254_98.method6087(Static609.method8332(arg0), Static41.method2947(arg0));
		}
		local16 = new Class347();
		local16.anInt9349 = arg0;
		local16.aClass209_2 = this;
		if (local53 != null) {
			local16.method8249(new Class2_Sub20(local53));
		}
		@Pc(83) Class85 local83 = this.aClass85_36;
		synchronized (this.aClass85_36) {
			this.aClass85_36.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V")
	public void method4571() {
		@Pc(11) Class85 local11 = this.aClass85_36;
		synchronized (this.aClass85_36) {
			this.aClass85_36.method1741();
		}
		local11 = this.aClass85_37;
		synchronized (this.aClass85_37) {
			this.aClass85_37.method1741();
		}
	}
}
