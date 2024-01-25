import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class32 {

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!co;")
	private final Class41 aClass41_6 = new Class41(64);

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!co;")
	public final Class41 aClass41_7 = new Class41(50);

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!co;")
	public final Class41 aClass41_8 = new Class41(5);

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!g;")
	private final Class83 aClass83_19;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!g;")
	public final Class83 aClass83_20;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public final int anInt713;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!ci;IZLclient!g;Lclient!g;)V")
	public Class32(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) Class83 arg4) {
		this.aClass83_19 = arg3;
		this.aBoolean50 = arg2;
		this.aClass83_20 = arg4;
		this.anInt713 = arg1;
		if (this.aClass83_19 != null) {
			@Pc(41) int local41 = this.aClass83_19.method1956() - 1;
			this.aClass83_19.method1955(local41);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public void method571() {
		@Pc(6) Class41 local6 = this.aClass41_7;
		synchronized (this.aClass41_7) {
			this.aClass41_7.method825();
		}
		local6 = this.aClass41_8;
		synchronized (this.aClass41_8) {
			this.aClass41_8.method825();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method573() {
		@Pc(2) Class41 local2 = this.aClass41_6;
		synchronized (this.aClass41_6) {
			this.aClass41_6.method825();
		}
		local2 = this.aClass41_7;
		synchronized (this.aClass41_7) {
			this.aClass41_7.method825();
		}
		local2 = this.aClass41_8;
		synchronized (this.aClass41_8) {
			this.aClass41_8.method825();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
	public void method574() {
		@Pc(6) Class41 local6 = this.aClass41_6;
		synchronized (this.aClass41_6) {
			this.aClass41_6.method826(5);
		}
		local6 = this.aClass41_7;
		synchronized (this.aClass41_7) {
			this.aClass41_7.method826(5);
		}
		local6 = this.aClass41_8;
		synchronized (this.aClass41_8) {
			this.aClass41_8.method826(5);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public void method577(@OriginalArg(0) int arg0) {
		this.anInt723 = arg0;
		@Pc(13) Class41 local13 = this.aClass41_7;
		synchronized (this.aClass41_7) {
			this.aClass41_7.method825();
		}
		local13 = this.aClass41_8;
		synchronized (this.aClass41_8) {
			this.aClass41_8.method825();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V")
	public void method578(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean50) {
			this.aBoolean50 = arg0;
			this.method573();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lclient!qs;")
	public Class197 method579(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_6;
		@Pc(16) Class197 local16;
		synchronized (this.aClass41_6) {
			local16 = (Class197) this.aClass41_6.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass83_19.method1968(Static384.method6011(arg0), Static47.method610(arg0));
		local16 = new Class197();
		local16.aClass32_2 = this;
		local16.anInt5489 = arg0;
		if (local37 != null) {
			local16.method4838(new Class2_Sub24(local37));
		}
		local16.method4844();
		@Pc(70) Class41 local70 = this.aClass41_6;
		synchronized (this.aClass41_6) {
			this.aClass41_6.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public void method580() {
		@Pc(2) Class41 local2 = this.aClass41_6;
		synchronized (this.aClass41_6) {
			this.aClass41_6.method829();
		}
		local2 = this.aClass41_7;
		synchronized (this.aClass41_7) {
			this.aClass41_7.method829();
		}
		local2 = this.aClass41_8;
		synchronized (this.aClass41_8) {
			this.aClass41_8.method829();
		}
	}
}
