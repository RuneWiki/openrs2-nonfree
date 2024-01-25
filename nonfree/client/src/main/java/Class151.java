import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class151 {

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public int anInt3665;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
	public boolean aBoolean270 = false;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Lclient!jk;")
	private Class137 aClass137_37 = new Class137(64);

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "Lclient!jk;")
	public final Class137 aClass137_38 = new Class137(500);

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Lclient!jk;")
	public final Class137 aClass137_39 = new Class137(30);

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Lclient!jk;")
	public final Class137 aClass137_40 = new Class137(50);

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!qn;")
	public final Class211 aClass211_56;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "Lclient!qn;")
	private final Class211 aClass211_58;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ae;IZLclient!qn;Lclient!qn;)V")
	public Class151(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_56 = arg4;
		this.aClass211_58 = arg3;
		this.aBoolean271 = arg2;
		if (this.aClass211_58 != null) {
			@Pc(47) int local47 = this.aClass211_58.method4368() - 1;
			this.aClass211_58.method4365(local47);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	public void method2912() {
		@Pc(2) Class137 local2 = this.aClass137_37;
		synchronized (this.aClass137_37) {
			this.aClass137_37.method2745(5);
		}
		local2 = this.aClass137_38;
		synchronized (this.aClass137_38) {
			this.aClass137_38.method2745(5);
		}
		local2 = this.aClass137_39;
		synchronized (this.aClass137_39) {
			this.aClass137_39.method2745(5);
		}
		local2 = this.aClass137_40;
		synchronized (this.aClass137_40) {
			this.aClass137_40.method2745(5);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
	public void method2914(@OriginalArg(0) int arg0) {
		this.anInt3665 = arg0;
		@Pc(17) Class137 local17 = this.aClass137_38;
		synchronized (this.aClass137_38) {
			this.aClass137_38.method2739();
		}
		local17 = this.aClass137_39;
		synchronized (this.aClass137_39) {
			this.aClass137_39.method2739();
		}
		local17 = this.aClass137_40;
		synchronized (this.aClass137_40) {
			this.aClass137_40.method2739();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
	public void method2915(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean270) {
			this.aBoolean270 = arg0;
			this.method2920();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BZ)V")
	public void method2916(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean271) {
			this.aBoolean271 = arg0;
			this.method2920();
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lclient!ho;")
	public Class114 method2917(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_37;
		@Pc(16) Class114 local16;
		synchronized (this.aClass137_37) {
			local16 = (Class114) this.aClass137_37.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_58;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_58) {
			local44 = this.aClass211_58.method4377(Static394.method2001(arg0), Static435.method5781(arg0));
		}
		local16 = new Class114();
		local16.aClass151_2 = this;
		local16.anInt2875 = arg0;
		if (local44 != null) {
			local16.method2192(new Class4_Sub9(local44));
		}
		local16.method2185();
		if (local16.aBoolean205) {
			local16.anInt2833 = 0;
			local16.aBoolean202 = false;
		}
		if (!this.aBoolean271 && local16.aBoolean207) {
			local16.anIntArray233 = null;
			local16.aStringArray26 = null;
		}
		@Pc(101) Class137 local101 = this.aClass137_37;
		synchronized (this.aClass137_37) {
			this.aClass137_37.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public void method2918() {
		@Pc(2) Class137 local2 = this.aClass137_37;
		synchronized (this.aClass137_37) {
			this.aClass137_37.method2737();
		}
		local2 = this.aClass137_38;
		synchronized (this.aClass137_38) {
			this.aClass137_38.method2737();
		}
		local2 = this.aClass137_39;
		synchronized (this.aClass137_39) {
			this.aClass137_39.method2737();
		}
		local2 = this.aClass137_40;
		synchronized (this.aClass137_40) {
			this.aClass137_40.method2737();
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(II)V")
	public void method2919(@OriginalArg(1) int arg0) {
		this.aClass137_37 = new Class137(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public void method2920() {
		@Pc(2) Class137 local2 = this.aClass137_37;
		synchronized (this.aClass137_37) {
			this.aClass137_37.method2739();
		}
		local2 = this.aClass137_38;
		synchronized (this.aClass137_38) {
			this.aClass137_38.method2739();
		}
		local2 = this.aClass137_39;
		synchronized (this.aClass137_39) {
			this.aClass137_39.method2739();
		}
		local2 = this.aClass137_40;
		synchronized (this.aClass137_40) {
			this.aClass137_40.method2739();
		}
	}
}
