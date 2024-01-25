import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class217 {

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	public int anInt5548;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!ku;")
	private Class139 aClass139_69 = new Class139(64);

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!ku;")
	public final Class139 aClass139_70 = new Class139(500);

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!ku;")
	public final Class139 aClass139_71 = new Class139(30);

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!ku;")
	public final Class139 aClass139_72 = new Class139(50);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!b;")
	private final Class20 aClass20_80;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Z")
	public boolean aBoolean431;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!b;")
	public final Class20 aClass20_81;

	static {
		new Class57(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ea;IZLclient!b;Lclient!b;)V")
	public Class217(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class20 arg4) {
		this.aClass20_80 = arg3;
		this.aBoolean431 = arg2;
		this.aClass20_81 = arg4;
		if (this.aClass20_80 != null) {
			@Pc(47) int local47 = this.aClass20_80.method229() - 1;
			this.aClass20_80.method231(local47);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public void method4998(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean431 != arg0) {
			this.aBoolean431 = arg0;
			this.method4999();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public void method4999() {
		@Pc(6) Class139 local6 = this.aClass139_69;
		synchronized (this.aClass139_69) {
			this.aClass139_69.method3075();
		}
		local6 = this.aClass139_70;
		synchronized (this.aClass139_70) {
			this.aClass139_70.method3075();
		}
		local6 = this.aClass139_71;
		synchronized (this.aClass139_71) {
			this.aClass139_71.method3075();
		}
		local6 = this.aClass139_72;
		synchronized (this.aClass139_72) {
			this.aClass139_72.method3075();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public void method5000() {
		@Pc(2) Class139 local2 = this.aClass139_69;
		synchronized (this.aClass139_69) {
			this.aClass139_69.method3083(5);
		}
		local2 = this.aClass139_70;
		synchronized (this.aClass139_70) {
			this.aClass139_70.method3083(5);
		}
		local2 = this.aClass139_71;
		synchronized (this.aClass139_71) {
			this.aClass139_71.method3083(5);
		}
		local2 = this.aClass139_72;
		synchronized (this.aClass139_72) {
			this.aClass139_72.method3083(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
	public void method5001(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean430) {
			this.aBoolean430 = arg0;
			this.method4999();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public void method5002(@OriginalArg(0) int arg0) {
		this.anInt5548 = arg0;
		@Pc(9) Class139 local9 = this.aClass139_70;
		synchronized (this.aClass139_70) {
			this.aClass139_70.method3075();
		}
		local9 = this.aClass139_71;
		synchronized (this.aClass139_71) {
			this.aClass139_71.method3075();
		}
		local9 = this.aClass139_72;
		synchronized (this.aClass139_72) {
			this.aClass139_72.method3075();
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)V")
	public void method5006(@OriginalArg(0) int arg0) {
		this.aClass139_69 = new Class139(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)Lclient!dq;")
	public Class60 method5007(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_69;
		@Pc(16) Class60 local16;
		synchronized (this.aClass139_69) {
			local16 = (Class60) this.aClass139_69.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass20_80.method253(Static374.method5586(arg0), Static380.method5621(arg0));
		local16 = new Class60();
		local16.anInt1402 = arg0;
		local16.aClass217_3 = this;
		if (local37 != null) {
			local16.method1189(new Class3_Sub5(local37));
		}
		local16.method1202();
		if (local16.aBoolean87) {
			local16.anInt1418 = 0;
			local16.aBoolean90 = false;
		}
		if (!this.aBoolean431 && local16.aBoolean91) {
			local16.aStringArray8 = null;
			local16.anIntArray136 = null;
		}
		@Pc(85) Class139 local85 = this.aClass139_69;
		synchronized (this.aClass139_69) {
			this.aClass139_69.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public void method5008() {
		@Pc(2) Class139 local2 = this.aClass139_69;
		synchronized (this.aClass139_69) {
			this.aClass139_69.method3072();
		}
		local2 = this.aClass139_70;
		synchronized (this.aClass139_70) {
			this.aClass139_70.method3072();
		}
		local2 = this.aClass139_71;
		synchronized (this.aClass139_71) {
			this.aClass139_71.method3072();
		}
		@Pc(59) Class139 local59 = this.aClass139_72;
		synchronized (this.aClass139_72) {
			this.aClass139_72.method3072();
		}
	}
}
