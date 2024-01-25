import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class220 {

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!gg;")
	private final Class112 aClass112_38 = new Class112(64);

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!kha;")
	private final Class181 aClass181_66;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class220(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_66 = arg2;
		this.aClass181_66.method5025(31);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)Lclient!ui;")
	public Class337 method5815(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_38;
		@Pc(16) Class337 local16;
		synchronized (this.aClass112_38) {
			local16 = (Class337) this.aClass112_38.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_66;
		@Pc(40) byte[] local40;
		synchronized (this.aClass181_66) {
			local40 = this.aClass181_66.method5023(31, arg0);
		}
		local16 = new Class337();
		if (local40 != null) {
			local16.method8008(new Class3_Sub15(local40));
		}
		@Pc(62) Class112 local62 = this.aClass112_38;
		synchronized (this.aClass112_38) {
			this.aClass112_38.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	public void method5816() {
		@Pc(10) Class112 local10 = this.aClass112_38;
		synchronized (this.aClass112_38) {
			this.aClass112_38.method3643();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public void method5818() {
		@Pc(2) Class112 local2 = this.aClass112_38;
		synchronized (this.aClass112_38) {
			this.aClass112_38.method3637(5);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	public void method5819() {
		@Pc(6) Class112 local6 = this.aClass112_38;
		synchronized (this.aClass112_38) {
			this.aClass112_38.method3638();
		}
	}
}
