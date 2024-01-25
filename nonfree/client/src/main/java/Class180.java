import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class180 {

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!d;")
	private final Class44 aClass44_43 = new Class44(64);

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!d;")
	public final Class44 aClass44_44 = new Class44(50);

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Lclient!d;")
	public final Class44 aClass44_45 = new Class44(5);

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Lclient!pt;")
	public final Class197 aClass197_3;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
	public boolean aBoolean331;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!um;")
	private final Class243 aClass243_164;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Lclient!um;")
	public final Class243 aClass243_165;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!pt;IZLclient!um;Lclient!um;)V")
	public Class180(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class243 arg4) {
		this.aClass197_3 = arg0;
		this.aBoolean331 = arg2;
		this.aClass243_164 = arg3;
		this.aClass243_165 = arg4;
		if (this.aClass243_164 != null) {
			@Pc(41) int local41 = this.aClass243_164.method5478() - 1;
			this.aClass243_164.method5472(local41);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public void method3712() {
		@Pc(2) Class44 local2 = this.aClass44_43;
		synchronized (this.aClass44_43) {
			this.aClass44_43.method1024();
		}
		local2 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1024();
		}
		local2 = this.aClass44_45;
		synchronized (this.aClass44_45) {
			this.aClass44_45.method1024();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lclient!ju;")
	public Class131 method3713(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_43;
		@Pc(16) Class131 local16;
		synchronized (this.aClass44_43) {
			local16 = (Class131) this.aClass44_43.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_164;
		@Pc(44) byte[] local44;
		synchronized (this.aClass243_164) {
			local44 = this.aClass243_164.method5455(Static86.method1263(arg0), Static294.method3672(arg0));
		}
		local16 = new Class131();
		local16.aClass180_2 = this;
		local16.anInt3478 = arg0;
		if (local44 != null) {
			local16.method2785(new Class5_Sub15(local44));
		}
		local16.method2783();
		@Pc(81) Class44 local81 = this.aClass44_43;
		synchronized (this.aClass44_43) {
			this.aClass44_43.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
	public void method3715(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean331 != arg0) {
			this.aBoolean331 = arg0;
			this.method3716();
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public void method3716() {
		@Pc(6) Class44 local6 = this.aClass44_43;
		synchronized (this.aClass44_43) {
			this.aClass44_43.method1031();
		}
		local6 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1031();
		}
		local6 = this.aClass44_45;
		synchronized (this.aClass44_45) {
			this.aClass44_45.method1031();
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public void method3717() {
		@Pc(6) Class44 local6 = this.aClass44_43;
		synchronized (this.aClass44_43) {
			this.aClass44_43.method1025(5);
		}
		local6 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1025(5);
		}
		local6 = this.aClass44_45;
		synchronized (this.aClass44_45) {
			this.aClass44_45.method1025(5);
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	public void method3718() {
		@Pc(2) Class44 local2 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1031();
		}
		local2 = this.aClass44_45;
		synchronized (this.aClass44_45) {
			this.aClass44_45.method1031();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)V")
	public void method3719(@OriginalArg(0) int arg0) {
		this.anInt4683 = arg0;
		@Pc(9) Class44 local9 = this.aClass44_44;
		synchronized (this.aClass44_44) {
			this.aClass44_44.method1031();
		}
		local9 = this.aClass44_45;
		synchronized (this.aClass44_45) {
			this.aClass44_45.method1031();
		}
	}
}
