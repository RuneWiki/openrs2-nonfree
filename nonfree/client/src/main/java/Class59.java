import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class59 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!tja;")
	private Class352 aClass352_12 = new Class352(128);

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Lclient!tja;")
	public Class352 aClass352_13 = new Class352(64);

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!bt;")
	public final Class34 aClass34_19;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_18;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class59(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_19 = arg3;
		this.aClass34_18 = arg2;
		this.aClass34_18.method1233(36);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
	public void method1792() {
		@Pc(6) Class352 local6 = this.aClass352_12;
		synchronized (this.aClass352_12) {
			this.aClass352_12.method7663(5);
		}
		local6 = this.aClass352_13;
		synchronized (this.aClass352_13) {
			this.aClass352_13.method7663(5);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method1795() {
		@Pc(2) Class352 local2 = this.aClass352_12;
		synchronized (this.aClass352_12) {
			this.aClass352_12.method7659();
		}
		local2 = this.aClass352_13;
		synchronized (this.aClass352_13) {
			this.aClass352_13.method7659();
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public void method1796() {
		@Pc(2) Class352 local2 = this.aClass352_12;
		synchronized (this.aClass352_12) {
			this.aClass352_12.method7656();
		}
		local2 = this.aClass352_13;
		synchronized (this.aClass352_13) {
			this.aClass352_13.method7656();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIB)V")
	public void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass352_12 = new Class352(arg0);
		this.aClass352_13 = new Class352(arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lclient!oaa;")
	public Class259 method1798(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_12;
		@Pc(16) Class259 local16;
		synchronized (this.aClass352_12) {
			local16 = (Class259) this.aClass352_12.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_18;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_18) {
			local38 = this.aClass34_18.method1239(36, arg0);
		}
		local16 = new Class259();
		local16.aClass59_3 = this;
		local16.anInt6659 = arg0;
		if (local38 != null) {
			local16.method5865(new Class4_Sub11(local38));
		}
		local16.method5873();
		@Pc(69) Class352 local69 = this.aClass352_12;
		synchronized (this.aClass352_12) {
			this.aClass352_12.method7655((long) arg0, local16);
			return local16;
		}
	}
}
