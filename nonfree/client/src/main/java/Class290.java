import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class290 {

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	public int anInt7108;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
	public boolean aBoolean584 = false;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!au;")
	private Class21 aClass21_63 = new Class21(64);

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "Lclient!au;")
	public final Class21 aClass21_64 = new Class21(500);

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!au;")
	public final Class21 aClass21_65 = new Class21(30);

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Lclient!au;")
	public final Class21 aClass21_66 = new Class21(50);

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_101;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
	public boolean aBoolean583;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!mv;")
	public final Class229 aClass229_102;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!sea;IZLclient!mv;Lclient!mv;)V")
	public Class290(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(4) Class229 arg4) {
		this.aClass229_101 = arg3;
		this.aBoolean583 = arg2;
		this.aClass229_102 = arg4;
		if (this.aClass229_101 != null) {
			@Pc(47) int local47 = this.aClass229_101.method4952() - 1;
			this.aClass229_101.method4981(local47);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)V")
	public void method5797(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean584) {
			this.aBoolean584 = arg0;
			this.method5802();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
	public void method5798(@OriginalArg(1) int arg0) {
		this.anInt7108 = arg0;
		@Pc(13) Class21 local13 = this.aClass21_64;
		synchronized (this.aClass21_64) {
			this.aClass21_64.method313();
		}
		local13 = this.aClass21_65;
		synchronized (this.aClass21_65) {
			this.aClass21_65.method313();
		}
		local13 = this.aClass21_66;
		synchronized (this.aClass21_66) {
			this.aClass21_66.method313();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lclient!lt;")
	public Class216 method5799(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_63;
		@Pc(22) Class216 local22;
		synchronized (this.aClass21_63) {
			local22 = (Class216) this.aClass21_63.method324((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class229 local35 = this.aClass229_101;
		@Pc(48) byte[] local48;
		synchronized (this.aClass229_101) {
			local48 = this.aClass229_101.method4980(Static376.method5251(arg0), Static181.method2309(arg0));
		}
		local22 = new Class216();
		local22.anInt5259 = arg0;
		local22.aClass290_1 = this;
		if (local48 != null) {
			local22.method4558(new Class2_Sub7(local48));
		}
		local22.method4548();
		if (!this.aBoolean583 && local22.aBoolean414) {
			local22.anIntArray364 = null;
			local22.aStringArray29 = null;
		}
		if (local22.aBoolean407) {
			local22.aBoolean409 = false;
			local22.anInt5290 = 0;
		}
		@Pc(102) Class21 local102 = this.aClass21_63;
		synchronized (this.aClass21_63) {
			this.aClass21_63.method317(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method5800() {
		@Pc(2) Class21 local2 = this.aClass21_63;
		synchronized (this.aClass21_63) {
			this.aClass21_63.method314();
		}
		local2 = this.aClass21_64;
		synchronized (this.aClass21_64) {
			this.aClass21_64.method314();
		}
		local2 = this.aClass21_65;
		synchronized (this.aClass21_65) {
			this.aClass21_65.method314();
		}
		local2 = this.aClass21_66;
		synchronized (this.aClass21_66) {
			this.aClass21_66.method314();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
	public void method5801(@OriginalArg(0) int arg0) {
		this.aClass21_63 = new Class21(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method5802() {
		@Pc(2) Class21 local2 = this.aClass21_63;
		synchronized (this.aClass21_63) {
			this.aClass21_63.method313();
		}
		local2 = this.aClass21_64;
		synchronized (this.aClass21_64) {
			this.aClass21_64.method313();
		}
		local2 = this.aClass21_65;
		synchronized (this.aClass21_65) {
			this.aClass21_65.method313();
		}
		local2 = this.aClass21_66;
		synchronized (this.aClass21_66) {
			this.aClass21_66.method313();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)V")
	public void method5803() {
		@Pc(2) Class21 local2 = this.aClass21_63;
		synchronized (this.aClass21_63) {
			this.aClass21_63.method323(5);
		}
		local2 = this.aClass21_64;
		synchronized (this.aClass21_64) {
			this.aClass21_64.method323(5);
		}
		local2 = this.aClass21_65;
		synchronized (this.aClass21_65) {
			this.aClass21_65.method323(5);
		}
		local2 = this.aClass21_66;
		synchronized (this.aClass21_66) {
			this.aClass21_66.method323(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(ZB)V")
	public void method5805(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean583) {
			this.aBoolean583 = arg0;
			this.method5802();
		}
	}
}
