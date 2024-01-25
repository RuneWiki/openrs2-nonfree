import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class231 {

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public int anInt6399;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!hn;")
	private final Class102 aClass102_49 = new Class102(64);

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!hn;")
	public final Class102 aClass102_50 = new Class102(50);

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!hn;")
	public final Class102 aClass102_51 = new Class102(5);

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!d;")
	public final Class48 aClass48_6;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Z")
	public boolean aBoolean704;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!fo;")
	private final Class82 aClass82_88;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!fo;")
	public final Class82 aClass82_87;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!d;IZLclient!fo;Lclient!fo;)V")
	public Class231(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class82 arg4) {
		this.aClass48_6 = arg0;
		this.aBoolean704 = arg2;
		this.aClass82_88 = arg3;
		this.aClass82_87 = arg4;
		if (this.aClass82_88 != null) {
			@Pc(41) int local41 = this.aClass82_88.method1825() - 1;
			this.aClass82_88.method1823(local41);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public void method5021(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean704 != arg0) {
			this.aBoolean704 = arg0;
			this.method5023();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!dh;")
	public Class54 method5022(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_49;
		@Pc(16) Class54 local16;
		synchronized (this.aClass102_49) {
			local16 = (Class54) this.aClass102_49.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_88;
		@Pc(49) byte[] local49;
		synchronized (this.aClass82_88) {
			local49 = this.aClass82_88.method1817(Static403.method5241(arg0), Static257.method3679(arg0));
		}
		local16 = new Class54();
		local16.aClass231_1 = this;
		local16.anInt1320 = arg0;
		if (local49 != null) {
			local16.method1150(new Class1_Sub28(local49));
		}
		local16.method1158();
		@Pc(80) Class102 local80 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public void method5023() {
		@Pc(6) Class102 local6 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2271();
		}
		local6 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2271();
		}
		local6 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2271();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public void method5024(@OriginalArg(0) int arg0) {
		this.anInt6399 = arg0;
		@Pc(12) Class102 local12 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2271();
		}
		local12 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2271();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	public void method5026() {
		@Pc(2) Class102 local2 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2271();
		}
		local2 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2271();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)V")
	public void method5027() {
		@Pc(6) Class102 local6 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2262(5);
		}
		local6 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2262(5);
		}
		local6 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2262(5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method5028() {
		@Pc(6) Class102 local6 = this.aClass102_49;
		synchronized (this.aClass102_49) {
			this.aClass102_49.method2260();
		}
		local6 = this.aClass102_50;
		synchronized (this.aClass102_50) {
			this.aClass102_50.method2260();
		}
		local6 = this.aClass102_51;
		synchronized (this.aClass102_51) {
			this.aClass102_51.method2260();
		}
	}
}
