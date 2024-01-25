import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class61 {

	@OriginalMember(owner = "client!cia", name = "r", descriptor = "I")
	public int anInt1213;

	@OriginalMember(owner = "client!cia", name = "t", descriptor = "Lclient!rl;")
	private final Class317 aClass317_6 = new Class317(64);

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "Lclient!rl;")
	public final Class317 aClass317_7 = new Class317(50);

	@OriginalMember(owner = "client!cia", name = "g", descriptor = "Lclient!rl;")
	public final Class317 aClass317_8 = new Class317(5);

	@OriginalMember(owner = "client!cia", name = "e", descriptor = "Z")
	public boolean aBoolean75;

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
	private final int anInt1205;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "Lclient!dja;")
	public final Class80 aClass80_5;

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "Lclient!rg;")
	public final Class310 aClass310_18;

	@OriginalMember(owner = "client!cia", name = "l", descriptor = "Lclient!rg;")
	private final Class310 aClass310_19;

	@OriginalMember(owner = "client!cia", name = "s", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray9;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lclient!dja;IZLclient!rg;Lclient!rg;)V")
	public Class61(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) Class310 arg4) {
		this.aBoolean75 = arg2;
		this.anInt1205 = arg1;
		this.aClass80_5 = arg0;
		this.aClass310_18 = arg4;
		this.aClass310_19 = arg3;
		if (this.aClass310_19 != null) {
			@Pc(44) int local44 = this.aClass310_19.method7800() - 1;
			this.aClass310_19.method7773(local44);
		}
		if (this.aClass80_5 == Static344.aClass80_7) {
			this.aStringArray9 = new String[] { null, null, null, null, null, Static21.aClass21_21.method324(this.anInt1205) };
		} else {
			this.aStringArray9 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IB)V")
	public void method1225() {
		@Pc(2) Class317 local2 = this.aClass317_6;
		synchronized (this.aClass317_6) {
			this.aClass317_6.method7870(5);
		}
		local2 = this.aClass317_7;
		synchronized (this.aClass317_7) {
			this.aClass317_7.method7870(5);
		}
		local2 = this.aClass317_8;
		synchronized (this.aClass317_8) {
			this.aClass317_8.method7870(5);
		}
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(B)V")
	public void method1227() {
		@Pc(2) Class317 local2 = this.aClass317_6;
		synchronized (this.aClass317_6) {
			this.aClass317_6.method7873();
		}
		local2 = this.aClass317_7;
		synchronized (this.aClass317_7) {
			this.aClass317_7.method7873();
		}
		local2 = this.aClass317_8;
		synchronized (this.aClass317_8) {
			this.aClass317_8.method7873();
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)V")
	public void method1229(@OriginalArg(1) int arg0) {
		this.anInt1213 = arg0;
		@Pc(17) Class317 local17 = this.aClass317_7;
		synchronized (this.aClass317_7) {
			this.aClass317_7.method7873();
		}
		local17 = this.aClass317_8;
		synchronized (this.aClass317_8) {
			this.aClass317_8.method7873();
		}
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(IB)Lclient!ufa;")
	public Class362 method1230(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_6;
		@Pc(16) Class362 local16;
		synchronized (this.aClass317_6) {
			local16 = (Class362) this.aClass317_6.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class310 local38 = this.aClass310_19;
		@Pc(51) byte[] local51;
		synchronized (this.aClass310_19) {
			local51 = this.aClass310_19.method7803(Static212.method3247(arg0), Static636.method8906(arg0));
		}
		local16 = new Class362();
		local16.anInt10090 = arg0;
		local16.aClass61_2 = this;
		local16.aStringArray44 = (String[]) this.aStringArray9.clone();
		if (local51 != null) {
			local16.method8645(new Class14_Sub21(local51));
		}
		local16.method8635();
		@Pc(90) Class317 local90 = this.aClass317_6;
		synchronized (this.aClass317_6) {
			this.aClass317_6.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
	public void method1231() {
		@Pc(6) Class317 local6 = this.aClass317_6;
		synchronized (this.aClass317_6) {
			this.aClass317_6.method7874();
		}
		local6 = this.aClass317_7;
		synchronized (this.aClass317_7) {
			this.aClass317_7.method7874();
		}
		@Pc(44) Class317 local44 = this.aClass317_8;
		synchronized (this.aClass317_8) {
			this.aClass317_8.method7874();
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZI)V")
	public void method1232(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean75) {
			this.aBoolean75 = arg0;
			this.method1227();
		}
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V")
	public void method1234() {
		@Pc(7) Class317 local7 = this.aClass317_7;
		synchronized (this.aClass317_7) {
			this.aClass317_7.method7873();
		}
		local7 = this.aClass317_8;
		synchronized (this.aClass317_8) {
			this.aClass317_8.method7873();
		}
	}
}
