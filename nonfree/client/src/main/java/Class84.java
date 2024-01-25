import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class84 {

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!nj;")
	private final Class171 aClass171_17 = new Class171(256);

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!mg;")
	private final Class160 aClass160_16;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class84(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_16 = arg2;
		this.aClass160_16.method3722(26);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	public void method2054() {
		@Pc(2) Class171 local2 = this.aClass171_17;
		synchronized (this.aClass171_17) {
			this.aClass171_17.method3934();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public void method2055() {
		@Pc(11) Class171 local11 = this.aClass171_17;
		synchronized (this.aClass171_17) {
			this.aClass171_17.method3933(5);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)Lclient!ss;")
	public Class2_Sub5_Sub16 method2057(@OriginalArg(1) int arg0) {
		@Pc(12) Class171 local12 = this.aClass171_17;
		@Pc(22) Class2_Sub5_Sub16 local22;
		synchronized (this.aClass171_17) {
			local22 = (Class2_Sub5_Sub16) this.aClass171_17.method3941((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass160_16.method3696(arg0, 26);
		local22 = new Class2_Sub5_Sub16();
		if (local39 != null) {
			local22.method5011(new Class2_Sub23(local39));
		}
		@Pc(55) Class171 local55 = this.aClass171_17;
		synchronized (this.aClass171_17) {
			this.aClass171_17.method3940((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V")
	public void method2058() {
		@Pc(2) Class171 local2 = this.aClass171_17;
		synchronized (this.aClass171_17) {
			this.aClass171_17.method3936();
		}
	}
}
