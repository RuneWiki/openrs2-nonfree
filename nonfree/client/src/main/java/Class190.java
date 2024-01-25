import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class190 {

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	public int anInt5300;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
	public boolean aBoolean389 = false;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!ka;")
	private Class132 aClass132_44 = new Class132(64);

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "Lclient!ka;")
	public final Class132 aClass132_45 = new Class132(500);

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "Lclient!ka;")
	public final Class132 aClass132_46 = new Class132(30);

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Lclient!ka;")
	public final Class132 aClass132_47 = new Class132(50);

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!dk;")
	private final Class54 aClass54_81;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Lclient!dk;")
	public final Class54 aClass54_82;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!ad;IZLclient!dk;Lclient!dk;)V")
	public Class190(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) Class54 arg4) {
		this.aBoolean390 = arg2;
		this.aClass54_81 = arg3;
		this.aClass54_82 = arg4;
		if (this.aClass54_81 != null) {
			@Pc(47) int local47 = this.aClass54_81.method1107() - 1;
			this.aClass54_81.method1123(local47);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public void method4212() {
		@Pc(2) Class132 local2 = this.aClass132_44;
		synchronized (this.aClass132_44) {
			this.aClass132_44.method2708();
		}
		local2 = this.aClass132_45;
		synchronized (this.aClass132_45) {
			this.aClass132_45.method2708();
		}
		local2 = this.aClass132_46;
		synchronized (this.aClass132_46) {
			this.aClass132_46.method2708();
		}
		local2 = this.aClass132_47;
		synchronized (this.aClass132_47) {
			this.aClass132_47.method2708();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V")
	public void method4213(@OriginalArg(0) int arg0) {
		this.anInt5300 = arg0;
		@Pc(16) Class132 local16 = this.aClass132_45;
		synchronized (this.aClass132_45) {
			this.aClass132_45.method2698();
		}
		local16 = this.aClass132_46;
		synchronized (this.aClass132_46) {
			this.aClass132_46.method2698();
		}
		local16 = this.aClass132_47;
		synchronized (this.aClass132_47) {
			this.aClass132_47.method2698();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(IZ)V")
	public void method4214(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean389 != arg0) {
			this.aBoolean389 = arg0;
			this.method4219();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	public void method4217() {
		@Pc(2) Class132 local2 = this.aClass132_44;
		synchronized (this.aClass132_44) {
			this.aClass132_44.method2713(5);
		}
		local2 = this.aClass132_45;
		synchronized (this.aClass132_45) {
			this.aClass132_45.method2713(5);
		}
		local2 = this.aClass132_46;
		synchronized (this.aClass132_46) {
			this.aClass132_46.method2713(5);
		}
		local2 = this.aClass132_47;
		synchronized (this.aClass132_47) {
			this.aClass132_47.method2713(5);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Lclient!pm;")
	public Class192 method4218(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_44;
		@Pc(16) Class192 local16;
		synchronized (this.aClass132_44) {
			local16 = (Class192) this.aClass132_44.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class54 local35 = this.aClass54_81;
		@Pc(48) byte[] local48;
		synchronized (this.aClass54_81) {
			local48 = this.aClass54_81.method1126(Static91.method1437(arg0), Static99.method1525(arg0));
		}
		local16 = new Class192();
		local16.aClass190_4 = this;
		local16.anInt5325 = arg0;
		if (local48 != null) {
			local16.method4231(new Class2_Sub13(local48));
		}
		local16.method4229();
		if (local16.aBoolean405) {
			local16.aBoolean404 = false;
			local16.anInt5337 = 0;
		}
		if (!this.aBoolean390 && local16.aBoolean406) {
			local16.anIntArray436 = null;
			local16.aStringArray30 = null;
		}
		@Pc(100) Class132 local100 = this.aClass132_44;
		synchronized (this.aClass132_44) {
			this.aClass132_44.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
	public void method4219() {
		@Pc(2) Class132 local2 = this.aClass132_44;
		synchronized (this.aClass132_44) {
			this.aClass132_44.method2698();
		}
		local2 = this.aClass132_45;
		synchronized (this.aClass132_45) {
			this.aClass132_45.method2698();
		}
		local2 = this.aClass132_46;
		synchronized (this.aClass132_46) {
			this.aClass132_46.method2698();
		}
		local2 = this.aClass132_47;
		synchronized (this.aClass132_47) {
			this.aClass132_47.method2698();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V")
	public void method4220(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean390 != arg0) {
			this.aBoolean390 = arg0;
			this.method4219();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
	public void method4221(@OriginalArg(1) int arg0) {
		this.aClass132_44 = new Class132(arg0);
	}
}
