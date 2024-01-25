import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class203 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public int anInt5464;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!d;")
	private final Class44 aClass44_56 = new Class44(64);

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!d;")
	public final Class44 aClass44_57 = new Class44(30);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!um;")
	private final Class243 aClass243_188;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!um;")
	public final Class243 aClass243_189;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;)V")
	public Class203(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		this.aClass243_188 = arg2;
		this.aClass243_189 = arg3;
		@Pc(26) int local26 = this.aClass243_188.method5478() - 1;
		this.aClass243_188.method5472(local26);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)Lclient!ek;")
	public Class63 method4360(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_56;
		@Pc(16) Class63 local16;
		synchronized (this.aClass44_56) {
			local16 = (Class63) this.aClass44_56.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_188;
		@Pc(44) byte[] local44;
		synchronized (this.aClass243_188) {
			local44 = this.aClass243_188.method5455(Static263.method3356(arg0), Static445.method2063(arg0));
		}
		local16 = new Class63();
		local16.anInt1713 = arg0;
		local16.aClass203_2 = this;
		if (local44 != null) {
			local16.method1397(new Class5_Sub15(local44));
		}
		@Pc(74) Class44 local74 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	public void method4362() {
		@Pc(2) Class44 local2 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1024();
		}
		local2 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1024();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
	public void method4363() {
		@Pc(6) Class44 local6 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1025(5);
		}
		local6 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1025(5);
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V")
	public void method4364(@OriginalArg(1) int arg0) {
		this.anInt5464 = arg0;
		@Pc(9) Class44 local9 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1031();
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	public void method4365() {
		@Pc(2) Class44 local2 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1031();
		}
		local2 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1031();
		}
	}
}
