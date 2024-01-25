import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class231 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public int anInt6288;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!wq;")
	private final Class391 aClass391_29 = new Class391(64);

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!wq;")
	public final Class391 aClass391_30 = new Class391(50);

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!wq;")
	public final Class391 aClass391_31 = new Class391(5);

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!la;")
	public final Class208 aClass208_83;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_82;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!to;")
	public Class333 aClass333_4;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!to;IZLclient!la;Lclient!la;)V")
	public Class231(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) Class208 arg4) {
		this.aClass208_83 = arg4;
		this.aClass208_82 = arg3;
		this.aClass333_4 = arg0;
		this.aBoolean473 = arg2;
		if (this.aClass208_82 != null) {
			@Pc(41) int local41 = this.aClass208_82.method4988() - 1;
			this.aClass208_82.method5005(local41);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public void method5362() {
		@Pc(6) Class391 local6 = this.aClass391_29;
		synchronized (this.aClass391_29) {
			this.aClass391_29.method9276(0);
		}
		local6 = this.aClass391_30;
		synchronized (this.aClass391_30) {
			this.aClass391_30.method9276(0);
		}
		local6 = this.aClass391_31;
		synchronized (this.aClass391_31) {
			this.aClass391_31.method9276(0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!maa;")
	public Class227 method5363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class391 local6 = this.aClass391_29;
		@Pc(16) Class227 local16;
		synchronized (this.aClass391_29) {
			local16 = (Class227) this.aClass391_29.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_82;
		@Pc(43) byte[] local43;
		synchronized (this.aClass208_82) {
			local43 = this.aClass208_82.method4991(Static372.method7049(arg0), Static60.method856(arg0), -118);
		}
		if (arg1 != 2) {
			this.aClass333_4 = null;
		}
		local16 = new Class227();
		local16.anInt6260 = arg0;
		local16.aClass231_2 = this;
		if (local43 != null) {
			local16.method5331(new Class5_Sub23(local43));
		}
		local16.method5329();
		@Pc(84) Class391 local84 = this.aClass391_29;
		synchronized (this.aClass391_29) {
			this.aClass391_29.method9273((long) arg0, local16, arg1 ^ 0x3);
			return local16;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)V")
	public void method5364(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean473) {
			this.aBoolean473 = arg0;
			this.method5362();
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public void method5366() {
		@Pc(2) Class391 local2 = this.aClass391_30;
		synchronized (this.aClass391_30) {
			this.aClass391_30.method9276(0);
		}
		local2 = this.aClass391_31;
		synchronized (this.aClass391_31) {
			this.aClass391_31.method9276(0);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	public void method5367() {
		@Pc(2) Class391 local2 = this.aClass391_29;
		synchronized (this.aClass391_29) {
			this.aClass391_29.method9274(5);
		}
		local2 = this.aClass391_30;
		synchronized (this.aClass391_30) {
			this.aClass391_30.method9274(5);
		}
		local2 = this.aClass391_31;
		synchronized (this.aClass391_31) {
			this.aClass391_31.method9274(5);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public void method5368() {
		@Pc(6) Class391 local6 = this.aClass391_29;
		synchronized (this.aClass391_29) {
			this.aClass391_29.method9286();
		}
		local6 = this.aClass391_30;
		synchronized (this.aClass391_30) {
			this.aClass391_30.method9286();
		}
		local6 = this.aClass391_31;
		synchronized (this.aClass391_31) {
			this.aClass391_31.method9286();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public void method5370(@OriginalArg(0) int arg0) {
		this.anInt6288 = arg0;
		@Pc(16) Class391 local16 = this.aClass391_30;
		synchronized (this.aClass391_30) {
			this.aClass391_30.method9276(0);
		}
		local16 = this.aClass391_31;
		synchronized (this.aClass391_31) {
			this.aClass391_31.method9276(0);
		}
	}
}
