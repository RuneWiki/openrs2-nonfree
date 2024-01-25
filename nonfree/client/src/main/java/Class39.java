import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class39 {

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!of;")
	private Class188 aClass188_5 = new Class188(64);

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!of;")
	public final Class188 aClass188_6 = new Class188(500);

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!of;")
	public final Class188 aClass188_7 = new Class188(30);

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!of;")
	public final Class188 aClass188_8 = new Class188(50);

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Lclient!mn;")
	public final Class171 aClass171_10;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!mn;")
	private final Class171 aClass171_9;

	static {
		new Class231("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!pr;IZLclient!mn;Lclient!mn;)V")
	public Class39(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_10 = arg4;
		this.aBoolean40 = arg2;
		this.aClass171_9 = arg3;
		if (this.aClass171_9 != null) {
			@Pc(47) int local47 = this.aClass171_9.method3677() - 1;
			this.aClass171_9.method3662(local47);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
	public void method745(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean39 != arg0) {
			this.aBoolean39 = arg0;
			this.method746();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public void method746() {
		@Pc(10) Class188 local10 = this.aClass188_5;
		synchronized (this.aClass188_5) {
			this.aClass188_5.method4156();
		}
		local10 = this.aClass188_6;
		synchronized (this.aClass188_6) {
			this.aClass188_6.method4156();
		}
		local10 = this.aClass188_7;
		synchronized (this.aClass188_7) {
			this.aClass188_7.method4156();
		}
		local10 = this.aClass188_8;
		synchronized (this.aClass188_8) {
			this.aClass188_8.method4156();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lclient!oq;")
	public Class192 method748(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_5;
		@Pc(16) Class192 local16;
		synchronized (this.aClass188_5) {
			local16 = (Class192) this.aClass188_5.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_9;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_9) {
			local42 = this.aClass171_9.method3658(Static304.method4352(arg0), Static391.method5424(arg0));
		}
		local16 = new Class192();
		local16.anInt5422 = arg0;
		local16.aClass39_3 = this;
		if (local42 != null) {
			local16.method4325(new Class2_Sub17(local42));
		}
		local16.method4315();
		if (local16.aBoolean376) {
			local16.aBoolean386 = false;
			local16.anInt5447 = 0;
		}
		if (!this.aBoolean40 && local16.aBoolean375) {
			local16.aStringArray50 = null;
			local16.anIntArray460 = null;
		}
		@Pc(99) Class188 local99 = this.aClass188_5;
		synchronized (this.aClass188_5) {
			this.aClass188_5.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public void method749() {
		@Pc(2) Class188 local2 = this.aClass188_5;
		synchronized (this.aClass188_5) {
			this.aClass188_5.method4154();
		}
		local2 = this.aClass188_6;
		synchronized (this.aClass188_6) {
			this.aClass188_6.method4154();
		}
		local2 = this.aClass188_7;
		synchronized (this.aClass188_7) {
			this.aClass188_7.method4154();
		}
		local2 = this.aClass188_8;
		synchronized (this.aClass188_8) {
			this.aClass188_8.method4154();
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	public void method750(@OriginalArg(0) int arg0) {
		this.anInt794 = arg0;
		@Pc(9) Class188 local9 = this.aClass188_6;
		synchronized (this.aClass188_6) {
			this.aClass188_6.method4156();
		}
		local9 = this.aClass188_7;
		synchronized (this.aClass188_7) {
			this.aClass188_7.method4156();
		}
		local9 = this.aClass188_8;
		synchronized (this.aClass188_8) {
			this.aClass188_8.method4156();
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)V")
	public void method751() {
		@Pc(6) Class188 local6 = this.aClass188_5;
		synchronized (this.aClass188_5) {
			this.aClass188_5.method4169(5);
		}
		local6 = this.aClass188_6;
		synchronized (this.aClass188_6) {
			this.aClass188_6.method4169(5);
		}
		local6 = this.aClass188_7;
		synchronized (this.aClass188_7) {
			this.aClass188_7.method4169(5);
		}
		local6 = this.aClass188_8;
		synchronized (this.aClass188_8) {
			this.aClass188_8.method4169(5);
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)V")
	public void method752(@OriginalArg(0) int arg0) {
		this.aClass188_5 = new Class188(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
	public void method753(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean40 != arg0) {
			this.aBoolean40 = arg0;
			this.method746();
		}
	}
}
