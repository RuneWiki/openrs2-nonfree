import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class76 {

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!nj;")
	private final Class171 aClass171_12 = new Class171(64);

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!nj;")
	public final Class171 aClass171_13 = new Class171(50);

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!nj;")
	public final Class171 aClass171_14 = new Class171(5);

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!mg;")
	public final Class160 aClass160_13;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!mg;")
	private final Class160 aClass160_14;

	static {
		new Class209("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!al;IZLclient!mg;Lclient!mg;)V")
	public Class76(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aBoolean170 = arg2;
		this.aClass160_13 = arg4;
		this.aClass160_14 = arg3;
		if (this.aClass160_14 != null) {
			@Pc(38) int local38 = this.aClass160_14.method3715() - 1;
			this.aClass160_14.method3722(local38);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public void method1884(@OriginalArg(0) int arg0) {
		this.anInt2412 = arg0;
		@Pc(9) Class171 local9 = this.aClass171_13;
		synchronized (this.aClass171_13) {
			this.aClass171_13.method3936();
		}
		local9 = this.aClass171_14;
		synchronized (this.aClass171_14) {
			this.aClass171_14.method3936();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method1885() {
		@Pc(2) Class171 local2 = this.aClass171_12;
		synchronized (this.aClass171_12) {
			this.aClass171_12.method3933(5);
		}
		local2 = this.aClass171_13;
		synchronized (this.aClass171_13) {
			this.aClass171_13.method3933(5);
		}
		local2 = this.aClass171_14;
		synchronized (this.aClass171_14) {
			this.aClass171_14.method3933(5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method1887() {
		@Pc(10) Class171 local10 = this.aClass171_13;
		synchronized (this.aClass171_13) {
			this.aClass171_13.method3936();
		}
		local10 = this.aClass171_14;
		synchronized (this.aClass171_14) {
			this.aClass171_14.method3936();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lclient!ej;")
	public Class65 method1888(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_12;
		@Pc(16) Class65 local16;
		synchronized (this.aClass171_12) {
			local16 = (Class65) this.aClass171_12.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass160_14.method3696(Static260.method3916(arg0), Static209.method3315(arg0));
		local16 = new Class65();
		local16.aClass76_1 = this;
		local16.anInt2114 = arg0;
		if (local37 != null) {
			local16.method1699(new Class2_Sub23(local37));
		}
		local16.method1706();
		@Pc(67) Class171 local67 = this.aClass171_12;
		synchronized (this.aClass171_12) {
			this.aClass171_12.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public void method1889() {
		@Pc(2) Class171 local2 = this.aClass171_12;
		synchronized (this.aClass171_12) {
			this.aClass171_12.method3934();
		}
		local2 = this.aClass171_13;
		synchronized (this.aClass171_13) {
			this.aClass171_13.method3934();
		}
		local2 = this.aClass171_14;
		synchronized (this.aClass171_14) {
			this.aClass171_14.method3934();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public void method1890() {
		@Pc(2) Class171 local2 = this.aClass171_12;
		synchronized (this.aClass171_12) {
			this.aClass171_12.method3936();
		}
		local2 = this.aClass171_13;
		synchronized (this.aClass171_13) {
			this.aClass171_13.method3936();
		}
		local2 = this.aClass171_14;
		synchronized (this.aClass171_14) {
			this.aClass171_14.method3936();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
	public void method1891(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean170) {
			this.aBoolean170 = arg0;
			this.method1890();
		}
	}
}
