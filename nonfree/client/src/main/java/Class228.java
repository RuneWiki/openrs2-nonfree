import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class228 {

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!ge;")
	private Class83 aClass83_48 = new Class83(64);

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "Lclient!ge;")
	public final Class83 aClass83_49 = new Class83(500);

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "Lclient!ge;")
	public final Class83 aClass83_50 = new Class83(30);

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "Lclient!ge;")
	public final Class83 aClass83_51 = new Class83(50);

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "Lclient!ci;")
	private final Class38 aClass38_76;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Lclient!ci;")
	public final Class38 aClass38_75;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!sn;IZLclient!ci;Lclient!ci;)V")
	public Class228(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) Class38 arg4) {
		this.aClass38_76 = arg3;
		this.aClass38_75 = arg4;
		this.aBoolean470 = arg2;
		if (this.aClass38_76 != null) {
			@Pc(47) int local47 = this.aClass38_76.method1035() - 1;
			this.aClass38_76.method1032(local47);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public void method5198() {
		@Pc(2) Class83 local2 = this.aClass83_48;
		synchronized (this.aClass83_48) {
			this.aClass83_48.method2345(5);
		}
		local2 = this.aClass83_49;
		synchronized (this.aClass83_49) {
			this.aClass83_49.method2345(5);
		}
		local2 = this.aClass83_50;
		synchronized (this.aClass83_50) {
			this.aClass83_50.method2345(5);
		}
		local2 = this.aClass83_51;
		synchronized (this.aClass83_51) {
			this.aClass83_51.method2345(5);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZB)V")
	public void method5199(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean470) {
			this.aBoolean470 = arg0;
			this.method5205();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ)V")
	public void method5200(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean471 != arg0) {
			this.aBoolean471 = arg0;
			this.method5205();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	public void method5201(@OriginalArg(1) int arg0) {
		this.aClass83_48 = new Class83(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	public void method5202(@OriginalArg(0) int arg0) {
		this.anInt6347 = arg0;
		@Pc(9) Class83 local9 = this.aClass83_49;
		synchronized (this.aClass83_49) {
			this.aClass83_49.method2346();
		}
		local9 = this.aClass83_50;
		synchronized (this.aClass83_50) {
			this.aClass83_50.method2346();
		}
		local9 = this.aClass83_51;
		synchronized (this.aClass83_51) {
			this.aClass83_51.method2346();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)Lclient!ku;")
	public Class139 method5203(@OriginalArg(1) int arg0) {
		@Pc(11) Class83 local11 = this.aClass83_48;
		@Pc(21) Class139 local21;
		synchronized (this.aClass83_48) {
			local21 = (Class139) this.aClass83_48.method2338((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class38 local34 = this.aClass38_76;
		@Pc(47) byte[] local47;
		synchronized (this.aClass38_76) {
			local47 = this.aClass38_76.method1039(Static184.method3362(arg0), Static291.method4480(arg0));
		}
		local21 = new Class139();
		local21.anInt4366 = arg0;
		local21.aClass228_4 = this;
		if (local47 != null) {
			local21.method3746(new Class4_Sub20(local47));
		}
		local21.method3745();
		if (local21.aBoolean288) {
			local21.anInt4367 = 0;
			local21.aBoolean284 = false;
		}
		if (!this.aBoolean470 && local21.aBoolean281) {
			local21.aStringArray19 = null;
			local21.anIntArray343 = null;
		}
		@Pc(99) Class83 local99 = this.aClass83_48;
		synchronized (this.aClass83_48) {
			this.aClass83_48.method2337(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public void method5204() {
		@Pc(6) Class83 local6 = this.aClass83_48;
		synchronized (this.aClass83_48) {
			this.aClass83_48.method2336();
		}
		@Pc(29) Class83 local29 = this.aClass83_49;
		synchronized (this.aClass83_49) {
			this.aClass83_49.method2336();
		}
		local29 = this.aClass83_50;
		synchronized (this.aClass83_50) {
			this.aClass83_50.method2336();
		}
		local29 = this.aClass83_51;
		synchronized (this.aClass83_51) {
			this.aClass83_51.method2336();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method5205() {
		@Pc(2) Class83 local2 = this.aClass83_48;
		synchronized (this.aClass83_48) {
			this.aClass83_48.method2346();
		}
		local2 = this.aClass83_49;
		synchronized (this.aClass83_49) {
			this.aClass83_49.method2346();
		}
		local2 = this.aClass83_50;
		synchronized (this.aClass83_50) {
			this.aClass83_50.method2346();
		}
		local2 = this.aClass83_51;
		synchronized (this.aClass83_51) {
			this.aClass83_51.method2346();
		}
	}
}
