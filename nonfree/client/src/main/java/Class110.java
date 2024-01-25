import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class110 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!gg;")
	private final Class112 aClass112_18 = new Class112(64);

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!gg;")
	public final Class112 aClass112_19 = new Class112(2);

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!kha;")
	public final Class181 aClass181_37;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!kha;")
	private final Class181 aClass181_38;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class110(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_37 = arg3;
		this.aClass181_38 = arg2;
		this.aClass181_38.method5025(33);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method3574() {
		@Pc(6) Class112 local6 = this.aClass112_18;
		synchronized (this.aClass112_18) {
			this.aClass112_18.method3643();
		}
		local6 = this.aClass112_19;
		synchronized (this.aClass112_19) {
			this.aClass112_19.method3643();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Lclient!taa;")
	public Class314 method3575(@OriginalArg(1) int arg0) {
		@Pc(11) Class112 local11 = this.aClass112_18;
		@Pc(23) Class314 local23;
		synchronized (this.aClass112_18) {
			local23 = (Class314) this.aClass112_18.method3640((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class181 local36 = this.aClass181_38;
		@Pc(45) byte[] local45;
		synchronized (this.aClass181_38) {
			local45 = this.aClass181_38.method5023(33, arg0);
		}
		local23 = new Class314();
		local23.aClass110_4 = this;
		if (local45 != null) {
			local23.method7548(new Class3_Sub15(local45));
		}
		@Pc(70) Class112 local70 = this.aClass112_18;
		synchronized (this.aClass112_18) {
			this.aClass112_18.method3636((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public void method3577() {
		@Pc(7) Class112 local7 = this.aClass112_18;
		synchronized (this.aClass112_18) {
			this.aClass112_18.method3638();
		}
		local7 = this.aClass112_19;
		synchronized (this.aClass112_19) {
			this.aClass112_19.method3638();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public void method3579() {
		@Pc(12) Class112 local12 = this.aClass112_18;
		synchronized (this.aClass112_18) {
			this.aClass112_18.method3637(5);
		}
		local12 = this.aClass112_19;
		synchronized (this.aClass112_19) {
			this.aClass112_19.method3637(5);
		}
	}
}
