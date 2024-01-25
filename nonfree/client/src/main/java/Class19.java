import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class19 {

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!tq;")
	private final Class340 aClass340_1 = new Class340(64);

	@OriginalMember(owner = "client!al", name = "p", descriptor = "Lclient!tq;")
	public final Class340 aClass340_2 = new Class340(50);

	@OriginalMember(owner = "client!al", name = "q", descriptor = "Lclient!tq;")
	public final Class340 aClass340_3 = new Class340(5);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!ega;")
	public final Class98 aClass98_1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!wm;")
	private final Class390 aClass390_3;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!wm;")
	public final Class390 aClass390_2;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ega;IZLclient!wm;Lclient!wm;)V")
	public Class19(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class390 arg3, @OriginalArg(4) Class390 arg4) {
		this.aBoolean19 = arg2;
		this.aClass98_1 = arg0;
		this.aClass390_3 = arg3;
		this.aClass390_2 = arg4;
		if (this.aClass390_3 != null) {
			@Pc(41) int local41 = this.aClass390_3.method8918() - 1;
			this.aClass390_3.method8913(local41);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)Lclient!gj;")
	public Class134 method274(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_1;
		@Pc(16) Class134 local16;
		synchronized (this.aClass340_1) {
			local16 = (Class134) this.aClass340_1.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_3;
		@Pc(44) byte[] local44;
		synchronized (this.aClass390_3) {
			local44 = this.aClass390_3.method8914(Static346.method5286(arg0), Static75.method1001(arg0));
		}
		local16 = new Class134();
		local16.anInt3816 = arg0;
		local16.aClass19_1 = this;
		if (local44 != null) {
			local16.method3268(new Class5_Sub41(local44));
		}
		local16.method3273();
		@Pc(81) Class340 local81 = this.aClass340_1;
		synchronized (this.aClass340_1) {
			this.aClass340_1.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public void method275() {
		@Pc(2) Class340 local2 = this.aClass340_1;
		synchronized (this.aClass340_1) {
			this.aClass340_1.method7996(5);
		}
		local2 = this.aClass340_2;
		synchronized (this.aClass340_2) {
			this.aClass340_2.method7996(5);
		}
		local2 = this.aClass340_3;
		synchronized (this.aClass340_3) {
			this.aClass340_3.method7996(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
	public void method276(@OriginalArg(0) int arg0) {
		this.anInt309 = arg0;
		@Pc(9) Class340 local9 = this.aClass340_2;
		synchronized (this.aClass340_2) {
			this.aClass340_2.method7987();
		}
		local9 = this.aClass340_3;
		synchronized (this.aClass340_3) {
			this.aClass340_3.method7987();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method277() {
		@Pc(6) Class340 local6 = this.aClass340_2;
		synchronized (this.aClass340_2) {
			this.aClass340_2.method7987();
		}
		local6 = this.aClass340_3;
		synchronized (this.aClass340_3) {
			this.aClass340_3.method7987();
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public void method278() {
		@Pc(2) Class340 local2 = this.aClass340_1;
		synchronized (this.aClass340_1) {
			this.aClass340_1.method7987();
		}
		local2 = this.aClass340_2;
		synchronized (this.aClass340_2) {
			this.aClass340_2.method7987();
		}
		local2 = this.aClass340_3;
		synchronized (this.aClass340_3) {
			this.aClass340_3.method7987();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
	public void method279(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean19) {
			this.aBoolean19 = arg0;
			this.method278();
		}
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public void method281() {
		@Pc(6) Class340 local6 = this.aClass340_1;
		synchronized (this.aClass340_1) {
			this.aClass340_1.method8000();
		}
		local6 = this.aClass340_2;
		synchronized (this.aClass340_2) {
			this.aClass340_2.method8000();
		}
		local6 = this.aClass340_3;
		synchronized (this.aClass340_3) {
			this.aClass340_3.method8000();
		}
	}
}
