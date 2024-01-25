import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class349 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public int anInt9884;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	public boolean aBoolean817 = false;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!gg;")
	private Class112 aClass112_64 = new Class112(64);

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!gg;")
	public final Class112 aClass112_65 = new Class112(500);

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!gg;")
	public final Class112 aClass112_66 = new Class112(30);

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!gg;")
	public final Class112 aClass112_67 = new Class112(50);

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_121;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
	public boolean aBoolean818;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!kha;")
	public final Class181 aClass181_122;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!dh;IZLclient!kha;Lclient!kha;)V")
	public Class349(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) Class181 arg4) {
		this.aClass181_121 = arg3;
		this.aBoolean818 = arg2;
		this.aClass181_122 = arg4;
		if (this.aClass181_121 != null) {
			@Pc(47) int local47 = this.aClass181_121.method5029() - 1;
			this.aClass181_121.method5025(local47);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public void method8113(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean818 != arg0) {
			this.aBoolean818 = arg0;
			this.method8120();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method8115() {
		@Pc(2) Class112 local2 = this.aClass112_64;
		synchronized (this.aClass112_64) {
			this.aClass112_64.method3643();
		}
		local2 = this.aClass112_65;
		synchronized (this.aClass112_65) {
			this.aClass112_65.method3643();
		}
		local2 = this.aClass112_66;
		synchronized (this.aClass112_66) {
			this.aClass112_66.method3643();
		}
		local2 = this.aClass112_67;
		synchronized (this.aClass112_67) {
			this.aClass112_67.method3643();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	public void method8118(@OriginalArg(0) int arg0) {
		this.aClass112_64 = new Class112(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V")
	public void method8119(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean817) {
			this.aBoolean817 = arg0;
			this.method8120();
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public void method8120() {
		@Pc(6) Class112 local6 = this.aClass112_64;
		synchronized (this.aClass112_64) {
			this.aClass112_64.method3638();
		}
		local6 = this.aClass112_65;
		synchronized (this.aClass112_65) {
			this.aClass112_65.method3638();
		}
		local6 = this.aClass112_66;
		synchronized (this.aClass112_66) {
			this.aClass112_66.method3638();
		}
		local6 = this.aClass112_67;
		synchronized (this.aClass112_67) {
			this.aClass112_67.method3638();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public void method8121() {
		@Pc(6) Class112 local6 = this.aClass112_64;
		synchronized (this.aClass112_64) {
			this.aClass112_64.method3637(5);
		}
		local6 = this.aClass112_65;
		synchronized (this.aClass112_65) {
			this.aClass112_65.method3637(5);
		}
		local6 = this.aClass112_66;
		synchronized (this.aClass112_66) {
			this.aClass112_66.method3637(5);
		}
		local6 = this.aClass112_67;
		synchronized (this.aClass112_67) {
			this.aClass112_67.method3637(5);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
	public void method8122(@OriginalArg(1) int arg0) {
		this.anInt9884 = arg0;
		@Pc(15) Class112 local15 = this.aClass112_65;
		synchronized (this.aClass112_65) {
			this.aClass112_65.method3638();
		}
		local15 = this.aClass112_66;
		synchronized (this.aClass112_66) {
			this.aClass112_66.method3638();
		}
		local15 = this.aClass112_67;
		synchronized (this.aClass112_67) {
			this.aClass112_67.method3638();
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)Lclient!qg;")
	public Class272 method8123(@OriginalArg(0) int arg0) {
		@Pc(13) Class112 local13 = this.aClass112_64;
		@Pc(23) Class272 local23;
		synchronized (this.aClass112_64) {
			local23 = (Class272) this.aClass112_64.method3640((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class181 local36 = this.aClass181_121;
		@Pc(49) byte[] local49;
		synchronized (this.aClass181_121) {
			local49 = this.aClass181_121.method5023(Static26.method463(arg0), Static319.method5424(arg0));
		}
		local23 = new Class272();
		local23.anInt8290 = arg0;
		local23.aClass349_3 = this;
		if (local49 != null) {
			local23.method6852(new Class3_Sub15(local49));
		}
		local23.method6861();
		if (!this.aBoolean818 && local23.aBoolean704) {
			local23.anIntArray524 = null;
			local23.aStringArray33 = null;
		}
		if (local23.aBoolean705) {
			local23.anInt8293 = 0;
			local23.aBoolean702 = false;
		}
		@Pc(101) Class112 local101 = this.aClass112_64;
		synchronized (this.aClass112_64) {
			this.aClass112_64.method3636((long) arg0, local23);
			return local23;
		}
	}
}
