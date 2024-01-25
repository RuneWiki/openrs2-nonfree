import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class30 {

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "Lclient!jv;")
	private Class126 aClass126_5 = new Class126(64);

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "Lclient!jv;")
	public final Class126 aClass126_6 = new Class126(500);

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Lclient!jv;")
	public final Class126 aClass126_7 = new Class126(30);

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "Lclient!jv;")
	public final Class126 aClass126_8 = new Class126(50);

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "Lclient!bu;")
	private final Class32 aClass32_15;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
	public boolean aBoolean96;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "Lclient!bu;")
	public final Class32 aClass32_14;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!oq;IZLclient!bu;Lclient!bu;)V")
	public Class30(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) Class32 arg4) {
		this.aClass32_15 = arg3;
		this.aBoolean96 = arg2;
		this.aClass32_14 = arg4;
		if (this.aClass32_15 != null) {
			@Pc(47) int local47 = this.aClass32_15.method809() - 1;
			this.aClass32_15.method790(local47);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	public void method762() {
		@Pc(6) Class126 local6 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method3131();
		}
		local6 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method3131();
		}
		local6 = this.aClass126_7;
		synchronized (this.aClass126_7) {
			this.aClass126_7.method3131();
		}
		local6 = this.aClass126_8;
		synchronized (this.aClass126_8) {
			this.aClass126_8.method3131();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
	public void method763(@OriginalArg(1) int arg0) {
		this.anInt1074 = arg0;
		@Pc(9) Class126 local9 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method3135();
		}
		local9 = this.aClass126_7;
		synchronized (this.aClass126_7) {
			this.aClass126_7.method3135();
		}
		local9 = this.aClass126_8;
		synchronized (this.aClass126_8) {
			this.aClass126_8.method3135();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
	public void method764(@OriginalArg(0) int arg0) {
		this.aClass126_5 = new Class126(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IB)V")
	public void method766() {
		@Pc(6) Class126 local6 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method3140(5);
		}
		local6 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method3140(5);
		}
		local6 = this.aClass126_7;
		synchronized (this.aClass126_7) {
			this.aClass126_7.method3140(5);
		}
		local6 = this.aClass126_8;
		synchronized (this.aClass126_8) {
			this.aClass126_8.method3140(5);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BZ)V")
	public void method767(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean97) {
			this.aBoolean97 = arg0;
			this.method770();
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BZ)V")
	public void method768(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean96) {
			this.aBoolean96 = arg0;
			this.method770();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lclient!gm;")
	public Class93 method769(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_5;
		@Pc(16) Class93 local16;
		synchronized (this.aClass126_5) {
			local16 = (Class93) this.aClass126_5.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass32_15.method785(Static451.method5937(arg0), Static278.method3937(arg0));
		local16 = new Class93();
		local16.anInt2747 = arg0;
		local16.aClass30_1 = this;
		if (local37 != null) {
			local16.method2070(new Class3_Sub7(local37));
		}
		local16.method2059();
		if (!this.aBoolean96 && local16.aBoolean250) {
			local16.aStringArray28 = null;
			local16.lb = null;
		}
		if (local16.aBoolean254) {
			local16.aBoolean256 = false;
			local16.anInt2780 = 0;
		}
		@Pc(85) Class126 local85 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
	public void method770() {
		@Pc(6) Class126 local6 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method3135();
		}
		local6 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method3135();
		}
		local6 = this.aClass126_7;
		synchronized (this.aClass126_7) {
			this.aClass126_7.method3135();
		}
		local6 = this.aClass126_8;
		synchronized (this.aClass126_8) {
			this.aClass126_8.method3135();
		}
	}
}
