import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class126 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!wf;")
	private final Class316 aClass316_23 = new Class316(64);

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "Lclient!wf;")
	private final Class316 aClass316_24 = new Class316(100);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!kda;")
	private final Class160 aClass160_42;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;Lclient!kda;Lclient!kda;)V")
	public Class126(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aClass160_42 = arg2;
		if (this.aClass160_42 != null) {
			@Pc(26) int local26 = this.aClass160_42.method4206() - 1;
			this.aClass160_42.method4207(local26);
		}
		Static481.method6968(arg4, arg3);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	public void method3568() {
		@Pc(6) Class316 local6 = this.aClass316_23;
		synchronized (this.aClass316_23) {
			this.aClass316_23.method7803();
		}
		local6 = this.aClass316_24;
		synchronized (this.aClass316_24) {
			this.aClass316_24.method7803();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
	public void method3569() {
		@Pc(2) Class316 local2 = this.aClass316_23;
		synchronized (this.aClass316_23) {
			this.aClass316_23.method7791(5);
		}
		local2 = this.aClass316_24;
		synchronized (this.aClass316_24) {
			this.aClass316_24.method7791(5);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	public void method3572() {
		@Pc(6) Class316 local6 = this.aClass316_23;
		synchronized (this.aClass316_23) {
			this.aClass316_23.method7794();
		}
		local6 = this.aClass316_24;
		synchronized (this.aClass316_24) {
			this.aClass316_24.method7794();
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)Lclient!gm;")
	public Class1_Sub1_Sub8 method3573(@OriginalArg(0) int arg0) {
		@Pc(14) Class316 local14 = this.aClass316_24;
		@Pc(24) Class1_Sub1_Sub8 local24;
		synchronized (this.aClass316_24) {
			local24 = (Class1_Sub1_Sub8) this.aClass316_24.method7799((long) arg0);
			if (local24 == null) {
				local24 = new Class1_Sub1_Sub8(arg0);
				this.aClass316_24.method7792((long) arg0, local24);
			}
		}
		synchronized (local24) {
			return local24.method3250() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(II)Lclient!tt;")
	public Class280 method3574(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_23;
		@Pc(16) Class280 local16;
		synchronized (this.aClass316_23) {
			local16 = (Class280) this.aClass316_23.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class160 local35 = this.aClass160_42;
		@Pc(48) byte[] local48;
		synchronized (this.aClass160_42) {
			local48 = this.aClass160_42.method4198(Static177.method3374(arg0), Static5.method212(arg0));
		}
		local16 = new Class280();
		local16.anInt8107 = arg0;
		local16.aClass126_2 = this;
		if (local48 != null) {
			local16.method6880(new Class1_Sub13(local48));
		}
		local16.method6877();
		@Pc(79) Class316 local79 = this.aClass316_23;
		synchronized (this.aClass316_23) {
			this.aClass316_23.method7792((long) arg0, local16);
			return local16;
		}
	}
}
