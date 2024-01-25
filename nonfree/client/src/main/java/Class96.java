import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class96 {

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
	public int anInt2877;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!co;")
	private Class41 aClass41_30 = new Class41(64);

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Lclient!co;")
	public final Class41 aClass41_31 = new Class41(500);

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "Lclient!co;")
	public final Class41 aClass41_32 = new Class41(30);

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!co;")
	public final Class41 aClass41_33 = new Class41(50);

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!g;")
	public final Class83 aClass83_54;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public final int anInt2874;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!g;")
	private final Class83 aClass83_53;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ci;IZLclient!g;Lclient!g;)V")
	public Class96(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) Class83 arg4) {
		this.aClass83_54 = arg4;
		this.aBoolean200 = arg2;
		this.anInt2874 = arg1;
		this.aClass83_53 = arg3;
		if (this.aClass83_53 != null) {
			@Pc(50) int local50 = this.aClass83_53.method1956() - 1;
			this.aClass83_53.method1955(local50);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public void method2294() {
		@Pc(2) Class41 local2 = this.aClass41_30;
		synchronized (this.aClass41_30) {
			this.aClass41_30.method826(5);
		}
		local2 = this.aClass41_31;
		synchronized (this.aClass41_31) {
			this.aClass41_31.method826(5);
		}
		local2 = this.aClass41_32;
		synchronized (this.aClass41_32) {
			this.aClass41_32.method826(5);
		}
		local2 = this.aClass41_33;
		synchronized (this.aClass41_33) {
			this.aClass41_33.method826(5);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public void method2295() {
		@Pc(2) Class41 local2 = this.aClass41_30;
		synchronized (this.aClass41_30) {
			this.aClass41_30.method825();
		}
		local2 = this.aClass41_31;
		synchronized (this.aClass41_31) {
			this.aClass41_31.method825();
		}
		local2 = this.aClass41_32;
		synchronized (this.aClass41_32) {
			this.aClass41_32.method825();
		}
		local2 = this.aClass41_33;
		synchronized (this.aClass41_33) {
			this.aClass41_33.method825();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public void method2296(@OriginalArg(0) int arg0) {
		this.anInt2877 = arg0;
		@Pc(9) Class41 local9 = this.aClass41_31;
		synchronized (this.aClass41_31) {
			this.aClass41_31.method825();
		}
		local9 = this.aClass41_32;
		synchronized (this.aClass41_32) {
			this.aClass41_32.method825();
		}
		local9 = this.aClass41_33;
		synchronized (this.aClass41_33) {
			this.aClass41_33.method825();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)V")
	public void method2298(@OriginalArg(1) int arg0) {
		this.aClass41_30 = new Class41(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	public void method2300(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean201) {
			this.aBoolean201 = arg0;
			this.method2295();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BZ)V")
	public void method2302(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean200) {
			this.aBoolean200 = arg0;
			this.method2295();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Lclient!cu;")
	public Class47 method2303(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_30;
		@Pc(16) Class47 local16;
		synchronized (this.aClass41_30) {
			local16 = (Class47) this.aClass41_30.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass83_53.method1968(Static104.method1854(arg0), Static371.method5901(arg0));
		local16 = new Class47();
		local16.anInt1234 = arg0;
		local16.aClass96_2 = this;
		if (local42 != null) {
			local16.method894(new Class2_Sub24(local42));
		}
		local16.method898();
		if (local16.aBoolean104) {
			local16.aBoolean95 = false;
			local16.anInt1263 = 0;
		}
		if (!this.aBoolean200 && local16.aBoolean97) {
			local16.aStringArray7 = null;
			local16.anIntArray93 = null;
		}
		@Pc(88) Class41 local88 = this.aClass41_30;
		synchronized (this.aClass41_30) {
			this.aClass41_30.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public void method2304() {
		@Pc(2) Class41 local2 = this.aClass41_30;
		synchronized (this.aClass41_30) {
			this.aClass41_30.method829();
		}
		local2 = this.aClass41_31;
		synchronized (this.aClass41_31) {
			this.aClass41_31.method829();
		}
		local2 = this.aClass41_32;
		synchronized (this.aClass41_32) {
			this.aClass41_32.method829();
		}
		local2 = this.aClass41_33;
		synchronized (this.aClass41_33) {
			this.aClass41_33.method829();
		}
	}
}
