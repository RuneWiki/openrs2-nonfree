import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class118 {

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	public int anInt3045;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!mo;")
	private Class160 aClass160_24 = new Class160(64);

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!mo;")
	public final Class160 aClass160_25 = new Class160(500);

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!mo;")
	public final Class160 aClass160_26 = new Class160(30);

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!mo;")
	public final Class160 aClass160_27 = new Class160(50);

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
	public boolean aBoolean230;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public final int anInt3037;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!nl;")
	private final Class171 aClass171_39;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!nl;")
	public final Class171 aClass171_40;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!lo;IZLclient!nl;Lclient!nl;)V")
	public Class118(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aBoolean230 = arg2;
		this.anInt3037 = arg1;
		this.aClass171_39 = arg3;
		this.aClass171_40 = arg4;
		if (this.aClass171_39 != null) {
			@Pc(50) int local50 = this.aClass171_39.method3770() - 1;
			this.aClass171_39.method3750(local50);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public void method2851() {
		@Pc(2) Class160 local2 = this.aClass160_24;
		synchronized (this.aClass160_24) {
			this.aClass160_24.method3605();
		}
		local2 = this.aClass160_25;
		synchronized (this.aClass160_25) {
			this.aClass160_25.method3605();
		}
		local2 = this.aClass160_26;
		synchronized (this.aClass160_26) {
			this.aClass160_26.method3605();
		}
		local2 = this.aClass160_27;
		synchronized (this.aClass160_27) {
			this.aClass160_27.method3605();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public void method2853() {
		@Pc(12) Class160 local12 = this.aClass160_24;
		synchronized (this.aClass160_24) {
			this.aClass160_24.method3606(5);
		}
		local12 = this.aClass160_25;
		synchronized (this.aClass160_25) {
			this.aClass160_25.method3606(5);
		}
		local12 = this.aClass160_26;
		synchronized (this.aClass160_26) {
			this.aClass160_26.method3606(5);
		}
		local12 = this.aClass160_27;
		synchronized (this.aClass160_27) {
			this.aClass160_27.method3606(5);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V")
	public void method2854(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean229) {
			this.aBoolean229 = arg0;
			this.method2861();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public void method2857(@OriginalArg(0) int arg0) {
		this.aClass160_24 = new Class160(arg0);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)Lclient!nm;")
	public Class172 method2858(@OriginalArg(1) int arg0) {
		@Pc(13) Class160 local13 = this.aClass160_24;
		@Pc(23) Class172 local23;
		synchronized (this.aClass160_24) {
			local23 = (Class172) this.aClass160_24.method3599((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(44) byte[] local44 = this.aClass171_39.method3745(Static358.method2025(arg0), Static190.method3249(arg0));
		local23 = new Class172();
		local23.anInt4131 = arg0;
		local23.aClass118_5 = this;
		if (local44 != null) {
			local23.method3778(new Class2_Sub16(local44));
		}
		local23.method3785();
		if (local23.aBoolean317) {
			local23.anInt4108 = 0;
			local23.aBoolean318 = false;
		}
		if (!this.aBoolean230 && local23.aBoolean320) {
			local23.anIntArray802 = null;
			local23.aStringArray103 = null;
		}
		@Pc(90) Class160 local90 = this.aClass160_24;
		synchronized (this.aClass160_24) {
			this.aClass160_24.method3602((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V")
	public void method2859(@OriginalArg(0) int arg0) {
		this.anInt3045 = arg0;
		@Pc(9) Class160 local9 = this.aClass160_25;
		synchronized (this.aClass160_25) {
			this.aClass160_25.method3595();
		}
		local9 = this.aClass160_26;
		synchronized (this.aClass160_26) {
			this.aClass160_26.method3595();
		}
		local9 = this.aClass160_27;
		synchronized (this.aClass160_27) {
			this.aClass160_27.method3595();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V")
	public void method2860(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean230 != arg0) {
			this.aBoolean230 = arg0;
			this.method2861();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method2861() {
		@Pc(2) Class160 local2 = this.aClass160_24;
		synchronized (this.aClass160_24) {
			this.aClass160_24.method3595();
		}
		local2 = this.aClass160_25;
		synchronized (this.aClass160_25) {
			this.aClass160_25.method3595();
		}
		local2 = this.aClass160_26;
		synchronized (this.aClass160_26) {
			this.aClass160_26.method3595();
		}
		local2 = this.aClass160_27;
		synchronized (this.aClass160_27) {
			this.aClass160_27.method3595();
		}
	}
}
