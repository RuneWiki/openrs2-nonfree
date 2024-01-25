import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class212 {

	@OriginalMember(owner = "client!me", name = "q", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!jn;")
	private final Class167 aClass167_26 = new Class167(64);

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!jn;")
	public final Class167 aClass167_27 = new Class167(50);

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!jn;")
	public final Class167 aClass167_28 = new Class167(5);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!gn;")
	public final Class128 aClass128_2;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Lclient!vo;")
	private final Class348 aClass348_64;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!vo;")
	public final Class348 aClass348_65;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!gn;IZLclient!vo;Lclient!vo;)V")
	public Class212(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class348 arg3, @OriginalArg(4) Class348 arg4) {
		this.aClass128_2 = arg0;
		this.aClass348_64 = arg3;
		this.aClass348_65 = arg4;
		this.aBoolean434 = arg2;
		if (this.aClass348_64 != null) {
			@Pc(41) int local41 = this.aClass348_64.method7985() - 1;
			this.aClass348_64.method7981(local41);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method4987() {
		@Pc(2) Class167 local2 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3961();
		}
		local2 = this.aClass167_28;
		synchronized (this.aClass167_28) {
			this.aClass167_28.method3961();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public void method4989() {
		@Pc(6) Class167 local6 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3961();
		}
		local6 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3961();
		}
		local6 = this.aClass167_28;
		synchronized (this.aClass167_28) {
			this.aClass167_28.method3961();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public void method4990(@OriginalArg(0) int arg0) {
		this.anInt6343 = arg0;
		@Pc(15) Class167 local15 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3961();
		}
		local15 = this.aClass167_28;
		synchronized (this.aClass167_28) {
			this.aClass167_28.method3961();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public void method4991() {
		@Pc(12) Class167 local12 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3964(5);
		}
		local12 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3964(5);
		}
		local12 = this.aClass167_28;
		synchronized (this.aClass167_28) {
			this.aClass167_28.method3964(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)Lclient!ce;")
	public Class51 method4992(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_26;
		@Pc(16) Class51 local16;
		synchronized (this.aClass167_26) {
			local16 = (Class51) this.aClass167_26.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_64;
		@Pc(42) byte[] local42;
		synchronized (this.aClass348_64) {
			local42 = this.aClass348_64.method7964(Static395.method5345(arg0), Static526.method7453(arg0));
		}
		local16 = new Class51();
		local16.aClass212_1 = this;
		local16.anInt1582 = arg0;
		if (local42 != null) {
			local16.method1370(new Class4_Sub13(local42));
		}
		local16.method1372();
		@Pc(73) Class167 local73 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V")
	public void method4993(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean434) {
			this.aBoolean434 = arg0;
			this.method4989();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method4995() {
		@Pc(2) Class167 local2 = this.aClass167_26;
		synchronized (this.aClass167_26) {
			this.aClass167_26.method3975();
		}
		local2 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3975();
		}
		local2 = this.aClass167_28;
		synchronized (this.aClass167_28) {
			this.aClass167_28.method3975();
		}
	}
}
