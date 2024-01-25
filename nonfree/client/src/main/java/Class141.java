import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class141 {

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt3562;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!bh;")
	private Class32 aClass32_32 = new Class32(64);

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Lclient!bh;")
	public final Class32 aClass32_33 = new Class32(500);

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "Lclient!bh;")
	public final Class32 aClass32_34 = new Class32(30);

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "Lclient!bh;")
	public final Class32 aClass32_35 = new Class32(50);

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!wu;")
	private final Class380 aClass380_55;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!wu;")
	public final Class380 aClass380_54;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!wj;IZLclient!wu;Lclient!wu;)V")
	public Class141(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(4) Class380 arg4) {
		this.aClass380_55 = arg3;
		this.aClass380_54 = arg4;
		this.aBoolean255 = arg2;
		if (this.aClass380_55 != null) {
			@Pc(47) int local47 = this.aClass380_55.method8639() - 1;
			this.aClass380_55.method8631(local47);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public void method2968() {
		@Pc(6) Class32 local6 = this.aClass32_32;
		synchronized (this.aClass32_32) {
			this.aClass32_32.method632();
		}
		local6 = this.aClass32_33;
		synchronized (this.aClass32_33) {
			this.aClass32_33.method632();
		}
		local6 = this.aClass32_34;
		synchronized (this.aClass32_34) {
			this.aClass32_34.method632();
		}
		local6 = this.aClass32_35;
		synchronized (this.aClass32_35) {
			this.aClass32_35.method632();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public void method2969() {
		@Pc(2) Class32 local2 = this.aClass32_32;
		synchronized (this.aClass32_32) {
			this.aClass32_32.method634(5);
		}
		local2 = this.aClass32_33;
		synchronized (this.aClass32_33) {
			this.aClass32_33.method634(5);
		}
		local2 = this.aClass32_34;
		synchronized (this.aClass32_34) {
			this.aClass32_34.method634(5);
		}
		local2 = this.aClass32_35;
		synchronized (this.aClass32_35) {
			this.aClass32_35.method634(5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public void method2970(@OriginalArg(1) int arg0) {
		this.aClass32_32 = new Class32(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!kha;")
	public Class191 method2971(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_32;
		@Pc(16) Class191 local16;
		synchronized (this.aClass32_32) {
			local16 = (Class191) this.aClass32_32.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_55;
		@Pc(48) byte[] local48;
		synchronized (this.aClass380_55) {
			local48 = this.aClass380_55.method8620(Static631.method8043(arg0), Static84.method1199(arg0));
		}
		local16 = new Class191();
		local16.aClass141_3 = this;
		local16.anInt4815 = arg0;
		if (local48 != null) {
			local16.method4061(new Class2_Sub22(local48));
		}
		local16.method4065();
		if (local16.aBoolean345) {
			local16.anInt4830 = 0;
			local16.aBoolean341 = false;
		}
		if (!this.aBoolean255 && local16.aBoolean342) {
			local16.aStringArray24 = null;
			local16.anIntArray322 = null;
		}
		@Pc(100) Class32 local100 = this.aClass32_32;
		synchronized (this.aClass32_32) {
			this.aClass32_32.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	public void method2972(@OriginalArg(0) int arg0) {
		this.anInt3562 = arg0;
		@Pc(9) Class32 local9 = this.aClass32_33;
		synchronized (this.aClass32_33) {
			this.aClass32_33.method640();
		}
		local9 = this.aClass32_34;
		synchronized (this.aClass32_34) {
			this.aClass32_34.method640();
		}
		local9 = this.aClass32_35;
		synchronized (this.aClass32_35) {
			this.aClass32_35.method640();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IZ)V")
	public void method2973(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean256 != arg0) {
			this.aBoolean256 = arg0;
			this.method2977();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	public void method2975(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean255) {
			this.aBoolean255 = arg0;
			this.method2977();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	public void method2977() {
		@Pc(2) Class32 local2 = this.aClass32_32;
		synchronized (this.aClass32_32) {
			this.aClass32_32.method640();
		}
		local2 = this.aClass32_33;
		synchronized (this.aClass32_33) {
			this.aClass32_33.method640();
		}
		local2 = this.aClass32_34;
		synchronized (this.aClass32_34) {
			this.aClass32_34.method640();
		}
		local2 = this.aClass32_35;
		synchronized (this.aClass32_35) {
			this.aClass32_35.method640();
		}
	}
}
