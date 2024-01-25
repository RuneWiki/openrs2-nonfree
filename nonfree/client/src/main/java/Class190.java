import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class190 {

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public int anInt5118;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!ng;")
	private final Class167 aClass167_71 = new Class167(64);

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!ng;")
	public final Class167 aClass167_72 = new Class167(30);

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!ic;")
	public final Class113 aClass113_94;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!ic;")
	private final Class113 aClass113_95;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;)V")
	public Class190(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3) {
		this.aClass113_94 = arg3;
		this.aClass113_95 = arg2;
		@Pc(26) int local26 = this.aClass113_95.method2272() - 1;
		this.aClass113_95.method2271(local26);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public void method3999(@OriginalArg(1) int arg0) {
		this.anInt5118 = arg0;
		@Pc(13) Class167 local13 = this.aClass167_72;
		synchronized (this.aClass167_72) {
			this.aClass167_72.method3390();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public void method4000() {
		@Pc(6) Class167 local6 = this.aClass167_71;
		synchronized (this.aClass167_71) {
			this.aClass167_71.method3389();
		}
		local6 = this.aClass167_72;
		synchronized (this.aClass167_72) {
			this.aClass167_72.method3389();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	public void method4002() {
		@Pc(6) Class167 local6 = this.aClass167_71;
		synchronized (this.aClass167_71) {
			this.aClass167_71.method3384(5);
		}
		local6 = this.aClass167_72;
		synchronized (this.aClass167_72) {
			this.aClass167_72.method3384(5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method4004() {
		@Pc(2) Class167 local2 = this.aClass167_71;
		synchronized (this.aClass167_71) {
			this.aClass167_71.method3390();
		}
		local2 = this.aClass167_72;
		synchronized (this.aClass167_72) {
			this.aClass167_72.method3390();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lclient!as;")
	public Class14 method4005(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_71;
		@Pc(16) Class14 local16;
		synchronized (this.aClass167_71) {
			local16 = (Class14) this.aClass167_71.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass113_95.method2274(Static139.method1855(arg0), Static416.method5176(arg0));
		local16 = new Class14();
		local16.anInt322 = arg0;
		local16.aClass190_1 = this;
		if (local37 != null) {
			local16.method275(new Class1_Sub11(local37));
		}
		@Pc(59) Class167 local59 = this.aClass167_71;
		synchronized (this.aClass167_71) {
			this.aClass167_71.method3392(local16, (long) arg0);
			return local16;
		}
	}
}
