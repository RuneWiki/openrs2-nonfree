import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class88 {

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!af;")
	private Class10 aClass10_8 = new Class10(64);

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Lclient!af;")
	public final Class10 aClass10_9 = new Class10(500);

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "Lclient!af;")
	public final Class10 aClass10_10 = new Class10(30);

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "Lclient!af;")
	public final Class10 aClass10_11 = new Class10(50);

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!ae;")
	private final Class8 aClass8_42;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Z")
	public boolean aBoolean139;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Lclient!ae;")
	public final Class8 aClass8_43;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!jk;IZLclient!ae;Lclient!ae;)V")
	public Class88(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) Class8 arg4) {
		this.aClass8_42 = arg3;
		this.aBoolean139 = arg2;
		this.aClass8_43 = arg4;
		if (this.aClass8_42 != null) {
			@Pc(47) int local47 = this.aClass8_42.method279() - 1;
			this.aClass8_42.method280(local47);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZ)V")
	public void method2017(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean141) {
			this.aBoolean141 = arg0;
			this.method2018();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public void method2018() {
		@Pc(2) Class10 local2 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method375();
		}
		local2 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method375();
		}
		local2 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method375();
		}
		local2 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method375();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public void method2019(@OriginalArg(1) int arg0) {
		this.anInt2306 = arg0;
		@Pc(9) Class10 local9 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method375();
		}
		local9 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method375();
		}
		local9 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method375();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public void method2020() {
		@Pc(6) Class10 local6 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method369(5);
		}
		local6 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method369(5);
		}
		local6 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method369(5);
		}
		local6 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method369(5);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method2022() {
		@Pc(6) Class10 local6 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method380();
		}
		local6 = this.aClass10_9;
		synchronized (this.aClass10_9) {
			this.aClass10_9.method380();
		}
		local6 = this.aClass10_10;
		synchronized (this.aClass10_10) {
			this.aClass10_10.method380();
		}
		local6 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method380();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZB)V")
	public void method2023(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean139) {
			this.aBoolean139 = arg0;
			this.method2018();
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lclient!ro;")
	public Class308 method2024(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_8;
		@Pc(16) Class308 local16;
		synchronized (this.aClass10_8) {
			local16 = (Class308) this.aClass10_8.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_42;
		@Pc(42) byte[] local42;
		synchronized (this.aClass8_42) {
			local42 = this.aClass8_42.method262(Static56.method1078(arg0), Static2.method8466(arg0));
		}
		local16 = new Class308();
		local16.anInt8569 = arg0;
		local16.aClass88_4 = this;
		if (local42 != null) {
			local16.method7307(new Class6_Sub23(local42));
		}
		local16.method7295();
		if (!this.aBoolean139 && local16.aBoolean606) {
			local16.anIntArray570 = null;
			local16.aStringArray53 = null;
		}
		if (local16.aBoolean596) {
			local16.aBoolean602 = false;
			local16.anInt8581 = 0;
		}
		@Pc(94) Class10 local94 = this.aClass10_8;
		synchronized (this.aClass10_8) {
			this.aClass10_8.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
	public void method2026(@OriginalArg(0) int arg0) {
		this.aClass10_8 = new Class10(arg0);
	}
}
