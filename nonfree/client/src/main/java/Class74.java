import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class74 {

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!er;")
	private Class69 aClass69_23 = new Class69(64);

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!er;")
	public final Class69 aClass69_24 = new Class69(500);

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Lclient!er;")
	public final Class69 aClass69_25 = new Class69(30);

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!er;")
	public final Class69 aClass69_26 = new Class69(50);

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!ns;")
	private final Class166 aClass166_80;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!ns;")
	public final Class166 aClass166_79;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!go;IZLclient!ns;Lclient!ns;)V")
	public Class74(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class166 arg3, @OriginalArg(4) Class166 arg4) {
		this.aClass166_80 = arg3;
		this.aBoolean175 = arg2;
		this.aClass166_79 = arg4;
		if (this.aClass166_80 != null) {
			@Pc(47) int local47 = this.aClass166_80.method3695() - 1;
			this.aClass166_80.method3691(local47);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method1680(@OriginalArg(0) int arg0) {
		this.anInt2269 = arg0;
		@Pc(9) Class69 local9 = this.aClass69_24;
		synchronized (this.aClass69_24) {
			this.aClass69_24.method1593();
		}
		local9 = this.aClass69_25;
		synchronized (this.aClass69_25) {
			this.aClass69_25.method1593();
		}
		local9 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1593();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public void method1681() {
		@Pc(2) Class69 local2 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1594(5);
		}
		local2 = this.aClass69_24;
		synchronized (this.aClass69_24) {
			this.aClass69_24.method1594(5);
		}
		local2 = this.aClass69_25;
		synchronized (this.aClass69_25) {
			this.aClass69_25.method1594(5);
		}
		local2 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1594(5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lclient!eu;")
	public Class71 method1683(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_23;
		@Pc(16) Class71 local16;
		synchronized (this.aClass69_23) {
			local16 = (Class71) this.aClass69_23.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass166_80.method3696(Static54.method5868(arg0), Static39.method1427(arg0));
		local16 = new Class71();
		local16.anInt2158 = arg0;
		local16.aClass74_6 = this;
		if (local37 != null) {
			local16.method1619(new Class4_Sub30(local37));
		}
		local16.method1629();
		if (local16.aBoolean171) {
			local16.aBoolean166 = false;
			local16.anInt2197 = 0;
		}
		if (!this.aBoolean175 && local16.aBoolean161) {
			local16.anIntArray141 = null;
			local16.aStringArray13 = null;
		}
		@Pc(83) Class69 local83 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public void method1684(@OriginalArg(1) int arg0) {
		this.aClass69_23 = new Class69(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public void method1686() {
		@Pc(6) Class69 local6 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1600();
		}
		local6 = this.aClass69_24;
		synchronized (this.aClass69_24) {
			this.aClass69_24.method1600();
		}
		local6 = this.aClass69_25;
		synchronized (this.aClass69_25) {
			this.aClass69_25.method1600();
		}
		local6 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1600();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public void method1687(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean175 != arg0) {
			this.aBoolean175 = arg0;
			this.method1690();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZI)V")
	public void method1689(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean176 != arg0) {
			this.aBoolean176 = arg0;
			this.method1690();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method1690() {
		@Pc(6) Class69 local6 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1593();
		}
		local6 = this.aClass69_24;
		synchronized (this.aClass69_24) {
			this.aClass69_24.method1593();
		}
		local6 = this.aClass69_25;
		synchronized (this.aClass69_25) {
			this.aClass69_25.method1593();
		}
		local6 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1593();
		}
	}
}
