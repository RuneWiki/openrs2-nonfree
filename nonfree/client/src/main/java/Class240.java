import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class240 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!wf;")
	private final Class316 aClass316_52 = new Class316(128);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!kda;")
	private final Class160 aClass160_81;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class240(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_81 = arg2;
		if (this.aClass160_81 != null) {
			@Pc(20) int local20 = this.aClass160_81.method4206() - 1;
			this.aClass160_81.method4207(local20);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!mi;")
	public Class193 method5913(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_52;
		@Pc(16) Class193 local16;
		synchronized (this.aClass316_52) {
			local16 = (Class193) this.aClass316_52.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass160_81.method4198(Static108.method2362(arg0), Static212.method3831(arg0));
		local16 = new Class193();
		if (local43 != null) {
			local16.method5036(new Class1_Sub13(local43));
		}
		@Pc(59) Class316 local59 = this.aClass316_52;
		synchronized (this.aClass316_52) {
			this.aClass316_52.method7792((long) arg0, local16);
			return local16;
		}
	}
}
