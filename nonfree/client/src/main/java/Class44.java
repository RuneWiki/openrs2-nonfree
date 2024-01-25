import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class44 {

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	public int anInt1418;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Lclient!fr;")
	private final Class91 aClass91_13 = new Class91(64);

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Lclient!fr;")
	public final Class91 aClass91_14 = new Class91(50);

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Lclient!fr;")
	public final Class91 aClass91_15 = new Class91(5);

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!qs;")
	public final Class211 aClass211_15;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "Lclient!wv;")
	public final Class272 aClass272_1;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
	public boolean aBoolean87;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!qs;")
	private final Class211 aClass211_16;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!wv;IZLclient!qs;Lclient!qs;)V")
	public Class44(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_15 = arg4;
		this.aClass272_1 = arg0;
		this.aBoolean87 = arg2;
		this.aClass211_16 = arg3;
		if (this.aClass211_16 != null) {
			@Pc(41) int local41 = this.aClass211_16.method4751() - 1;
			this.aClass211_16.method4772(local41);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lclient!ak;")
	public Class11 method999(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_13;
		@Pc(16) Class11 local16;
		synchronized (this.aClass91_13) {
			local16 = (Class11) this.aClass91_13.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_16;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_16) {
			local44 = this.aClass211_16.method4758(Static431.method5778(arg0), Static7.method81(arg0));
		}
		local16 = new Class11();
		local16.aClass44_1 = this;
		local16.anInt187 = arg0;
		if (local44 != null) {
			local16.method144(new Class1_Sub3(local44));
		}
		local16.method139();
		@Pc(81) Class91 local81 = this.aClass91_13;
		synchronized (this.aClass91_13) {
			this.aClass91_13.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
	public void method1001(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean87 != arg0) {
			this.aBoolean87 = arg0;
			this.method1007();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public void method1002() {
		@Pc(2) Class91 local2 = this.aClass91_14;
		synchronized (this.aClass91_14) {
			this.aClass91_14.method1999();
		}
		local2 = this.aClass91_15;
		synchronized (this.aClass91_15) {
			this.aClass91_15.method1999();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	public void method1004() {
		@Pc(11) Class91 local11 = this.aClass91_13;
		synchronized (this.aClass91_13) {
			this.aClass91_13.method1998(5);
		}
		local11 = this.aClass91_14;
		synchronized (this.aClass91_14) {
			this.aClass91_14.method1998(5);
		}
		local11 = this.aClass91_15;
		synchronized (this.aClass91_15) {
			this.aClass91_15.method1998(5);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	public void method1007() {
		@Pc(6) Class91 local6 = this.aClass91_13;
		synchronized (this.aClass91_13) {
			this.aClass91_13.method1999();
		}
		local6 = this.aClass91_14;
		synchronized (this.aClass91_14) {
			this.aClass91_14.method1999();
		}
		local6 = this.aClass91_15;
		synchronized (this.aClass91_15) {
			this.aClass91_15.method1999();
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
	public void method1010(@OriginalArg(0) int arg0) {
		this.anInt1418 = arg0;
		@Pc(9) Class91 local9 = this.aClass91_14;
		synchronized (this.aClass91_14) {
			this.aClass91_14.method1999();
		}
		local9 = this.aClass91_15;
		synchronized (this.aClass91_15) {
			this.aClass91_15.method1999();
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	public void method1011() {
		@Pc(6) Class91 local6 = this.aClass91_13;
		synchronized (this.aClass91_13) {
			this.aClass91_13.method1993();
		}
		local6 = this.aClass91_14;
		synchronized (this.aClass91_14) {
			this.aClass91_14.method1993();
		}
		local6 = this.aClass91_15;
		synchronized (this.aClass91_15) {
			this.aClass91_15.method1993();
		}
	}
}
