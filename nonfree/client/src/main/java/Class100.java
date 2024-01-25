import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class100 {

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Lclient!of;")
	private final Class188 aClass188_27 = new Class188(64);

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "Lclient!of;")
	public final Class188 aClass188_28 = new Class188(30);

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!mn;")
	private final Class171 aClass171_35;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!mn;")
	public final Class171 aClass171_34;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;)V")
	public Class100(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_35 = arg2;
		this.aClass171_34 = arg3;
		@Pc(26) int local26 = this.aClass171_35.method3677() - 1;
		this.aClass171_35.method3662(local26);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
	public void method2195(@OriginalArg(1) int arg0) {
		this.anInt2606 = arg0;
		@Pc(9) Class188 local9 = this.aClass188_28;
		synchronized (this.aClass188_28) {
			this.aClass188_28.method4156();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method2196() {
		@Pc(6) Class188 local6 = this.aClass188_27;
		synchronized (this.aClass188_27) {
			this.aClass188_27.method4156();
		}
		local6 = this.aClass188_28;
		synchronized (this.aClass188_28) {
			this.aClass188_28.method4156();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)Lclient!jp;")
	public Class139 method2197(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_27;
		@Pc(16) Class139 local16;
		synchronized (this.aClass188_27) {
			local16 = (Class139) this.aClass188_27.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class171 local35 = this.aClass171_35;
		@Pc(48) byte[] local48;
		synchronized (this.aClass171_35) {
			local48 = this.aClass171_35.method3658(Static180.method2620(arg0), Static412.method5670(arg0));
		}
		local16 = new Class139();
		local16.anInt3453 = arg0;
		local16.aClass100_1 = this;
		if (local48 != null) {
			local16.method2837(new Class2_Sub17(local48));
		}
		@Pc(76) Class188 local76 = this.aClass188_27;
		synchronized (this.aClass188_27) {
			this.aClass188_27.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	public void method2200() {
		@Pc(2) Class188 local2 = this.aClass188_27;
		synchronized (this.aClass188_27) {
			this.aClass188_27.method4169(5);
		}
		local2 = this.aClass188_28;
		synchronized (this.aClass188_28) {
			this.aClass188_28.method4169(5);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method2201() {
		@Pc(2) Class188 local2 = this.aClass188_27;
		synchronized (this.aClass188_27) {
			this.aClass188_27.method4154();
		}
		local2 = this.aClass188_28;
		synchronized (this.aClass188_28) {
			this.aClass188_28.method4154();
		}
	}
}
