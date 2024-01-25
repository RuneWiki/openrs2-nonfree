import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class298 {

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "Lclient!eda;")
	private final Class87 aClass87_196 = new Class87(64);

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "Lclient!eda;")
	private final Class87 aClass87_197 = new Class87(100);

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "Lclient!la;")
	private final Class207 aClass207_101;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;Lclient!la;)V")
	public Class298(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(4) Class207 arg4) {
		this.aClass207_101 = arg2;
		if (this.aClass207_101 != null) {
			@Pc(26) int local26 = this.aClass207_101.method4685() - 1;
			this.aClass207_101.method4672(local26);
		}
		Static87.method1417(arg3, arg4);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)Lclient!lk;")
	public Class5_Sub5_Sub12 method7026(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_197;
		synchronized (this.aClass87_197) {
			@Pc(16) Class5_Sub5_Sub12 local16 = (Class5_Sub5_Sub12) this.aClass87_197.method1805((long) arg0);
			if (local16 == null) {
				local16 = new Class5_Sub5_Sub12(arg0);
				this.aClass87_197.method1792((long) arg0, local16);
			}
			return local16.method4847() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
	public void method7029() {
		@Pc(8) Class87 local8 = this.aClass87_196;
		synchronized (this.aClass87_196) {
			this.aClass87_196.method1796();
		}
		local8 = this.aClass87_197;
		synchronized (this.aClass87_197) {
			this.aClass87_197.method1796();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V")
	public void method7032() {
		@Pc(6) Class87 local6 = this.aClass87_196;
		synchronized (this.aClass87_196) {
			this.aClass87_196.method1801();
		}
		local6 = this.aClass87_197;
		synchronized (this.aClass87_197) {
			this.aClass87_197.method1801();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BI)Lclient!vga;")
	public Class362 method7034(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_196;
		@Pc(16) Class362 local16;
		synchronized (this.aClass87_196) {
			local16 = (Class362) this.aClass87_196.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_101;
		@Pc(42) byte[] local42;
		synchronized (this.aClass207_101) {
			local42 = this.aClass207_101.method4681(Static504.method7544(arg0), Static596.method8558(arg0));
		}
		local16 = new Class362();
		local16.anInt10004 = arg0;
		local16.aClass298_2 = this;
		if (local42 != null) {
			local16.method8563(new Class5_Sub22(local42));
		}
		local16.method8565();
		@Pc(73) Class87 local73 = this.aClass87_196;
		synchronized (this.aClass87_196) {
			this.aClass87_196.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IB)V")
	public void method7035() {
		@Pc(2) Class87 local2 = this.aClass87_196;
		synchronized (this.aClass87_196) {
			this.aClass87_196.method1793(5);
		}
		local2 = this.aClass87_197;
		synchronized (this.aClass87_197) {
			this.aClass87_197.method1793(5);
		}
	}
}
