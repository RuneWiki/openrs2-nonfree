import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class255 {

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt7876;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "Lclient!qc;")
	private final Class231 aClass231_61 = new Class231(64);

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "Lclient!qc;")
	public final Class231 aClass231_62 = new Class231(50);

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "Lclient!qc;")
	public final Class231 aClass231_63 = new Class231(5);

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!oda;")
	public final Class212 aClass212_3;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!dda;")
	public final Class53 aClass53_120;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!dda;")
	private final Class53 aClass53_121;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Z")
	public boolean aBoolean581;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!oda;IZLclient!dda;Lclient!dda;)V")
	public Class255(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) Class53 arg4) {
		this.aClass212_3 = arg0;
		this.aClass53_120 = arg4;
		this.aClass53_121 = arg3;
		this.aBoolean581 = arg2;
		if (this.aClass53_121 != null) {
			@Pc(41) int local41 = this.aClass53_121.method1607() - 1;
			this.aClass53_121.method1592(local41);
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method6581() {
		@Pc(2) Class231 local2 = this.aClass231_61;
		synchronized (this.aClass231_61) {
			this.aClass231_61.method6240();
		}
		local2 = this.aClass231_62;
		synchronized (this.aClass231_62) {
			this.aClass231_62.method6240();
		}
		local2 = this.aClass231_63;
		synchronized (this.aClass231_63) {
			this.aClass231_63.method6240();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	public void method6582() {
		@Pc(2) Class231 local2 = this.aClass231_61;
		synchronized (this.aClass231_61) {
			this.aClass231_61.method6231(5);
		}
		local2 = this.aClass231_62;
		synchronized (this.aClass231_62) {
			this.aClass231_62.method6231(5);
		}
		local2 = this.aClass231_63;
		synchronized (this.aClass231_63) {
			this.aClass231_63.method6231(5);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Lclient!ai;")
	public Class12 method6583(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_61;
		@Pc(16) Class12 local16;
		synchronized (this.aClass231_61) {
			local16 = (Class12) this.aClass231_61.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_121;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_121) {
			local44 = this.aClass53_121.method1616(Static72.method1455(arg0), Static375.method5908(arg0));
		}
		local16 = new Class12();
		local16.anInt314 = arg0;
		local16.aClass255_1 = this;
		if (local44 != null) {
			local16.method463(new Class2_Sub29(local44));
		}
		local16.method462();
		@Pc(75) Class231 local75 = this.aClass231_61;
		synchronized (this.aClass231_61) {
			this.aClass231_61.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V")
	public void method6585(@OriginalArg(0) int arg0) {
		this.anInt7876 = arg0;
		@Pc(17) Class231 local17 = this.aClass231_62;
		synchronized (this.aClass231_62) {
			this.aClass231_62.method6240();
		}
		local17 = this.aClass231_63;
		synchronized (this.aClass231_63) {
			this.aClass231_63.method6240();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
	public void method6586(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean581) {
			this.aBoolean581 = arg0;
			this.method6581();
		}
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	public void method6587() {
		@Pc(2) Class231 local2 = this.aClass231_62;
		synchronized (this.aClass231_62) {
			this.aClass231_62.method6240();
		}
		local2 = this.aClass231_63;
		synchronized (this.aClass231_63) {
			this.aClass231_63.method6240();
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	public void method6588() {
		@Pc(2) Class231 local2 = this.aClass231_61;
		synchronized (this.aClass231_61) {
			this.aClass231_61.method6227();
		}
		local2 = this.aClass231_62;
		synchronized (this.aClass231_62) {
			this.aClass231_62.method6227();
		}
		local2 = this.aClass231_63;
		synchronized (this.aClass231_63) {
			this.aClass231_63.method6227();
		}
	}
}
