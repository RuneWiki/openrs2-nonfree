import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class309 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!au;")
	private final Class21 aClass21_76 = new Class21(64);

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public int anInt7724 = 0;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_115;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public final int anInt7723;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class309(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_115 = arg2;
		this.anInt7723 = this.aClass229_115.method4981(4);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public void method6242() {
		@Pc(2) Class21 local2 = this.aClass21_76;
		synchronized (this.aClass21_76) {
			this.aClass21_76.method323(5);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public void method6244() {
		@Pc(10) Class21 local10 = this.aClass21_76;
		synchronized (this.aClass21_76) {
			this.aClass21_76.method314();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public void method6245() {
		@Pc(11) Class21 local11 = this.aClass21_76;
		synchronized (this.aClass21_76) {
			this.aClass21_76.method313();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lclient!jo;")
	public Class179 method6246(@OriginalArg(1) int arg0) {
		@Pc(14) Class21 local14 = this.aClass21_76;
		@Pc(26) Class179 local26;
		synchronized (this.aClass21_76) {
			local26 = (Class179) this.aClass21_76.method324((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(39) Class229 local39 = this.aClass229_115;
		@Pc(50) byte[] local50;
		synchronized (this.aClass229_115) {
			local50 = this.aClass229_115.method4980(4, arg0);
		}
		local26 = new Class179();
		local26.anInt4270 = arg0;
		local26.aClass309_3 = this;
		if (local50 != null) {
			local26.method3652(new Class2_Sub7(local50));
		}
		local26.method3650();
		@Pc(81) Class21 local81 = this.aClass21_76;
		synchronized (this.aClass21_76) {
			this.aClass21_76.method317(local26, (long) arg0);
			return local26;
		}
	}
}
