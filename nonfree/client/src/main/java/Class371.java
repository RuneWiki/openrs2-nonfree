import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class371 {

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt10088;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	public boolean aBoolean820 = false;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!qr;")
	private Class293 aClass293_70 = new Class293(64);

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!qr;")
	public final Class293 aClass293_71 = new Class293(500);

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!qr;")
	public final Class293 aClass293_72 = new Class293(30);

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Lclient!qr;")
	public final Class293 aClass293_73 = new Class293(50);

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!wu;")
	public final Class384 aClass384_135;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
	public boolean aBoolean821;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!wu;")
	private final Class384 aClass384_136;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ms;IZLclient!wu;Lclient!wu;)V")
	public Class371(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class384 arg3, @OriginalArg(4) Class384 arg4) {
		this.aClass384_135 = arg4;
		this.aBoolean821 = arg2;
		this.aClass384_136 = arg3;
		if (this.aClass384_136 != null) {
			@Pc(47) int local47 = this.aClass384_136.method8865() - 1;
			this.aClass384_136.method8862(local47);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
	public void method8553(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean821 != arg0) {
			this.aBoolean821 = arg0;
			this.method8559();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lclient!qfa;")
	public Class283 method8554(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_70;
		@Pc(16) Class283 local16;
		synchronized (this.aClass293_70) {
			local16 = (Class283) this.aClass293_70.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_136;
		@Pc(42) byte[] local42;
		synchronized (this.aClass384_136) {
			local42 = this.aClass384_136.method8885(Static569.method6637(arg0), Static490.method7196(arg0));
		}
		local16 = new Class283();
		local16.anInt7807 = arg0;
		local16.aClass371_3 = this;
		if (local42 != null) {
			local16.method6848(new Class5_Sub12(local42));
		}
		local16.method6845();
		if (local16.aBoolean649) {
			local16.anInt7835 = 0;
			local16.aBoolean655 = false;
		}
		if (!this.aBoolean821 && local16.aBoolean640) {
			local16.aStringArray34 = null;
			local16.anIntArray621 = null;
		}
		@Pc(94) Class293 local94 = this.aClass293_70;
		synchronized (this.aClass293_70) {
			this.aClass293_70.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method8555() {
		@Pc(11) Class293 local11 = this.aClass293_70;
		synchronized (this.aClass293_70) {
			this.aClass293_70.method6922(5);
		}
		local11 = this.aClass293_71;
		synchronized (this.aClass293_71) {
			this.aClass293_71.method6922(5);
		}
		local11 = this.aClass293_72;
		synchronized (this.aClass293_72) {
			this.aClass293_72.method6922(5);
		}
		local11 = this.aClass293_73;
		synchronized (this.aClass293_73) {
			this.aClass293_73.method6922(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public void method8556(@OriginalArg(0) int arg0) {
		this.anInt10088 = arg0;
		@Pc(17) Class293 local17 = this.aClass293_71;
		synchronized (this.aClass293_71) {
			this.aClass293_71.method6930();
		}
		local17 = this.aClass293_72;
		synchronized (this.aClass293_72) {
			this.aClass293_72.method6930();
		}
		local17 = this.aClass293_73;
		synchronized (this.aClass293_73) {
			this.aClass293_73.method6930();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public void method8557() {
		@Pc(6) Class293 local6 = this.aClass293_70;
		synchronized (this.aClass293_70) {
			this.aClass293_70.method6927();
		}
		local6 = this.aClass293_71;
		synchronized (this.aClass293_71) {
			this.aClass293_71.method6927();
		}
		local6 = this.aClass293_72;
		synchronized (this.aClass293_72) {
			this.aClass293_72.method6927();
		}
		local6 = this.aClass293_73;
		synchronized (this.aClass293_73) {
			this.aClass293_73.method6927();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IZ)V")
	public void method8558(@OriginalArg(0) int arg0) {
		this.aClass293_70 = new Class293(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method8559() {
		@Pc(2) Class293 local2 = this.aClass293_70;
		synchronized (this.aClass293_70) {
			this.aClass293_70.method6930();
		}
		local2 = this.aClass293_71;
		synchronized (this.aClass293_71) {
			this.aClass293_71.method6930();
		}
		local2 = this.aClass293_72;
		synchronized (this.aClass293_72) {
			this.aClass293_72.method6930();
		}
		local2 = this.aClass293_73;
		synchronized (this.aClass293_73) {
			this.aClass293_73.method6930();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V")
	public void method8561(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean820 != arg0) {
			this.aBoolean820 = arg0;
			this.method8559();
		}
	}
}
