import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class130 {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!jp;")
	private final Class129 aClass129_31 = new Class129(64);

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!pc;")
	private final Class188 aClass188_53;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class130(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_53 = arg2;
		this.aClass188_53.method4285(5);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!sm;")
	public Class2_Sub2_Sub18 method3041(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_31;
		@Pc(16) Class2_Sub2_Sub18 local16;
		synchronized (this.aClass129_31) {
			local16 = (Class2_Sub2_Sub18) this.aClass129_31.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_53.method4283(5, arg0);
		local16 = new Class2_Sub2_Sub18();
		if (local33 != null) {
			local16.method5063(new Class2_Sub20(local33));
		}
		@Pc(49) Class129 local49 = this.aClass129_31;
		synchronized (this.aClass129_31) {
			this.aClass129_31.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
