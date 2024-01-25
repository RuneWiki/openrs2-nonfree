import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class146 {

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Lclient!me;")
	private Class211 aClass211_26 = new Class211(64);

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "Lclient!me;")
	public final Class211 aClass211_27 = new Class211(500);

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "Lclient!me;")
	public final Class211 aClass211_28 = new Class211(30);

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "Lclient!me;")
	public final Class211 aClass211_29 = new Class211(50);

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "Lclient!pe;")
	private final Class254 aClass254_64;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "Lclient!pe;")
	public final Class254 aClass254_65;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!vd;IZLclient!pe;Lclient!pe;)V")
	public Class146(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_64 = arg3;
		this.aBoolean303 = arg2;
		this.aClass254_65 = arg4;
		if (this.aClass254_64 != null) {
			@Pc(47) int local47 = this.aClass254_64.method6421() - 1;
			this.aClass254_64.method6396(local47);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	public void method3352(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean303) {
			this.aBoolean303 = arg0;
			this.method3357();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public void method3353(@OriginalArg(0) int arg0) {
		this.anInt3896 = arg0;
		@Pc(9) Class211 local9 = this.aClass211_27;
		synchronized (this.aClass211_27) {
			this.aClass211_27.method5535();
		}
		local9 = this.aClass211_28;
		synchronized (this.aClass211_28) {
			this.aClass211_28.method5535();
		}
		local9 = this.aClass211_29;
		synchronized (this.aClass211_29) {
			this.aClass211_29.method5535();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(ZI)V")
	public void method3354(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean302 != arg0) {
			this.aBoolean302 = arg0;
			this.method3357();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)Lclient!sa;")
	public Class292 method3356(@OriginalArg(1) int arg0) {
		@Pc(14) Class211 local14 = this.aClass211_26;
		@Pc(24) Class292 local24;
		synchronized (this.aClass211_26) {
			local24 = (Class292) this.aClass211_26.method5534((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class254 local37 = this.aClass254_64;
		@Pc(50) byte[] local50;
		synchronized (this.aClass254_64) {
			local50 = this.aClass254_64.method6401(Static326.method5660(arg0), Static480.method7346(arg0));
		}
		local24 = new Class292();
		local24.aClass146_4 = this;
		local24.anInt8757 = arg0;
		if (local50 != null) {
			local24.method7189(new Class3_Sub7(local50));
		}
		local24.method7188();
		if (!this.aBoolean303 && local24.aBoolean724) {
			local24.aStringArray30 = null;
			local24.anIntArray574 = null;
		}
		if (local24.aBoolean732) {
			local24.anInt8782 = 0;
			local24.aBoolean726 = false;
		}
		@Pc(102) Class211 local102 = this.aClass211_26;
		synchronized (this.aClass211_26) {
			this.aClass211_26.method5529((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public void method3357() {
		@Pc(2) Class211 local2 = this.aClass211_26;
		synchronized (this.aClass211_26) {
			this.aClass211_26.method5535();
		}
		local2 = this.aClass211_27;
		synchronized (this.aClass211_27) {
			this.aClass211_27.method5535();
		}
		local2 = this.aClass211_28;
		synchronized (this.aClass211_28) {
			this.aClass211_28.method5535();
		}
		@Pc(59) Class211 local59 = this.aClass211_29;
		synchronized (this.aClass211_29) {
			this.aClass211_29.method5535();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method3358() {
		@Pc(2) Class211 local2 = this.aClass211_26;
		synchronized (this.aClass211_26) {
			this.aClass211_26.method5537();
		}
		local2 = this.aClass211_27;
		synchronized (this.aClass211_27) {
			this.aClass211_27.method5537();
		}
		@Pc(44) Class211 local44 = this.aClass211_28;
		synchronized (this.aClass211_28) {
			this.aClass211_28.method5537();
		}
		local44 = this.aClass211_29;
		synchronized (this.aClass211_29) {
			this.aClass211_29.method5537();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public void method3359(@OriginalArg(1) int arg0) {
		this.aClass211_26 = new Class211(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V")
	public void method3362() {
		@Pc(6) Class211 local6 = this.aClass211_26;
		synchronized (this.aClass211_26) {
			this.aClass211_26.method5538(5);
		}
		local6 = this.aClass211_27;
		synchronized (this.aClass211_27) {
			this.aClass211_27.method5538(5);
		}
		local6 = this.aClass211_28;
		synchronized (this.aClass211_28) {
			this.aClass211_28.method5538(5);
		}
		local6 = this.aClass211_29;
		synchronized (this.aClass211_29) {
			this.aClass211_29.method5538(5);
		}
	}
}
