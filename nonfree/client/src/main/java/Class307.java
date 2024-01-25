import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class307 {

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public int anInt8160;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
	public boolean aBoolean577 = false;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!hm;")
	private Class136 aClass136_90 = new Class136(64);

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!hm;")
	public final Class136 aClass136_91 = new Class136(500);

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Lclient!hm;")
	public final Class136 aClass136_92 = new Class136(30);

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "Lclient!hm;")
	public final Class136 aClass136_93 = new Class136(50);

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Z")
	public boolean aBoolean578;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_116;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_115;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!bs;IZLclient!pfa;Lclient!pfa;)V")
	public Class307(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aBoolean578 = arg2;
		this.aClass251_116 = arg4;
		this.aClass251_115 = arg3;
		if (this.aClass251_115 != null) {
			@Pc(47) int local47 = this.aClass251_115.method5755() - 1;
			this.aClass251_115.method5768(local47);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
	public void method6631(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean577) {
			this.aBoolean577 = arg0;
			this.method6638();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method6633() {
		@Pc(6) Class136 local6 = this.aClass136_90;
		synchronized (this.aClass136_90) {
			this.aClass136_90.method3474(5);
		}
		local6 = this.aClass136_91;
		synchronized (this.aClass136_91) {
			this.aClass136_91.method3474(5);
		}
		local6 = this.aClass136_92;
		synchronized (this.aClass136_92) {
			this.aClass136_92.method3474(5);
		}
		local6 = this.aClass136_93;
		synchronized (this.aClass136_93) {
			this.aClass136_93.method3474(5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public void method6634() {
		@Pc(6) Class136 local6 = this.aClass136_90;
		synchronized (this.aClass136_90) {
			this.aClass136_90.method3476();
		}
		local6 = this.aClass136_91;
		synchronized (this.aClass136_91) {
			this.aClass136_91.method3476();
		}
		local6 = this.aClass136_92;
		synchronized (this.aClass136_92) {
			this.aClass136_92.method3476();
		}
		local6 = this.aClass136_93;
		synchronized (this.aClass136_93) {
			this.aClass136_93.method3476();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
	public void method6635(@OriginalArg(0) int arg0) {
		this.anInt8160 = arg0;
		@Pc(12) Class136 local12 = this.aClass136_91;
		synchronized (this.aClass136_91) {
			this.aClass136_91.method3470();
		}
		local12 = this.aClass136_92;
		synchronized (this.aClass136_92) {
			this.aClass136_92.method3470();
		}
		local12 = this.aClass136_93;
		synchronized (this.aClass136_93) {
			this.aClass136_93.method3470();
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)Lclient!pg;")
	public Class252 method6636(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_90;
		@Pc(16) Class252 local16;
		synchronized (this.aClass136_90) {
			local16 = (Class252) this.aClass136_90.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class251 local34 = this.aClass251_115;
		@Pc(47) byte[] local47;
		synchronized (this.aClass251_115) {
			local47 = this.aClass251_115.method5772(Static541.method5643(arg0), Static286.method4667(arg0));
		}
		local16 = new Class252();
		local16.aClass307_3 = this;
		local16.anInt6905 = arg0;
		if (local47 != null) {
			local16.method5796(new Class6_Sub21(local47));
		}
		local16.method5786();
		if (local16.aBoolean478) {
			local16.anInt6914 = 0;
			local16.aBoolean469 = false;
		}
		if (!this.aBoolean578 && local16.aBoolean480) {
			local16.anIntArray508 = null;
			local16.aStringArray28 = null;
		}
		@Pc(99) Class136 local99 = this.aClass136_90;
		synchronized (this.aClass136_90) {
			this.aClass136_90.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V")
	public void method6637(@OriginalArg(0) int arg0) {
		this.aClass136_90 = new Class136(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	public void method6638() {
		@Pc(2) Class136 local2 = this.aClass136_90;
		synchronized (this.aClass136_90) {
			this.aClass136_90.method3470();
		}
		local2 = this.aClass136_91;
		synchronized (this.aClass136_91) {
			this.aClass136_91.method3470();
		}
		local2 = this.aClass136_92;
		synchronized (this.aClass136_92) {
			this.aClass136_92.method3470();
		}
		local2 = this.aClass136_93;
		synchronized (this.aClass136_93) {
			this.aClass136_93.method3470();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)V")
	public void method6639(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean578 != arg0) {
			this.aBoolean578 = arg0;
			this.method6638();
		}
	}
}
