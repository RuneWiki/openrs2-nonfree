import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class216 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!wg;")
	private final Class313 aClass313_39 = new Class313(64);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!kr;")
	private final Class171 aClass171_97;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class216(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_97 = arg2;
		if (this.aClass171_97 != null) {
			this.aClass171_97.method4349(35);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public void method5172() {
		@Pc(2) Class313 local2 = this.aClass313_39;
		synchronized (this.aClass313_39) {
			this.aClass313_39.method7403(5);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public void method5174() {
		@Pc(10) Class313 local10 = this.aClass313_39;
		synchronized (this.aClass313_39) {
			this.aClass313_39.method7398();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Lclient!pu;")
	public Class240 method5177(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_39;
		@Pc(16) Class240 local16;
		synchronized (this.aClass313_39) {
			local16 = (Class240) this.aClass313_39.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_97;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_97) {
			local38 = this.aClass171_97.method4339(35, arg0);
		}
		local16 = new Class240();
		if (local38 != null) {
			local16.method5759(new Class1_Sub6(local38));
		}
		local16.method5764();
		@Pc(68) Class313 local68 = this.aClass313_39;
		synchronized (this.aClass313_39) {
			this.aClass313_39.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	public void method5179() {
		@Pc(11) Class313 local11 = this.aClass313_39;
		synchronized (this.aClass313_39) {
			this.aClass313_39.method7400();
		}
	}
}
