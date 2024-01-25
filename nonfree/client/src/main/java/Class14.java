import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class14 {

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_1 = new Class307(64);

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_2 = new Class307(50);

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_3 = new Class307(5);

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	private final int anInt692;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "Lclient!ik;")
	private final Class182 aClass182_2;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Lclient!ik;")
	public final Class182 aClass182_3;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!qh;")
	public final Class309 aClass309_1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!qh;IZLclient!ik;Lclient!ik;)V")
	public Class14(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) Class182 arg4) {
		this.aBoolean44 = arg2;
		this.anInt692 = arg1;
		this.aClass182_2 = arg3;
		this.aClass182_3 = arg4;
		this.aClass309_1 = arg0;
		if (this.aClass182_2 != null) {
			@Pc(44) int local44 = this.aClass182_2.method3956() - 1;
			this.aClass182_2.method3970(local44);
		}
		if (Static326.aClass309_5 == this.aClass309_1) {
			this.aStringArray1 = new String[] { null, null, null, null, null, Static430.aClass257_22.method5699(this.anInt692) };
		} else {
			this.aStringArray1 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method618() {
		@Pc(6) Class307 local6 = this.aClass307_2;
		synchronized (this.aClass307_2) {
			this.aClass307_2.method7006();
		}
		local6 = this.aClass307_3;
		synchronized (this.aClass307_3) {
			this.aClass307_3.method7006();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!lb;")
	public Class219 method619(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_1;
		@Pc(18) Class219 local18;
		synchronized (this.aClass307_1) {
			local18 = (Class219) this.aClass307_1.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_2;
		@Pc(50) byte[] local50;
		synchronized (this.aClass182_2) {
			local50 = this.aClass182_2.method3985(Static587.method7580(arg0), Static132.method2345(arg0));
		}
		local18 = new Class219();
		local18.anInt5701 = arg0;
		local18.aClass14_2 = this;
		local18.aStringArray24 = (String[]) this.aStringArray1.clone();
		if (local50 != null) {
			local18.method5032(new Class3_Sub2(local50));
		}
		local18.method5029();
		@Pc(91) Class307 local91 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7000(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method620() {
		@Pc(6) Class307 local6 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method6998();
		}
		local6 = this.aClass307_2;
		synchronized (this.aClass307_2) {
			this.aClass307_2.method6998();
		}
		local6 = this.aClass307_3;
		synchronized (this.aClass307_3) {
			this.aClass307_3.method6998();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method622() {
		@Pc(2) Class307 local2 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7006();
		}
		local2 = this.aClass307_2;
		synchronized (this.aClass307_2) {
			this.aClass307_2.method7006();
		}
		local2 = this.aClass307_3;
		synchronized (this.aClass307_3) {
			this.aClass307_3.method7006();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	public void method623(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean44) {
			this.aBoolean44 = arg0;
			this.method622();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	public void method624() {
		@Pc(2) Class307 local2 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method6995(5);
		}
		local2 = this.aClass307_2;
		synchronized (this.aClass307_2) {
			this.aClass307_2.method6995(5);
		}
		local2 = this.aClass307_3;
		synchronized (this.aClass307_3) {
			this.aClass307_3.method6995(5);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public void method626(@OriginalArg(0) int arg0) {
		this.anInt701 = arg0;
		@Pc(9) Class307 local9 = this.aClass307_2;
		synchronized (this.aClass307_2) {
			this.aClass307_2.method7006();
		}
		local9 = this.aClass307_3;
		synchronized (this.aClass307_3) {
			this.aClass307_3.method7006();
		}
	}
}
