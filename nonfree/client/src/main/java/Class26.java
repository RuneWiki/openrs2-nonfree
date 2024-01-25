import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class26 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!au;")
	private final Class21 aClass21_8 = new Class21(256);

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_6;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class26(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_6 = arg2;
		this.aClass229_6.method4981(26);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method391() {
		@Pc(10) Class21 local10 = this.aClass21_8;
		synchronized (this.aClass21_8) {
			this.aClass21_8.method313();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!pba;")
	public Class2_Sub2_Sub16 method393(@OriginalArg(1) int arg0) {
		@Pc(12) Class21 local12 = this.aClass21_8;
		@Pc(22) Class2_Sub2_Sub16 local22;
		synchronized (this.aClass21_8) {
			local22 = (Class2_Sub2_Sub16) this.aClass21_8.method324((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class229 local35 = this.aClass229_6;
		@Pc(44) byte[] local44;
		synchronized (this.aClass229_6) {
			local44 = this.aClass229_6.method4980(26, arg0);
		}
		local22 = new Class2_Sub2_Sub16();
		if (local44 != null) {
			local22.method5503(new Class2_Sub7(local44));
		}
		@Pc(66) Class21 local66 = this.aClass21_8;
		synchronized (this.aClass21_8) {
			this.aClass21_8.method317(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public void method396() {
		@Pc(2) Class21 local2 = this.aClass21_8;
		synchronized (this.aClass21_8) {
			this.aClass21_8.method323(5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public void method397() {
		@Pc(8) Class21 local8 = this.aClass21_8;
		synchronized (this.aClass21_8) {
			this.aClass21_8.method314();
		}
	}
}
