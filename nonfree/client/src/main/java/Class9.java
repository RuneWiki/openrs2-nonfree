import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class9 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!gg;")
	private final Class112 aClass112_4 = new Class112(64);

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class9(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_1 = arg2;
		this.aClass181_1.method5025(5);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lclient!bu;")
	public Class3_Sub1_Sub1 method105(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_4;
		@Pc(16) Class3_Sub1_Sub1 local16;
		synchronized (this.aClass112_4) {
			local16 = (Class3_Sub1_Sub1) this.aClass112_4.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_1) {
			local38 = this.aClass181_1.method5023(5, arg0);
		}
		local16 = new Class3_Sub1_Sub1();
		if (local38 != null) {
			local16.method1163(new Class3_Sub15(local38));
		}
		@Pc(60) Class112 local60 = this.aClass112_4;
		synchronized (this.aClass112_4) {
			this.aClass112_4.method3636((long) arg0, local16);
			return local16;
		}
	}
}
