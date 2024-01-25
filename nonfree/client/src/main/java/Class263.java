import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class263 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!wf;")
	private final Class316 aClass316_56 = new Class316(64);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!kda;")
	private final Class160 aClass160_89;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	public final int anInt7458;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class263(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_89 = arg2;
		this.anInt7458 = this.aClass160_89.method4207(19);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lclient!ll;")
	public Class180 method6375(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_56;
		@Pc(16) Class180 local16;
		synchronized (this.aClass316_56) {
			local16 = (Class180) this.aClass316_56.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_89;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_89) {
			local38 = this.aClass160_89.method4198(arg0, 19);
		}
		local16 = new Class180();
		if (local38 != null) {
			local16.method4747(new Class1_Sub13(local38));
		}
		@Pc(60) Class316 local60 = this.aClass316_56;
		synchronized (this.aClass316_56) {
			this.aClass316_56.method7792((long) arg0, local16);
			return local16;
		}
	}
}
