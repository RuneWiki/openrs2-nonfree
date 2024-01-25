import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class378 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_70 = new Class112(64);

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!kha;")
	private final Class181 aClass181_134;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public final int anInt10520;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class378(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_134 = arg2;
		this.anInt10520 = this.aClass181_134.method5025(19);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lclient!lm;")
	public Class203 method8645(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_70;
		@Pc(18) Class203 local18;
		synchronized (this.aClass112_70) {
			local18 = (Class203) this.aClass112_70.method3640((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class181 local31 = this.aClass181_134;
		@Pc(40) byte[] local40;
		synchronized (this.aClass181_134) {
			local40 = this.aClass181_134.method5023(19, arg0);
		}
		local18 = new Class203();
		if (local40 != null) {
			local18.method5441(new Class3_Sub15(local40));
		}
		@Pc(62) Class112 local62 = this.aClass112_70;
		synchronized (this.aClass112_70) {
			this.aClass112_70.method3636((long) arg0, local18);
			return local18;
		}
	}
}
