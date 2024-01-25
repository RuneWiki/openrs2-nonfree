import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class142 {

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	public int anInt3976;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!jo;")
	private Class126 aClass126_27 = new Class126(64);

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!jo;")
	public final Class126 aClass126_28 = new Class126(500);

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!jo;")
	public final Class126 aClass126_29 = new Class126(30);

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!jo;")
	public final Class126 aClass126_30 = new Class126(50);

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!ok;")
	private final Class178 aClass178_66;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!ok;")
	public final Class178 aClass178_65;

	static {
		new Class55("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!kr;IZLclient!ok;Lclient!ok;)V")
	public Class142(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) Class178 arg4) {
		this.aClass178_66 = arg3;
		this.aBoolean247 = arg2;
		this.aClass178_65 = arg4;
		if (this.aClass178_66 != null) {
			@Pc(47) int local47 = this.aClass178_66.method3832() - 1;
			this.aClass178_66.method3833(local47);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public void method3146(@OriginalArg(1) int arg0) {
		this.anInt3976 = arg0;
		@Pc(9) Class126 local9 = this.aClass126_28;
		synchronized (this.aClass126_28) {
			this.aClass126_28.method2827();
		}
		local9 = this.aClass126_29;
		synchronized (this.aClass126_29) {
			this.aClass126_29.method2827();
		}
		local9 = this.aClass126_30;
		synchronized (this.aClass126_30) {
			this.aClass126_30.method2827();
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
	public void method3147() {
		@Pc(2) Class126 local2 = this.aClass126_27;
		synchronized (this.aClass126_27) {
			this.aClass126_27.method2828(5);
		}
		local2 = this.aClass126_28;
		synchronized (this.aClass126_28) {
			this.aClass126_28.method2828(5);
		}
		local2 = this.aClass126_29;
		synchronized (this.aClass126_29) {
			this.aClass126_29.method2828(5);
		}
		local2 = this.aClass126_30;
		synchronized (this.aClass126_30) {
			this.aClass126_30.method2828(5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)Lclient!pf;")
	public Class189 method3148(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_27;
		@Pc(16) Class189 local16;
		synchronized (this.aClass126_27) {
			local16 = (Class189) this.aClass126_27.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class178 local36 = this.aClass178_66;
		@Pc(49) byte[] local49;
		synchronized (this.aClass178_66) {
			local49 = this.aClass178_66.method3838(Static282.method3738(arg0), Static16.method5105(arg0));
		}
		local16 = new Class189();
		local16.anInt5088 = arg0;
		local16.aClass142_3 = this;
		if (local49 != null) {
			local16.method4027(new Class7_Sub14(local49));
		}
		local16.method4021();
		if (local16.aBoolean314) {
			local16.anInt5109 = 0;
			local16.aBoolean321 = false;
		}
		if (!this.aBoolean247 && local16.aBoolean325) {
			local16.aStringArray39 = null;
			local16.anIntArray449 = null;
		}
		@Pc(101) Class126 local101 = this.aClass126_27;
		synchronized (this.aClass126_27) {
			this.aClass126_27.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3149() {
		@Pc(6) Class126 local6 = this.aClass126_27;
		synchronized (this.aClass126_27) {
			this.aClass126_27.method2821();
		}
		local6 = this.aClass126_28;
		synchronized (this.aClass126_28) {
			this.aClass126_28.method2821();
		}
		local6 = this.aClass126_29;
		synchronized (this.aClass126_29) {
			this.aClass126_29.method2821();
		}
		local6 = this.aClass126_30;
		synchronized (this.aClass126_30) {
			this.aClass126_30.method2821();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	public void method3150(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean246) {
			this.aBoolean246 = arg0;
			this.method3151();
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method3151() {
		@Pc(12) Class126 local12 = this.aClass126_27;
		synchronized (this.aClass126_27) {
			this.aClass126_27.method2827();
		}
		local12 = this.aClass126_28;
		synchronized (this.aClass126_28) {
			this.aClass126_28.method2827();
		}
		local12 = this.aClass126_29;
		synchronized (this.aClass126_29) {
			this.aClass126_29.method2827();
		}
		local12 = this.aClass126_30;
		synchronized (this.aClass126_30) {
			this.aClass126_30.method2827();
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)V")
	public void method3152(@OriginalArg(1) int arg0) {
		this.aClass126_27 = new Class126(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IZ)V")
	public void method3154(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean247 != arg0) {
			this.aBoolean247 = arg0;
			this.method3151();
		}
	}
}
