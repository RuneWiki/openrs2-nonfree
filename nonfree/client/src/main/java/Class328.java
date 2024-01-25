import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class328 {

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	public int anInt9376;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	public boolean aBoolean681 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!aq;")
	private Class22 aClass22_51 = new Class22(64);

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!aq;")
	public final Class22 aClass22_52 = new Class22(500);

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!aq;")
	public final Class22 aClass22_53 = new Class22(30);

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!aq;")
	public final Class22 aClass22_54 = new Class22(50);

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!gga;")
	public final Class124 aClass124_114;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!gga;")
	private final Class124 aClass124_113;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!mca;IZLclient!gga;Lclient!gga;)V")
	public Class328(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) Class124 arg4) {
		this.aClass124_114 = arg4;
		this.aBoolean682 = arg2;
		this.aClass124_113 = arg3;
		if (this.aClass124_113 != null) {
			@Pc(47) int local47 = this.aClass124_113.method3633() - 1;
			this.aClass124_113.method3629(local47);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public void method8253(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean681 != arg0) {
			this.aBoolean681 = arg0;
			this.method8263();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)V")
	public void method8255(@OriginalArg(1) int arg0) {
		this.aClass22_51 = new Class22(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method8256() {
		@Pc(2) Class22 local2 = this.aClass22_51;
		synchronized (this.aClass22_51) {
			this.aClass22_51.method468(5);
		}
		local2 = this.aClass22_52;
		synchronized (this.aClass22_52) {
			this.aClass22_52.method468(5);
		}
		local2 = this.aClass22_53;
		synchronized (this.aClass22_53) {
			this.aClass22_53.method468(5);
		}
		local2 = this.aClass22_54;
		synchronized (this.aClass22_54) {
			this.aClass22_54.method468(5);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZ)V")
	public void method8260(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean682) {
			this.aBoolean682 = arg0;
			this.method8263();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!sea;")
	public Class331 method8261(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_51;
		@Pc(16) Class331 local16;
		synchronized (this.aClass22_51) {
			local16 = (Class331) this.aClass22_51.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_113;
		@Pc(42) byte[] local42;
		synchronized (this.aClass124_113) {
			local42 = this.aClass124_113.method3641(Static666.method9731(arg0), Static606.method9085(arg0));
		}
		local16 = new Class331();
		local16.aClass328_3 = this;
		local16.anInt9434 = arg0;
		if (local42 != null) {
			local16.method8297(new Class2_Sub8(local42));
		}
		local16.method8295();
		if (local16.aBoolean693) {
			local16.aBoolean696 = false;
			local16.anInt9403 = 0;
		}
		if (!this.aBoolean682 && local16.aBoolean697) {
			local16.aStringArray60 = null;
			local16.anIntArray483 = null;
		}
		@Pc(94) Class22 local94 = this.aClass22_51;
		synchronized (this.aClass22_51) {
			this.aClass22_51.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
	public void method8262() {
		@Pc(2) Class22 local2 = this.aClass22_51;
		synchronized (this.aClass22_51) {
			this.aClass22_51.method473();
		}
		local2 = this.aClass22_52;
		synchronized (this.aClass22_52) {
			this.aClass22_52.method473();
		}
		local2 = this.aClass22_53;
		synchronized (this.aClass22_53) {
			this.aClass22_53.method473();
		}
		local2 = this.aClass22_54;
		synchronized (this.aClass22_54) {
			this.aClass22_54.method473();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public void method8263() {
		@Pc(2) Class22 local2 = this.aClass22_51;
		synchronized (this.aClass22_51) {
			this.aClass22_51.method461();
		}
		local2 = this.aClass22_52;
		synchronized (this.aClass22_52) {
			this.aClass22_52.method461();
		}
		local2 = this.aClass22_53;
		synchronized (this.aClass22_53) {
			this.aClass22_53.method461();
		}
		local2 = this.aClass22_54;
		synchronized (this.aClass22_54) {
			this.aClass22_54.method461();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	public void method8265(@OriginalArg(1) int arg0) {
		this.anInt9376 = arg0;
		@Pc(9) Class22 local9 = this.aClass22_52;
		synchronized (this.aClass22_52) {
			this.aClass22_52.method461();
		}
		local9 = this.aClass22_53;
		synchronized (this.aClass22_53) {
			this.aClass22_53.method461();
		}
		local9 = this.aClass22_54;
		synchronized (this.aClass22_54) {
			this.aClass22_54.method461();
		}
	}
}
