import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class55 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!au;")
	private final Class21 aClass21_15 = new Class21(64);

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_19;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public final int anInt1148;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class55(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_19 = arg2;
		if (this.aClass229_19 == null) {
			this.anInt1148 = 0;
		} else {
			this.anInt1148 = this.aClass229_19.method4981(16);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public void method1096() {
		@Pc(12) Class21 local12 = this.aClass21_15;
		synchronized (this.aClass21_15) {
			this.aClass21_15.method314();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V")
	public void method1097() {
		@Pc(2) Class21 local2 = this.aClass21_15;
		synchronized (this.aClass21_15) {
			this.aClass21_15.method323(5);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lclient!bd;")
	public Class27 method1098(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_15;
		@Pc(16) Class27 local16;
		synchronized (this.aClass21_15) {
			local16 = (Class27) this.aClass21_15.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class229 local35 = this.aClass229_19;
		@Pc(44) byte[] local44;
		synchronized (this.aClass229_19) {
			local44 = this.aClass229_19.method4980(16, arg0);
		}
		local16 = new Class27();
		if (local44 != null) {
			local16.method550(new Class2_Sub7(local44));
		}
		@Pc(66) Class21 local66 = this.aClass21_15;
		synchronized (this.aClass21_15) {
			this.aClass21_15.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public void method1099() {
		@Pc(9) Class21 local9 = this.aClass21_15;
		synchronized (this.aClass21_15) {
			this.aClass21_15.method313();
		}
	}
}
