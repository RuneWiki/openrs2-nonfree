import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class304 {

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
	public int anInt8021;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Z")
	public boolean aBoolean581 = false;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!de;")
	private Class69 aClass69_48 = new Class69(64);

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "Lclient!de;")
	public final Class69 aClass69_49 = new Class69(500);

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "Lclient!de;")
	public final Class69 aClass69_50 = new Class69(30);

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Lclient!de;")
	public final Class69 aClass69_51 = new Class69(50);

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Z")
	public boolean aBoolean580;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!nd;")
	private final Class238 aClass238_224;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!nd;")
	public final Class238 aClass238_225;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!al;IZLclient!nd;Lclient!nd;)V")
	public Class304(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class238 arg3, @OriginalArg(4) Class238 arg4) {
		this.aBoolean580 = arg2;
		this.aClass238_224 = arg3;
		this.aClass238_225 = arg4;
		if (this.aClass238_224 != null) {
			@Pc(47) int local47 = this.aClass238_224.method5569() - 1;
			this.aClass238_224.method5592(local47);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V")
	public void method6952(@OriginalArg(0) int arg0) {
		this.anInt8021 = arg0;
		@Pc(9) Class69 local9 = this.aClass69_49;
		synchronized (this.aClass69_49) {
			this.aClass69_49.method1905();
		}
		local9 = this.aClass69_50;
		synchronized (this.aClass69_50) {
			this.aClass69_50.method1905();
		}
		@Pc(47) Class69 local47 = this.aClass69_51;
		synchronized (this.aClass69_51) {
			this.aClass69_51.method1905();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(IB)V")
	public void method6953() {
		@Pc(8) Class69 local8 = this.aClass69_48;
		synchronized (this.aClass69_48) {
			this.aClass69_48.method1910(5);
		}
		local8 = this.aClass69_49;
		synchronized (this.aClass69_49) {
			this.aClass69_49.method1910(5);
		}
		local8 = this.aClass69_50;
		synchronized (this.aClass69_50) {
			this.aClass69_50.method1910(5);
		}
		local8 = this.aClass69_51;
		synchronized (this.aClass69_51) {
			this.aClass69_51.method1910(5);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZZ)V")
	public void method6954(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean580) {
			this.aBoolean580 = arg0;
			this.method6964();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)Lclient!ac;")
	public Class5 method6956(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_48;
		@Pc(16) Class5 local16;
		synchronized (this.aClass69_48) {
			local16 = (Class5) this.aClass69_48.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_224;
		@Pc(42) byte[] local42;
		synchronized (this.aClass238_224) {
			local42 = this.aClass238_224.method5567(Static270.method4447(arg0), Static259.method4301(arg0));
		}
		local16 = new Class5();
		local16.aClass304_1 = this;
		local16.anInt106 = arg0;
		if (local42 != null) {
			local16.method75(new Class2_Sub17(local42));
		}
		local16.method88();
		if (!this.aBoolean580 && local16.aBoolean12) {
			local16.aStringArray1 = null;
			local16.anIntArray10 = null;
		}
		if (local16.aBoolean4) {
			local16.anInt102 = 0;
			local16.aBoolean8 = false;
		}
		@Pc(100) Class69 local100 = this.aClass69_48;
		synchronized (this.aClass69_48) {
			this.aClass69_48.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(IB)V")
	public void method6957(@OriginalArg(0) int arg0) {
		this.aClass69_48 = new Class69(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
	public void method6960(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean581) {
			this.aBoolean581 = arg0;
			this.method6964();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method6962() {
		@Pc(6) Class69 local6 = this.aClass69_48;
		synchronized (this.aClass69_48) {
			this.aClass69_48.method1904();
		}
		local6 = this.aClass69_49;
		synchronized (this.aClass69_49) {
			this.aClass69_49.method1904();
		}
		local6 = this.aClass69_50;
		synchronized (this.aClass69_50) {
			this.aClass69_50.method1904();
		}
		local6 = this.aClass69_51;
		synchronized (this.aClass69_51) {
			this.aClass69_51.method1904();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method6964() {
		@Pc(6) Class69 local6 = this.aClass69_48;
		synchronized (this.aClass69_48) {
			this.aClass69_48.method1905();
		}
		local6 = this.aClass69_49;
		synchronized (this.aClass69_49) {
			this.aClass69_49.method1905();
		}
		local6 = this.aClass69_50;
		synchronized (this.aClass69_50) {
			this.aClass69_50.method1905();
		}
		local6 = this.aClass69_51;
		synchronized (this.aClass69_51) {
			this.aClass69_51.method1905();
		}
	}
}
