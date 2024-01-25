import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class128 {

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "Lclient!of;")
	private final Class236 aClass236_34 = new Class236(64);

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_55;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
	public final int anInt4556;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class128(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_55 = arg2;
		this.anInt4556 = this.aClass237_55.method6315(19);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)Lclient!kj;")
	public Class179 method3671(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_34;
		@Pc(16) Class179 local16;
		synchronized (this.aClass236_34) {
			local16 = (Class179) this.aClass236_34.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_55;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_55) {
			local38 = this.aClass237_55.method6314(19, arg0);
		}
		local16 = new Class179();
		if (local38 != null) {
			local16.method4811(new Class8_Sub8(local38));
		}
		@Pc(60) Class236 local60 = this.aClass236_34;
		synchronized (this.aClass236_34) {
			this.aClass236_34.method6241((long) arg0, local16);
			return local16;
		}
	}
}
