import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class31 {

	@OriginalMember(owner = "client!bfa", name = "i", descriptor = "[C")
	public static final char[] aCharArray2 = new char[64];

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lclient!mq;")
	private final Class223 aClass223_4 = new Class223(64);

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!mq;")
	public final Class223 aClass223_5 = new Class223(50);

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "Lclient!mq;")
	public final Class223 aClass223_6 = new Class223(5);

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "Lclient!jn;")
	public final Class176 aClass176_14;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "Lclient!jn;")
	private final Class176 aClass176_13;

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "Lclient!er;")
	public final Class92 aClass92_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray2[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray2[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray2[local38] = (char) (local38 - 4);
		}
		aCharArray2[63] = '/';
		aCharArray2[62] = '+';
	}

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!er;IZLclient!jn;Lclient!jn;)V")
	public Class31(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class176 arg4) {
		this.aBoolean29 = arg2;
		this.aClass176_14 = arg4;
		this.aClass176_13 = arg3;
		this.aClass92_1 = arg0;
		if (this.aClass176_13 != null) {
			@Pc(41) int local41 = this.aClass176_13.method3973() - 1;
			this.aClass176_13.method3999(local41);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Lclient!rb;")
	public Class283 method478(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_4;
		@Pc(16) Class283 local16;
		synchronized (this.aClass223_4) {
			local16 = (Class283) this.aClass223_4.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_13;
		@Pc(42) byte[] local42;
		synchronized (this.aClass176_13) {
			local42 = this.aClass176_13.method3994(Static33.method449(arg0), Static583.method8290(arg0));
		}
		local16 = new Class283();
		local16.anInt8273 = arg0;
		local16.aClass31_2 = this;
		if (local42 != null) {
			local16.method6835(new Class4_Sub11(local42));
		}
		local16.method6827();
		@Pc(73) Class223 local73 = this.aClass223_4;
		synchronized (this.aClass223_4) {
			this.aClass223_4.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V")
	public void method479() {
		@Pc(2) Class223 local2 = this.aClass223_4;
		synchronized (this.aClass223_4) {
			this.aClass223_4.method5399(5);
		}
		local2 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5399(5);
		}
		local2 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method5399(5);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)V")
	public void method480() {
		@Pc(6) Class223 local6 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5398();
		}
		local6 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method5398();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	public void method481() {
		@Pc(6) Class223 local6 = this.aClass223_4;
		synchronized (this.aClass223_4) {
			this.aClass223_4.method5400();
		}
		local6 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5400();
		}
		local6 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method5400();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
	public void method482() {
		@Pc(2) Class223 local2 = this.aClass223_4;
		synchronized (this.aClass223_4) {
			this.aClass223_4.method5398();
		}
		local2 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5398();
		}
		local2 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method5398();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)V")
	public void method483(@OriginalArg(1) int arg0) {
		this.anInt531 = arg0;
		@Pc(13) Class223 local13 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method5398();
		}
		local13 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method5398();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IZ)V")
	public void method485(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean29 != arg0) {
			this.aBoolean29 = arg0;
			this.method482();
		}
	}
}
