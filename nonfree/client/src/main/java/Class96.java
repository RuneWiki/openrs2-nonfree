import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class96 {

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public int anInt2677;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!wg;")
	private Class313 aClass313_16 = new Class313(64);

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!wg;")
	public final Class313 aClass313_17 = new Class313(500);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "Lclient!wg;")
	public final Class313 aClass313_18 = new Class313(30);

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!wg;")
	public final Class313 aClass313_19 = new Class313(50);

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!kr;")
	private final Class171 aClass171_52;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!kr;")
	public final Class171 aClass171_51;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!g;IZLclient!kr;Lclient!kr;)V")
	public Class96(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_52 = arg3;
		this.aBoolean174 = arg2;
		this.aClass171_51 = arg4;
		if (this.aClass171_52 != null) {
			@Pc(47) int local47 = this.aClass171_52.method4331() - 1;
			this.aClass171_52.method4349(local47);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2269() {
		@Pc(6) Class313 local6 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method7400();
		}
		local6 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method7400();
		}
		local6 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method7400();
		}
		local6 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method7400();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public void method2270() {
		@Pc(6) Class313 local6 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method7398();
		}
		local6 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method7398();
		}
		local6 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method7398();
		}
		local6 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method7398();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
	public void method2271(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean173 != arg0) {
			this.aBoolean173 = arg0;
			this.method2270();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public void method2272() {
		@Pc(2) Class313 local2 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method7403(5);
		}
		local2 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method7403(5);
		}
		local2 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method7403(5);
		}
		local2 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method7403(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	public void method2273(@OriginalArg(1) int arg0) {
		this.aClass313_16 = new Class313(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)Lclient!bu;")
	public Class36 method2274(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_16;
		@Pc(16) Class36 local16;
		synchronized (this.aClass313_16) {
			local16 = (Class36) this.aClass313_16.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_52;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_52) {
			local42 = this.aClass171_52.method4339(Static271.method4462(arg0), Static391.method5899(arg0));
		}
		local16 = new Class36();
		local16.aClass96_3 = this;
		local16.anInt952 = arg0;
		if (local42 != null) {
			local16.method957(new Class1_Sub6(local42));
		}
		local16.method958();
		if (!this.aBoolean174 && local16.aBoolean62) {
			local16.anIntArray126 = null;
			local16.aStringArray4 = null;
		}
		if (local16.aBoolean57) {
			local16.anInt969 = 0;
			local16.aBoolean63 = false;
		}
		@Pc(98) Class313 local98 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(II)V")
	public void method2275(@OriginalArg(0) int arg0) {
		this.anInt2677 = arg0;
		@Pc(17) Class313 local17 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method7398();
		}
		local17 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method7398();
		}
		local17 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method7398();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(ZI)V")
	public void method2276(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean174 != arg0) {
			this.aBoolean174 = arg0;
			this.method2270();
		}
	}
}
