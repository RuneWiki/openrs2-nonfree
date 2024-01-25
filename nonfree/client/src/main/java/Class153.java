import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class153 {

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	public int anInt3725;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Lclient!dka;")
	private Class85 aClass85_24 = new Class85(64);

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!dka;")
	public final Class85 aClass85_25 = new Class85(500);

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!dka;")
	public final Class85 aClass85_26 = new Class85(30);

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "Lclient!dka;")
	public final Class85 aClass85_27 = new Class85(50);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!nca;")
	public final Class254 aClass254_81;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	private final int anInt3718;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!hda;")
	private final Class150 aClass150_5;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!nca;")
	private final Class254 aClass254_82;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
	public boolean aBoolean333;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!hda;IZLclient!nca;Lclient!nca;)V")
	public Class153(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_81 = arg4;
		this.anInt3718 = arg1;
		this.aClass150_5 = arg0;
		this.aClass254_82 = arg3;
		this.aBoolean333 = arg2;
		if (this.aClass254_82 != null) {
			@Pc(53) int local53 = this.aClass254_82.method6094() - 1;
			this.aClass254_82.method6101(local53);
		}
		if (Static395.aClass150_8 == this.aClass150_5) {
			this.aStringArray17 = new String[] { null, null, null, null, null, Static289.aClass191_22.method4067(this.anInt3718) };
		} else {
			this.aStringArray17 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
	public void method3338(@OriginalArg(1) int arg0) {
		this.anInt3725 = arg0;
		@Pc(14) Class85 local14 = this.aClass85_25;
		synchronized (this.aClass85_25) {
			this.aClass85_25.method1748();
		}
		local14 = this.aClass85_26;
		synchronized (this.aClass85_26) {
			this.aClass85_26.method1748();
		}
		local14 = this.aClass85_27;
		synchronized (this.aClass85_27) {
			this.aClass85_27.method1748();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3340() {
		@Pc(6) Class85 local6 = this.aClass85_24;
		synchronized (this.aClass85_24) {
			this.aClass85_24.method1748();
		}
		local6 = this.aClass85_25;
		synchronized (this.aClass85_25) {
			this.aClass85_25.method1748();
		}
		local6 = this.aClass85_26;
		synchronized (this.aClass85_26) {
			this.aClass85_26.method1748();
		}
		local6 = this.aClass85_27;
		synchronized (this.aClass85_27) {
			this.aClass85_27.method1748();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)V")
	public void method3341(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean333) {
			this.aBoolean333 = arg0;
			this.method3340();
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Lclient!dga;")
	public Class81 method3342(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_24;
		@Pc(16) Class81 local16;
		synchronized (this.aClass85_24) {
			local16 = (Class81) this.aClass85_24.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class254 local38 = this.aClass254_82;
		@Pc(53) byte[] local53;
		synchronized (this.aClass254_82) {
			local53 = this.aClass254_82.method6087(Static372.method5304(arg0), Static334.method4626(arg0));
		}
		local16 = new Class81();
		local16.aClass153_2 = this;
		local16.anInt1860 = arg0;
		local16.aStringArray11 = (String[]) this.aStringArray17.clone();
		if (local53 != null) {
			local16.method1632(new Class2_Sub20(local53));
		}
		local16.method1638();
		if (!this.aBoolean333 && local16.lb) {
			local16.aStringArray11 = null;
			local16.anIntArray144 = null;
		}
		if (local16.aBoolean223) {
			local16.anInt1893 = 0;
			local16.aBoolean216 = false;
		}
		@Pc(121) Class85 local121 = this.aClass85_24;
		synchronized (this.aClass85_24) {
			this.aClass85_24.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method3343() {
		@Pc(2) Class85 local2 = this.aClass85_24;
		synchronized (this.aClass85_24) {
			this.aClass85_24.method1741();
		}
		local2 = this.aClass85_25;
		synchronized (this.aClass85_25) {
			this.aClass85_25.method1741();
		}
		local2 = this.aClass85_26;
		synchronized (this.aClass85_26) {
			this.aClass85_26.method1741();
		}
		local2 = this.aClass85_27;
		synchronized (this.aClass85_27) {
			this.aClass85_27.method1741();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZ)V")
	public void method3344(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean334 != arg0) {
			this.aBoolean334 = arg0;
			this.method3340();
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
	public void method3345(@OriginalArg(0) int arg0) {
		this.aClass85_24 = new Class85(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public void method3347() {
		@Pc(2) Class85 local2 = this.aClass85_24;
		synchronized (this.aClass85_24) {
			this.aClass85_24.method1742(5);
		}
		local2 = this.aClass85_25;
		synchronized (this.aClass85_25) {
			this.aClass85_25.method1742(5);
		}
		local2 = this.aClass85_26;
		synchronized (this.aClass85_26) {
			this.aClass85_26.method1742(5);
		}
		local2 = this.aClass85_27;
		synchronized (this.aClass85_27) {
			this.aClass85_27.method1742(5);
		}
	}
}
