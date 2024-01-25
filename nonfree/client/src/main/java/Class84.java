import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class84 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!of;")
	private Class188 aClass188_25 = new Class188(128);

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!of;")
	public Class188 aClass188_26 = new Class188(64);

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!mn;")
	private final Class171 aClass171_33;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Lclient!mn;")
	public final Class171 aClass171_32;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;)V")
	public Class84(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_33 = arg2;
		this.aClass171_32 = arg3;
		this.aClass171_33.method3662(36);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
	public void method1950() {
		@Pc(11) Class188 local11 = this.aClass188_25;
		synchronized (this.aClass188_25) {
			this.aClass188_25.method4169(5);
		}
		local11 = this.aClass188_26;
		synchronized (this.aClass188_26) {
			this.aClass188_26.method4169(5);
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public void method1951() {
		@Pc(6) Class188 local6 = this.aClass188_25;
		synchronized (this.aClass188_25) {
			this.aClass188_25.method4154();
		}
		local6 = this.aClass188_26;
		synchronized (this.aClass188_26) {
			this.aClass188_26.method4154();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	public void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass188_25 = new Class188(arg1);
		this.aClass188_26 = new Class188(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)Lclient!qg;")
	public Class203 method1953(@OriginalArg(0) int arg0) {
		@Pc(11) Class188 local11 = this.aClass188_25;
		@Pc(21) Class203 local21;
		synchronized (this.aClass188_25) {
			local21 = (Class203) this.aClass188_25.method4158((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class171 local34 = this.aClass171_33;
		@Pc(47) byte[] local47;
		synchronized (this.aClass171_33) {
			local47 = this.aClass171_33.method3658(36, arg0);
		}
		local21 = new Class203();
		local21.anInt5947 = arg0;
		local21.aClass84_3 = this;
		if (local47 != null) {
			local21.method4743(new Class2_Sub17(local47));
		}
		local21.method4741();
		@Pc(78) Class188 local78 = this.aClass188_25;
		synchronized (this.aClass188_25) {
			this.aClass188_25.method4155((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
	public void method1954() {
		@Pc(6) Class188 local6 = this.aClass188_25;
		synchronized (this.aClass188_25) {
			this.aClass188_25.method4156();
		}
		local6 = this.aClass188_26;
		synchronized (this.aClass188_26) {
			this.aClass188_26.method4156();
		}
	}
}
