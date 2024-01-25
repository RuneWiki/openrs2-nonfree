import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class259 {

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!nj;")
	private final Class171 aClass171_59 = new Class171(64);

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!mg;")
	private final Class160 aClass160_87;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!mg;")
	public final Class160 aClass160_88;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;)V")
	public Class259(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_87 = arg2;
		this.aClass160_88 = arg3;
		this.aClass160_87.method3722(3);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!g;")
	public Class88 method5676(@OriginalArg(1) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_59;
		@Pc(16) Class88 local16;
		synchronized (this.aClass171_59) {
			local16 = (Class88) this.aClass171_59.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass160_87.method3696(arg0, 3);
		local16 = new Class88();
		local16.aClass259_1 = this;
		if (local41 != null) {
			local16.method2099(new Class2_Sub23(local41));
		}
		@Pc(60) Class171 local60 = this.aClass171_59;
		synchronized (this.aClass171_59) {
			this.aClass171_59.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public void method5677() {
		@Pc(12) Class171 local12 = this.aClass171_59;
		synchronized (this.aClass171_59) {
			this.aClass171_59.method3933(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public void method5680() {
		@Pc(6) Class171 local6 = this.aClass171_59;
		synchronized (this.aClass171_59) {
			this.aClass171_59.method3936();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method5682() {
		@Pc(2) Class171 local2 = this.aClass171_59;
		synchronized (this.aClass171_59) {
			this.aClass171_59.method3934();
		}
	}
}
