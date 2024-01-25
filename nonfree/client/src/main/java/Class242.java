import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class242 {

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public int anInt6955;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!wg;")
	private final Class313 aClass313_43 = new Class313(64);

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!wg;")
	public final Class313 aClass313_44 = new Class313(50);

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!wg;")
	public final Class313 aClass313_45 = new Class313(5);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!kr;")
	public final Class171 aClass171_115;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!kr;")
	private final Class171 aClass171_116;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!g;")
	public final Class101 aClass101_2;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
	public boolean aBoolean506;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!g;IZLclient!kr;Lclient!kr;)V")
	public Class242(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_115 = arg4;
		this.aClass171_116 = arg3;
		this.aClass101_2 = arg0;
		this.aBoolean506 = arg2;
		if (this.aClass171_116 != null) {
			@Pc(41) int local41 = this.aClass171_116.method4331() - 1;
			this.aClass171_116.method4349(local41);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method5830() {
		@Pc(6) Class313 local6 = this.aClass313_43;
		synchronized (this.aClass313_43) {
			this.aClass313_43.method7400();
		}
		local6 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method7400();
		}
		local6 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method7400();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
	public void method5831() {
		@Pc(6) Class313 local6 = this.aClass313_43;
		synchronized (this.aClass313_43) {
			this.aClass313_43.method7403(5);
		}
		local6 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method7403(5);
		}
		local6 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method7403(5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lclient!mt;")
	public Class196 method5833(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_43;
		@Pc(16) Class196 local16;
		synchronized (this.aClass313_43) {
			local16 = (Class196) this.aClass313_43.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_116;
		@Pc(50) byte[] local50;
		synchronized (this.aClass171_116) {
			local50 = this.aClass171_116.method4339(Static174.method2617(arg0), Static439.method6332(arg0));
		}
		local16 = new Class196();
		local16.aClass242_1 = this;
		local16.anInt5720 = arg0;
		if (local50 != null) {
			local16.method4858(new Class1_Sub6(local50));
		}
		local16.method4859();
		@Pc(81) Class313 local81 = this.aClass313_43;
		synchronized (this.aClass313_43) {
			this.aClass313_43.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public void method5834() {
		@Pc(2) Class313 local2 = this.aClass313_43;
		synchronized (this.aClass313_43) {
			this.aClass313_43.method7398();
		}
		local2 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method7398();
		}
		local2 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method7398();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	public void method5835(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean506) {
			this.aBoolean506 = arg0;
			this.method5834();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)V")
	public void method5837(@OriginalArg(0) int arg0) {
		this.anInt6955 = arg0;
		@Pc(9) Class313 local9 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method7398();
		}
		local9 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method7398();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	public void method5838() {
		@Pc(6) Class313 local6 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method7398();
		}
		local6 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method7398();
		}
	}
}
