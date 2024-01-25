import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class267 {

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	public int anInt7582;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
	public boolean aBoolean562 = false;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!jda;")
	private Class165 aClass165_52 = new Class165(64);

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!jda;")
	public final Class165 aClass165_53 = new Class165(500);

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Lclient!jda;")
	public final Class165 aClass165_54 = new Class165(30);

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!jda;")
	public final Class165 aClass165_55 = new Class165(50);

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!aj;")
	public final Class15 aClass15_114;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!aj;")
	private final Class15 aClass15_115;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!gia;IZLclient!aj;Lclient!aj;)V")
	public Class267(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Class15 arg4) {
		this.aClass15_114 = arg4;
		this.aClass15_115 = arg3;
		this.aBoolean563 = arg2;
		if (this.aClass15_115 != null) {
			@Pc(47) int local47 = this.aClass15_115.method516() - 1;
			this.aClass15_115.method512(local47);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
	public void method6679() {
		@Pc(6) Class165 local6 = this.aClass165_52;
		synchronized (this.aClass165_52) {
			this.aClass165_52.method4394(5);
		}
		local6 = this.aClass165_53;
		synchronized (this.aClass165_53) {
			this.aClass165_53.method4394(5);
		}
		local6 = this.aClass165_54;
		synchronized (this.aClass165_54) {
			this.aClass165_54.method4394(5);
		}
		local6 = this.aClass165_55;
		synchronized (this.aClass165_55) {
			this.aClass165_55.method4394(5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public void method6680(@OriginalArg(1) int arg0) {
		this.anInt7582 = arg0;
		@Pc(9) Class165 local9 = this.aClass165_53;
		synchronized (this.aClass165_53) {
			this.aClass165_53.method4403();
		}
		local9 = this.aClass165_54;
		synchronized (this.aClass165_54) {
			this.aClass165_54.method4403();
		}
		local9 = this.aClass165_55;
		synchronized (this.aClass165_55) {
			this.aClass165_55.method4403();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method6681() {
		@Pc(9) Class165 local9 = this.aClass165_52;
		synchronized (this.aClass165_52) {
			this.aClass165_52.method4403();
		}
		local9 = this.aClass165_53;
		synchronized (this.aClass165_53) {
			this.aClass165_53.method4403();
		}
		local9 = this.aClass165_54;
		synchronized (this.aClass165_54) {
			this.aClass165_54.method4403();
		}
		local9 = this.aClass165_55;
		synchronized (this.aClass165_55) {
			this.aClass165_55.method4403();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)Lclient!pu;")
	public Class277 method6682(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_52;
		@Pc(16) Class277 local16;
		synchronized (this.aClass165_52) {
			local16 = (Class277) this.aClass165_52.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class15 local36 = this.aClass15_115;
		@Pc(49) byte[] local49;
		synchronized (this.aClass15_115) {
			local49 = this.aClass15_115.method517(Static66.method1348(arg0), Static529.method7638(arg0));
		}
		local16 = new Class277();
		local16.aClass267_3 = this;
		local16.anInt7714 = arg0;
		if (local49 != null) {
			local16.method6812(new Class3_Sub25(local49));
		}
		local16.method6808();
		if (!this.aBoolean563 && local16.aBoolean584) {
			local16.anIntArray658 = null;
			local16.aStringArray21 = null;
		}
		if (local16.aBoolean576) {
			local16.aBoolean581 = false;
			local16.anInt7718 = 0;
		}
		@Pc(101) Class165 local101 = this.aClass165_52;
		synchronized (this.aClass165_52) {
			this.aClass165_52.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	public void method6683(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean562 != arg0) {
			this.aBoolean562 = arg0;
			this.method6681();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public void method6685(@OriginalArg(1) int arg0) {
		this.aClass165_52 = new Class165(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public void method6686() {
		@Pc(2) Class165 local2 = this.aClass165_52;
		synchronized (this.aClass165_52) {
			this.aClass165_52.method4400();
		}
		local2 = this.aClass165_53;
		synchronized (this.aClass165_53) {
			this.aClass165_53.method4400();
		}
		local2 = this.aClass165_54;
		synchronized (this.aClass165_54) {
			this.aClass165_54.method4400();
		}
		local2 = this.aClass165_55;
		synchronized (this.aClass165_55) {
			this.aClass165_55.method4400();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IZ)V")
	public void method6687(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean563 != arg0) {
			this.aBoolean563 = arg0;
			this.method6681();
		}
	}
}
