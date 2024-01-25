import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class55 {

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!wf;")
	private final Class316 aClass316_11 = new Class316(64);

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Lclient!kda;")
	private final Class160 aClass160_19;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class55(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_19 = arg2;
		this.aClass160_19.method4207(5);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)Lclient!aca;")
	public Class1_Sub1_Sub2 method1979(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_11;
		@Pc(16) Class1_Sub1_Sub2 local16;
		synchronized (this.aClass316_11) {
			local16 = (Class1_Sub1_Sub2) this.aClass316_11.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_19;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_19) {
			local38 = this.aClass160_19.method4198(arg0, 5);
		}
		local16 = new Class1_Sub1_Sub2();
		if (local38 != null) {
			local16.method224(new Class1_Sub13(local38));
		}
		@Pc(68) Class316 local68 = this.aClass316_11;
		synchronized (this.aClass316_11) {
			this.aClass316_11.method7792((long) arg0, local16);
			return local16;
		}
	}
}
