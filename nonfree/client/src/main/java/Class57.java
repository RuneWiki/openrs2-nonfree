import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class57 {

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	public int anInt1701;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "Lclient!pca;")
	private Class245 aClass245_17 = new Class245(64);

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "Lclient!pca;")
	public final Class245 aClass245_18 = new Class245(500);

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!pca;")
	public final Class245 aClass245_19 = new Class245(30);

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "Lclient!pca;")
	public final Class245 aClass245_20 = new Class245(50);

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
	public boolean aBoolean177;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!jo;")
	public final Class168 aClass168_23;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_22;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!jda;IZLclient!jo;Lclient!jo;)V")
	public Class57(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class168 arg3, @OriginalArg(4) Class168 arg4) {
		this.aBoolean177 = arg2;
		this.aClass168_23 = arg4;
		this.aClass168_22 = arg3;
		if (this.aClass168_22 != null) {
			@Pc(47) int local47 = this.aClass168_22.method4456() - 1;
			this.aClass168_22.method4443(local47);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
	public void method1466() {
		@Pc(6) Class245 local6 = this.aClass245_17;
		synchronized (this.aClass245_17) {
			this.aClass245_17.method6083(5);
		}
		local6 = this.aClass245_18;
		synchronized (this.aClass245_18) {
			this.aClass245_18.method6083(5);
		}
		local6 = this.aClass245_19;
		synchronized (this.aClass245_19) {
			this.aClass245_19.method6083(5);
		}
		local6 = this.aClass245_20;
		synchronized (this.aClass245_20) {
			this.aClass245_20.method6083(5);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)V")
	public void method1467(@OriginalArg(0) int arg0) {
		this.anInt1701 = arg0;
		@Pc(9) Class245 local9 = this.aClass245_18;
		synchronized (this.aClass245_18) {
			this.aClass245_18.method6079();
		}
		local9 = this.aClass245_19;
		synchronized (this.aClass245_19) {
			this.aClass245_19.method6079();
		}
		local9 = this.aClass245_20;
		synchronized (this.aClass245_20) {
			this.aClass245_20.method6079();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public void method1468() {
		@Pc(2) Class245 local2 = this.aClass245_17;
		synchronized (this.aClass245_17) {
			this.aClass245_17.method6076();
		}
		local2 = this.aClass245_18;
		synchronized (this.aClass245_18) {
			this.aClass245_18.method6076();
		}
		local2 = this.aClass245_19;
		synchronized (this.aClass245_19) {
			this.aClass245_19.method6076();
		}
		local2 = this.aClass245_20;
		synchronized (this.aClass245_20) {
			this.aClass245_20.method6076();
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(IB)Lclient!bfa;")
	public Class31 method1469(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_17;
		@Pc(16) Class31 local16;
		synchronized (this.aClass245_17) {
			local16 = (Class31) this.aClass245_17.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_22;
		@Pc(44) byte[] local44;
		synchronized (this.aClass168_22) {
			local44 = this.aClass168_22.method4435(Static109.method2241(arg0), Static421.method6531(arg0));
		}
		local16 = new Class31();
		local16.aClass57_5 = this;
		local16.anInt1060 = arg0;
		if (local44 != null) {
			local16.method1034(new Class6_Sub26(local44));
		}
		local16.method1023();
		if (!this.aBoolean177 && local16.aBoolean95) {
			local16.aStringArray6 = null;
			local16.anIntArray72 = null;
		}
		if (local16.aBoolean87) {
			local16.anInt1093 = 0;
			local16.aBoolean101 = false;
		}
		@Pc(100) Class245 local100 = this.aClass245_17;
		synchronized (this.aClass245_17) {
			this.aClass245_17.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
	public void method1470(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean177 != arg0) {
			this.aBoolean177 = arg0;
			this.method1471();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
	public void method1471() {
		@Pc(6) Class245 local6 = this.aClass245_17;
		synchronized (this.aClass245_17) {
			this.aClass245_17.method6079();
		}
		local6 = this.aClass245_18;
		synchronized (this.aClass245_18) {
			this.aClass245_18.method6079();
		}
		local6 = this.aClass245_19;
		synchronized (this.aClass245_19) {
			this.aClass245_19.method6079();
		}
		local6 = this.aClass245_20;
		synchronized (this.aClass245_20) {
			this.aClass245_20.method6079();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public void method1472(@OriginalArg(1) int arg0) {
		this.aClass245_17 = new Class245(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V")
	public void method1474(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean176) {
			this.aBoolean176 = arg0;
			this.method1471();
		}
	}
}
