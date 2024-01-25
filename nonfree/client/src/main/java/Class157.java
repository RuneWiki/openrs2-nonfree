import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class157 {

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Lclient!bh;")
	private final Class32 aClass32_42 = new Class32(16);

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_63;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class157(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_63 = arg2;
		this.aClass380_63.method8631(29);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public void method3381() {
		@Pc(6) Class32 local6 = this.aClass32_42;
		synchronized (this.aClass32_42) {
			this.aClass32_42.method640();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!mj;IZII)Lclient!iw;")
	public Class160 method3384(@OriginalArg(0) int arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class340[] local7 = null;
		@Pc(19) Class204 local19 = this.method3385(arg4);
		if (local19.anIntArray346 != null) {
			local7 = new Class340[local19.anIntArray346.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(39) Class164 local39 = arg1.method4715(local19.anIntArray346[local29]);
				local7[local29] = new Class340(local39.anInt4058, local39.anInt4062, local39.anInt4056, local39.anInt4059, local39.anInt4063, local39.anInt4064, local39.anInt4057, local39.aBoolean289);
			}
		}
		return new Class160(local19.anInt5040, local7, local19.anInt5042, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)Lclient!lda;")
	private Class204 method3385(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_42;
		@Pc(16) Class204 local16;
		synchronized (this.aClass32_42) {
			local16 = (Class204) this.aClass32_42.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_63;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_63) {
			local38 = this.aClass380_63.method8620(29, arg0);
		}
		local16 = new Class204();
		if (local38 != null) {
			local16.method4249(new Class2_Sub22(local38));
		}
		@Pc(60) Class32 local60 = this.aClass32_42;
		synchronized (this.aClass32_42) {
			this.aClass32_42.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
	public void method3386() {
		@Pc(2) Class32 local2 = this.aClass32_42;
		synchronized (this.aClass32_42) {
			this.aClass32_42.method634(5);
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public void method3388() {
		@Pc(6) Class32 local6 = this.aClass32_42;
		synchronized (this.aClass32_42) {
			this.aClass32_42.method632();
		}
	}
}
