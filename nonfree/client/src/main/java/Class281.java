import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class281 {

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public int anInt8043;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Z")
	public boolean aBoolean605 = false;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!nga;")
	private Class233 aClass233_43 = new Class233(64);

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Lclient!nga;")
	public final Class233 aClass233_44 = new Class233(500);

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Lclient!nga;")
	public final Class233 aClass233_45 = new Class233(30);

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!nga;")
	public final Class233 aClass233_46 = new Class233(50);

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Lclient!eq;")
	private final Class97 aClass97_119;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!eq;")
	public final Class97 aClass97_118;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!cw;IZLclient!eq;Lclient!eq;)V")
	public Class281(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) Class97 arg4) {
		this.aBoolean606 = arg2;
		this.aClass97_119 = arg3;
		this.aClass97_118 = arg4;
		if (this.aClass97_119 != null) {
			@Pc(47) int local47 = this.aClass97_119.method2546() - 1;
			this.aClass97_119.method2569(local47);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public void method6730(@OriginalArg(0) int arg0) {
		this.anInt8043 = arg0;
		@Pc(16) Class233 local16 = this.aClass233_44;
		synchronized (this.aClass233_44) {
			this.aClass233_44.method5663();
		}
		local16 = this.aClass233_45;
		synchronized (this.aClass233_45) {
			this.aClass233_45.method5663();
		}
		local16 = this.aClass233_46;
		synchronized (this.aClass233_46) {
			this.aClass233_46.method5663();
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
	public void method6731() {
		@Pc(6) Class233 local6 = this.aClass233_43;
		synchronized (this.aClass233_43) {
			this.aClass233_43.method5664(5);
		}
		local6 = this.aClass233_44;
		synchronized (this.aClass233_44) {
			this.aClass233_44.method5664(5);
		}
		local6 = this.aClass233_45;
		synchronized (this.aClass233_45) {
			this.aClass233_45.method5664(5);
		}
		local6 = this.aClass233_46;
		synchronized (this.aClass233_46) {
			this.aClass233_46.method5664(5);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	public void method6732() {
		@Pc(6) Class233 local6 = this.aClass233_43;
		synchronized (this.aClass233_43) {
			this.aClass233_43.method5665();
		}
		local6 = this.aClass233_44;
		synchronized (this.aClass233_44) {
			this.aClass233_44.method5665();
		}
		local6 = this.aClass233_45;
		synchronized (this.aClass233_45) {
			this.aClass233_45.method5665();
		}
		local6 = this.aClass233_46;
		synchronized (this.aClass233_46) {
			this.aClass233_46.method5665();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public void method6733() {
		@Pc(2) Class233 local2 = this.aClass233_43;
		synchronized (this.aClass233_43) {
			this.aClass233_43.method5663();
		}
		local2 = this.aClass233_44;
		synchronized (this.aClass233_44) {
			this.aClass233_44.method5663();
		}
		local2 = this.aClass233_45;
		synchronized (this.aClass233_45) {
			this.aClass233_45.method5663();
		}
		local2 = this.aClass233_46;
		synchronized (this.aClass233_46) {
			this.aClass233_46.method5663();
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(II)Lclient!uw;")
	public Class350 method6734(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_43;
		@Pc(16) Class350 local16;
		synchronized (this.aClass233_43) {
			local16 = (Class350) this.aClass233_43.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_119;
		@Pc(42) byte[] local42;
		synchronized (this.aClass97_119) {
			local42 = this.aClass97_119.method2545(Static71.method1360(arg0), Static188.method3422(arg0));
		}
		local16 = new Class350();
		local16.anInt9607 = arg0;
		local16.aClass281_3 = this;
		if (local42 != null) {
			local16.method8078(new Class2_Sub34(local42));
		}
		local16.method8084();
		if (!this.aBoolean606 && local16.aBoolean710) {
			local16.anIntArray666 = null;
			local16.aStringArray41 = null;
		}
		if (local16.aBoolean705) {
			local16.anInt9665 = 0;
			local16.aBoolean704 = false;
		}
		@Pc(94) Class233 local94 = this.aClass233_43;
		synchronized (this.aClass233_43) {
			this.aClass233_43.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	public void method6735(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean605) {
			this.aBoolean605 = arg0;
			this.method6733();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	public void method6737(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean606) {
			this.aBoolean606 = arg0;
			this.method6733();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
	public void method6738(@OriginalArg(0) int arg0) {
		this.aClass233_43 = new Class233(arg0);
	}
}
