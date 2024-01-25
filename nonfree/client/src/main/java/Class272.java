import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class272 {

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!wg;")
	private Class313 aClass313_57 = new Class313(128);

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Lclient!wg;")
	public Class313 aClass313_58 = new Class313(64);

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!kr;")
	private final Class171 aClass171_138;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!kr;")
	public final Class171 aClass171_139;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;)V")
	public Class272(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_138 = arg2;
		this.aClass171_139 = arg3;
		this.aClass171_138.method4349(36);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
	public void method6377() {
		@Pc(6) Class313 local6 = this.aClass313_57;
		synchronized (this.aClass313_57) {
			this.aClass313_57.method7400();
		}
		local6 = this.aClass313_58;
		synchronized (this.aClass313_58) {
			this.aClass313_58.method7400();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZI)V")
	public void method6378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass313_57 = new Class313(arg1);
		this.aClass313_58 = new Class313(arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
	public void method6379() {
		@Pc(2) Class313 local2 = this.aClass313_57;
		synchronized (this.aClass313_57) {
			this.aClass313_57.method7403(5);
		}
		local2 = this.aClass313_58;
		synchronized (this.aClass313_58) {
			this.aClass313_58.method7403(5);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lclient!bl;")
	public Class30 method6380(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_57;
		@Pc(16) Class30 local16;
		synchronized (this.aClass313_57) {
			local16 = (Class30) this.aClass313_57.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_138;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_138) {
			local38 = this.aClass171_138.method4339(36, arg0);
		}
		local16 = new Class30();
		local16.anInt888 = arg0;
		local16.aClass272_3 = this;
		if (local38 != null) {
			local16.method911(new Class1_Sub6(local38));
		}
		local16.method912();
		@Pc(73) Class313 local73 = this.aClass313_57;
		synchronized (this.aClass313_57) {
			this.aClass313_57.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	public void method6381() {
		@Pc(2) Class313 local2 = this.aClass313_57;
		synchronized (this.aClass313_57) {
			this.aClass313_57.method7398();
		}
		local2 = this.aClass313_58;
		synchronized (this.aClass313_58) {
			this.aClass313_58.method7398();
		}
	}
}
