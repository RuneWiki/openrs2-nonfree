import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class95 {

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
	public int anInt2314;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!ng;")
	private Class167 aClass167_35 = new Class167(64);

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "Lclient!ng;")
	public final Class167 aClass167_36 = new Class167(500);

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Lclient!ng;")
	public final Class167 aClass167_37 = new Class167(30);

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "Lclient!ng;")
	public final Class167 aClass167_38 = new Class167(50);

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!ic;")
	private final Class113 aClass113_45;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "Lclient!ic;")
	public final Class113 aClass113_46;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!ai;IZLclient!ic;Lclient!ic;)V")
	public Class95(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class113 arg4) {
		this.aClass113_45 = arg3;
		this.aBoolean170 = arg2;
		this.aClass113_46 = arg4;
		if (this.aClass113_45 != null) {
			@Pc(47) int local47 = this.aClass113_45.method2272() - 1;
			this.aClass113_45.method2271(local47);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V")
	public void method1819(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean170) {
			this.aBoolean170 = arg0;
			this.method1829();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Lclient!kn;")
	public Class141 method1821(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_35;
		@Pc(16) Class141 local16;
		synchronized (this.aClass167_35) {
			local16 = (Class141) this.aClass167_35.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass113_45.method2274(Static311.method4038(arg0), Static29.method504(arg0));
		local16 = new Class141();
		local16.anInt3383 = arg0;
		local16.aClass95_2 = this;
		if (local37 != null) {
			local16.method2833(new Class1_Sub11(local37));
		}
		local16.method2823();
		if (local16.aBoolean259) {
			local16.anInt3428 = 0;
			local16.aBoolean260 = false;
		}
		if (!this.aBoolean170 && local16.aBoolean263) {
			local16.aStringArray26 = null;
			local16.anIntArray187 = null;
		}
		@Pc(83) Class167 local83 = this.aClass167_35;
		synchronized (this.aClass167_35) {
			this.aClass167_35.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZ)V")
	public void method1823(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean169) {
			this.aBoolean169 = arg0;
			this.method1829();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	public void method1825(@OriginalArg(0) int arg0) {
		this.anInt2314 = arg0;
		@Pc(13) Class167 local13 = this.aClass167_36;
		synchronized (this.aClass167_36) {
			this.aClass167_36.method3390();
		}
		local13 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3390();
		}
		local13 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3390();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	public void method1826() {
		@Pc(2) Class167 local2 = this.aClass167_35;
		synchronized (this.aClass167_35) {
			this.aClass167_35.method3384(5);
		}
		local2 = this.aClass167_36;
		synchronized (this.aClass167_36) {
			this.aClass167_36.method3384(5);
		}
		local2 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3384(5);
		}
		local2 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3384(5);
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	public void method1827() {
		@Pc(2) Class167 local2 = this.aClass167_35;
		synchronized (this.aClass167_35) {
			this.aClass167_35.method3389();
		}
		local2 = this.aClass167_36;
		synchronized (this.aClass167_36) {
			this.aClass167_36.method3389();
		}
		local2 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3389();
		}
		local2 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3389();
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	public void method1829() {
		@Pc(2) Class167 local2 = this.aClass167_35;
		synchronized (this.aClass167_35) {
			this.aClass167_35.method3390();
		}
		local2 = this.aClass167_36;
		synchronized (this.aClass167_36) {
			this.aClass167_36.method3390();
		}
		local2 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3390();
		}
		local2 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3390();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IZ)V")
	public void method1830(@OriginalArg(0) int arg0) {
		this.aClass167_35 = new Class167(arg0);
	}
}
