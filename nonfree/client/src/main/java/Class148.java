import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class148 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!tja;")
	private final Class352 aClass352_32 = new Class352(256);

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!bt;")
	private final Class34 aClass34_54;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class148(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_54 = arg2;
		this.aClass34_54.method1233(26);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!vq;")
	public Class4_Sub5_Sub19 method3258(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_32;
		@Pc(16) Class4_Sub5_Sub19 local16;
		synchronized (this.aClass352_32) {
			local16 = (Class4_Sub5_Sub19) this.aClass352_32.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_54;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_54) {
			local38 = this.aClass34_54.method1239(26, arg0);
		}
		local16 = new Class4_Sub5_Sub19();
		if (local38 != null) {
			local16.method8588(new Class4_Sub11(local38));
		}
		@Pc(60) Class352 local60 = this.aClass352_32;
		synchronized (this.aClass352_32) {
			this.aClass352_32.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3259() {
		@Pc(6) Class352 local6 = this.aClass352_32;
		synchronized (this.aClass352_32) {
			this.aClass352_32.method7659();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public void method3261() {
		@Pc(2) Class352 local2 = this.aClass352_32;
		synchronized (this.aClass352_32) {
			this.aClass352_32.method7663(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method3262() {
		@Pc(10) Class352 local10 = this.aClass352_32;
		synchronized (this.aClass352_32) {
			this.aClass352_32.method7656();
		}
	}
}
