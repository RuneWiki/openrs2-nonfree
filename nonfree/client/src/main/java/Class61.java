import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class61 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!wg;")
	private final Class313 aClass313_8 = new Class313(128);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!kr;")
	private final Class171 aClass171_35;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class61(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_35 = arg2;
		this.aClass171_35.method4349(1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public void method1452() {
		@Pc(11) Class313 local11 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method7403(5);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public void method1455() {
		@Pc(2) Class313 local2 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method7400();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method1456() {
		@Pc(14) Class313 local14 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method7398();
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Lclient!iv;")
	public Class146 method1458(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_8;
		@Pc(16) Class146 local16;
		synchronized (this.aClass313_8) {
			local16 = (Class146) this.aClass313_8.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class171 local35 = this.aClass171_35;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_35) {
			local44 = this.aClass171_35.method4339(1, arg0);
		}
		local16 = new Class146();
		if (local44 != null) {
			local16.method3731(new Class1_Sub6(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method7399((long) arg0, local16);
			return local16;
		}
	}
}
