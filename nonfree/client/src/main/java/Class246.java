import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class246 {

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "[Lclient!ql;")
	private static final Class293[] aClass293Array1 = new Class293[32];

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	public int anInt6201;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!eda;")
	private Class87 aClass87_151 = new Class87(64);

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!eda;")
	public final Class87 aClass87_152 = new Class87(500);

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Lclient!eda;")
	public final Class87 aClass87_153 = new Class87(30);

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Lclient!eda;")
	public final Class87 aClass87_154 = new Class87(50);

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!la;")
	private final Class207 aClass207_78;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!la;")
	public final Class207 aClass207_77;

	static {
		@Pc(89) Class293[] local89 = Static269.method4318();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass293Array1[local89[local91].anInt7773] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!cr;IZLclient!la;Lclient!la;)V")
	public Class246(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class207 arg3, @OriginalArg(4) Class207 arg4) {
		this.aBoolean444 = arg2;
		this.aClass207_78 = arg3;
		this.aClass207_77 = arg4;
		if (this.aClass207_78 != null) {
			@Pc(47) int local47 = this.aClass207_78.method4685() - 1;
			this.aClass207_78.method4672(local47);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method5489(@OriginalArg(0) int arg0) {
		this.anInt6201 = arg0;
		@Pc(13) Class87 local13 = this.aClass87_152;
		synchronized (this.aClass87_152) {
			this.aClass87_152.method1801();
		}
		local13 = this.aClass87_153;
		synchronized (this.aClass87_153) {
			this.aClass87_153.method1801();
		}
		local13 = this.aClass87_154;
		synchronized (this.aClass87_154) {
			this.aClass87_154.method1801();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
	public void method5490(@OriginalArg(0) int arg0) {
		this.aClass87_151 = new Class87(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	public void method5491(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean445 != arg0) {
			this.aBoolean445 = arg0;
			this.method5496();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
	public void method5493(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean444 != arg0) {
			this.aBoolean444 = arg0;
			this.method5496();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(ZI)V")
	public void method5494() {
		@Pc(2) Class87 local2 = this.aClass87_151;
		synchronized (this.aClass87_151) {
			this.aClass87_151.method1793(5);
		}
		local2 = this.aClass87_152;
		synchronized (this.aClass87_152) {
			this.aClass87_152.method1793(5);
		}
		local2 = this.aClass87_153;
		synchronized (this.aClass87_153) {
			this.aClass87_153.method1793(5);
		}
		local2 = this.aClass87_154;
		synchronized (this.aClass87_154) {
			this.aClass87_154.method1793(5);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public void method5495() {
		@Pc(10) Class87 local10 = this.aClass87_151;
		synchronized (this.aClass87_151) {
			this.aClass87_151.method1796();
		}
		local10 = this.aClass87_152;
		synchronized (this.aClass87_152) {
			this.aClass87_152.method1796();
		}
		local10 = this.aClass87_153;
		synchronized (this.aClass87_153) {
			this.aClass87_153.method1796();
		}
		local10 = this.aClass87_154;
		synchronized (this.aClass87_154) {
			this.aClass87_154.method1796();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public void method5496() {
		@Pc(10) Class87 local10 = this.aClass87_151;
		synchronized (this.aClass87_151) {
			this.aClass87_151.method1801();
		}
		local10 = this.aClass87_152;
		synchronized (this.aClass87_152) {
			this.aClass87_152.method1801();
		}
		local10 = this.aClass87_153;
		synchronized (this.aClass87_153) {
			this.aClass87_153.method1801();
		}
		local10 = this.aClass87_154;
		synchronized (this.aClass87_154) {
			this.aClass87_154.method1801();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Lclient!jl;")
	public Class181 method5497(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_151;
		@Pc(16) Class181 local16;
		synchronized (this.aClass87_151) {
			local16 = (Class181) this.aClass87_151.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_78;
		@Pc(42) byte[] local42;
		synchronized (this.aClass207_78) {
			local42 = this.aClass207_78.method4681(Static612.method8701(arg0), Static95.method1589(arg0));
		}
		local16 = new Class181();
		local16.aClass246_3 = this;
		local16.anInt4758 = arg0;
		if (local42 != null) {
			local16.method4286(new Class5_Sub22(local42));
		}
		local16.method4278();
		if (local16.aBoolean351) {
			local16.aBoolean344 = false;
			local16.anInt4744 = 0;
		}
		if (!this.aBoolean444 && local16.aBoolean352) {
			local16.aStringArray34 = null;
			local16.anIntArray238 = null;
		}
		@Pc(94) Class87 local94 = this.aClass87_151;
		synchronized (this.aClass87_151) {
			this.aClass87_151.method1792((long) arg0, local16);
			return local16;
		}
	}
}
