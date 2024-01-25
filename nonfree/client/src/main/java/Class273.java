import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class273 {

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "Lclient!nga;")
	private final Class233 aClass233_40 = new Class233(64);

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "Lclient!nga;")
	public final Class233 aClass233_41 = new Class233(2);

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "Lclient!eq;")
	public final Class97 aClass97_114;

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_115;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;)V")
	public Class273(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3) {
		this.aClass97_114 = arg3;
		this.aClass97_115 = arg2;
		this.aClass97_115.method2569(33);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public void method6656() {
		@Pc(6) Class233 local6 = this.aClass233_40;
		synchronized (this.aClass233_40) {
			this.aClass233_40.method5663();
		}
		local6 = this.aClass233_41;
		synchronized (this.aClass233_41) {
			this.aClass233_41.method5663();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	public void method6657() {
		@Pc(2) Class233 local2 = this.aClass233_40;
		synchronized (this.aClass233_40) {
			this.aClass233_40.method5664(5);
		}
		local2 = this.aClass233_41;
		synchronized (this.aClass233_41) {
			this.aClass233_41.method5664(5);
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)Lclient!tga;")
	public Class321 method6658(@OriginalArg(0) int arg0) {
		@Pc(11) Class233 local11 = this.aClass233_40;
		@Pc(21) Class321 local21;
		synchronized (this.aClass233_40) {
			local21 = (Class321) this.aClass233_40.method5669((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class97 local34 = this.aClass97_115;
		@Pc(43) byte[] local43;
		synchronized (this.aClass97_115) {
			local43 = this.aClass97_115.method2545(arg0, 33);
		}
		local21 = new Class321();
		local21.aClass273_2 = this;
		if (local43 != null) {
			local21.method7603(new Class2_Sub34(local43));
		}
		@Pc(68) Class233 local68 = this.aClass233_40;
		synchronized (this.aClass233_40) {
			this.aClass233_40.method5662(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
	public void method6659() {
		@Pc(2) Class233 local2 = this.aClass233_40;
		synchronized (this.aClass233_40) {
			this.aClass233_40.method5665();
		}
		@Pc(29) Class233 local29 = this.aClass233_41;
		synchronized (this.aClass233_41) {
			this.aClass233_41.method5665();
		}
	}
}
