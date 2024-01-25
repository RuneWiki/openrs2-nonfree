import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class58 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!d;")
	private final Class44 aClass44_17 = new Class44(256);

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!um;")
	private final Class243 aClass243_56;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class58(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_56 = arg2;
		this.aClass243_56.method5472(26);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)Lclient!ng;")
	public Class5_Sub2_Sub11 method1318(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_17;
		@Pc(16) Class5_Sub2_Sub11 local16;
		synchronized (this.aClass44_17) {
			local16 = (Class5_Sub2_Sub11) this.aClass44_17.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_56;
		@Pc(38) byte[] local38;
		synchronized (this.aClass243_56) {
			local38 = this.aClass243_56.method5455(arg0, 26);
		}
		local16 = new Class5_Sub2_Sub11();
		if (local38 != null) {
			local16.method3448(new Class5_Sub15(local38));
		}
		@Pc(60) Class44 local60 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public void method1320() {
		@Pc(8) Class44 local8 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1031();
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
	public void method1321() {
		@Pc(12) Class44 local12 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1025(5);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public void method1322() {
		@Pc(6) Class44 local6 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1024();
		}
	}
}
