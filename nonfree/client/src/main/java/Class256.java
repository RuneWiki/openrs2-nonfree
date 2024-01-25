import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class256 {

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	public int anInt7281;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!d;")
	private Class44 aClass44_71 = new Class44(64);

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!d;")
	public final Class44 aClass44_72 = new Class44(500);

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Lclient!d;")
	public final Class44 aClass44_73 = new Class44(30);

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "Lclient!d;")
	public final Class44 aClass44_74 = new Class44(50);

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!um;")
	public final Class243 aClass243_246;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!um;")
	private final Class243 aClass243_247;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!pt;IZLclient!um;Lclient!um;)V")
	public Class256(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class243 arg4) {
		this.aBoolean487 = arg2;
		this.aClass243_246 = arg4;
		this.aClass243_247 = arg3;
		if (this.aClass243_247 != null) {
			@Pc(47) int local47 = this.aClass243_247.method5478() - 1;
			this.aClass243_247.method5472(local47);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public void method5775(@OriginalArg(0) int arg0) {
		this.anInt7281 = arg0;
		@Pc(13) Class44 local13 = this.aClass44_72;
		synchronized (this.aClass44_72) {
			this.aClass44_72.method1031();
		}
		local13 = this.aClass44_73;
		synchronized (this.aClass44_73) {
			this.aClass44_73.method1031();
		}
		local13 = this.aClass44_74;
		synchronized (this.aClass44_74) {
			this.aClass44_74.method1031();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V")
	public void method5776(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean487 != arg0) {
			this.aBoolean487 = arg0;
			this.method5783();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method5777() {
		@Pc(14) Class44 local14 = this.aClass44_71;
		synchronized (this.aClass44_71) {
			this.aClass44_71.method1024();
		}
		local14 = this.aClass44_72;
		synchronized (this.aClass44_72) {
			this.aClass44_72.method1024();
		}
		local14 = this.aClass44_73;
		synchronized (this.aClass44_73) {
			this.aClass44_73.method1024();
		}
		local14 = this.aClass44_74;
		synchronized (this.aClass44_74) {
			this.aClass44_74.method1024();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(ZI)V")
	public void method5779(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean488) {
			this.aBoolean488 = arg0;
			this.method5783();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IB)V")
	public void method5780() {
		@Pc(10) Class44 local10 = this.aClass44_71;
		synchronized (this.aClass44_71) {
			this.aClass44_71.method1025(5);
		}
		local10 = this.aClass44_72;
		synchronized (this.aClass44_72) {
			this.aClass44_72.method1025(5);
		}
		local10 = this.aClass44_73;
		synchronized (this.aClass44_73) {
			this.aClass44_73.method1025(5);
		}
		local10 = this.aClass44_74;
		synchronized (this.aClass44_74) {
			this.aClass44_74.method1025(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)V")
	public void method5781(@OriginalArg(1) int arg0) {
		this.aClass44_71 = new Class44(arg0);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lclient!ii;")
	public Class114 method5782(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_71;
		@Pc(18) Class114 local18;
		synchronized (this.aClass44_71) {
			local18 = (Class114) this.aClass44_71.method1028((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class243 local31 = this.aClass243_247;
		@Pc(46) byte[] local46;
		synchronized (this.aClass243_247) {
			local46 = this.aClass243_247.method5455(Static239.method4851(arg0), Static279.method3466(arg0));
		}
		local18 = new Class114();
		local18.aClass256_2 = this;
		local18.anInt2994 = arg0;
		if (local46 != null) {
			local18.method2398(new Class5_Sub15(local46));
		}
		local18.method2402();
		if (local18.aBoolean194) {
			local18.anInt2991 = 0;
			local18.lb = false;
		}
		if (!this.aBoolean487 && local18.aBoolean188) {
			local18.aStringArray18 = null;
			local18.anIntArray167 = null;
		}
		@Pc(106) Class44 local106 = this.aClass44_71;
		synchronized (this.aClass44_71) {
			this.aClass44_71.method1017((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method5783() {
		@Pc(2) Class44 local2 = this.aClass44_71;
		synchronized (this.aClass44_71) {
			this.aClass44_71.method1031();
		}
		@Pc(29) Class44 local29 = this.aClass44_72;
		synchronized (this.aClass44_72) {
			this.aClass44_72.method1031();
		}
		local29 = this.aClass44_73;
		synchronized (this.aClass44_73) {
			this.aClass44_73.method1031();
		}
		local29 = this.aClass44_74;
		synchronized (this.aClass44_74) {
			this.aClass44_74.method1031();
		}
	}
}
