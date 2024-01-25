import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class69 {

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!aj;")
	private Class10 aClass10_7 = new Class10(64);

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "Lclient!aj;")
	public final Class10 aClass10_8 = new Class10(500);

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "Lclient!aj;")
	public final Class10 aClass10_9 = new Class10(30);

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "Lclient!aj;")
	public final Class10 aClass10_10 = new Class10(50);

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!om;")
	private final Class246 aClass246_55;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Lclient!om;")
	public final Class246 aClass246_54;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!mea;IZLclient!om;Lclient!om;)V")
	public Class69(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aBoolean200 = arg2;
		this.aClass246_55 = arg3;
		this.aClass246_54 = arg4;
		if (this.aClass246_55 != null) {
			@Pc(47) int local47 = this.aClass246_55.method5682() - 1;
			this.aClass246_55.method5673(local47);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)V")
	public void method2178(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean198 != arg0) {
			this.aBoolean198 = arg0;
			this.method2182();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
	public void method2179(@OriginalArg(0) int arg0) {
		this.aClass10_7 = new Class10(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public void method2180() {
		@Pc(10) Class10 local10 = this.aClass10_7;
		synchronized (this.aClass10_7) {
			this.aClass10_7.method262();
		}
		local10 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method262();
		}
		local10 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method262();
		}
		local10 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method262();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lclient!bd;")
	public Class23 method2181(@OriginalArg(0) int arg0) {
		@Pc(12) Class10 local12 = this.aClass10_7;
		@Pc(22) Class23 local22;
		synchronized (this.aClass10_7) {
			local22 = (Class23) this.aClass10_7.method250((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class246 local35 = this.aClass246_55;
		@Pc(50) byte[] local50;
		synchronized (this.aClass246_55) {
			local50 = this.aClass246_55.method5653(Static54.method1063(arg0), Static86.method1944(arg0));
		}
		local22 = new Class23();
		local22.anInt764 = arg0;
		local22.aClass69_1 = this;
		if (local50 != null) {
			local22.method584(new Class3_Sub11(local50));
		}
		local22.method589();
		if (!this.aBoolean200 && local22.aBoolean58) {
			local22.anIntArray79 = null;
			local22.aStringArray2 = null;
		}
		if (local22.aBoolean69) {
			local22.anInt770 = 0;
			local22.aBoolean63 = false;
		}
		@Pc(102) Class10 local102 = this.aClass10_7;
		synchronized (this.aClass10_7) {
			this.aClass10_7.method254(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public void method2182() {
		@Pc(6) Class10 local6 = this.aClass10_7;
		synchronized (this.aClass10_7) {
			this.aClass10_7.method263();
		}
		local6 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method263();
		}
		local6 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method263();
		}
		local6 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method263();
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(IZ)V")
	public void method2183() {
		@Pc(12) Class10 local12 = this.aClass10_7;
		synchronized (this.aClass10_7) {
			this.aClass10_7.method258(5);
		}
		local12 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method258(5);
		}
		local12 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method258(5);
		}
		local12 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method258(5);
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
	public void method2184(@OriginalArg(0) int arg0) {
		this.anInt2439 = arg0;
		@Pc(9) Class10 local9 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method263();
		}
		local9 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method263();
		}
		local9 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method263();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BZ)V")
	public void method2187(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean200) {
			this.aBoolean200 = arg0;
			this.method2182();
		}
	}
}
