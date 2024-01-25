import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
	public int anInt15;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "Lclient!gw;")
	private final Class136 aClass136_1 = new Class136(64);

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "Lclient!gw;")
	public final Class136 aClass136_2 = new Class136(50);

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lclient!gw;")
	public final Class136 aClass136_3 = new Class136(5);

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!gp;")
	public final Class133 aClass133_1;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "Lclient!uu;")
	public final Class343 aClass343_2;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lclient!uu;")
	private final Class343 aClass343_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!gp;IZLclient!uu;Lclient!uu;)V")
	public Class2(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) Class343 arg4) {
		this.aClass133_1 = arg0;
		this.aClass343_2 = arg4;
		this.aBoolean1 = arg2;
		this.aClass343_1 = arg3;
		if (this.aClass343_1 != null) {
			@Pc(41) int local41 = this.aClass343_1.method8144() - 1;
			this.aClass343_1.method8157(local41);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public void method21() {
		@Pc(2) Class136 local2 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3142();
		}
		local2 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			this.aClass136_3.method3142();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	public void method22() {
		@Pc(6) Class136 local6 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3138();
		}
		local6 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3138();
		}
		local6 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			this.aClass136_3.method3138();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lclient!sk;")
	public Class309 method23(@OriginalArg(1) int arg0) {
		@Pc(12) Class136 local12 = this.aClass136_1;
		@Pc(22) Class309 local22;
		synchronized (this.aClass136_1) {
			local22 = (Class309) this.aClass136_1.method3134((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class343 local35 = this.aClass343_1;
		@Pc(48) byte[] local48;
		synchronized (this.aClass343_1) {
			local48 = this.aClass343_1.method8132(Static322.method5334(arg0), Static100.method2422(arg0));
		}
		local22 = new Class309();
		local22.aClass2_2 = this;
		local22.anInt8837 = arg0;
		if (local48 != null) {
			local22.method7583(new Class3_Sub9(local48));
		}
		local22.method7590();
		@Pc(79) Class136 local79 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3135(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public void method25() {
		@Pc(6) Class136 local6 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3142();
		}
		local6 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3142();
		}
		local6 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			this.aClass136_3.method3142();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZZ)V")
	public void method26(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean1 != arg0) {
			this.aBoolean1 = arg0;
			this.method25();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
	public void method29() {
		@Pc(2) Class136 local2 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3132(5);
		}
		local2 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3132(5);
		}
		local2 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			this.aClass136_3.method3132(5);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V")
	public void method30(@OriginalArg(0) int arg0) {
		this.anInt15 = arg0;
		@Pc(14) Class136 local14 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3142();
		}
		local14 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			this.aClass136_3.method3142();
		}
	}
}
