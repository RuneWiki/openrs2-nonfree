import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class41 {

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!bja", name = "l", descriptor = "Lclient!dka;")
	private final Class85 aClass85_7 = new Class85(64);

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "Lclient!dka;")
	public final Class85 aClass85_8 = new Class85(50);

	@OriginalMember(owner = "client!bja", name = "o", descriptor = "Lclient!dka;")
	public final Class85 aClass85_9 = new Class85(5);

	@OriginalMember(owner = "client!bja", name = "h", descriptor = "Lclient!nca;")
	public final Class254 aClass254_31;

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "Lclient!hda;")
	public final Class150 aClass150_2;

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "Z")
	public boolean aBoolean106;

	@OriginalMember(owner = "client!bja", name = "m", descriptor = "I")
	private final int anInt864;

	@OriginalMember(owner = "client!bja", name = "d", descriptor = "Lclient!nca;")
	private final Class254 aClass254_30;

	@OriginalMember(owner = "client!bja", name = "k", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray6;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!hda;IZLclient!nca;Lclient!nca;)V")
	public Class41(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_31 = arg4;
		this.aClass150_2 = arg0;
		this.aBoolean106 = arg2;
		this.anInt864 = arg1;
		this.aClass254_30 = arg3;
		if (this.aClass254_30 != null) {
			@Pc(44) int local44 = this.aClass254_30.method6094() - 1;
			this.aClass254_30.method6101(local44);
		}
		if (Static395.aClass150_8 == this.aClass150_2) {
			this.aStringArray6 = new String[] { null, null, null, null, null, Static289.aClass191_22.method4067(this.anInt864) };
		} else {
			this.aStringArray6 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	public void method746() {
		@Pc(2) Class85 local2 = this.aClass85_7;
		synchronized (this.aClass85_7) {
			this.aClass85_7.method1741();
		}
		local2 = this.aClass85_8;
		synchronized (this.aClass85_8) {
			this.aClass85_8.method1741();
		}
		local2 = this.aClass85_9;
		synchronized (this.aClass85_9) {
			this.aClass85_9.method1741();
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IZ)V")
	public void method747(@OriginalArg(0) int arg0) {
		this.anInt873 = arg0;
		@Pc(9) Class85 local9 = this.aClass85_8;
		synchronized (this.aClass85_8) {
			this.aClass85_8.method1748();
		}
		local9 = this.aClass85_9;
		synchronized (this.aClass85_9) {
			this.aClass85_9.method1748();
		}
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(II)V")
	public void method749() {
		@Pc(6) Class85 local6 = this.aClass85_7;
		synchronized (this.aClass85_7) {
			this.aClass85_7.method1742(5);
		}
		local6 = this.aClass85_8;
		synchronized (this.aClass85_8) {
			this.aClass85_8.method1742(5);
		}
		@Pc(46) Class85 local46 = this.aClass85_9;
		synchronized (this.aClass85_9) {
			this.aClass85_9.method1742(5);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(BZ)V")
	public void method750(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean106) {
			this.aBoolean106 = arg0;
			this.method752();
		}
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
	public void method751() {
		@Pc(6) Class85 local6 = this.aClass85_8;
		synchronized (this.aClass85_8) {
			this.aClass85_8.method1748();
		}
		local6 = this.aClass85_9;
		synchronized (this.aClass85_9) {
			this.aClass85_9.method1748();
		}
	}

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "(I)V")
	public void method752() {
		@Pc(10) Class85 local10 = this.aClass85_7;
		synchronized (this.aClass85_7) {
			this.aClass85_7.method1748();
		}
		local10 = this.aClass85_8;
		synchronized (this.aClass85_8) {
			this.aClass85_8.method1748();
		}
		local10 = this.aClass85_9;
		synchronized (this.aClass85_9) {
			this.aClass85_9.method1748();
		}
	}

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "(II)Lclient!nl;")
	public Class261 method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 2) {
			return null;
		}
		@Pc(12) Class85 local12 = this.aClass85_7;
		@Pc(22) Class261 local22;
		synchronized (this.aClass85_7) {
			local22 = (Class261) this.aClass85_7.method1737((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class254 local36 = this.aClass254_30;
		@Pc(49) byte[] local49;
		synchronized (this.aClass254_30) {
			local49 = this.aClass254_30.method6087(Static48.method625(arg0), Static91.method1403(arg0));
		}
		local22 = new Class261();
		local22.aClass41_2 = this;
		local22.anInt7031 = arg0;
		local22.aStringArray30 = (String[]) this.aStringArray6.clone();
		if (local49 != null) {
			local22.method6270(arg1 - 2, new Class2_Sub20(local49));
		}
		local22.method6269();
		@Pc(90) Class85 local90 = this.aClass85_7;
		synchronized (this.aClass85_7) {
			this.aClass85_7.method1745((long) arg0, arg1 ^ 0x3FFD, local22);
			return local22;
		}
	}
}
