import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class101 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ng;")
	private Class167 aClass167_41 = new Class167(128);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!ng;")
	public Class167 aClass167_42 = new Class167(64);

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!ic;")
	public final Class113 aClass113_51;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!ic;")
	private final Class113 aClass113_50;

	static {
		new Class151("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;)V")
	public Class101(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3) {
		this.aClass113_51 = arg3;
		this.aClass113_50 = arg2;
		this.aClass113_50.method2271(36);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public void method2103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass167_41 = new Class167(arg0);
		this.aClass167_42 = new Class167(arg1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lclient!dt;")
	public Class56 method2104(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_41;
		@Pc(16) Class56 local16;
		synchronized (this.aClass167_41) {
			local16 = (Class56) this.aClass167_41.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_50.method2274(36, arg0);
		local16 = new Class56();
		local16.anInt1480 = arg0;
		local16.aClass101_1 = this;
		if (local33 != null) {
			local16.method1232(new Class1_Sub11(local33));
		}
		local16.method1227();
		@Pc(63) Class167 local63 = this.aClass167_41;
		synchronized (this.aClass167_41) {
			this.aClass167_41.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public void method2105() {
		@Pc(6) Class167 local6 = this.aClass167_41;
		synchronized (this.aClass167_41) {
			this.aClass167_41.method3384(5);
		}
		local6 = this.aClass167_42;
		synchronized (this.aClass167_42) {
			this.aClass167_42.method3384(5);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public void method2107() {
		@Pc(6) Class167 local6 = this.aClass167_41;
		synchronized (this.aClass167_41) {
			this.aClass167_41.method3389();
		}
		local6 = this.aClass167_42;
		synchronized (this.aClass167_42) {
			this.aClass167_42.method3389();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method2108() {
		@Pc(2) Class167 local2 = this.aClass167_41;
		synchronized (this.aClass167_41) {
			this.aClass167_41.method3390();
		}
		local2 = this.aClass167_42;
		synchronized (this.aClass167_42) {
			this.aClass167_42.method3390();
		}
	}
}
