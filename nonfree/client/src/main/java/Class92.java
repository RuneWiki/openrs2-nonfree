import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class92 {

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	public int anInt2316;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Lclient!eda;")
	private final Class87 aClass87_72 = new Class87(64);

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "Lclient!eda;")
	public final Class87 aClass87_73 = new Class87(50);

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "Lclient!eda;")
	public final Class87 aClass87_74 = new Class87(5);

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Lclient!cr;")
	public final Class63 aClass63_1;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!la;")
	public final Class207 aClass207_27;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!la;")
	private final Class207 aClass207_28;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!cr;IZLclient!la;Lclient!la;)V")
	public Class92(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(4) Class207 arg4) {
		this.aClass63_1 = arg0;
		this.aClass207_27 = arg4;
		this.aClass207_28 = arg3;
		this.aBoolean167 = arg2;
		if (this.aClass207_28 != null) {
			@Pc(41) int local41 = this.aClass207_28.method4685() - 1;
			this.aClass207_28.method4672(local41);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public void method1909() {
		@Pc(2) Class87 local2 = this.aClass87_72;
		synchronized (this.aClass87_72) {
			this.aClass87_72.method1801();
		}
		local2 = this.aClass87_73;
		synchronized (this.aClass87_73) {
			this.aClass87_73.method1801();
		}
		local2 = this.aClass87_74;
		synchronized (this.aClass87_74) {
			this.aClass87_74.method1801();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method1910() {
		@Pc(6) Class87 local6 = this.aClass87_73;
		synchronized (this.aClass87_73) {
			this.aClass87_73.method1801();
		}
		local6 = this.aClass87_74;
		synchronized (this.aClass87_74) {
			this.aClass87_74.method1801();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZB)V")
	public void method1913(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean167) {
			this.aBoolean167 = arg0;
			this.method1909();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Lclient!maa;")
	public Class225 method1914(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_72;
		@Pc(16) Class225 local16;
		synchronized (this.aClass87_72) {
			local16 = (Class225) this.aClass87_72.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_28;
		@Pc(47) byte[] local47;
		synchronized (this.aClass207_28) {
			local47 = this.aClass207_28.method4681(Static593.method8543(arg0), Static204.method3552(arg0));
		}
		local16 = new Class225();
		local16.aClass92_1 = this;
		local16.anInt5613 = arg0;
		if (local47 != null) {
			local16.method4989(new Class5_Sub22(local47));
		}
		local16.method4991();
		@Pc(78) Class87 local78 = this.aClass87_72;
		synchronized (this.aClass87_72) {
			this.aClass87_72.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
	public void method1915() {
		@Pc(6) Class87 local6 = this.aClass87_72;
		synchronized (this.aClass87_72) {
			this.aClass87_72.method1796();
		}
		local6 = this.aClass87_73;
		synchronized (this.aClass87_73) {
			this.aClass87_73.method1796();
		}
		local6 = this.aClass87_74;
		synchronized (this.aClass87_74) {
			this.aClass87_74.method1796();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
	public void method1917() {
		@Pc(2) Class87 local2 = this.aClass87_72;
		synchronized (this.aClass87_72) {
			this.aClass87_72.method1793(5);
		}
		local2 = this.aClass87_73;
		synchronized (this.aClass87_73) {
			this.aClass87_73.method1793(5);
		}
		local2 = this.aClass87_74;
		synchronized (this.aClass87_74) {
			this.aClass87_74.method1793(5);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public void method1920(@OriginalArg(1) int arg0) {
		this.anInt2316 = arg0;
		@Pc(15) Class87 local15 = this.aClass87_73;
		synchronized (this.aClass87_73) {
			this.aClass87_73.method1801();
		}
		local15 = this.aClass87_74;
		synchronized (this.aClass87_74) {
			this.aClass87_74.method1801();
		}
	}
}
