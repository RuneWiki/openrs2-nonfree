import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class74 {

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
	public int anInt2147;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!tja;")
	private Class352 aClass352_16 = new Class352(64);

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Lclient!tja;")
	public final Class352 aClass352_17 = new Class352(500);

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!tja;")
	public final Class352 aClass352_18 = new Class352(30);

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "Lclient!tja;")
	public final Class352 aClass352_19 = new Class352(50);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!bt;")
	public final Class34 aClass34_25;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_26;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!mja;IZLclient!bt;Lclient!bt;)V")
	public Class74(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) Class34 arg4) {
		this.aClass34_25 = arg4;
		this.aBoolean138 = arg2;
		this.aClass34_26 = arg3;
		if (this.aClass34_26 != null) {
			@Pc(47) int local47 = this.aClass34_26.method1247() - 1;
			this.aClass34_26.method1233(local47);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)V")
	public void method2070(@OriginalArg(1) int arg0) {
		this.aClass352_16 = new Class352(arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	public void method2071() {
		@Pc(2) Class352 local2 = this.aClass352_16;
		synchronized (this.aClass352_16) {
			this.aClass352_16.method7663(5);
		}
		local2 = this.aClass352_17;
		synchronized (this.aClass352_17) {
			this.aClass352_17.method7663(5);
		}
		local2 = this.aClass352_18;
		synchronized (this.aClass352_18) {
			this.aClass352_18.method7663(5);
		}
		local2 = this.aClass352_19;
		synchronized (this.aClass352_19) {
			this.aClass352_19.method7663(5);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	public void method2072(@OriginalArg(0) int arg0) {
		this.anInt2147 = arg0;
		@Pc(9) Class352 local9 = this.aClass352_17;
		synchronized (this.aClass352_17) {
			this.aClass352_17.method7659();
		}
		local9 = this.aClass352_18;
		synchronized (this.aClass352_18) {
			this.aClass352_18.method7659();
		}
		local9 = this.aClass352_19;
		synchronized (this.aClass352_19) {
			this.aClass352_19.method7659();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZB)V")
	public void method2074(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean138) {
			this.aBoolean138 = arg0;
			this.method2076();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)Lclient!tba;")
	public Class342 method2075(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_16;
		@Pc(16) Class342 local16;
		synchronized (this.aClass352_16) {
			local16 = (Class342) this.aClass352_16.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_26;
		@Pc(44) byte[] local44;
		synchronized (this.aClass34_26) {
			local44 = this.aClass34_26.method1239(Static579.method7635(arg0), Static597.method7834(arg0));
		}
		local16 = new Class342();
		local16.aClass74_133 = this;
		local16.anInt8738 = arg0;
		if (local44 != null) {
			local16.method7507(new Class4_Sub11(local44));
		}
		local16.method7493();
		if (local16.aBoolean684) {
			local16.aBoolean677 = false;
			local16.anInt8707 = 0;
		}
		if (!this.aBoolean138 && local16.aBoolean686) {
			local16.anIntArray619 = null;
			local16.aStringArray42 = null;
		}
		@Pc(102) Class352 local102 = this.aClass352_16;
		synchronized (this.aClass352_16) {
			this.aClass352_16.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public void method2076() {
		@Pc(2) Class352 local2 = this.aClass352_16;
		synchronized (this.aClass352_16) {
			this.aClass352_16.method7659();
		}
		@Pc(29) Class352 local29 = this.aClass352_17;
		synchronized (this.aClass352_17) {
			this.aClass352_17.method7659();
		}
		local29 = this.aClass352_18;
		synchronized (this.aClass352_18) {
			this.aClass352_18.method7659();
		}
		local29 = this.aClass352_19;
		synchronized (this.aClass352_19) {
			this.aClass352_19.method7659();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
	public void method2078() {
		@Pc(2) Class352 local2 = this.aClass352_16;
		synchronized (this.aClass352_16) {
			this.aClass352_16.method7656();
		}
		local2 = this.aClass352_17;
		synchronized (this.aClass352_17) {
			this.aClass352_17.method7656();
		}
		local2 = this.aClass352_18;
		synchronized (this.aClass352_18) {
			this.aClass352_18.method7656();
		}
		local2 = this.aClass352_19;
		synchronized (this.aClass352_19) {
			this.aClass352_19.method7656();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BZ)V")
	public void method2079(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean139) {
			this.aBoolean139 = arg0;
			this.method2076();
		}
	}
}
