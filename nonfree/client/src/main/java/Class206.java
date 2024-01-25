import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class206 {

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
	public int anInt6248;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "Lclient!qc;")
	private Class231 aClass231_48 = new Class231(64);

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Lclient!qc;")
	public final Class231 aClass231_49 = new Class231(500);

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "Lclient!qc;")
	public final Class231 aClass231_50 = new Class231(30);

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!qc;")
	public final Class231 aClass231_51 = new Class231(50);

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!dda;")
	private final Class53 aClass53_94;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!dda;")
	public final Class53 aClass53_93;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!oda;IZLclient!dda;Lclient!dda;)V")
	public Class206(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) Class53 arg4) {
		this.aClass53_94 = arg3;
		this.aBoolean468 = arg2;
		this.aClass53_93 = arg4;
		if (this.aClass53_94 != null) {
			@Pc(47) int local47 = this.aClass53_94.method1607() - 1;
			this.aClass53_94.method1592(local47);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	public void method5325() {
		@Pc(6) Class231 local6 = this.aClass231_48;
		synchronized (this.aClass231_48) {
			this.aClass231_48.method6240();
		}
		local6 = this.aClass231_49;
		synchronized (this.aClass231_49) {
			this.aClass231_49.method6240();
		}
		local6 = this.aClass231_50;
		synchronized (this.aClass231_50) {
			this.aClass231_50.method6240();
		}
		local6 = this.aClass231_51;
		synchronized (this.aClass231_51) {
			this.aClass231_51.method6240();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)Lclient!ih;")
	public Class129 method5326(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_48;
		@Pc(16) Class129 local16;
		synchronized (this.aClass231_48) {
			local16 = (Class129) this.aClass231_48.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_94;
		@Pc(42) byte[] local42;
		synchronized (this.aClass53_94) {
			local42 = this.aClass53_94.method1616(Static147.method2580(arg0), Static512.method7487(arg0));
		}
		local16 = new Class129();
		local16.aClass206_3 = this;
		local16.anInt3646 = arg0;
		if (local42 != null) {
			local16.method3265(new Class2_Sub29(local42));
		}
		local16.method3268();
		if (!this.aBoolean468 && local16.aBoolean286) {
			local16.anIntArray396 = null;
			local16.aStringArray21 = null;
		}
		if (local16.aBoolean285) {
			local16.anInt3678 = 0;
			local16.aBoolean289 = false;
		}
		@Pc(94) Class231 local94 = this.aClass231_48;
		synchronized (this.aClass231_48) {
			this.aClass231_48.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V")
	public void method5327(@OriginalArg(1) int arg0) {
		this.anInt6248 = arg0;
		@Pc(9) Class231 local9 = this.aClass231_49;
		synchronized (this.aClass231_49) {
			this.aClass231_49.method6240();
		}
		local9 = this.aClass231_50;
		synchronized (this.aClass231_50) {
			this.aClass231_50.method6240();
		}
		local9 = this.aClass231_51;
		synchronized (this.aClass231_51) {
			this.aClass231_51.method6240();
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(ZI)V")
	public void method5329(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean467) {
			this.aBoolean467 = arg0;
			this.method5325();
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V")
	public void method5330() {
		@Pc(2) Class231 local2 = this.aClass231_48;
		synchronized (this.aClass231_48) {
			this.aClass231_48.method6227();
		}
		local2 = this.aClass231_49;
		synchronized (this.aClass231_49) {
			this.aClass231_49.method6227();
		}
		local2 = this.aClass231_50;
		synchronized (this.aClass231_50) {
			this.aClass231_50.method6227();
		}
		local2 = this.aClass231_51;
		synchronized (this.aClass231_51) {
			this.aClass231_51.method6227();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	public void method5331(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean468) {
			this.aBoolean468 = arg0;
			this.method5325();
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(IZ)V")
	public void method5332(@OriginalArg(0) int arg0) {
		this.aClass231_48 = new Class231(arg0);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
	public void method5333() {
		@Pc(2) Class231 local2 = this.aClass231_48;
		synchronized (this.aClass231_48) {
			this.aClass231_48.method6231(5);
		}
		local2 = this.aClass231_49;
		synchronized (this.aClass231_49) {
			this.aClass231_49.method6231(5);
		}
		local2 = this.aClass231_50;
		synchronized (this.aClass231_50) {
			this.aClass231_50.method6231(5);
		}
		local2 = this.aClass231_51;
		synchronized (this.aClass231_51) {
			this.aClass231_51.method6231(5);
		}
	}
}
