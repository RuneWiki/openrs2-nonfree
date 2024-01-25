import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class213 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!ng;")
	private final Class167 aClass167_81 = new Class167(64);

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!ng;")
	private final Class167 aClass167_82 = new Class167(100);

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!ic;")
	private final Class113 aClass113_106;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;Lclient!ic;)V")
	public Class213(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class113 arg4) {
		this.aClass113_106 = arg2;
		if (this.aClass113_106 != null) {
			@Pc(26) int local26 = this.aClass113_106.method2272() - 1;
			this.aClass113_106.method2271(local26);
		}
		Static11.method182(arg4, arg3);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method4408() {
		@Pc(2) Class167 local2 = this.aClass167_81;
		synchronized (this.aClass167_81) {
			this.aClass167_81.method3389();
		}
		local2 = this.aClass167_82;
		synchronized (this.aClass167_82) {
			this.aClass167_82.method3389();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!nm;")
	public Class171 method4410(@OriginalArg(0) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_81;
		@Pc(21) Class171 local21;
		synchronized (this.aClass167_81) {
			local21 = (Class171) this.aClass167_81.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(44) byte[] local44 = this.aClass113_106.method2274(Static336.method4289(arg0), Static76.method1199(arg0));
		local21 = new Class171();
		local21.anInt4250 = arg0;
		local21.aClass213_2 = this;
		if (local44 != null) {
			local21.method3429(new Class1_Sub11(local44));
		}
		local21.method3433();
		@Pc(71) Class167 local71 = this.aClass167_81;
		synchronized (this.aClass167_81) {
			this.aClass167_81.method3392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public void method4411() {
		@Pc(6) Class167 local6 = this.aClass167_81;
		synchronized (this.aClass167_81) {
			this.aClass167_81.method3390();
		}
		local6 = this.aClass167_82;
		synchronized (this.aClass167_82) {
			this.aClass167_82.method3390();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Lclient!lo;")
	public Class1_Sub3_Sub11 method4412(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_82;
		@Pc(16) Class1_Sub3_Sub11 local16;
		synchronized (this.aClass167_82) {
			local16 = (Class1_Sub3_Sub11) this.aClass167_82.method3386((long) arg0);
			if (local16 == null) {
				local16 = new Class1_Sub3_Sub11(arg0);
				this.aClass167_82.method3392(local16, (long) arg0);
			}
		}
		synchronized (local16) {
			return local16.method3069() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public void method4413() {
		@Pc(6) Class167 local6 = this.aClass167_81;
		synchronized (this.aClass167_81) {
			this.aClass167_81.method3384(5);
		}
		local6 = this.aClass167_82;
		synchronized (this.aClass167_82) {
			this.aClass167_82.method3384(5);
		}
	}
}
