import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class138 {

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	public int anInt3627;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!qr;")
	private final Class293 aClass293_23 = new Class293(64);

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!qr;")
	public final Class293 aClass293_24 = new Class293(50);

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!qr;")
	public final Class293 aClass293_25 = new Class293(5);

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!wu;")
	public final Class384 aClass384_50;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!ms;")
	public final Class235 aClass235_3;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!wu;")
	private final Class384 aClass384_49;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ms;IZLclient!wu;Lclient!wu;)V")
	public Class138(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class384 arg3, @OriginalArg(4) Class384 arg4) {
		this.aClass384_50 = arg4;
		this.aBoolean297 = arg2;
		this.aClass235_3 = arg0;
		this.aClass384_49 = arg3;
		if (this.aClass384_49 != null) {
			@Pc(41) int local41 = this.aClass384_49.method8865() - 1;
			this.aClass384_49.method8862(local41);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public void method3192(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean297) {
			this.aBoolean297 = arg0;
			this.method3196();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method3193() {
		@Pc(8) Class293 local8 = this.aClass293_23;
		synchronized (this.aClass293_23) {
			this.aClass293_23.method6922(5);
		}
		local8 = this.aClass293_24;
		synchronized (this.aClass293_24) {
			this.aClass293_24.method6922(5);
		}
		local8 = this.aClass293_25;
		synchronized (this.aClass293_25) {
			this.aClass293_25.method6922(5);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method3194() {
		@Pc(6) Class293 local6 = this.aClass293_23;
		synchronized (this.aClass293_23) {
			this.aClass293_23.method6927();
		}
		local6 = this.aClass293_24;
		synchronized (this.aClass293_24) {
			this.aClass293_24.method6927();
		}
		local6 = this.aClass293_25;
		synchronized (this.aClass293_25) {
			this.aClass293_25.method6927();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public void method3196() {
		@Pc(6) Class293 local6 = this.aClass293_23;
		synchronized (this.aClass293_23) {
			this.aClass293_23.method6930();
		}
		local6 = this.aClass293_24;
		synchronized (this.aClass293_24) {
			this.aClass293_24.method6930();
		}
		local6 = this.aClass293_25;
		synchronized (this.aClass293_25) {
			this.aClass293_25.method6930();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public void method3198(@OriginalArg(1) int arg0) {
		this.anInt3627 = arg0;
		@Pc(9) Class293 local9 = this.aClass293_24;
		synchronized (this.aClass293_24) {
			this.aClass293_24.method6930();
		}
		local9 = this.aClass293_25;
		synchronized (this.aClass293_25) {
			this.aClass293_25.method6930();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public void method3201() {
		@Pc(2) Class293 local2 = this.aClass293_24;
		synchronized (this.aClass293_24) {
			this.aClass293_24.method6930();
		}
		local2 = this.aClass293_25;
		synchronized (this.aClass293_25) {
			this.aClass293_25.method6930();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lclient!pha;")
	public Class271 method3202(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_23;
		@Pc(16) Class271 local16;
		synchronized (this.aClass293_23) {
			local16 = (Class271) this.aClass293_23.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_49;
		@Pc(44) byte[] local44;
		synchronized (this.aClass384_49) {
			local44 = this.aClass384_49.method8885(Static523.method7488(arg0), Static450.method6695(arg0));
		}
		local16 = new Class271();
		local16.anInt7344 = arg0;
		local16.aClass138_2 = this;
		if (local44 != null) {
			local16.method6475(new Class5_Sub12(local44));
		}
		local16.method6482();
		@Pc(75) Class293 local75 = this.aClass293_23;
		synchronized (this.aClass293_23) {
			this.aClass293_23.method6925((long) arg0, local16);
			return local16;
		}
	}
}
