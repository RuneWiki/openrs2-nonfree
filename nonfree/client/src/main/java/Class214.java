import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class214 {

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
	public int anInt5806;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!uf;")
	private Class326 aClass326_29 = new Class326(64);

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!uf;")
	public final Class326 aClass326_30 = new Class326(500);

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Lclient!uf;")
	public final Class326 aClass326_31 = new Class326(30);

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!uf;")
	public final Class326 aClass326_32 = new Class326(50);

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!ga;")
	private final Class111 aClass111_74;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!ga;")
	public final Class111 aClass111_75;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!nq;IZLclient!ga;Lclient!ga;)V")
	public Class214(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) Class111 arg4) {
		this.aBoolean418 = arg2;
		this.aClass111_74 = arg3;
		this.aClass111_75 = arg4;
		if (this.aClass111_74 != null) {
			@Pc(47) int local47 = this.aClass111_74.method2436() - 1;
			this.aClass111_74.method2442(local47);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public void method4892(@OriginalArg(0) int arg0) {
		this.anInt5806 = arg0;
		@Pc(13) Class326 local13 = this.aClass326_30;
		synchronized (this.aClass326_30) {
			this.aClass326_30.method7230();
		}
		local13 = this.aClass326_31;
		synchronized (this.aClass326_31) {
			this.aClass326_31.method7230();
		}
		local13 = this.aClass326_32;
		synchronized (this.aClass326_32) {
			this.aClass326_32.method7230();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
	public void method4893(@OriginalArg(1) int arg0) {
		this.aClass326_29 = new Class326(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	public void method4894() {
		@Pc(6) Class326 local6 = this.aClass326_29;
		synchronized (this.aClass326_29) {
			this.aClass326_29.method7241(5);
		}
		local6 = this.aClass326_30;
		synchronized (this.aClass326_30) {
			this.aClass326_30.method7241(5);
		}
		local6 = this.aClass326_31;
		synchronized (this.aClass326_31) {
			this.aClass326_31.method7241(5);
		}
		local6 = this.aClass326_32;
		synchronized (this.aClass326_32) {
			this.aClass326_32.method7241(5);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BZ)V")
	public void method4896(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean418 != arg0) {
			this.aBoolean418 = arg0;
			this.method4899();
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Lclient!tc;")
	public Class306 method4897(@OriginalArg(0) int arg0) {
		@Pc(13) Class326 local13 = this.aClass326_29;
		@Pc(23) Class306 local23;
		synchronized (this.aClass326_29) {
			local23 = (Class306) this.aClass326_29.method7238((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class111 local36 = this.aClass111_74;
		@Pc(49) byte[] local49;
		synchronized (this.aClass111_74) {
			local49 = this.aClass111_74.method2441(Static208.method7268(arg0), Static300.method4701(arg0));
		}
		local23 = new Class306();
		local23.anInt8416 = arg0;
		local23.aClass214_4 = this;
		if (local49 != null) {
			local23.method6982(new Class1_Sub20(local49));
		}
		local23.method6968();
		if (local23.aBoolean621) {
			local23.aBoolean620 = false;
			local23.anInt8406 = 0;
		}
		if (!this.aBoolean418 && local23.aBoolean612) {
			local23.aStringArray35 = null;
			local23.anIntArray573 = null;
		}
		@Pc(101) Class326 local101 = this.aClass326_29;
		synchronized (this.aClass326_29) {
			this.aClass326_29.method7236(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method4899() {
		@Pc(10) Class326 local10 = this.aClass326_29;
		synchronized (this.aClass326_29) {
			this.aClass326_29.method7230();
		}
		local10 = this.aClass326_30;
		synchronized (this.aClass326_30) {
			this.aClass326_30.method7230();
		}
		local10 = this.aClass326_31;
		synchronized (this.aClass326_31) {
			this.aClass326_31.method7230();
		}
		local10 = this.aClass326_32;
		synchronized (this.aClass326_32) {
			this.aClass326_32.method7230();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
	public void method4901(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean419 != arg0) {
			this.aBoolean419 = arg0;
			this.method4899();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method4902() {
		@Pc(6) Class326 local6 = this.aClass326_29;
		synchronized (this.aClass326_29) {
			this.aClass326_29.method7234();
		}
		local6 = this.aClass326_30;
		synchronized (this.aClass326_30) {
			this.aClass326_30.method7234();
		}
		local6 = this.aClass326_31;
		synchronized (this.aClass326_31) {
			this.aClass326_31.method7234();
		}
		local6 = this.aClass326_32;
		synchronized (this.aClass326_32) {
			this.aClass326_32.method7234();
		}
	}
}
