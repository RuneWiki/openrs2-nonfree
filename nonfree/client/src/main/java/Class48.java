import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class48 {

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Lclient!bh;")
	private final Class32 aClass32_12 = new Class32(64);

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_18;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public final int anInt1175;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class48(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_18 = arg2;
		this.anInt1175 = this.aClass380_18.method8631(19);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)Lclient!sk;")
	public Class321 method919(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_12;
		@Pc(16) Class321 local16;
		synchronized (this.aClass32_12) {
			local16 = (Class321) this.aClass32_12.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_18;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_18) {
			local38 = this.aClass380_18.method8620(19, arg0);
		}
		local16 = new Class321();
		if (local38 != null) {
			local16.method7269(new Class2_Sub22(local38));
		}
		@Pc(68) Class32 local68 = this.aClass32_12;
		synchronized (this.aClass32_12) {
			this.aClass32_12.method629(local16, (long) arg0);
			return local16;
		}
	}
}
